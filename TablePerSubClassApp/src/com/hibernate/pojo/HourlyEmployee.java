package com.hibernate.pojo;

public class HourlyEmployee extends Employee {
	private int hours;
	private double salPerHour;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSalPerHour() {
		return salPerHour;
	}

	public void setSalPerHour(double salPerHour) {
		this.salPerHour = salPerHour;
	}

}
