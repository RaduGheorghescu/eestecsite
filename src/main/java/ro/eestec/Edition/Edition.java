package ro.eestec.Edition;

import ro.eestec.Event.Event;
import ro.eestec.Team.EventEditionTeam;
import ro.eestec.Team.Team;

import javax.persistence.*;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
public abstract class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Event event;

    @OneToOne
    private Team team;
}
