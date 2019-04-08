package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;

public class Application {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        Set<Flight> flightSet = flightDatabase.getFlightSet();

        FlightScanner flightScanner = new FlightScanner();
        flightScanner.lookForDepartureAirport(flightSet, "WMI");
        flightScanner.lookForArrivalAirport(flightSet, "WRO");
        flightScanner.lookForConnectingAirport(flightSet, "WAW", "WRO");
    }
}
