package dev.daisuzz.samplespringboot32;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/virtual-thread")
    public String load() throws InterruptedException {
        Thread.sleep(1000);
        return "finish!";
    }
}
