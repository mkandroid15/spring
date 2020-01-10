package com.example.dbtest.dbtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mehmetk
 *
 * Jan 5, 2020
 * 4:28:06 PM
 */
@RestController
public class TestController {

	
	@RequestMapping("test")
	public String test() {
		return "ddd";
	}
}
