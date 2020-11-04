package codes.mcdonald.craig.snakestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SnakesController {

	@GetMapping("/snakes")
	public String getSnakes() {
		return "snakes";
	}
}
