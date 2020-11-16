package popelos.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Athlete;
import popelos.entity.Stadium;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-13T12:28:50")
@StaticMetamodel(Trainings.class)
public class Trainings_ { 

    public static volatile SingularAttribute<Trainings, Boolean> attended;
    public static volatile SingularAttribute<Trainings, Date> trainingDate;
    public static volatile SingularAttribute<Trainings, Integer> id;
    public static volatile SingularAttribute<Trainings, Athlete> aid;
    public static volatile SingularAttribute<Trainings, Stadium> sid;

}