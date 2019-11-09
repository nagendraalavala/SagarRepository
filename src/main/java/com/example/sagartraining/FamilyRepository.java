package com.example.sagartraining;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends CrudRepository<FamilyEntity,Long>
{


}
