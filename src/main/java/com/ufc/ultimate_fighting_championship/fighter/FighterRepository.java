package com.ufc.ultimate_fighting_championship.fighter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FighterRepository extends JpaRepository<Fighter,Integer> {

    void deleteByName(String fighterName);
    Optional<Fighter> findByName(String name);
}
