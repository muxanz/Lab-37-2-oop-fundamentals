package MovieTheater;

public class Room {
    int idRoom;
    String typeRoom;
    int capacity;
    int seatsReserved;

    public Room(int idRoom, String typeRoom, int capacity) {
        this.idRoom = idRoom;
        this.typeRoom = typeRoom;
        this.capacity = capacity;
        this.seatsReserved = 0;
    }

    public void reserveSeat(int seats) {
        int seatsAvailable = (capacity - seatsReserved);
        if (seats > seatsAvailable) {
            System.out.println(
                    "\nNo es posible procesar tu reserva" +
                    "\n➡️ Sillas solicitadas => " + seats +
                    "\n💺 Sillas disponibles => " + seatsAvailable
            );
        } else {
            seatsReserved += seats;
        }
    }

    public void statusRoom() {
        System.out.println(
                "\n====  SALA  ====" +
                "\n🍿 Sala => " + idRoom +
                "\n🎥 Tipo => " + typeRoom +
                "\n💺 Capacidad => " + capacity + " sillas" +
                "\n®️ Sillas disponibles => " + (capacity - seatsReserved)
        );
    }
}


