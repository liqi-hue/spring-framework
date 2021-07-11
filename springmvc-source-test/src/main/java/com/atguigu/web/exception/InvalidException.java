package com.atguigu.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: liqi
 * @create 2021-07-11 19:36
 */
@ResponseStatus(value = HttpStatus.CONFLICT,reason = "非法用户")
public class InvalidException extends RuntimeException{


}
