package com.ljs.common.result;

import lombok.Getter;

/**
 * @author ljs
 * @version 1.0
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    FAIL(201, "失败"),
//    SERVICE_ERROR(2012, "服务异常"),
//    DATA_ERROR(204, "数据异常"),
//
//    LOGIN_AUTH(208, "未登录"),
//    PERMISSION(209, "没有权限")
    ;

    private Integer code;
    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
