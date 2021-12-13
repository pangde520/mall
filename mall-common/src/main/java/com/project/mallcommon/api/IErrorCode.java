package com.project.mallcommon.api;

/**
 * 描述：封装API的错误码
 *
 * @author pangde
 * @version 1.0
 * @date 2021/12/13 10:35:25
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
