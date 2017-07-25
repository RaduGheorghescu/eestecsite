package ro.eestec.Event;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
public class EventFactory {

    public Event generateEvent(EventTypes eventType){
        if(eventType == EventTypes.INTERN)
            return new InternEvent();
        if(eventType == EventTypes.INTERNATIONAL)
            return new InternationalEvent();
        if(eventType == EventTypes.LOCAL)
            return new LocalEvent();
        if(eventType == EventTypes.OPERATIONAL)
            return new OperationalEvent();
        return null;
    }
}
