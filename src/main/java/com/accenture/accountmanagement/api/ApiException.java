package com.accenture.accountmanagement.api;

@javax.annotation.Generated(value = "com.accenture.accountmanagement.codegen.languages.SpringCodegen", date = "2022-11-06T18:07:24.905Z")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
