package ro.eestec.Event;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Transactional
public interface LocalEventRepository extends EventBaseRepository<LocalEvent>, JpaRepository<LocalEvent,String> {

}
