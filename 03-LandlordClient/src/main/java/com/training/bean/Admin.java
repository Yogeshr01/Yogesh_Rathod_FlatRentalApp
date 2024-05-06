package com.training.bean;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="Adminusers")
public class Admin {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "admn_seq"
			)
	@SequenceGenerator(
			name="admn_seq",
			sequenceName = "admin_seq",
			allocationSize = 1
			)
private int adminId;
	@Column
private String adminPassword;
	@Column
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