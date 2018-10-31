package com.thingtrust.power.task;


import com.google.common.collect.Lists;
import com.thingtrust.power.data.ChargeRepository;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.domain.Charge;
import com.thingtrust.power.domain.example.ChargeExample;
import com.thingtrust.power.service.AreaService;
import com.thingtrust.power.service.ChargeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ChargeTask {

    @Autowired
    private ChargeService chargeService;

    @Autowired
    private ChargeRepository chargeRepository;

    @Autowired
    private AreaService areaService;

    @Scheduled(cron = "0 0/10 * * * ? ")
    public void manageCharge(){
        LocalDateTime nowTime = LocalDateTime.now();
        List<Area> areaList = areaService.queryAll();
        areaList.stream()
                .forEach(area -> {
                    ChargeExample chargeExample = new ChargeExample();
                    chargeExample.createCriteria()
                            .andTypeEqualTo(area.getId());
                    List<Charge> chargeList = chargeRepository.selectByExample(chargeExample);
                    List<Charge> arrayList = Lists.newArrayList();
                    chargeList.stream()
                            .forEach(charge -> {
                                Period period = Period.between(nowTime.toLocalDate(), charge.getBillTime().toLocalDate());
                                System.out.println(period.getDays());
                                if(period.getDays()<=5&&period.getDays()>0){
                                    arrayList.add(charge);
                                }
                            });
                    chargeService.sendSmsMessage(arrayList);
                });
    }


    @Scheduled(cron = "0 0/10 * * * ? ")
    public void Charge(){

    }

}
