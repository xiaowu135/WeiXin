package com.zslin.basic.controller;

import com.zslin.basic.exception.ErrorInfo;
import com.zslin.basic.exception.SystemException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * ControllerAdvice, 类注解, 作用于 整个 Spring 工程. ControllerAdvice 注解定义了一个全局的异常处理器.
 * 
 * 
 * 项目中异常的处理机制
 * 
 * @author WQ
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	
	/**
	 * ExceptionHandler, 方法注解, 作用于 Controller 级别. ExceptionHandler 注解为一个 Controler 定义一个异常处理器.
	 * 
	 * 
	 * @param model
	 * @param req
	 * @param e
	 * @return
	 */
    @ExceptionHandler(value = SystemException.class)
    public String systemExceptionHandler(Model model, HttpServletRequest req, SystemException e) {
        ErrorInfo<String> er = new ErrorInfo<>();
        er.setCode(ErrorInfo.ERROR);
        er.setMessage(e.getMessage());
        er.setUrl(req.getRequestURL().toString());
        er.setParams(req.getQueryString());
        er.setDatas("发生系统异常，无法继续进行！");
        model.addAttribute("errorInfo", er);
//        e.printStackTrace();
        return "admin/basic/errors/system";
    }

    @ExceptionHandler(value = Exception.class)
    public String defaultExceptionHandler(Model model, HttpServletRequest req, Exception e) {
        ErrorInfo<String> er = new ErrorInfo<>();
        er.setCode(ErrorInfo.ERROR);
        er.setMessage(e.getMessage());
        er.setUrl(req.getRequestURL().toString());
        er.setParams(req.getQueryString());
        er.setDatas("发生异常，无法继续进行！");
        model.addAttribute("errorInfo", er);
//        e.printStackTrace();
        return "admin/basic/errors/default";
    }
}
