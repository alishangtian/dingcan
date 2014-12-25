package com.maoxiaobing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maoxiaobing.scan.service.MockService;

@Controller
@RequestMapping("/mock")
public class MockController {
	@Autowired
	private MockService mockService;

	@RequestMapping("/create")
	public String createMock(String f1, String f2, ModelMap model) {
		System.out.println(f1 + "  :   " + f2);
		this.mockService.createOneMock();
		model.put("f1", f1);
		model.put("f2", f2);
		return "result";
	}
}
