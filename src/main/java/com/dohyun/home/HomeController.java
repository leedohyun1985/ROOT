/**
 * 
 */
package com.dohyun.home;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

/**
 * @author Dohyun Lee
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String home(HttpServletRequest request, Locale locale, Model model) {

		return "main";
	}
}
