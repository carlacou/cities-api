package com.github.carlacou.cities.api.countries.repository;

import com.github.carlacou.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Countryrepository extends JpaRepository<Country, Long> {
}
