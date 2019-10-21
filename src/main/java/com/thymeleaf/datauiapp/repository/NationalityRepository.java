package com.thymeleaf.datauiapp.repository;

import com.thymeleaf.datauiapp.models.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
}
