package com.fanfan.weblog.common.utils;
import lombok.Data;
import java.io.Serializable;

/**
 *Author: fanfan
 *Date: 2025/1/16
 *Description:响应参数工具类
 */

@Data
public class Response<T> implements Serializable {

    //是否成功，默认为true
    private boolean success = true;
    //响应信息
    private String message;
    //异常码
    private String errorCode;
    //响应数据
    private T data;

    //=====================================成功响应=========================================
    public static <T> Response<T> success(){
        Response<T> response = new Response<>();
        return response;
    }

    public static <T> Response<T> success(T data){
        Response<T> response = new Response<>();
        response.setData(data);
        return response;
    }

    //=====================================失败响应=========================================
    public static <T> Response<T> fail(){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        return response;
    }

    public static <T> Response<T> fail(String errorMessage){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setMessage(errorMessage);
        return response;
    }

    public static <T> Response<T> fail(String errorCode,String errorMessage){
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setMessage(errorMessage);
        return response;
    }
}