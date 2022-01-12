package com.example.Ex11_Model.repository;

import com.example.Ex11_Model.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository  extends JpaRepository<Cat, Integer> {

}
