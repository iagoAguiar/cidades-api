package com.github.iagoaguiar.countries.resources;

import com.github.iagoaguiar.countries.entities.Country;
import com.github.iagoaguiar.countries.repositories.CountryRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

  private final CountryRepository repository;

  public CountryResource(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<Country> cities() {

    return repository.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity getOne(@PathVariable Long id){
    Optional<Country> optional = repository.findById(id);
    if(optional.isPresent()){
      return ResponseEntity.ok().body(optional.get());

    }
    return ResponseEntity.notFound().build();

  }
}
