package com.roc.exception;

import com.roc.common.CommonConstants;
import com.roc.common.R;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ResponseBody
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler
    public R myExceptionHandler(Exception e){
        log.error(e.getMessage(),e);
        return R.failed(CommonConstants.FAIL).setMsg(e.getMessage());
    }

}
