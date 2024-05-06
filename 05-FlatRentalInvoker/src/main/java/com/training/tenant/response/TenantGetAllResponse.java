package com.training.tenant.response;

import java.util.List;

import com.training.bean.Tenant;

public class TenantGetAllResponse {

	private int statusCode;
	private String message;
	private List<Tenant> getAllTenant;
	
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Tenant> getGetAllTenant() {
		return getAllTenant;
	}
	public void setGetAllTenant(List<Tenant> getAllTenant) {
		this.getAllTenant = getAllTenant;
	}
	
}
