package company.clinic.controllers;

import company.clinic.entities.Symptom;
import company.clinic.repositories.ISymptomRepositoryImpl;
import company.clinic.repositories.interfaces.ISymptomRepository;

import java.util.List;

public class SymptomsController {
    ISymptomRepository symptomRepository = new ISymptomRepositoryImpl();

    public List<Symptom> getAllSymptoms() {
        List<Symptom> symptoms = symptomRepository.getAllSymptoms();

        return symptoms;
    }

    public String addSymptom(String title) {
        Symptom symptom = new Symptom(title);

        boolean created = symptomRepository.addSymptom(symptom);

        return (created ? "Symptom was created!" : "Symptom creation was failed!");
    }
}
