package com.prueba.tecnica.clima.repository;

import com.prueba.tecnica.clima.model.Weather;

import java.util.List;

public interface WeatherRepository  {
    List<Weather> findAllLimitedTo();
}
