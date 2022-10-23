package com.example.api;

import com.example.service.ExecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
public class ApiController {

    @Autowired
    private ExecService execService;

    @GetMapping("/ping")
    String ping() throws InterruptedException, IOException {

        String command = "ping -c 3 www.google.com";
        return execService.execute(command);
        //return "pong";
    }




}
