package com.htn.pojo;

import com.htn.pojo.Bustrip;
import com.htn.pojo.Seat;
import com.htn.pojo.Station;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-11-12T09:10:26")
@StaticMetamodel(Bus.class)
public class Bus_ { 

    public static volatile SingularAttribute<Bus, String> biensoxe;
    public static volatile SingularAttribute<Bus, Station> manhaxe;
    public static volatile SetAttribute<Bus, Seat> seatSet;
    public static volatile SetAttribute<Bus, Bustrip> bustripSet;

}