package company.clinic.controllers;



import company.clinic.entities.Patient;
import company.clinic.repositories.IPatientRepositoryImpl;
import company.clinic.repositories.interfaces.IPatientRepository;

import java.util.List;

public class PatientController {
     IPatientRepository patientRepository=new IPatientRepositoryImpl();



    public List<Patient> getAllPatients() {
       List<Patient> patients=patientRepository.getAllPatients();

        return patients;
    }

    public String addPatient(String name, String surname, Integer age) {
        Patient patient = new Patient(name, surname, age);

        boolean created = patientRepository.addPatient(patient);

        return (created ? "Patient was created!" : "Patient creation was failed!");
    }
}
