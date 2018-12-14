/* See the file "LICENSE" for the full license governing this code. */
package com.cognizant.covr;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

@RestController("covrController")
final class CovrController {

	@GetMapping("/")
	Iterable<?> list() {
		return Collections.emptyList();
	}

	@PostMapping("/")
	String echo(@RequestBody String newItem){

		return newItem;

	}

	@GetMapping("/time/")
	String getTime() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}
}

