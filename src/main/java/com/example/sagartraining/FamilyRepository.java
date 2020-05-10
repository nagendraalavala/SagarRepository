package com.example.sagartraining;


import com.example.sagartraining.persistence.Entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<EventEntity,Long>
{


}
