package hello;

import org.mariuszgromada.math.mxparser.Expression;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "homepage";
	}

	@GetMapping("/calculate")
	public String calculate(@RequestParam(value = "expression") String expression, Model model) {
		Expression exp = new Expression(expression);
		double result = exp.calculate();

		if (Double.isNaN(result)) {
			return "errorpage";
		}

		model.addAttribute("result", result);
		return "resultpage";
	}
}
