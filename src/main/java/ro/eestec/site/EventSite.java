package ro.eestec.site;

import ro.eestec.event.Event;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
public class EventSite extends Site{
    @OneToOne
    private Event event; //LocalEvent
}
