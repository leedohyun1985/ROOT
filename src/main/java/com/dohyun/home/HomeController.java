/**
 * 
 */
package com.dohyun.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author Dohyun Lee
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home(HttpServletRequest request) {

		return "main";
	}
}
