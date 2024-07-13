package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndHerBakery implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(AliceAndHerBakery.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.cakeBake();
	}
}
