package com.roc.exception;

import com.roc.common.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler
    public R myExceptionHandler(MyException e){
        System.out.println("=============跑起来");
        return R.failed(e.getCode(),e.getMsg());
    }

}
