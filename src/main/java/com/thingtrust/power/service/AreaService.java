package com.thingtrust.power.service;



import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import com.thingtrust.power.common.mybatis.pager.PageInfo;
import com.thingtrust.power.data.AreaRepository;
import com.thingtrust.power.data.ChargeRepository;
import com.thingtrust.power.data.UserRepository;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.domain.Charge;
import com.thingtrust.power.domain.User;
import com.thingtrust.power.domain.example.ChargeExample;
import com.thingtrust.power.domain.example.UserExample;
import com.thingtrust.power.dto.AreaDTO;
import com.thingtrust.power.dto.ChargeDTO;
import com.thingtrust.power.entity.UserEntity;
import com.thingtrust.power.util.utils.TimeType;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private ChargeRepository chargeRepository;

    @Autowired
    private ChargeService chargeService;

    public void insertArea(final Area area) {
        areaRepository.insert(area);
    }

    public void updateArea(Area area){
        areaRepository.updateById(area);
    }

    public List<Area> queryAll(){
        return areaRepository.selectByExample(null);
    }

    public PageInfo queryByPage(int index, int length){
        PageInfo pageInfo = new PageInfo(index,length);
        List<Area> areaList = areaRepository.selectByPager(pageInfo, null);
        ArrayList<AreaDTO> arrayList = Lists.newArrayList();
        areaList.stream()
                .forEach(area -> {
                    AreaDTO areaDTO = AreaDTO.builder()
                            .updateTime(area.getUpdateTime()==null ? "未发送":area.getUpdateTime().toString().replaceAll("T"," "))
                            .build();
                    BeanUtils.copyProperties(area,areaDTO);
                    arrayList.add(areaDTO);
                });
        int count = areaRepository.countByExample(null);
        pageInfo.setTotals(count);
        pageInfo.setListObject(arrayList);
        return pageInfo;
    }


    public void sendMessage(int id){
        ChargeExample chargeExample = new ChargeExample();
        chargeExample.createCriteria()
                .andTypeEqualTo(id);
        List<Charge> chargeList = chargeRepository.selectByExample(chargeExample);
//        chargeService.sendSmsMessage(chargeList);
        Area area = Area.builder()
                .id(id)
                .updateTime(LocalDateTime.now())
                .build();
        areaRepository.updateById(area);
    }



    public void delete(int id){
        areaRepository.deleteById(id);
    }

    public Area queryOne(int id){
        return areaRepository.selectById(id);
    }
}
