package com.app;

public class Student {
	private int StuId;
	private String StdName;
	private double StuFee;

	public int getStuId() {
		return StuId;
	}

	public void setStuId(int stuId) {
		StuId = stuId;
	}

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public double getStuFee() {
		return StuFee;
	}

	public void setStuFee(double stuFee) {
		StuFee = stuFee;
	}

	public String toString() {
		return "Student [StuId=" + StuId + ", StdName=" + StdName + ", StuFee="
				+ StuFee + "]";
	}

}// bean class
