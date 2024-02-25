package dev.daisuzz.samplespringboot32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class SampleSpringBoot32Application {
    public static void main(String[] args) {
        SpringApplication.run(SampleSpringBoot32Application.class, args);
    }

    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder.baseUrl("https://random.dog").build();
    }
}
