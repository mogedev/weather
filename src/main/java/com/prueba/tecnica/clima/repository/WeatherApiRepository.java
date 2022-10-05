package com.prueba.tecnica.clima.repository;

import com.prueba.tecnica.clima.model.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherApiRepository extends CrudRepository<Weather, Long> {
}
