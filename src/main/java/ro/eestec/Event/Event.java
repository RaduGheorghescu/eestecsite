package ro.eestec.Event;

import ro.eestec.Team.Team;

import javax.persistence.Id;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
public abstract class Event {
    @Id
    private String abbreviation;

    private String name;

    private String eventDescription;

    private Team team;


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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
