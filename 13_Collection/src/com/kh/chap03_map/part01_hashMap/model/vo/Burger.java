// 2021.11.19(금) 12h
package com.kh.chap03_map.part01_hashMap.model.vo;

public class Burger {
	
	// [필드부]
	private String flavor; // 맛
	private int calorie; // 열량
	
	// [생성자부]
	public Burger() {
		super();
	}

	public Burger(String flavor, int calorie) {
		super();
		this.flavor = flavor;
		this.calorie = calorie;
	}

	// [메소드부] getter, setter, toString()
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "Burger [flavor=" + flavor + ", calorie=" + calorie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calorie;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Burger other = (Burger) obj;
		if (calorie != other.calorie)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		return true;
	}

}
