package lesson6.taskc;

import lesson6.taska.DeptEmployee;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	public Professor(String name, double salary, LocalDate hireDate){
		super(name,salary,hireDate);
	}
}
