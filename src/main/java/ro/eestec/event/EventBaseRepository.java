package ro.eestec.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@NoRepositoryBean
public interface EventBaseRepository<T extends Event>
        extends JpaRepository<T, String> {
}