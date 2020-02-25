package com.racheltan;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public  class HeavenlyBody<T> {
    private final String name;
    private final double orbitalPeriod;
    private final String type;
    private final Set<T> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, String type) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.type = type;
        this.satellites = new HashSet<T>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getType() {
        return type;
    }

    public Set<T> getSatellites() {
        return satellites;
    }

    public boolean addSatellite(T satellite){
        return this.satellites.add(satellite);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj){ // checking if references are pointing to the same thing;
            return true;
        }
        if (obj instanceof HeavenlyBody){
            String objName = ((HeavenlyBody) obj).getName();
            String objType = ((HeavenlyBody) obj).getType();
            boolean returnable = (this.name.equals(objName) && (this.getType().equals(objType))); // they are equal if name and type are the same
//            System.out.println(this.name.equals(objName));
//            System.out.println((this.getType().equals(objType)));
            return returnable;
        }
//        System.out.println("obj instance of HeavenlyBody: " + (obj instanceof HeavenlyBody));
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println(type+name+ Objects.hash(name,type));
        return Objects.hash(name,type);
    }
}
