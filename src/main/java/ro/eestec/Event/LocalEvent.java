package ro.eestec.Event;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */


@Entity
public class LocalEvent extends Event{
    private String test;
}
