package com.racheltan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Set<HeavenlyBody> solarSystem = new HashSet<>();
    private static Map<String, HeavenlyBody> solarMap = new HashMap<>();

    public static void main(String[] args) {
	// write your code here
//        Planet earth = new Planet("Earth", 365);
//        Moon moon = new Moon("moon",26);
//        earth.addSatellite(moon);
//        solarSystem.add(earth);
//        solarSystem.add(moon);
//
//
//        Planet mercury = new Planet("Mercury", 88);
//        solarSystem.add(mercury);
//
//
//        Planet venus = new Planet("Venus", 225);
//        solarSystem.add(venus);
//
//
//        Planet mars = new Planet("Mars", 687);
//        Moon deimos = new Moon("Deimos",1.3);
//        Moon phobos = new Moon("Phobos", 0.3);
//        mars.addSatellite(deimos);
//        mars.addSatellite(phobos);
//        solarSystem.add(mars);
//        solarSystem.add(deimos);
//        solarSystem.add(phobos);
//
//
//        Planet jupiter = new Planet("Jupiter",4332);
//        Moon io = new Moon("Io",1.8);
//        Moon europa = new Moon("Europa", 3.5);
//        Moon ganymede = new Moon("ganymede", 7.1);
//        Moon callisto = new Moon("Callisto", 16.7);
//        jupiter.addSatellite(io);
//        jupiter.addSatellite(europa);
//        jupiter.addSatellite(ganymede);
//        jupiter.addSatellite(callisto);
//        solarSystem.add(jupiter);
//        solarSystem.add(io);
//        solarSystem.add(europa);
//        solarSystem.add(ganymede);
//        solarSystem.add(callisto);
//
//        Planet saturn = new Planet("Saturn",10759);
//        solarSystem.add(saturn);
//
//        Planet uranus = new Planet("Uranus", 30660);
//        solarSystem.add(uranus);
//
//
//        Planet neptune = new Planet("Neptune", 165);
//        solarSystem.add(neptune);


        Planet pluto = new Planet("Pluto", 100);
        solarSystem.add(pluto);
        solarMap.put(pluto.getName(),pluto);

        HeavenlyBody pluto2 = new HeavenlyBody("Pluto", 500, "PLANET");
        solarSystem.add(pluto2);
        solarMap.put(pluto2.getName(),pluto2);

        Moon pluto3 = new Moon("Pluto", 1000);
        solarSystem.add(pluto3);
        solarMap.put(pluto3.getName(),pluto3);

        System.out.println("Planets Set");
        for(HeavenlyBody planet : solarSystem) {
            System.out.println("\t" +planet.getType()+"   "+ planet.getName() +" : "+planet.getOrbitalPeriod());
        }

        System.out.println("Planets Map");
        System.out.println(solarMap.get("Pluto").getName() + "  "+solarMap.get("Pluto").getType() + "   "+solarMap.get("Pluto").getOrbitalPeriod());

//        System.out.println(pluto.equals(pluto2));
//        System.out.println(pluto2.equals(pluto));


    }
}
