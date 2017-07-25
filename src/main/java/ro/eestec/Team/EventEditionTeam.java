package ro.eestec.Team;

import ro.eestec.Edition.Edition;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
public class EventEditionTeam extends Team{
    @OneToOne
    private Edition edition;
}
