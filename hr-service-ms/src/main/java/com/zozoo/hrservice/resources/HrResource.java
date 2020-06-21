package com.zozoo.hrservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zozoo.hrservice.models.Employee;
import com.zozoo.hrservice.models.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrResource {

	List<Employee> employees = Arrays.asList(new Employee("e1", "Sunil", "Nasik", "Spinal"),
			new Employee("e2", "Pooja", "Pune", "Heart"), new Employee("e3", "Ankush", "Mumbai", "Psychatrist"),
			new Employee("e4", "Ankit", "Pune", "General"), new Employee("e5", "Aakash", "Pune", "Surgary"));

	@RequestMapping("/employees")
	public EmployeesList getEmployees() {

		EmployeesList employeeList = new EmployeesList();
		employeeList.setEmployees(employees);

		return employeeList;
	}

	@RequestMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") String Id) {

		Employee employee = employees.stream().filter(emp -> emp.getId().equals(Id)).findAny().orElse(null);
		return employee;

	}

}
