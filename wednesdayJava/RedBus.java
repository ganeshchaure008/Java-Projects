package wednesdayJava;

import java.util.Scanner;

class Bus {
    int busNumber;
    String lastPassengerName;
    int seatsAvailable;
    String passengerName;
    static int totalTicketsBooked = 0;
    Scanner scanner = new Scanner(System.in);

    static void bookTicket(Bus bus) {
        if (bus.seatsAvailable > 0) {
            bus.lastPassengerName = bus.passengerName;
            bus.seatsAvailable--;
            totalTicketsBooked++;

            System.out.println("Ticket booked successfully!");
            System.out.println("Bus Number: " + bus.busNumber);
            System.out.println("Last Passenger Name: " + bus.lastPassengerName);
            System.out.println("Seats Available: " + bus.seatsAvailable);
            System.out.println("Total Tickets Booked across all buses: " + totalTicketsBooked);
        } else {
            System.out.println("No seats available!");

        }

    }

    Bus(int busNumber, int seatsAvailable) {
        this.busNumber = busNumber;
        this.seatsAvailable = seatsAvailable;
        System.out.println("Enter Passenger Name:");
        this.passengerName = scanner.nextLine();
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Last Passenger Name: " + lastPassengerName);
        System.out.println("Seats Available: " + seatsAvailable);
        System.out.println("-----------------------------");

    }

    public class RedBus {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Passenger Name:");
            String passengerName = scanner.nextLine();
            System.out.println("Bus Number: ");
            int busNumber = scanner.nextInt();
            String lastPassengerName = scanner.nextLine();
            System.out.println("Last Passenger Name: " + lastPassengerName);
            System.out.println("Seats Available: ");
            int seatsAvailable = scanner.nextInt();
            System.out.println("Total Tickets Booked across all buses: " + Bus.totalTicketsBooked);
            int totalTicketsBooked = scanner.nextInt();
            scanner.nextLine();
            scanner.close();

            seatsAvailable = scanner.nextInt();
            seatsAvailable--;
            System.out.println("Total Tickets Booked across all buses: " + totalTicketsBooked);
            Bus bus1 = new Bus(busNumber, 3);
            Bus bus2 = new Bus(busNumber, 2);
            Bus.bookTicket(bus1);
            Bus.bookTicket(bus2);
            Bus.bookTicket(bus1);
            Bus.bookTicket(bus2);

        }

    }
}
