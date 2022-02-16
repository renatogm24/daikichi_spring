package com.codingdojo.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String hello() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow(@RequestParam(value = "q") String searchQuery) {
		return "Your searched form: " + searchQuery;
	}
	
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place) {
		return "¡Felicitaciones! ¡Pronto viajarás a "+ place +"!";
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") Integer num) {
		if (num%2==0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
		} else {
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
		}		
	}
}
