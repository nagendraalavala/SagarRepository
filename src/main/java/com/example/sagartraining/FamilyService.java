package com.example.sagartraining;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService
{
    @Autowired
    private FamilyRepository familyRepository;

    //create family
    public FamilyEntity createfamily(@RequestBody FamilyEntity familyEntity)
    {
        return familyRepository.save(familyEntity);
    }
    //find details by id
    public Optional<FamilyEntity> findfamily(Long id)
    {
        return familyRepository.findById(id);
    }

    //get all family details
    public List<FamilyEntity> findallfamilies()
    {
        return (List<FamilyEntity>) familyRepository.findAll();
    }

}
