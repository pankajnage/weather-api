package com.panks.weather.weatherapi.repositories;

import com.panks.weather.weatherapi.entities.ApiKeyRate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApiKeyRateRepository extends JpaRepository<ApiKeyRate, String> {

}
