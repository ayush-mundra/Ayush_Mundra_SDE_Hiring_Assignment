import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    ParkingSlot[] slots;

    ParkingLot(int size) {
        slots = new ParkingSlot[size];
        for (int i = 0; i < size; i++) {
            slots[i] = new ParkingSlot(i + 1);
        }
    }
    void regNumbersForCarsWithColour(String color) {
    List<String> regNumbers = new ArrayList<>();
    for (ParkingSlot slot : slots) {
        if (!slot.isFree && slot.car.color.equalsIgnoreCase(color)) {
            regNumbers.add(slot.car.regNo);
        }
    }
    System.out.println(String.join(", ", regNumbers));
}

void slotNumbersForCarsWithColour(String color) {
    List<String> slotNumbers = new ArrayList<>();
    for (ParkingSlot slot : slots) {
        if (!slot.isFree && slot.car.color.equalsIgnoreCase(color)) {
            slotNumbers.add(Integer.toString(slot.num));
        }
    }
    System.out.println(String.join(", ", slotNumbers));
}

void slotNumberForRegNo(String regNo) {
    for (ParkingSlot slot : slots) {
        if (!slot.isFree && slot.car.regNo.equals(regNo)) {
            System.out.println(slot.num);
            return;
        }
    }
    System.out.println("Not found");
}


    void park(String regNo, String color) {
        for (ParkingSlot slot : slots) {
            if (slot.isFree) {
                slot.park(new Car(regNo, color));
                System.out.println("Allocated slot number: " + slot.num);
                return;
            }
        }
        System.out.println("Sorry, parking lot is full");
    }

    void leave(int slotNumber) {
        if (slotNumber > 0 && slotNumber <= slots.length && !slots[slotNumber - 1].isFree) {
            slots[slotNumber - 1].leave();
            System.out.println("Slot number " + slotNumber + " is free");
        }
    }

    void status() {
        System.out.println("Slot No. Registration No Colour");
        for (ParkingSlot slot : slots) {
            if (!slot.isFree) {
                System.out.println(slot.num + " " + slot.car.regNo + " " + slot.car.color);
            }
        }
    }
}
