package dev.thesarfo.springbasics;

import dev.thesarfo.springbasics.service.MessagePrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(MessagePrinter messagePrinter){
		return args ->  messagePrinter.printMessage();
	}

}
