package com.training.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Landlord;
import com.training.bean.Tenant;
import com.training.dao.TenantDAO;
@Service
public class TenantServiceImpl implements TenantService {
	@Autowired
    private TenantDAO tenantDAO;

    public TenantDAO getTenantDAO() {
		return tenantDAO;
	}

	public void setTenantDAO(TenantDAO tenantDAO) {
		this.tenantDAO = tenantDAO;
	}

	@Override
    public Tenant addTenant(Tenant tenant) {
       Tenant ten=this.tenantDAO.save(tenant);
		return ten;
    }

    @Override
    public Tenant updateTenant(Tenant tenant) {
    	 Tenant ten=this.tenantDAO.save(tenant);
 		return ten;
    }

    @Override
    public String deleteTenant(Tenant tenant) {
       this.tenantDAO.delete(tenant);
       return "Tenant Deleted Successfully";
    }

    @Override
    public Tenant getTenant(int tenantId) {
    	Optional<Tenant> tenantOptional=this.tenantDAO.findById(tenantId);
	 	if(tenantOptional.isPresent())
	 		return tenantOptional.get();
	 	else
	    return null;
    }

    @Override
    public List<Tenant> getAllTenants() {
        return tenantDAO.findAll();
    }

  /*  @Override
    public Tenant validateTenant(int tenantId) {
        // Implement validation logic here
        // For example, check if the tenant exists
        return getTenant(tenantId);
    }
}
*/
}
