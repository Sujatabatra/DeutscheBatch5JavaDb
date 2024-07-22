package com.sujata.setdemos;

import java.util.Objects;

/*
 * if you want to display the object of any class with
 * System.out.println(), then override toString() from object class into that class
 */
//POJO : Plain Old Java Object / Java Bean
public class Person {
	private int pId;
	private String pName;
	
	public Person() {
		
	}
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(pId, pName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return pId == other.pId && Objects.equals(pName, other.pName);
	}
	
	

}
