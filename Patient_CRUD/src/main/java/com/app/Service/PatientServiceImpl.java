package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Patient;
import com.app.repository.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepo patientRepo;

	@Override
	public Patient addPatient(Patient patient) {

		return patientRepo.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {

		return patientRepo.findAll();
	}

	@Override
	public Patient getPatientById(int pId) {

		return patientRepo.findById(pId).orElse(null);
	}

	@Override
	public String deletePatientById(int pIds) {
		patientRepo.deleteById(pIds);

		return "Patients Data Deleted";

	}

	@Override
	public Patient updatePatient(Patient patient) {
		Patient existingPatient = patientRepo.findById(patient.getpId()).orElse(null);
		existingPatient.setpName(patient.getpName());
		existingPatient.setpAddress(patient.getpAddress());

		return patientRepo.save(existingPatient);

	}

}
