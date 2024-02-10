public class ParkingSlot {
    int num;
    Car car;
    boolean isFree;

    ParkingSlot(int num) {
        this.num = num;
        this.isFree = true;
    }

    void park(Car car) {
        this.car = car;
        this.isFree = false;
    }

    void leave() {
        this.car = null;
        this.isFree = true;
    }
}
