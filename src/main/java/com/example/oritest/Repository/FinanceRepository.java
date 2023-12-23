package com.example.oritest.Repository;

import com.example.oritest.Entity.DividendEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends JpaRepository<DividendEntity, Long> {

}