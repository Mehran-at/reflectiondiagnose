package at.nacs.drhousediagnoses;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PatientManager {
    private final PatientRepository repository;

    public Optional<Patient> findByName(String name) {
        return repository.findByName(name);
    };

    public Optional<Patient> findBySymptoms(String symptoms) {
        return repository.findBySymptoms(symptoms);
    };

    public Optional<Patient> findByDiagnosis(String diagnosis) {
        return repository.findByDiagnosis(diagnosis);
    };

    public Optional<Patient> findByMedicine(String medicine) {
        return repository.findByMedicine(medicine);
    };
}
