package com.project.mallcommon.exception;


import com.project.mallcommon.api.IErrorCode;

/**
 * 描述：断言处理类，用于抛出各种API异常
 *
 * @author pangde
 * @version 1.0
 * @date 2021/12/13 10:15:56
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
