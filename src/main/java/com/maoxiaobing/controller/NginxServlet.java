package com.maoxiaobing.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nginx")
public class NginxServlet {

	private static Logger logger = Logger.getLogger(NginxServlet.class);

	@RequestMapping("/echo")
	public String echo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("success", true);
		result.put("msg", "你好");
		try {
			result.put("serverIp", InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			System.err.println(e.getMessage());
		}
		result.put("sessionId", request.getSession().getId());
		request.setAttribute("server", result);
		logger.info(new Date().toString() + "*****被访问到了******");
		return "nginx";
	}

	/**
	 * 输出 文本流(字符编码为 UTF-8)
	 * 
	 * @param text
	 */
	protected void renderText(HttpServletResponse response, String text) {
		try {
			response.setContentType("text/plain;charset=UTF-8");
			response.getWriter().write(text);
		} catch (IOException e) {
		}
	}
}
