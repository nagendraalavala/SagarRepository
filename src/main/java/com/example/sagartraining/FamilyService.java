package com.example.sagartraining;


import com.example.sagartraining.persistence.DAO.RegistrationDAO;
import com.example.sagartraining.persistence.DTO.RegistrationDTO;
import com.example.sagartraining.persistence.Entity.EventEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService
{
    private ModelMapper modelMapper;
    private FamilyRepository familyRepository;

    @Autowired
    public FamilyService(ModelMapper modelMapper,
                         FamilyRepository familyRepository) {
        this.modelMapper = modelMapper;
        this.familyRepository = familyRepository;
    }

    public RegistrationDAO AddCompany(RegistrationDTO newUser)
    {
        EventEntity eventEntity;
        eventEntity = modelMapper.map(newUser,EventEntity.class);
        RegistrationDAO registrationDAO = new RegistrationDAO();
        return registrationDAO;
    }
}
