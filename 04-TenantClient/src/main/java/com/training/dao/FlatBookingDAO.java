package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.bean.FlatBooking;
@Repository
public interface FlatBookingDAO extends JpaRepository<FlatBooking, Integer> {

}
