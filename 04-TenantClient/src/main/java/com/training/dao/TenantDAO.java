package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.bean.Tenant;
@Repository
public interface TenantDAO extends JpaRepository<Tenant, Integer> {

}
