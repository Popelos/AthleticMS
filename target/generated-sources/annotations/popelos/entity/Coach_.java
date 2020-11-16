package popelos.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import popelos.entity.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-13T12:28:50")
@StaticMetamodel(Coach.class)
public class Coach_ { 

    public static volatile SingularAttribute<Coach, String> name;
    public static volatile SingularAttribute<Coach, Integer> id;
    public static volatile SingularAttribute<Coach, BigDecimal> salary;
    public static volatile SingularAttribute<Coach, Date> startDate;
    public static volatile SingularAttribute<Coach, Team> tid;

}