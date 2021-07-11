package com.atguigu.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: liqi
 * @create 2021-07-11 20:06
 */
@ControllerAdvice
public class MyExceptionHandler {

	@ResponseBody
	@ExceptionHandler(value = {ArithmeticException.class})
	public String handleZeroException(Exception e){
		return "";
	}
}
