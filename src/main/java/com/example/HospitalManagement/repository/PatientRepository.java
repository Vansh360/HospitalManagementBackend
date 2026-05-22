package com.example.HospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalManagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}