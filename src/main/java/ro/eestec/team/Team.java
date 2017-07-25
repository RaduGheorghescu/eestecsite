package ro.eestec.team;

import javax.persistence.*;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
