package br.com.mv.microservices.productapi.controller;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/api")
public class ProductController {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static LocalDateTimeSerializer LOCAL_DATETIME_SERIALIZER = new LocalDateTimeSerializer(
            DateTimeFormatter.ofPattern(DATE_TIME_FORMAT));
    @GetMapping("status")
    public ResponseEntity<Map <String, Object>> getStatusApi(){

        var response = new HashMap<String, Object>();
        response.put("service", "Product-api");
        response.put("status", "UP");
        response.put("httpStatus", HttpStatus.OK.value());
        return ResponseEntity.ok(response);

    }
}
