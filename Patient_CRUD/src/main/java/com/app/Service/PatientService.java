package com.app.Service;

import java.util.List;

import com.app.Patient;

public interface PatientService {
	
	public Patient addPatient(Patient patient);

	public List<Patient> getAllPatient();

	public Patient getPatientById(int pId);

	public String deletePatientById(int pIds);
	
	public Patient updatePatient(Patient patient);

}
