package hwprogrammes;

import java.util.HashMap;
import java.util.Map;

/*
Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name
 */
public class Programme_10_StationName {
        public static void main(String[] args) {
            // Create a map to associate stations with the lines
            Map<String, String> stationToLineMap = new HashMap<>();

            // Populate the map with Zone 1 stations and their respective lines
            stationToLineMap.put("Oxford Circus", "Bakerloo, Central, Victoria");
            stationToLineMap.put("Embankment", "Bakerloo, District, Circle, Northern");
            stationToLineMap.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
            stationToLineMap.put("Angel", "Northern");
            stationToLineMap.put("Leicester Square", "Northern, Piccadilly");

            // Specify the station for which you want to find the lines
            String stationToFind = "Oxford Circus";
            //String stationToFind = "Watford";//display will be Watford is not in Zone 1 or not found in the map.

            // Search for the station and display the lines
            if (stationToLineMap.containsKey(stationToFind)) {
                String lines = stationToLineMap.get(stationToFind);
                System.out.println("Lines passing through " + stationToFind + ": " + lines);
            } else {
                System.out.println(stationToFind + " is not in Zone 1 or not found in the map.");
            }
        }
    }
