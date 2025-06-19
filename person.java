import java.util.HashMap;

public class Person {
    private HashMap<Integer, Reservation> myReservations = new HashMap<>();

    public void removeReservation(int reservationNumber) {
        myReservations.remove(reservationNumber);
    }
}
