package com.example.sagartraining.persistence.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class EventEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String companyName;
    private String start_date;
    private String companyAge;
    private String companyStream;
    private String companyCEO;
    private long totalEvents;
    private String contactNumber;
    private float companyRating;
    private String registrationStatus;
    private String companystatus;
    private LocalDateTime modifiedDate;
    private double budget;
}
