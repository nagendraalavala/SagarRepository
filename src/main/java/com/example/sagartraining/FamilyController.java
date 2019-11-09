package com.example.sagartraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sagar")
public class FamilyController
{
    @Autowired
    private FamilyService familyService;

    @PostMapping("/create")
    public FamilyEntity savefamily(@RequestBody FamilyEntity familyEntity)
    {
        return familyService.createfamily(familyEntity);
    }

    @GetMapping("/all")
    public List<FamilyEntity> all()
    {
        return familyService.findallfamilies();
    }

    @GetMapping("/find/{id}")
    public Optional<FamilyEntity> findbyId(@PathVariable Long id)
    {
        return familyService.findfamily(id);
    }





}
