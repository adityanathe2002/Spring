package com.qsp.spring_boot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/qsp/pune")
@RestController
public class Controller {
	@GetMapping("/m1")
	public String m1() {
		return "m1";
	}
	@GetMapping("/m2")
	public String m2() {
		return "m2";
	}
	@GetMapping("/m3")
	public String m3() {
		return "m3";
	}
}
