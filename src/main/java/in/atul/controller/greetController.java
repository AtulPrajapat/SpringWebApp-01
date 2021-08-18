package in.atul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class greetController {

	@GetMapping("/welcome")
	public ModelAndView greetMsg() {
		String MsgText = "welcome to India.....";
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", MsgText);

		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/greet")
	public String greetMsgText(Model model) {

		String greetMsgTxt = "good afternoon....";

		model.addAttribute("msg", greetMsgTxt);

		return "index";

	}
}
