package com.leesandbox.frt.seed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leesandbox.frt.seed.util.SEEDUtil;

@Controller
public class SeedController {
	@RequestMapping("/seed.do")
	public String main() throws Exception {
		
		
		return "site/frt/returnSeed";
	}
}
