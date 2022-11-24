package jp.co.blackJack.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.blackJack.model.TestForm;


@RestController
public class ApiController {
	@PostMapping("/post")
	public TestForm postData(TestForm testForm) {
//		testForm.setName(testForm.getName());
//		testForm.setAge(testForm.getAge());
//		testForm.setGender(testForm.getGender());
		return testForm;
	}
}


