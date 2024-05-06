package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.bean.Landlord;
@Repository
public interface LandlordDAO extends JpaRepository<Landlord, Integer> {

}
