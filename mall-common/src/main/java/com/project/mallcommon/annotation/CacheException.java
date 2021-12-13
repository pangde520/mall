package com.project.mallcommon.annotation;

import java.lang.annotation.*;

/**
 * 描述：自定义注解，有该注解的缓存方法会抛出异常
 *
 * @author pangde
 * @version 1.0
 * @date 2021/12/13 10:33:15
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
