package codes.mcdonald.craig.snakestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

	@GetMapping("/about")
	public String getAbout() {
		
		return "about";
	}
}
