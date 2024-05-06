package com.training.bean;





import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="Tenants20")
public class Tenant {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "tent_seq"
			)
	@SequenceGenerator(
			name="tent_seq",
			sequenceName = "tenant_seq",
			allocationSize = 1
			)
private int tenantId;
	@Column
private int age;
@OneToOne
private Flat flat ;
public Tenant(int tenantId, int age, Flat flat) {
	super();
	this.tenantId = tenantId;
	this.age = age;
	this.flat = flat;
}
public Tenant(int age, Flat flat) {
	super();
	this.age = age;
	this.flat = flat;
}
public Tenant(int tenantId) {
	super();
	this.tenantId = tenantId;
}
public Tenant() {
	super();
}
public int getTenantId() {
	return tenantId;
}
public void setTenantId(int tenantId) {
	this.tenantId = tenantId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Flat getFlat() {
	return flat;
}
public void setFlat(Flat flat) {
	this.flat = flat;
}
@Override
public String toString() {
	return "Tenant [tenantId=" + tenantId + ", age=" + age + ", flat=" + flat + "]";
}
@Override
public int hashCode() {
	return Objects.hash(tenantId);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Tenant other = (Tenant) obj;
	return tenantId == other.tenantId;
}




}