import java.util.HashMap;

public class GuestHouse {
    private HashMap<Integer, Reservation> reservations = new HashMap<>();

    public String cancelReservation(int reservationNumber) {
        if (!isReservationValid(reservationNumber)) {
            return "Cancellation failed: Invalid reservation number.";
        }

        Reservation res = reservations.get(reservationNumber);
        deallocateRoom(res);
        removeFromPayer(res);
        reservations.remove(reservationNumber);

        return "Reservation #" + reservationNumber + " has been cancelled successfully.";
    }

    private boolean isReservationValid(int reservationNumber) {
        if (reservations == null) {
            System.err.println("Error: Reservation list not initialized.");
            return false;
        }

        if (!reservations.containsKey(reservationNumber)) {
            System.err.println("Error: Reservation does not exist.");
            return false;
        }

        return true;
    }

    private void deallocateRoom(Reservation res) {
        Room room = res.getRoom();
        if (room != null) {
            room.deallocateRoom(res);
        }
    }

    private void removeFromPayer(Reservation res) {
        Person payer = res.getReserverPayer();
        if (payer != null) {
            payer.removeReservation(res.getReservationNumber());
        }
    }
}
