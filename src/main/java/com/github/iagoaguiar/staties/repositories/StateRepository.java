package com.github.iagoaguiar.staties.repositories;

import com.github.iagoaguiar.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
