package ro.eestec.edition;

import ro.eestec.event.Event;
import ro.eestec.team.Team;

import javax.persistence.*;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Event event;

    @OneToOne
    private Team team;
}
