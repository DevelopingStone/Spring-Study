package com.example.oritest.web;

import com.example.oritest.Entity.DividendEntity;
import com.example.oritest.service.FinanceService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
@AllArgsConstructor
public class FinanceController {

    FinanceService financeService;

    @GetMapping("/dividend/{companyName}")
    public ResponseEntity<?> searchFinance(@PathVariable String companyName) {
        long companyId = financeService.searchCompanyId(companyName);
        List<DividendEntity> dividendEntities = financeService.searchCompanyDividend(companyId);
        return ResponseEntity.ok(dividendEntities);
    }
}
