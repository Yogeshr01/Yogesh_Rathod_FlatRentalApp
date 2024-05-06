package com.training.bean;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Flats20")

public class Flat {
	@Id
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "flt_seq"
			)
	@SequenceGenerator(
			name="flt_seq",
			sequenceName = "flat_seq",
			allocationSize = 1
			)
	private int flatId;
	@Column
	private float cost;
	@Embedded
	
	private FlatAddress flatAddress;
	@Column
	private String availability;

	public Flat(int flatId, float cost, FlatAddress flatAddress, String availability) {
		super();
		this.flatId = flatId;
		this.cost = cost;
		this.flatAddress = flatAddress;
		this.availability = availability;
	}

	public Flat(float cost, FlatAddress flatAddress, String availability) {
		super();
		this.cost = cost;
		this.flatAddress = flatAddress;
		this.availability = availability;
	}

	public Flat(int flatId) {
		super();
		this.flatId = flatId;
	}

	public Flat() {
		super();
	}

	public int getFlatId() {
		return flatId;
	}

	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public FlatAddress getFlatAddress() {
		return flatAddress;
	}

	public void setFlatAddress(FlatAddress flatAddress) {
		this.flatAddress = flatAddress;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Flat [flatId=" + flatId + ", cost=" + cost + ", flatAddress=" + flatAddress + ", availability="
				+ availability + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(flatId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		return flatId == other.flatId;
	}

}