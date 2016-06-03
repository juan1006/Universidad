package com.springbase.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @date : 26/5/2016
 * @time : 15:08:18
 * @author : Juan Quispe O.
 */

@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}



	@RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		return "contactus";
	}
}