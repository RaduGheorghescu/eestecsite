package ro.eestec.event;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */


@Entity
public class InternationalEvent extends Event{
    @ElementCollection
    private List<InternationalEventTypes> typesList;
}
