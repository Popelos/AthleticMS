package popelos.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Athlete;
import popelos.entity.Games;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-21T17:36:54")
@StaticMetamodel(Performances.class)
public class Performances_ { 

    public static volatile SingularAttribute<Performances, Integer> performance;
    public static volatile SingularAttribute<Performances, Games> gid;
    public static volatile SingularAttribute<Performances, Integer> id;
    public static volatile SingularAttribute<Performances, Athlete> aid;

}