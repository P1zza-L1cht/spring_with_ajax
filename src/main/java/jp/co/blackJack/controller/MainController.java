package jp.co.blackJack.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import jp.co.blackJack.model.TestForm;

@Controller
public class MainController {
	
//	@Autowired
//	private TestForm testForm;
	
	@GetMapping("/")
	public String index() {
		return "client/index";
	}
	
//	@GetMapping("/content")
//	public String content(Model model) {
//		model.addAttribute("name", testForm.getName());
//		model.addAttribute("age", testForm.getAge());
//		model.addAttribute("gender", testForm.getGender());
//		return "client/content";
//	}
	
}
