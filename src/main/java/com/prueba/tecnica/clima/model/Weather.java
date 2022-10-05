package com.prueba.tecnica.clima.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Weather {

    @Id
    private Long id;

    private String name;

    private Long timezone;

    private Long dt;

    private String base;

    private String visibility;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> coord;

    @Convert(converter = ListConverter.class)
    private List<Map<String, Object>> weather;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> main;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> wind;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> clouds;

    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> sys;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date lastSearch;

    @PrePersist
    private void onCreate() {
        lastSearch = new Date();
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', time='%d']",
                id, name, timezone);
    }
}
