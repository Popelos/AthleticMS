package popelos.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Games;
import popelos.entity.Trainings;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-13T12:28:50")
@StaticMetamodel(Stadium.class)
public class Stadium_ { 

    public static volatile CollectionAttribute<Stadium, Trainings> trainingsCollection;
    public static volatile SingularAttribute<Stadium, String> location;
    public static volatile CollectionAttribute<Stadium, Games> gamesCollection;
    public static volatile SingularAttribute<Stadium, Integer> id;

}