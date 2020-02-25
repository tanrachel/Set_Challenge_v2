package com.racheltan;

public class Planet extends HeavenlyBody<Moon> {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, "PLANET");
    }
}
