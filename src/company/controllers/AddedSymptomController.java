package company.clinic.controllers;

import company.clinic.repositories.IAddedSymptomsRepositoryImpl;
import company.clinic.repositories.interfaces.IAddedSymptomsRepository;
import java.util.List;

public class AddedSymptomController {
    IAddedSymptomsRepository addedSymptomsRepository = new IAddedSymptomsRepositoryImpl();

    public String addedSymptom(int id, String symptom){
        boolean created = addedSymptomsRepository.addAddedSymptoms(id,symptom);

        return (created ? "Symptom was added!" : "Failed");
    }
    public  String removeAddedSymptom(int id,String symptom){
        boolean created = addedSymptomsRepository.returnAddedSymptom(id,symptom);

        return (created ? "Symptom was removed!" : "Failed");
    }

    public String getAddedSymptomsByPatientId(Integer patientId){
        List<String> symptoms = addedSymptomsRepository.showAddedSymptoms(patientId);
        return symptoms.toString();
    }
}
