package MovieTheater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie peli1 = new Movie("Avatar: Fire and Ash", "Ciencia Ficción", 2025, 2, 30);
        peli1.showInfoMovie();


        System.out.println("\n===============================\n");

        Room sala1 = new Room(1, "XD", 30);
        sala1.statusRoom();

        System.out.println("\n===============================\n");

        Reservation reserva1 = new Reservation(peli1, sala1, "Plutarco de Queronea");
        Reservation reserva2 = new Reservation(peli1, sala1, "Apolonio de Perga");
        reserva1.processReservation(3);
        reserva2.processReservation(7);

    }
}