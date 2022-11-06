package com.accenture.accountmanagement.api;

@javax.annotation.Generated(value = "com.accenture.accountmanagement.codegen.languages.SpringCodegen", date = "2022-11-06T18:07:24.905Z")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
