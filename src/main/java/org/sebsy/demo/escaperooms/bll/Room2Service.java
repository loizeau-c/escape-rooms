package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile("trap")
public class Room2Service implements RoomService {


    public String entreeSalle() {
        return "Perdu, vous etes dans la mauvaise salle !";
    }

}
