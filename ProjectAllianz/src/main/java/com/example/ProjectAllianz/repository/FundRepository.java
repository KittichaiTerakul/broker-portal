package com.example.ProjectAllianz.repository;

import com.example.ProjectAllianz.model.Funds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundRepository extends JpaRepository<Funds,Integer> {
}
