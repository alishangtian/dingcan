package com.maoxiaobing.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class RenderUtil {
	public static Logger logger = Logger.getLogger(RenderUtil.class);

	/**
	 * 输出 文本流(字符编码为 UTF-8)
	 * 
	 * @param text
	 */
	public static void renderText(HttpServletResponse rsp, String text) {
		try {
			rsp.setContentType("text/plain;charset=UTF-8");
			rsp.getWriter().write(text);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 输出 json流(字符编码为 UTF-8)
	 * 
	 * @param text
	 */
	public static void renderJson(HttpServletResponse rsp, String text) {
		try {
			rsp.setContentType("application/json;charset=utf-8");
			rsp.getWriter().write(text);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 输出 文本流
	 * 
	 * @param text
	 * @param charset
	 *            字符编码
	 */
	public static void renderText(HttpServletResponse rsp, String text,
			String charset) {
		try {
			rsp.setContentType((new StringBuilder("text/plain;charset="))
					.append(charset).toString());
			rsp.getWriter().write(text);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 输出 html 流(字符编码为 UTF-8)
	 * 
	 * @param text
	 */
	public static void renderHtml(HttpServletResponse rsp, String text) {
		try {
			rsp.setContentType("text/html;charset=UTF-8");
			PrintWriter out = rsp.getWriter();
			out.write(text);
			out.flush();
			out.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 输出 html 流
	 * 
	 * @param text
	 * @param charset
	 *            字符编码
	 */
	public static void renderHtml(HttpServletResponse rsp, String text,
			String charset) {
		try {
			rsp.setContentType((new StringBuilder("text/html;charset="))
					.append(charset).toString());
			PrintWriter out = rsp.getWriter();
			out.write(text);
			out.flush();
			out.close();
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 输出 xml 流(字符编码集为 UTF-8)
	 * 
	 * @param text
	 */
	public static void renderXML(HttpServletResponse rsp, String text) {
		try {
			rsp.setContentType("text/xml;charset=UTF-8");
			rsp.getWriter().write(text);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	/**
	 * 输出 xml 流
	 * 
	 * @param text
	 * @param charset
	 *            字符编码
	 */
	public static void renderXML(HttpServletResponse rsp, String text,
			String charset) {
		try {
			rsp.setContentType((new StringBuilder("text/xml;charset=")).append(
					charset).toString());
			rsp.getWriter().write(text);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
