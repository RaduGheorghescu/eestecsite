package ro.eestec.Event;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.util.List;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */


@MappedSuperclass
public class InternationalEvent extends Event{
    @ElementCollection
    private List<InternationalEventTypes> typesList;
}
