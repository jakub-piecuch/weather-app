package com.kuba.repository;

import com.kuba.model.CurrentWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentWeatherRepository extends JpaRepository<CurrentWeather, Integer>{

}
