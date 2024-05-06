package com.training.RestController;

import java.util.List;

import com.training.bean.Tenant;

public interface TenantRestController {
Tenant addTenant(Tenant tenant);
    
    Tenant updateTenant(Tenant tenant);
    
    String deleteTenant(Tenant tenant);
    
    Tenant getTenantById(int tenantId);
    
    List<Tenant> getAllTenants();
}
