package br.com.tcc.puc.recognize.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping(value = "healthcheck")
    public String healthCheck(){
        return "200 OK";
    }

}
