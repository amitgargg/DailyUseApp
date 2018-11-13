package com.fdp.build.deployment;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuildDeploymentController {

	@RequestMapping(value = "/build", method = RequestMethod.GET)
	public String showBuild(Model model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
}
