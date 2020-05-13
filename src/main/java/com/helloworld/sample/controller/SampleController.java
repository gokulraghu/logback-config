package com.helloworld.sample.controller;



import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;

@Controller("/api")
@Validated
public class SampleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

		@Get("/helloworld")
	public MutableHttpResponse<String> helloWorld() {
		LOGGER.info("SampleController :: helloWorld() :: Starts");
		String firstString = "Hello ";
		String secondString ="World!";
		String result = firstString + secondString;
		LOGGER.info("SampleController :: helloWorld() :: Ends");
		if (Optional.ofNullable(result).isPresent()) {
		    return HttpResponse.ok(result);

	} else {
		return HttpResponse.badRequest(result);
	}

	}

	
}
