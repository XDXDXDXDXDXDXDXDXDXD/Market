package com.springbootlearning.market.pojo.dto;

import lombok.Data;

/**
 * @author YHZ
 * @date 2020/3/27
 */
@Data
public class ResponseDTO {

    /**
     * 返回到客户端的结果
     */
    private Boolean res;

    /**
     * 返回至客户端的消息
     */
    private String msg;

    /**
     * 返回至客户端的数据
     */
    private Object data;

    /**
     * 返回至客户端的状态码,默认200
     */
    private Integer status = 200;

    /**
     * 返回至客户端的错误代码
     */
    private Integer errorCode;

    public ResponseDTO(Boolean res, String msg, Object data, Integer status, Integer errorCode) {
        this.res = res;
        this.msg = msg;
        this.data = data;
        this.status = status;
        this.errorCode = errorCode;
    }

    /**
     * 返回不带数据的成功传输对象
     * @param msg 消息
     * @return 返回一个ResponseDTO对象
     */
    public static ResponseDTO successWithoutData(String msg){
        return new ResponseDTO(true,msg,null,200,null);
    }

    /**
     * 返回带数据的成功传输对象
     * @param msg 消息
     * @param data 返回客户端携带的数据
     * @return 返回一个ResponseDTO对象
     */
    public static ResponseDTO successWithData(String msg, Object data){
        return new ResponseDTO(true,msg,data,200,null);
    }

    public static ResponseDTO failWithoutData(String msg){
        return new ResponseDTO(false,msg,null,null,null);
    }

    /**
     * 返回带数据的错误传输对象
     * @param msg 消息
     * @param data 返回客户端携带的数据
     * @return 返回一个ResponseDTO对象
     */
    public static ResponseDTO failsWithData(String msg, Object data, Integer status, Integer errorCode){
        return new ResponseDTO(false,msg,data,status,errorCode);
    }
}
