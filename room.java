import java.util.HashSet;

public class Room {
    private HashSet<Reservation> roomReservations = new HashSet<>();

    public void deallocateRoom(Reservation reservation) {
        roomReservations.remove(reservation);
    }
}
