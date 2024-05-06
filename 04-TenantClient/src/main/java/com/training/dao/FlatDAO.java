package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.bean.Flat;
@Repository
public interface FlatDAO extends JpaRepository<Flat, Integer> {

}
