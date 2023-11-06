package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_10_zone1Stations {

    public void zone1Stations() {

        ArrayList<String> stations = new ArrayList<>();
        stations.add("King's Cross St. Pancras");
        stations.add("Bank and Monument");
        stations.add("Paddington");
        stations.add("Baker Street");
        stations.add("Westminster");
        stations.add("Victoria");
        stations.add("Liverpool Street");
        stations.add("Waterloo");
        stations.add("South Kensington");

        for (String station : stations) {
            System.out.println(station);
        }
    }

    public String userInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a station from the given zone 1 stations name: ");
        String userChoice = scanner.next();
        scanner.close();
        return userChoice;
    }

    public void lineConnection(String useChoice) {
        switch (useChoice) {
            case "King's Cross St Pancras":
                System.out.println("Circle, Piccadilly, Hammersmith & City, Northern, Metropolitan and Victoria lines run through King's Cross St Pancras station.");
                break;
            case "Bank and Monument":
                System.out.println("Central, Northern and Waterloo & City lines run through Bank and Monument.");
                break;
            case "Paddington":
                System.out.println("Bakerloo, Circle, District and Hammersmith & City lines run through Paddington.");
                break;
            case "Baker Street":
                System.out.println("Bakerloo, Jubilee, Metropolitan, Circle and Hammersmith & City lines run thorough Baker Street");
                break;
            case "Westminster":
                System.out.println("Circle, District and Jubilee lines run through Westminster.");
                break;
            case "Victoria":
                System.out.println("Victoria, District and Circle lines run through Victoria");
                break;
            case "Liverpool Street":
                System.out.println("Central, Circle, Hammersmith & City and Metropolitan lines run through Liverpool Street");
                break;
            case "Waterloo":
                System.out.println("Bakerloo, Jubilee, Northern and Waterloo & City Lines run through Waterloo");
                break;
            case "South Kensington":
                System.out.println("District, Circle and Piccadilly lines passing through South Kensington");
                break;
            default:
                System.out.println("Work in Progress");
        }
    }
        public static void main (String[]args){
            Programme_10_zone1Stations obj = new Programme_10_zone1Stations();
            obj.zone1Stations();
            obj.lineConnection(obj.userInput());
        }
    }