package com.example.oritest.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/finance/dividend/{companyName}")
    public ResponseEntity<?> searchFinance(@PathVariable String companyName) {
        return ResponseEntity.ok(companyName + "주식을 조회합니다.");
    }


    @GetMapping("/company/autocomplete")
    public ResponseEntity<?> autoComplete(@RequestParam String keyword) {
        return null;
    }

    @GetMapping("/company")
    public ResponseEntity<?> searchCompany() {
        return null;
    }

}
