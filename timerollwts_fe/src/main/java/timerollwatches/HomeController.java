package timerollwatches;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		System.out.println(" I am from controller");
		return "index";
	}
	@RequestMapping("/login")
	public String login()
	{
		System.out.println(" login request mapping is done");
		return "login";
	}
	@RequestMapping("/register")
	public String register()
	{
		System.out.println(" register request mapping is done");
		return "register";
	}
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		System.out.println(" aboutus request mapping is done");
		return "aboutus";
	}
	@RequestMapping("/contactus")
	public String contactus()
	{
		System.out.println(" contactus request mapping is done");
		return "contactus";
	}

}
