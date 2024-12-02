package com.example.dbtest.repository;

import com.example.dbtest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Long> {
}
