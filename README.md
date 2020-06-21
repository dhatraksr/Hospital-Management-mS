# Hospital-Management-mS

## Simple ms Architecture
![Image of ms Architecture](https://github.com/dhatraksr/Hospital-Management-mS/blob/master/hospital.svg)


## REST URL for mS
* Pathology service
	* Retrive all list of diseases with treatment - http://localhost:8080/pathology/diseases/
	* Retrieve list disease by Id http://localhost:8080/pathology/diseases/D1

* HR service:
	* Retrive all Employees(Physicians)- http://localhost:8080/hr/employees
	* Retrive by Emp Id- http://localhost:8080/hr/employees/e1

* Admission Service:
	* Retrive all patients - http://localhost:8080/admissions/patients/
	* Retrive all patients - http://localhost:8080/admissions/patients/p1

* Pathology mS -- Admission mS -- HR mS comminication
	* Admission retrives all Physicians from HR service mS- http://localhost:8080/admissions/physicians
	* Admission retrives all Diseases from Pathology service mS - http://localhost:8080/admissions/diseases
