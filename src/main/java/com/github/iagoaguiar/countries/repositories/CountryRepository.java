package com.github.iagoaguiar.countries.repositories;

import com.github.iagoaguiar.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
