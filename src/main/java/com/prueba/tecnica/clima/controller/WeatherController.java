package com.prueba.tecnica.clima.controller;

import com.prueba.tecnica.clima.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@Slf4j
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("${weather.api.get-weather-by-city}")
    public Object getWeatherByCity(
            @RequestParam @Validated String city
    ) {
        log.info("Ciudad consultada: {}", city);
        return weatherService.getWeatherByCity(city);
    }

    @GetMapping("${weather.api.get-weather-history}")
    public Object getWeatherHistory() {
        log.info("Historial de clima");
        return weatherService.getWeatherHistory();
    }
}
