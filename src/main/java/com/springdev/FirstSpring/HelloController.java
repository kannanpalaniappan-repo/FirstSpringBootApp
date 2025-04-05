package com.springdev.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}/show")
    public HelloResponse hello(@PathVariable String name){
        return new HelloResponse("Hello, "+name+"!");
    }
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello, "+name+" !");
    }
}
