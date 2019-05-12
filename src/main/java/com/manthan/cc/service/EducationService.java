package com.manthan.cc.service;

import com.manthan.cc.entity.Education;
import com.manthan.cc.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EducationService {

    private final EducationRepository educationRepository;

    @Autowired
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    /**
     * @param id
     * @return
     */
    public Education findById(long id) {
        Optional<Education> education = educationRepository.findById(id);
        return education.orElseGet(Education::new);
    }

}
