package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {
    private Set<Flight> flightSet = new HashSet<>();

    public Set<Flight> getFlightSet() {
        flightSet.add(new Flight("WAW", "WRO"));
        flightSet.add(new Flight("WRO", "POZ"));
        flightSet.add(new Flight("SZZ", "WRO"));
        flightSet.add(new Flight("WMI", "SZZ"));
        flightSet.add(new Flight("KRK", "WAW"));
        flightSet.add(new Flight("WRO", "RZE"));
        flightSet.add(new Flight("RZE", "SZZ"));
        flightSet.add(new Flight("WMI", "KRK"));
        flightSet.add(new Flight("KRK", "LCJ"));
        flightSet.add(new Flight("GDN", "WMI"));
        return flightSet;
    }
}
