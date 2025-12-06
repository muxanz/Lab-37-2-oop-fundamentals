package MovieTheater;

public class Movie {
    String title;
    String genre;
    int year;
    int duration;
    int tickets;

    public Movie(String title, String genre, int year, int duration, int tickets) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.tickets = tickets;
    }

    public void sellTicket(int customerTickets) {
        if (customerTickets > tickets) {
            System.out.println(
                    "\nNo es posible procesar tu reserva" +
                    "\n➡️ Entradas solicitadas => " + customerTickets +
                    "\n🎟️ Entradas disponibles => " + tickets
            );
        } else {
            tickets -= customerTickets;
        }
    }

    public void showInfoMovie() {
        System.out.println(
                "\n====  PELICULA  ====" +
                "\n🎞️ Título => " + title +
                "\n🎥 Género => " + genre +
                "\n📅 Año => " + year +
                "\n🕜 Duración => " + duration +
                "\n🎟️ Total entradas => " + tickets
        );
    }
}
