package net.javaci.javacibank.backoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	@GetMapping ({"/", "index"})
	public String renderTemp() {
		return "dashboard";
	}
	
	@GetMapping ("page1")
	public String renderpage1() {
		return "page1";
	}
	
	@GetMapping ("page2")
	public String renderpage2() {
		return "page2";
	}

}
