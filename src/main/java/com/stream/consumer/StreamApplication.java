package com.stream.consumer;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class StreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamApplication.class, args);
	}

	@Bean
	public Consumer<Flux<RssModel>> rssConsumer() {
		return flux -> flux.doOnNext(System.out::println).subscribe();
	};

}
