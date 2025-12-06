package MovieTheater;

public class Reservation {
    Movie movie;
    Room room;
    String customerName;

    public Reservation(Movie movie, Room room, String customerName) {
        this.movie = movie;
        this.room = room;
        this.customerName = customerName;
    }

    public void processReservation(int totalTickets) {
        System.out.println("Procesando entradas, para => " + movie.title);
        movie.sellTicket(totalTickets);
        room.reserveSeat(totalTickets);
        System.out.println("Entradas procesadas => " + totalTickets);
        showDetails(totalTickets);
        movie.showInfoMovie();
        room.statusRoom();
    }

    public void showDetails(int tickets) {
        System.out.println(
                "\n====  RESERVA  ====" +
                "\n👨‍🦱 Cliente => " + customerName +
                "\n🎥 Película => " + movie.title +
                "\n🍿 Sala => " + room.idRoom +
                "\n🎟️ Entradas => " + tickets +
                "\n==================="
        );
    }



}
