import org.springframework.web.bind.annotation.RequestMapping;

public class WatchListController {

	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
}
