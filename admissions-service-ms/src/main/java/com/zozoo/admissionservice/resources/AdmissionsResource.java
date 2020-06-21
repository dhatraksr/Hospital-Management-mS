package com.zozoo.admissionservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zozoo.admissionservice.models.DiseasesList;
import com.zozoo.admissionservice.models.EmployeesList;
import com.zozoo.admissionservice.models.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionsResource {

	@Autowired
	private RestTemplate restTemplate;
	List<Patient> patients = Arrays.asList(new Patient("p1", "Gabor", "Hungarian"),
			new Patient("p2", "Emeka", "Nigerian"), new Patient("p3", "Emilly", "Americal"),
			new Patient("p4", "Pooja", "Indian"));

	@RequestMapping("/physicians")
	public EmployeesList getPhysicians() {
		EmployeesList employeesList = restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);

		return employeesList;

	}

	@RequestMapping("/diseases")
	public DiseasesList getDiseases() {
		DiseasesList diseasesList = restTemplate.getForObject("http://pathology-service/pathology/diseases",
				DiseasesList.class);

		return diseasesList;

	}

	@RequestMapping("/patients")
	public List<Patient> getPatients() {

		return patients;

	}

	@RequestMapping("/patients/{id}")
	public Patient getPatientById(@PathVariable("id") String id) {

		Patient p = patients.stream().filter(patients -> id.equals(patients.getId())).findAny().orElse(null);

		return p;
	}

}
