package com.training.bean;

import java.util.Objects;


public class Admin {
	
private int adminId;
	
private String adminPassword;
	
private String userName;
public Admin(int adminId, String adminPassword, String userName) {
	super();
	this.adminId = adminId;
	this.adminPassword = adminPassword;
	this.userName = userName;
}
public Admin(String adminPassword, String userName) {
	super();
	this.adminPassword = adminPassword;
	this.userName = userName;
}
public Admin(int adminId) {
	super();
	this.adminId = adminId;
}
public Admin() {
	super();
}
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminPassword=" + adminPassword + ", userName=" + userName + "]";
}
@Override
public int hashCode() {
	return Objects.hash(adminId);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Admin other = (Admin) obj;
	return adminId == other.adminId;
}



}