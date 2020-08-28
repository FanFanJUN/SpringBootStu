package com.lc.common;

/**
 *
 * @Description: 自定义业务异常
 * @author: licai
 * @date:  17:18  
 * @param: 
 * @return: 
 *
 */
public class BusinessException extends RuntimeException {

    /**
     * 状态码
     */
    private Integer status = 500;

    /**
     * 异常信息
     */
    private String msg;


    public BusinessException(String msg) {
        super(msg);
        this.msg = msg;

    }


    public BusinessException(Integer status, String msg) {
        super(msg);
        this.status = status;
        this.msg = msg;

    }

    public BusinessException(Integer status, String msg, Throwable e) {
        super(msg,e);
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public BusinessException setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public BusinessException setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
