package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightScanner {
    public void lookForArrivalAirport(Set<Flight> flightSet, String airport) {
        flightSet.stream()
                .filter(f -> f.getArrivalAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void lookForDepartureAirport(Set<Flight> flightSet, String airport) {
        flightSet.stream()
                .filter(f -> f.getDepartureAirport().equals(airport))
                .forEach(System.out::println);
    }

    public void lookForConnectingAirport(Set<Flight> flightSet, String airport1, String airport2) {
        Set<Flight> flightSet1 = flightSet.stream()
                .filter(f -> f.getArrivalAirport().equals(airport1))
                .collect(Collectors.toSet());
        Set<Flight> flightSet2 = flightSet.stream()
                .filter(f -> f.getArrivalAirport().equals(airport2))
                .collect(Collectors.toSet());
        for(Flight flight1 : flightSet1){
            for(Flight flight2 : flightSet2){
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    System.out.println(flight1);
                    System.out.println(flight2);
                }
            }
        }
    }
}