package com.training.bean;

import java.time.LocalDate;
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
@Table(name="FlatBookings30")
public class FlatBooking {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "flatbkng_seq"
			)
	@SequenceGenerator(
			name="flatbkng_seq",
			sequenceName = "flatbooking_seq",
			allocationSize = 1
			)
private int bookingNo;
	@OneToOne
	
private Flat flat;
@OneToOne
private Tenant tenant;
@Column
private LocalDate bookingFromDate;
@Column
private LocalDate bookingToDate;

public FlatBooking(int bookingNo, Flat flat, Tenant tenant, LocalDate bookingFromDate, LocalDate bookingToDate) {
	super();
	this.bookingNo = bookingNo;
	this.flat = flat;
	this.tenant = tenant;
	this.bookingFromDate = bookingFromDate;
	this.bookingToDate = bookingToDate;
}

public FlatBooking(Flat flat, Tenant tenant, LocalDate bookingFromDate, LocalDate bookingToDate) {
	super();
	this.flat = flat;
	this.tenant = tenant;
	this.bookingFromDate = bookingFromDate;
	this.bookingToDate = bookingToDate;
}

public FlatBooking(int bookingNo) {
	super();
	this.bookingNo = bookingNo;
}

public FlatBooking() {
	super();
}
public int getBookingNo() {
	return bookingNo;
}
public void setBookingNo(int bookingNo) {
	this.bookingNo = bookingNo;
}
public Flat getFlat() {
	return flat;
}
public void setFlat(Flat flat) {
	this.flat = flat;
}
public Tenant getTenant() {
	return tenant;
}
public void setTenant(Tenant tenant) {
	this.tenant = tenant;
}
public LocalDate getBookingFromDate() {
	return bookingFromDate;
}
public void setBookingFromDate(LocalDate bookingFromDate) {
	this.bookingFromDate = bookingFromDate;
}
public LocalDate getBookingToDate() {
	return bookingToDate;
}
public void setBookingToDate(LocalDate bookingToDate) {
	this.bookingToDate = bookingToDate;
}
@Override
public String toString() {
	return "FlatBooking [bookingNo=" + bookingNo + ", flat=" + flat + ", tenant=" + tenant + ", bookingFromDate="
			+ bookingFromDate + ", bookingToDate=" + bookingToDate + "]";
}
@Override
public int hashCode() {
	return Objects.hash(bookingNo);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FlatBooking other = (FlatBooking) obj;
	return bookingNo == other.bookingNo;
}



}