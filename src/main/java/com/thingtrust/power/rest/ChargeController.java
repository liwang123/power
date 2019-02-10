package com.thingtrust.power.rest;



import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.primitives.Ints;
import com.thingtrust.power.common.model.ResponseResult;
import com.thingtrust.power.common.mybatis.pager.PageInfo;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.domain.Charge;
import com.thingtrust.power.dto.ChargeDTO;
import com.thingtrust.power.entity.ChargeEntity;
import com.thingtrust.power.service.AreaService;
import com.thingtrust.power.service.ChargeService;
import com.thingtrust.power.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/charge")
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @PostMapping("/add")
    public ResponseResult add(ChargeEntity charge) {
        chargeService.insertCharbe(charge);
        return ResponseResult.success();
    }

    @PostMapping("/update")
    public ResponseResult update(final Charge charge) {
        chargeService.updateCharge(charge);
        return ResponseResult.success();
    }

    @GetMapping("/query-all")
    public ResponseResult queryAll(int index,int length){
        PageInfo pageInfo = chargeService.queryAll(index, length);
        return ResponseResult.success(pageInfo);
    }

    @GetMapping("/query-one")
    public ResponseResult queryOne(int id){
        Charge charge = chargeService.queryOne(id);
        return ResponseResult.success(charge);
    }


    @GetMapping("/export")
    public ResponseResult export(HttpServletResponse response){
        String excel = "";
        String fileName="电费信息.xls";
            List<ChargeDTO> lists =chargeService.export(1,1000000);
            List<String> header=new ArrayList<>();
            header.add("联系人");
            header.add("联系方式");
            header.add("联系人地址");
            header.add("区域");
            header.add("本月电费");
            header.add("缴费时间");
            header.add("下月预缴");
            header.add("物业地址");
            header.add("时间类型");
            header.add("完成时间");
            header.add("状态");
            excel = ExcelUtils.exportExcel(fileName, header, lists, response);

        return ResponseResult.success(excel);
    }

    @PostMapping("/remove")
    public ResponseResult remove(int id){
        chargeService.delete(id);
        return ResponseResult.success();
    }

    @PostMapping("/finsish")
    public ResponseResult finsish(int id){
        chargeService.finsish(id);
        return ResponseResult.success();
    }


    @PostMapping("/sendSms")
    public ResponseResult sendSms(int[] ids){
        chargeService.sendMessage(ids);
        return ResponseResult.success();
    }


}
