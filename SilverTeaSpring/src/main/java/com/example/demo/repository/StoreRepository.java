package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.store_location;

@Repository
public interface StoreRepository extends JpaRepository<store_location,Integer> {

}
