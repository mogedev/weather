package com.prueba.tecnica.clima.repository;

import com.prueba.tecnica.clima.model.Weather;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class WeatherRepositoryImpl implements WeatherRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Weather> findAllLimitedTo() {
        return entityManager.createQuery("SELECT w FROM Weather w ORDER BY w.lastSearch DESC",
                Weather.class).setMaxResults(10).getResultList();
    }
}
