package com.thingtrust.power.task;


import com.thingtrust.power.data.ChargeRepository;
import com.thingtrust.power.service.ChargeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class ChargeTask {

    @Autowired
    private ChargeService chargeService;

    @Autowired
    private ChargeRepository chargeRepository;

    @Scheduled(cron = "0 0/2 * * * ?")
    public void manageCharge(){
        System.out.println();
    }
}
