package com.thingtrust.power.rest;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.Maps;
import com.thingtrust.power.util.OkHttpUtils;
import com.thingtrust.power.util.SmsUtils;
import com.thingtrust.power.util.utils.TimeType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws ClientException, JsonProcessingException {
        String url="https://api.bibox.com/v1/mdata?cmd=market&pair=TTT_BTC";
        String s = OkHttpUtils.rpcRequestBodyPost(url,null);
        System.out.println(s);
    }
}
