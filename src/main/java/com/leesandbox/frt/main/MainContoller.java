package com.leesandbox.frt.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContoller {
	@RequestMapping("/main.do")
	public String main() {
		return "site/frt/main";
	}
}
