package ro.eestec.Event;

import ro.eestec.Edition.Edition;
import ro.eestec.Team.Team;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Event {
    @Id
    private String abbreviation;

    private String name;

    private String eventDescription;

    @OneToMany
    private List<Edition> editionList;


    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public List<Edition> getEditionList() {
        return editionList;
    }

    public void addEdition(Edition edition) {
        this.editionList.add(edition);
    }
}
