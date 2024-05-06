package com.training.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.Service.TenantService;
import com.training.bean.Tenant;

@RestController
@RequestMapping("/Tenants")
public class TenantRestControllerImpl implements TenantRestController {
	@Autowired
	TenantService tenantService;

	@Override
	@PostMapping("/addTenant")
	public Tenant addTenant(@RequestBody Tenant tenant) {
		Tenant t=this.tenantService.addTenant(tenant);
		return t;
	}

	@Override
	@PutMapping("/updateTenant")
	public Tenant updateTenant(@RequestBody Tenant tenant) {
		Tenant t=this.tenantService.updateTenant(tenant);
		return t;
	}

	@Override
	@DeleteMapping("/deleteTenant/{tenantId}")
	public String deleteTenant(@PathVariable(name="tenantId") int id) {
		Tenant tenant=new Tenant();
		tenant.setTenantId(id);
		this.tenantService.deleteTenant(tenant);
		return "landlord deleted successfully";
	}

	@Override
	@GetMapping("/getTenantById/{tenantId}")
	public Tenant getTenantById(@PathVariable("tenantId") int id) {
		Tenant t=this.tenantService.getTenant(id);
			return t;
	}

	@Override
	@GetMapping("/getAllTenant")
	public List<Tenant> getAllTenants() {
		return this.tenantService.getAllTenants();
	}
	
}

