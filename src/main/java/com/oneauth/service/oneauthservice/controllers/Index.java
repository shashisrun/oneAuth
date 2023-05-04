package com.oneauth.service.oneauthservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Index {
    @GetMapping("/")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Welcome to OneAuth!");
    }
}
