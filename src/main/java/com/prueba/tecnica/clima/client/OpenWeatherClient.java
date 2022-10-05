package com.prueba.tecnica.clima.client;

import com.prueba.tecnica.clima.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "${open.weather.api.weather.value}",
        url = "${open.weather.api.weather.url}")
public interface OpenWeatherClient {

    @RequestMapping(method = RequestMethod.GET,
            value = "${open.weather.api.weather.path}")
    Weather getWeatherByCity(
            @RequestParam(value="lat") float lat,
            @RequestParam(value="lon") float lon
    );
}
