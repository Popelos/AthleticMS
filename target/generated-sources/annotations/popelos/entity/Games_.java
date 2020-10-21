package popelos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Performances;
import popelos.entity.Stadium;
import popelos.entity.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-21T17:36:54")
@StaticMetamodel(Games.class)
public class Games_ { 

    public static volatile SingularAttribute<Games, String> result;
    public static volatile CollectionAttribute<Games, Performances> performancesCollection;
    public static volatile SingularAttribute<Games, Date> gameDate;
    public static volatile SingularAttribute<Games, Integer> id;
    public static volatile SingularAttribute<Games, Team> tid;
    public static volatile SingularAttribute<Games, Stadium> sid;

}