package com.training.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.training.bean.Tenant;

import com.training.tenant.response.TenantAddResponse;
import com.training.tenant.response.TenantDeleteResponse;
import com.training.tenant.response.TenantGetAllResponse;
import com.training.tenant.response.TenantGetResponse;
import com.training.tenant.response.TenantUpdateResponse;


@RestController
@RequestMapping("/tenantinvoker")
public class TenantController {

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/addTenant")
	public ResponseEntity<TenantAddResponse> f1(@RequestBody Tenant tenant){

	String url="http://02ADMINCLIENT1/Tenants/addTenant";
	Tenant t1=this.restTemplate.postForObject(url, tenant, Tenant.class);
	TenantAddResponse response= new TenantAddResponse();
	response.setStatusCode(200);
	response.setTenant(t1);
	response.setMessage("Tenant added Successfully");
	return ResponseEntity.ok(response);
	}
	@PutMapping("/updateTenant")
	public ResponseEntity<TenantUpdateResponse> f2(@RequestBody Tenant tenant){	
		String url="http://02ADMINCLIENT1/Tenants/updateTenant";
		this.restTemplate.put(url, tenant, Tenant.class);
		TenantUpdateResponse response= new TenantUpdateResponse();
		response.setStatusCode(200);
		response.setTenant(tenant);
		response.setMessage("Tenant updated Successfully");
		return ResponseEntity.ok(response);
	}
	@DeleteMapping("/deleteTenant/{tenantId}")
	public ResponseEntity<TenantDeleteResponse> f3(@PathVariable(name="tenantId")int id){
		
		String url="http://02ADMINCLIENT1/Tenants/deleteTenant/"+id;
		this.restTemplate.delete(url);
		TenantDeleteResponse response= new TenantDeleteResponse();
		response.setStatusCode(200);
		response.setMessage("Tenant removed Successfully");
		return ResponseEntity.ok(response);	
	}
	@GetMapping("/getTenantById/{tenantId}")
	public ResponseEntity<TenantGetResponse> f4(@PathVariable(name="tenantId") int id){
		String url="http://02ADMINCLIENT1/Tenants/getTenantById/" +id;
		Tenant t1=this.restTemplate.getForObject(url, Tenant.class);
		TenantGetResponse response= new TenantGetResponse();
		response.setStatusCode(200);
		response.setTenant(t1);
		response.setMessage("Tenant found by id Successfully");
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getAllTenant")
	public ResponseEntity<TenantGetAllResponse> f5(@RequestBody Tenant tenant){
		String url="http://02ADMINCLIENT1/Tenants/getAllTenant";
		//Flat f1=this.restTemplate.getForObject(url, Flat.class);
		List<Tenant> allTenant=this.restTemplate.getForObject(url, List.class);
		TenantGetAllResponse response= new TenantGetAllResponse();
		response.setStatusCode(200);
		response.setGetAllTenant(allTenant);
		response.setMessage("Tenants found Successfully");
		return ResponseEntity.ok(response);
	}
}