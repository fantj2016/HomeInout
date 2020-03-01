package com.home.inout.response;

/**
 * 响应码 枚举类
 * Created by Fant.J.
 * 2018/4/21 13:49
 */
public enum  ResponseCode {

    SUCCESS(200,"SUCCESS"),
    ERROR(500,"ERROR"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT"),
    NEED_LOGIN(403,"NEED_LOGIN");

    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}
