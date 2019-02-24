package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("JFK", true);
        flightMap.put("LAX", true);
        flightMap.put("FRA", false);
        flightMap.put("WAW", true);
        flightMap.put("ARN", false);
        flightMap.put("WRO", true);

        if (flightMap.get(flight.getArrivalAirport()) == null){
            throw new RouteNotFoundException();
        } else if (flightMap.get(flight.getArrivalAirport()) == false) {
            System.out.println("Arrival airport is not available!");
        } else {
            System.out.println("Arrival airport " + flight.getArrivalAirport() + " is available!");
        }
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("WAW", "RZE"));
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry! Route you are looking for could not be found!");
        }
    }
}
