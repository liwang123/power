package com.thingtrust.power.service;



import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.thingtrust.power.common.mybatis.pager.PageInfo;
import com.thingtrust.power.data.AreaRepository;
import com.thingtrust.power.data.ChargeRepository;
import com.thingtrust.power.data.MessageRepository;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.domain.Charge;
import com.thingtrust.power.domain.Message;
import com.thingtrust.power.domain.example.ChargeExample;
import com.thingtrust.power.dto.ChargeDTO;
import com.thingtrust.power.util.SmsUtils;
import com.thingtrust.power.util.utils.TimeType;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChargeService {

    @Autowired
    private ChargeRepository chargeRepository;

    @Autowired
    private MessageRepository messageRepository;

    public void insertCharbe(final Charge charge) {
        int day = LocalDateTime.now().getDayOfMonth();
        Integer payTime = charge.getPayTime();
        if(payTime<day){
            charge.setBillTime(LocalDateTime.now().plusDays(payTime-day).plusMonths(TimeType.getMonths(charge.getTimeType())));
        }else {
            charge.setBillTime(LocalDateTime.now().plusDays(payTime-day+1));
        }
        chargeRepository.insert(charge);
    }

    public void updateCharge(Charge charge){
        int day = LocalDateTime.now().getDayOfMonth();
        Integer payTime = charge.getPayTime();
        if(payTime<day){
            charge.setBillTime(LocalDateTime.now().plusDays(payTime-day).plusMonths(TimeType.getMonths(charge.getTimeType())));
        }else {
            charge.setBillTime(LocalDateTime.now().plusDays(payTime-day+1));
        }
        chargeRepository.updateById(charge);
    }

    public PageInfo queryAll(int index,int length){
        PageInfo pageInfo = new PageInfo(index,length);
        List<Charge> chargeList = chargeRepository.selectByPager(pageInfo, null);
        List<ChargeDTO> chargeDTOList = Lists.newArrayList();
        chargeList.stream()
                .forEach(charge -> {
                    ChargeDTO chargeDTO = new ChargeDTO();
                    BeanUtils.copyProperties(charge,chargeDTO);
                    chargeDTO.setFinsishTime(charge.getFinsishTime()==null?charge.getFinsishTime()+"":charge.getFinsishTime().toString().replaceAll("T"," "));
                    chargeDTO.setPayTime(charge.getBillTime()==null?charge.getBillTime()+"":charge.getBillTime().toLocalDate().toString());
                    chargeDTO.setTimeType(TimeType.getTimeType(charge.getTimeType()));
                    chargeDTO.setStatus(TimeType.getCompletionStatus(charge.getStatus()));
                    chargeDTO.setType(charge.getType()==null? charge.getType()+"":TimeType.getArea(charge.getType()));
                    chargeDTOList.add(chargeDTO);
                });
        int count = chargeRepository.countByExample(null);
        pageInfo.setTotals(count);
        pageInfo.setListObject(chargeDTOList);
        return pageInfo;
    }



    public void delete(int id){
        chargeRepository.deleteById(id);
    }

    public Charge queryOne(int id){
        return chargeRepository.selectById(id);
    }

    public void finsish(int id){
        Charge charge = Charge.builder()
                .id(id)
                .status(2)
                .finsishTime(LocalDateTime.now())
                .build();
        chargeRepository.updateById(charge);
    }

    public void sendMessage(int[] ids){
        List<Integer> list = Ints.asList(ids);
        ChargeExample chargeExample = new ChargeExample();
        chargeExample.createCriteria()
                .andIdIn(list);
        List<Charge> chargeList = chargeRepository.selectByExample(chargeExample);
        sendSmsMessage(chargeList);

    }

    public void sendSmsMessage(List<Charge> chargeList){
        chargeList.stream()
            .forEach(charge -> {
                Map<String, String> params = Maps.newHashMap();
                params.put("time",charge.getBillTime().toLocalDate().toString());
                params.put("address",charge.getAddress());
                params.put("phone","1xxxxxxxxxxxx");
                String sendSms = sendSms(charge.getPhone(), params);
                if("OK".equals(sendSms)){
                    charge.setStatus(1);
                    chargeRepository.updateById(charge);
                    Message message = Message.builder()
                            .chargeId(charge.getId())
                            .name(charge.getName())
                            .build();
                    messageRepository.insert(message);
                }
            });
    }


    public String sendSms(String  mobile, Map<String,String> map) {
        SendSmsResponse response= null;
        try {
            response = SmsUtils.sendSms(mobile,"SMS_149102181",map);
        } catch (ClientException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return response.getCode();
    }

}
