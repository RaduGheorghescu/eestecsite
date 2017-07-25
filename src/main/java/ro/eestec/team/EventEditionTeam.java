package ro.eestec.team;

import ro.eestec.edition.Edition;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
public class EventEditionTeam extends Team{
    @OneToOne
    private Edition edition;
}
