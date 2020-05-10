package com.example.sagartraining.persistence.DTO;

import lombok.Data;

@Data
public class RegistrationDTO
{
    private String companyName;
    private String companyAge;
    private String companyStream;
    private String companyCEO;
    private long totalEvents;
    private String contactNumber;
    private float companyRating;
    private String companystatus;
}
