package com.app.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Patient;
import com.app.Service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient patient)
	{
		return patientService.addPatient(patient);
		
	}
	
	@GetMapping("/allPatient") 
	public List<Patient> getAllPatients(@RequestBody Patient patient)
	{
		return patientService.getAllPatient();
	}
	
	@GetMapping("/patientBYId/{pId}")
	public Patient getPatientById(@PathVariable int pId) {
        return patientService.getPatientById(pId);
	}
	
	@DeleteMapping("/deleteById/{pIds}")
	public String deletePatientById(@PathVariable int pIds)
	{
		
		return patientService.deletePatientById(pIds);
	}
}
