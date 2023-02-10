package company.clinic.repositories.interfaces;

import company.clinic.entities.Symptom;


import java.util.List;

public interface ISymptomRepository {
    boolean addSymptom(Symptom symptom);
    List<Symptom> getAllSymptoms();
}
