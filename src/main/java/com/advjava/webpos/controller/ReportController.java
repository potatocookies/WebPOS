package com.advjava.webpos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReportController {
	
	
	@RequestMapping(value = "/reportss", method = RequestMethod.GET)
	public String page2(ModelMap modelMap) {
		
		modelMap.put("reportList", "");
		return "reports";
	}
}
