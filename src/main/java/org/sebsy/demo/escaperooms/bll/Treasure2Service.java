package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Profile("treasure")
public class Treasure2Service implements TreasureService {


    public String ouvrir() {
        return "Gagné, vous avez trouvé la salle du trésor !";
    }
}
