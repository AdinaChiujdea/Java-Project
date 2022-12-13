package ro.digitalnation.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@GetMapping("/index")
  public String index()
  {
		return "hello";
  }
}
