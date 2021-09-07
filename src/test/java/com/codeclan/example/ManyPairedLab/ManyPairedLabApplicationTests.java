package com.codeclan.example.ManyPairedLab;

import models.Department;
import models.Employee;
//import models.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repositories.DepartmentRepository;
import repositories.EmployeeRepository;
import repositories.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyPairedLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Finance Department");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Harper", 25, department);
		employeeRepository.save(employee);
	}

//	@Test
//	public void addEmployeesAndProjects(){
//		Department department = new Department("Finance Department");
//		departmentRepository.save(department);
//
//		Employee employee = new Employee("John", "Harper", 25, department);
//		employeeRepository.save(employee);
//
//		Project project = new Project();
//
//	}

}
