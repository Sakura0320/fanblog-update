package com.fanfan.weblog.web.controller;

import com.fanfan.weblog.common.utils.Response;
import com.fanfan.weblog.web.model.User;
import com.fanfan.weblog.common.aspect.ApiOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.*;

import java.util.stream.Collectors;

/**
 *Author: fanfan
 *Date: 2025/1/15
 *Description:设计参数校验
 */

@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user, BindingResult bindingResult){
        //是否存在校验错误
        if(bindingResult.hasErrors()){
            //获取校验不通过字段的提示信息
            String errorMsg = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .collect(Collectors.joining(","));

            return Response.fail(errorMsg);
        }
        return Response.success();
    }

    /**
    public ResponseEntity<String> test(@RequestBody @Validated User user, BindingResult bindingResult) {
        //是否存在参数错误
        if(bindingResult.hasErrors()){
            //获取校验不通过的字段的提示信息
            String errorMsg = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .collect(Collectors.joining(","));

            return ResponseEntity.badRequest().body(errorMsg);
        }
        //返回参数
        return ResponseEntity.ok("参数校验正确");
    }
     */
}

