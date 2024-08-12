package com.ufc.ultimate_fighting_championship.fighter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/fighter")

public class FighterController {

    private final FighterService fighterService;

    @Autowired
    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @GetMapping
    public List<Fighter> getFighters(@RequestParam(required = false) String name,
                                     @RequestParam(required = false) String weight,
                                     @RequestParam(required = false) String height,
                                     @RequestParam(required = false) String stance) {

        if (name != null) {
            return fighterService.getFighterByName(name);
        } else if (weight != null) {
            return fighterService.getFighterByWeight(weight);
        } else if (height != null) {
            return fighterService.getFighterByHeight(height);
        } else if (stance != null) {
            return fighterService.getFighterByStance(stance);
        } else {
            return fighterService.getAllFighters();
        }
    }
}