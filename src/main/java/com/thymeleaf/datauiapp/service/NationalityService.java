package com.thymeleaf.datauiapp.service;

import com.thymeleaf.datauiapp.models.Nationality;
import com.thymeleaf.datauiapp.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {

    @Autowired
    private NationalityRepository nationalityRepository;

    public List<Nationality> getNationalities() {

        return (List<Nationality>) nationalityRepository.findAll();
    }

    public void save(Nationality nationality) {
        nationalityRepository.save(nationality);
    }

    public Optional<Nationality> getNationalityById(Integer id) {
        return nationalityRepository.findById(id);
    }

    public void deleteById(Integer id) {
        nationalityRepository.deleteById(id);
    }

    public void updateNationality(Nationality nationality) {
        nationalityRepository.save(nationality);

    }

    public void addNationality(Nationality nationality) {
        nationalityRepository.save(nationality);
    }

}
