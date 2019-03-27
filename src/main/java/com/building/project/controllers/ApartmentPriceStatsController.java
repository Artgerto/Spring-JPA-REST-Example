package com.building.project.controllers;

import com.building.project.exception.ResourceNotFoundException;
import com.building.project.models.ApartmentPriceStats;
import com.building.project.repository.ApartmentPriceStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ApartmentPriceStatsController {

    @Autowired
   ApartmentPriceStatsRepository apartmentPriceStatsRepository;

    @RequestMapping(value = "/apart/prognosis/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    List<ApartmentPriceStats> getStats(@PathVariable Long id) {
        List<ApartmentPriceStats> apartmentPriceStatsList = apartmentPriceStatsRepository.findByIdApartment(id);
        if(apartmentPriceStatsList.size() == 0){
            throw new ResourceNotFoundException(id);
        }
        return apartmentPriceStatsList;
    }
}
