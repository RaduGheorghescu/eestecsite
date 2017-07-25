package ro.eestec.event;

import ro.eestec.site.EventSite;
import ro.eestec.site.Site;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */


@Entity
public class LocalEvent extends Event{

    @OneToOne
    private Site site; //EventSite
}
