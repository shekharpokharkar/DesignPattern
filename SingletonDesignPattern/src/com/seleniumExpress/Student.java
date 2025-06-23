package com.seleniumExpress;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentName;
	private String studentAddress;
	private Boolean isMarried;
	private Long studentSalary;
	private static volatile Student student = null;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public Long getStudentSalary() {
		return studentSalary;
	}

	public void setStudentSalary(Long studentSalary) {
		this.studentSalary = studentSalary;
	}

	private Student() {
		if (student != null) {
			throw new RuntimeException("Create student object by Using getStudentInstance()");
		}

	}

	public static Student getStudentInstance() {
		if (student == null) {
			synchronized (Student.class) {
				if (student == null) {
					student = new Student();
				}

			}
		}
		return student;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		throw new RuntimeException("Create student object by Using getStudentInstance()");
	}

	public Object readResolve() {
		return getStudentInstance();
	}

	@Override
	public int hashCode() {
		return Objects.hash(isMarried, studentAddress, studentName, studentSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(isMarried, other.isMarried) && Objects.equals(studentAddress, other.studentAddress)
				&& Objects.equals(studentName, other.studentName) && Objects.equals(studentSalary, other.studentSalary);
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddress=" + studentAddress + ", isMarried=" + isMarried
				+ ", studentSalary=" + studentSalary + "]";
	}

}
