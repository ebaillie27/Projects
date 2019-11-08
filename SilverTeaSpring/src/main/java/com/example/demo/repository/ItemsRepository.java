package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.items;

@Repository
public interface ItemsRepository extends JpaRepository<items,Integer>{

}
