package com.ajdg.api.java.playground.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/play")
public class PlaygroundController {

    @GetMapping("")
    public ResponseEntity<?> getAllUnit() {
        return new ResponseEntity<>("Hooray", HttpStatus.OK);
    }
}
