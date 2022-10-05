package com.prueba.tecnica.clima.client;

import com.prueba.tecnica.clima.client.bean.GeoBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "${open.weather.api.geo.value}",
        url = "${open.weather.api.geo.url}")
public interface OpenWeatherGeoClient {

    @RequestMapping(method = RequestMethod.GET,
            value = "${open.weather.api.geo.path}")
    GeoBean[] getGeoByCity(
            @RequestParam(value="city") String city
    );
}
