package com.prueba.tecnica.clima.client.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class GeoBean {
    private String name;
    private float lat;
    private float lon;
}
