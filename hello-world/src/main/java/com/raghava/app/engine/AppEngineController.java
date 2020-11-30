package com.raghava.app.engine;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppEngineController {

	@GetMapping
	public Date getDate() {

		return new Date();
	}
}
