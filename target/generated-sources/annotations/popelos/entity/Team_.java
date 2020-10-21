package popelos.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Athlete;
import popelos.entity.Coach;
import popelos.entity.Games;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-21T17:36:54")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile CollectionAttribute<Team, Athlete> athleteCollection;
    public static volatile CollectionAttribute<Team, Coach> coachCollection;
    public static volatile CollectionAttribute<Team, Games> gamesCollection;
    public static volatile SingularAttribute<Team, Integer> id;
    public static volatile SingularAttribute<Team, String> sport;

}