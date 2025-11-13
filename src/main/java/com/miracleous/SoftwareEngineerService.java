package com.miracleous;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    // Returning "SoftwareEngineer" which is an entity
    // Usually, you don't want to do this, but map it into a DTO (because there might be some data that doesn't want to be returned to the client, i.e. password)
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();

        // Best practices:
//        return softwareEngineerRepository.findAll().stream().map([A class that you can return to the client]);
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }
}
