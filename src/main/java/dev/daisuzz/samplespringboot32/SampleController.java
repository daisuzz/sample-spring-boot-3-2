package dev.daisuzz.samplespringboot32;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/virtual-thread")
    public String virtualThread() throws InterruptedException {
        Thread.sleep(1000);
        return "finish!";
    }

    @GetMapping("/rest-client")
    public SampleResponse restClient() {
        return sampleService.call();
    }
}
