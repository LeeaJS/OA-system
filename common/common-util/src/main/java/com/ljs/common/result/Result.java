package com.ljs.common.result;

import lombok.Data;

/**
 * @author ljs
 * @version 1.0
 */
@Data
public class Result<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private T data;

    // 私有化
    private Result() {

    }

    /**
     * @param body           数据
     * @param resultCodeEnum 返回结果枚举类
     * @param <T>
     * @return 返回result，返回的时候会判断body是否为空
     */
    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<>();
        // 封装数据
        if (body != null) {
            result.setData(body);
        }
        // 设置状态码
        result.setCode(resultCodeEnum.getCode());
        // 返回信息
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }


    // 成功，不返回数据
    public static <T> Result<T> ok() {
        return build(null, ResultCodeEnum.SUCCESS);
    }
    // 成功，返回数据
    public static <T> Result<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    // 失败，不返回数据
    public static <T> Result<T> fail() {
        return build(null, ResultCodeEnum.FAIL);
    }

    // 失败，返回数据
    public static <T> Result<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }
    // 扩展返回信息
    public Result<T> message(String msg) {
        this.setMessage(msg);
        return this;
    }
    // 扩展状态码
    public Result<T> code(Integer code) {
        this.setCode(code);
        return this;
    }


}
