package com.tqm.examsem3taquangminh.repo;

import com.tqm.examsem3taquangminh.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepo extends JpaRepository<SaleEntity, Long> {
}
