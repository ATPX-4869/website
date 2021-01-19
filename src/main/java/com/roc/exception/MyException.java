package com.roc.exception;

import lombok.Data;

@Data
public class MyException extends RuntimeException{

    private String code;

    private String msg;

}
