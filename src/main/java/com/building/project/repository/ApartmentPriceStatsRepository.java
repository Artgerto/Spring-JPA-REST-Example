package com.building.project.repository;

import com.building.project.models.ApartmentPriceStats;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface ApartmentPriceStatsRepository extends Repository<ApartmentPriceStats, Long> {
    List<ApartmentPriceStats> findByIdApartment(Long idApartment);
}
