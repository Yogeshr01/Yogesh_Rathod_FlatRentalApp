package com.training.bean;

import java.util.List;
import java.util.Objects;


public class Landlord {
	
	

	 private int landLordId;
	
	private String landLordName;
	
	private int landLordAge;
	
	private List<Flat>flatList;
	
	
	
	public Landlord(int landLordId, String landLordName, int landLordAge, List<Flat> flatList) {
		super();
		this.landLordId = landLordId;
		this.landLordName = landLordName;
		this.landLordAge = landLordAge;
		this.flatList = flatList;
	}
	public Landlord(String landLordName, int landLordAge, List<Flat> flatList) {
		super();
		this.landLordName = landLordName;
		this.landLordAge = landLordAge;
		this.flatList = flatList;
	}
	public Landlord(int landLordId) {
		super();
		this.landLordId = landLordId;
	}
	public Landlord() {
		super();
	}
	public int getLandLordId() {
		return landLordId;
	}
	public void setLandLordId(int landLordId) {
		this.landLordId = landLordId;
	}
	public String getLandLordName() {
		return landLordName;
	}
	public void setLandLordName(String landLordName) {
		this.landLordName = landLordName;
	}
	public int getLandLordAge() {
		return landLordAge;
	}
	public void setLandLordAge(int landLordAge) {
		this.landLordAge = landLordAge;
	}
	public List<Flat> getFlatList() {
		return flatList;
	}
	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}
	
	@Override
	public String toString() {
		return "Landlord [landLordId=" + landLordId + ", landLordName=" + landLordName + ", landLordAge=" + landLordAge
				+ ", flatList=" + flatList + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(landLordId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Landlord other = (Landlord) obj;
		return landLordId == other.landLordId;
	}
	
	
}
