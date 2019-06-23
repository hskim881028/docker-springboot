package me.hskim.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringbootApplication {
    @GetMapping("/")
    public String sayHello() {
        return "hello docker-springboot !";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringbootApplication.class, args);
    }
}
