package com.prueba.tecnica.clima.service.impl;

import com.google.gson.Gson;
import com.prueba.tecnica.clima.client.OpenWeatherClient;
import com.prueba.tecnica.clima.client.OpenWeatherGeoClient;
import com.prueba.tecnica.clima.client.bean.GeoBean;
import com.prueba.tecnica.clima.model.Weather;
import com.prueba.tecnica.clima.repository.WeatherApiRepository;
import com.prueba.tecnica.clima.repository.WeatherRepository;
import com.prueba.tecnica.clima.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private OpenWeatherGeoClient openWeatherGeoClient;

    @Autowired
    private OpenWeatherClient openWeatherClient;

    @Autowired
    private WeatherApiRepository weatherApiRepository;

    @Autowired
    private WeatherRepository weatherRepository;

    @Override
    public Object getWeatherByCity(String city) {

        GeoBean[] geoLocalitation = openWeatherGeoClient.getGeoByCity(city);

        Weather weatherEntity = openWeatherClient.getWeatherByCity(
                geoLocalitation[0].getLat(),
                geoLocalitation[0].getLon());

        log.info(new Gson().toJson(weatherEntity));

        weatherApiRepository.save(weatherEntity);

        return weatherEntity;
    }

    @Override
    public Object getWeatherHistory() {
        return weatherRepository.findAllLimitedTo();
    }
}
