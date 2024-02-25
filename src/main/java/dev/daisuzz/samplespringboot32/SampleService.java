package dev.daisuzz.samplespringboot32;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class SampleService {

    private final RestClient restClient;

    public SampleService(RestClient restClient) {
        this.restClient = restClient;
    }

    public SampleResponse call() {
        return restClient
                .get()
                .uri("/woof.json")
                .retrieve()
                .body(SampleResponse.class);
    }
}
