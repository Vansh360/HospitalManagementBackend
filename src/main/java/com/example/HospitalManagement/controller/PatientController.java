// package com.example.HospitalManagement.controller;

// public class PatientController {
    
// }

package com.example.HospitalManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HospitalManagement.entity.Patient;
import com.example.HospitalManagement.repository.PatientRepository;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {

        return repo.save(patient);
    }

    @GetMapping
    public List<Patient> getPatients() {

        return repo.findAll();
    }
}