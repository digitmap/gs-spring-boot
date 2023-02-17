package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "2023年2月3日14时56分41秒!"+"\n"+"2023年2月16日15时02分08秒 第二次执行";
	}

}
