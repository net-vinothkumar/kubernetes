package com.kubernetes.demo;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class K8SDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(K8SDemoApplication.class, args);
    }
}


@Slf4j
@RestController
class HelloResource {

    @Autowired
    Environment env;

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        String greeting = String.format("Hello %s - Thanks friend for your support... - Happy Learning!", name);
        return ResponseEntity.ok(greeting);
    }

    @GetMapping("health")
    public ResponseEntity<Health> customHealth() {
        String appName = env.getProperty("spring.application.name");
        String appVersion = env.getProperty("spring.application.version");
        Health build =
                Health.status(Status.UP)
                        .withDetail("info",
                                Application.builder()
                                        .name(appName)
                                        .version(appVersion)
                                        .build()
                        )
                        .build();
        return ResponseEntity.ok(build);
    }
}

@Builder
@Data
class Application {
    private String name;
    private String version;
}
