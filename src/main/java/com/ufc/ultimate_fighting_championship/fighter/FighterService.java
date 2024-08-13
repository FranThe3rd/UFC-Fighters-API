package com.ufc.ultimate_fighting_championship.fighter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FighterService {
    private final FighterRepository fighterRepository;

    @Autowired
    public FighterService(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    public List<Fighter> getAllFighters() {
        return fighterRepository.findAll();
    }


    /**
     * This is all for searching functionality (example searching from an input)
     */

    public List<Fighter> getFighterByName(String name) {
        return fighterRepository.findAll().stream()
                .filter(fighter -> fighter.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }


    public List<Fighter> getFighterByWeight(String weight) {
        return fighterRepository.findAll().stream()
                .filter(fighter -> fighter.getWeight().toLowerCase().contains(weight.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Fighter> getFighterByHeight(String height) {
        return fighterRepository.findAll().stream()
                .filter(fighter -> fighter.getHeight().toLowerCase().contains(height.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Fighter> getFighterByStance(String stance) {
        return fighterRepository.findAll().stream()
                .filter(fighter -> fighter.getStance() != null && fighter.getStance().toLowerCase().contains(stance.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Fighter> getFighterByBirthday(String dob) {
        return fighterRepository.findAll().stream()
                .filter(fighter -> fighter.getDob() != null && fighter.getDob().toLowerCase().contains(dob.toLowerCase()))
                .collect(Collectors.toList());
    }






}