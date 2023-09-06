import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rs {
    static List<String> reservations = new ArrayList<>();
    static int rescount = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("Welcome to the online reservation system...");
            System.out.println("1) Reserve Ticket");
            System.out.println("2) View Reserved Seats");
            System.out.println("3) Cancel Reservation");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    reserveTicket(sc);
                    break;
                case 2:
                    viewReservedSeats();
                    break;
                case 3:
                    cancelReservation(sc);
                    break;
                case 4:
                    System.out.println("Exiting Rail reservation System...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 4);

        sc.close();
    }

    public static void reserveTicket(Scanner sc) {
        System.out.print("Enter the passenger name: ");
        String name = sc.nextLine();
        System.out.print("Enter the destination: ");
        String destination = sc.nextLine();
        String res = "Reservation #" + rescount++ + ": Passenger: " + name + ", Destination: " + destination;
        reservations.add(res);
        System.out.println("Ticket reserved successfully.");
    }

    public static void viewReservedSeats() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations made yet.");
        } else {
            System.out.println("Reserved Seats:");
            for (String reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    public static void cancelReservation(Scanner sc) {
        if (reservations.isEmpty()) {
            System.out.println("No reservations are made to cancel.");
            return;
        }

        System.out.print("Enter the reservation number to cancel (1-" + reservations.size() + "): ");
        int pnrno = sc.nextInt();
        sc.nextLine(); 

        if (pnrno >= 1 && pnrno <= reservations.size()) {
            String canceledReservation = reservations.remove(pnrno - 1);
            System.out.println("Canceled Reservation: " + canceledReservation);
        } else {
            System.out.println("Invalid pnr number.");
        }
    }
}
