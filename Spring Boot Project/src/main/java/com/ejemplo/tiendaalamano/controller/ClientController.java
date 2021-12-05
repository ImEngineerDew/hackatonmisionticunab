package com.ejemplo.tiendaalamano.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientController
{
    @GetMapping
    public String name()
    {
        return "This is just a test";
    }

}
