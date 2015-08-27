package com.maoxiaobing.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeAction {
	private static Logger logger = Logger.getLogger(HomeAction.class);

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logger.info(new Date().toString()+"***主页被访问到了");
		return "result";
	}

}
