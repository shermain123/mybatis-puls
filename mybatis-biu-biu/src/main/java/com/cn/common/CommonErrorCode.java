package com.cn.common;

/**
 * Created by sher on 2020/11/25.
 */
public enum CommonErrorCode implements ErrorCode {

    SUCCESS(0,"成功"),

    E100101(100101,"传入参数与接口不匹配"),

    E100102(100102,"查询结果为空"),

    CUSTOM(999998,"自定义异常"),

    UNKOWN(999999,"未知错误");

    private int code;
    private String desc;


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    private CommonErrorCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static CommonErrorCode setErrorCode(int code){
        for (CommonErrorCode errorCode : CommonErrorCode.values()){
            if(errorCode.getCode() == code){
                return errorCode;
            }
        }
        return null;
    }


}
