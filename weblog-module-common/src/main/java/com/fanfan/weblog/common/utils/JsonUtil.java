package com.fanfan.weblog.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

/**
 *Author: fanfan
 *Date: 2025/1/14
 *Description:JSON工具类，将日志切面中打印的出入参转变为字符串
 */

@Slf4j
public class JsonUtil {
    private static final ObjectMapper INSTANCE = new ObjectMapper();

    public static String toJsonString(Object obj){
        try{
            return INSTANCE.writeValueAsString(obj);
        }catch(JsonProcessingException e){
            return obj.toString();
        }
    }
}
