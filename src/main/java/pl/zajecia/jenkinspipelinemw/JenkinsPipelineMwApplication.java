package pl.zajecia.jenkinspipelinemw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsPipelineMwApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPipelineMwApplication.class, args);
	}

	@GetMapping
	public String get() {
		return "Hello Jenkins - MW";
	}
}
