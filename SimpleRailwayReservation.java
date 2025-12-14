import java.util.Scanner;

public class SimpleRailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] seats = new String[10];

        char repeat;

        do {
            System.out.println("===== RAILWAY RESERVATION SYSTEM =====");
            System.out.println("1. Show Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
            
                System.out.println("\n--- Seat Status ---");
                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] == null) {
                        System.out.println("Seat " + (i + 1) + ": Available");
                    } else {
                        System.out.println("Seat " + (i + 1) + ": Booked by " + seats[i]);
                    }
                }
                System.out.println();
            }

            else if (choice == 2) {
    
                System.out.print("Enter seat number to book (1-10): ");
                int sn = sc.nextInt();

                if (sn < 1 || sn > 10) {
                    System.out.println("Invalid seat number!");
                } else if (seats[sn - 1] != null) {
                    System.out.println("Seat already booked!");
                } else {
                    System.out.print("Enter passenger name: ");
                    String name = sc.next();
                    seats[sn - 1] = name;
                    System.out.println("Seat booked successfully!");
                }
                System.out.println();
            }

            else if (choice == 3) {
    
                System.out.print("Enter seat number to cancel (1-10): ");
                int sn = sc.nextInt();

                if (sn < 1 || sn > 10) {
                    System.out.println("Invalid seat number!");
                } else if (seats[sn - 1] == null) {
                    System.out.println("Seat is already empty.");
                } else {
                    seats[sn - 1] = null;
                    System.out.println("Seat cancelled successfully!");
                }
                System.out.println();
            }

            else if (choice == 4) {
                System.out.println("Thank you for using the system!");
                break;
            }

            else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'Y' || repeat == 'y');
    }
}