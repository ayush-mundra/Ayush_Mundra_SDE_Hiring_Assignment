import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot lot = null;

        while (true) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            switch (parts[0]) {
                case "create_parking_lot":
                    lot = new ParkingLot(Integer.parseInt(parts[1]));
                    System.out.println("Created a parking lot with " + parts[1] + " slots");
                    break;
                case "park":
                    if (lot != null) lot.park(parts[1], parts[2]);
                    break;
                case "leave":
                    if (lot != null) lot.leave(Integer.parseInt(parts[1]));
                    break;
                case "status":
                    if (lot != null) lot.status();
                    break;
                case "registration_numbers_for_cars_with_colour":
                    if (lot != null) lot.regNumbersForCarsWithColour(parts[1]);
                    break;
                case "slot_numbers_for_cars_with_colour":
                    if (lot != null) lot.slotNumbersForCarsWithColour(parts[1]);
                    break;
                case "slot_number_for_registration_number":
                    if (lot != null) lot.slotNumberForRegNo(parts[1]);
                    break;
                case "exit":
                    scanner.close(); 
                    return;
            }
        }
    }
}
