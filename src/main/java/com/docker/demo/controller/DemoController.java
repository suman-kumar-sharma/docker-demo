package com.docker.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

@GetMapping("/home")

    public String homePage(){
    return "this is default page for docker demo"
;}

}
