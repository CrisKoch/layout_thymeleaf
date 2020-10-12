package kochmann.leyout_Thymeleaf.controle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("pagina2")
	public String pagina2() {
		return "pagina2";
	}

}
