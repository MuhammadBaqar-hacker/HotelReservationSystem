public class Reservation {
    private int reservationNumber;
    private Room room;
    private Person reserverPayer;

    public Reservation(int num, Room room, Person payer) {
        this.reservationNumber = num;
        this.room = room;
        this.reserverPayer = payer;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public Room getRoom() {
        return room;
    }

    public Person getReserverPayer() {
        return reserverPayer;
    }
}
