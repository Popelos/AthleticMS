package popelos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Performances;
import popelos.entity.Team;
import popelos.entity.Trainings;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-13T12:28:50")
@StaticMetamodel(Athlete.class)
public class Athlete_ { 

    public static volatile CollectionAttribute<Athlete, Trainings> trainingsCollection;
    public static volatile CollectionAttribute<Athlete, Performances> performancesCollection;
    public static volatile SingularAttribute<Athlete, String> name;
    public static volatile SingularAttribute<Athlete, BigDecimal> weight;
    public static volatile SingularAttribute<Athlete, Date> dateOfBirth;
    public static volatile SingularAttribute<Athlete, Integer> id;
    public static volatile SingularAttribute<Athlete, Integer> age;
    public static volatile SingularAttribute<Athlete, Team> tid;
    public static volatile SingularAttribute<Athlete, BigDecimal> height;

}