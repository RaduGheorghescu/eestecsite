package ro.eestec.event;

import org.springframework.stereotype.Component;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Component
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
