package dev.joaobertholino.dockerdiochallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class DockerDioChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDioChallengeApplication.class, args);
	}

}
