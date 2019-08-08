package com.readingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	public ProjectDetails bean;

	@RequestMapping("projectName")
	String getProjectName() {
		return bean.getProjectName();
	}
}