package com.training.RestController;

import java.util.List;

import com.training.bean.Tenant;

public interface TenantRestController {
	Tenant addTenant(Tenant tenant) ;
	Tenant updateTenant(Tenant tenant) ;
	String deleteTenant(int tenantId) ;
	Tenant getTenantById(int id) ;
	List<Tenant> getAllTenants();
	//Tenant validateTenent(int tenantId);
}
