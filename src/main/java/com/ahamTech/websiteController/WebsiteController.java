package com.ahamTech.websiteController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {
	
	
	
	@RequestMapping("/")
	public String fetchHomePage()
	{
		return "website/index";
		
	}
	@RequestMapping("/about")
	public String fetchabout()
	{
		return "website/about";
		
	}

}
