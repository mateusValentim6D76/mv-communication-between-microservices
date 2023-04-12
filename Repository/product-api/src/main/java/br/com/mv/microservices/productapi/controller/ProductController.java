package br.com.mv.microservices.productapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/api")
public class ProductController {

    @GetMapping("status")
    public ResponseEntity<Map <String, Object>> getStatusApi(){

        var response = new HashMap<String, Object>();
        response.put("service", "Product-api");
        response.put("status", "UP");
        response.put("httpStatus", HttpStatus.OK.value());
        return ResponseEntity.ok(response);
    }
}
