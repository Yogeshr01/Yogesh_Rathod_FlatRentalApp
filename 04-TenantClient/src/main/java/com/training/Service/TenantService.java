package com.training.Service;

import java.util.List;

import com.training.bean.Tenant;

public interface TenantService {
Tenant addTenant(Tenant tenant);
    
    Tenant updateTenant(Tenant tenant);
    
    String deleteTenant(Tenant tenant);
    
    Tenant getTenant(int tenantId);
    
    List<Tenant> getAllTenants();
    
    //Tenant validateTenant(int tenantid);
}