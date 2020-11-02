package codes.mcdonald.craig.snakestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String getHome() {
		return "Hello, from the Snake Store on Spring";
	}

}