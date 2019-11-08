package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.supply;


@Repository
public interface SupplyRepository extends JpaRepository<supply,Integer> {

}
