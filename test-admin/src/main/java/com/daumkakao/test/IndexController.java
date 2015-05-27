package com.daumkakao.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

/**
 * Created by jennifer.jyp on 15. 5. 27..
 */

@RequestMapping("/")
public class IndexController {

	@Autowired
	private MessageSource messageSource;

	public void home(Model model) {
		model.addAttribute("welcome", messageSource.getMessage("welcome", new String[]{"jennifer"}, Locale.getDefault()));
	}

}
