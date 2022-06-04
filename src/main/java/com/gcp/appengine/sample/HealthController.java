package com.gcp.appengine.sample;

import org.springframework.web.bind.annotation.*;

@RequestMapping("")
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "hello world";
    }
}