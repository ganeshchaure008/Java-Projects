package TuesdayJava;

import java.util.Scanner;

class Bus {
    String passengerName;
    String lastPassengerName;
    int seatsAvailable;
    int busNumber;
    static int totalTicketsBooked;
}

public class BusTicketBookingGeneration {
    public static void main(String[] args) {
        String passengerName;
        String sourceCity;
        String destinationCity;
        int tickets;
        float pricePerTicket;
        float totalPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Passenger:");
        passengerName = scanner.nextLine();
        System.out.println("From:");
        sourceCity = scanner.nextLine();
        System.out.println("To:");
        destinationCity = scanner.nextLine();
        System.out.println("Tickets:");
        tickets = scanner.nextInt();
        System.out.println("Price per Ticket:");
        pricePerTicket = scanner.nextFloat();
        totalPrice = tickets * pricePerTicket;
        System.out.println("Total Fare:");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("From: " + sourceCity);
        System.out.println("To: " + destinationCity);
        System.out.println("Tickets: " + tickets);
        System.out.println("Price per Ticket:Rs." + pricePerTicket);
        System.out.println("Total Fare:Rs." + totalPrice);
        scanner.close();

    }

    static void bookTicket(Bus bus) {
        if (bus.seatsAvailable > 0) {
            bus.lastPassengerName = bus.passengerName;
            bus.seatsAvailable--;
            Bus.totalTicketsBooked++;
            System.out.println("Ticket booked successfully!");
            System.out.println("Bus Number: " + bus.busNumber);
            System.out.println("Last Passenger Name: " + bus.lastPassengerName);
            System.out.println("Seats Available: " + bus.seatsAvailable);
            System.out.println("Total Tickets Booked across all buses: " + Bus.totalTicketsBooked);
        } else {
            System.out.println("No seats available!");
        }

    }

}
