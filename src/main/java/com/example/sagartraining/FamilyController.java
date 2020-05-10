package com.example.sagartraining;

import com.example.sagartraining.persistence.DAO.RegistrationDAO;
import com.example.sagartraining.persistence.DTO.RegistrationDTO;
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
    public RegistrationDAO saveUser(@RequestBody RegistrationDTO registrationDTO)
    {
         familyService.AddCompany(registrationDTO);
         RegistrationDAO registrationDAO = new RegistrationDAO();
         return registrationDAO;
    }

//    @GetMapping("/all")
//    public List<FamilyEntity> all()
//    {
//        return familyService.findallfamilies();
//    }
//
//    @GetMapping("/find/{id}")
//    public Optional<FamilyEntity> findbyId(@PathVariable Long id)
//    {
//        return familyService.findfamily(id);
//    }
//
//



}
