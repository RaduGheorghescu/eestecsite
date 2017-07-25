package ro.eestec.Event;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Transactional
public interface InternEventRepository extends EventBaseRepository<InternEvent>, JpaRepository<InternEvent,String> {

}
