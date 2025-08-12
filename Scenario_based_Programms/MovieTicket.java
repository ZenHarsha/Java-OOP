class MovieTicket {
    String movieName;
    int ticketCount;
    String seatType;
    int pricePerTicket;

    MovieTicket(String movieName, int ticketCount) {
        this(movieName, ticketCount, "Normal");
    }

    MovieTicket(String movieName, int ticketCount, String seatType) {
        this.movieName = movieName;
        this.ticketCount = ticketCount;
        this.seatType = seatType;

        if (seatType.equalsIgnoreCase("Normal")) {
            this.pricePerTicket = 150;
        } else if (seatType.equalsIgnoreCase("VIP")) {
            this.pricePerTicket = 300;
        } else {
            this.pricePerTicket = 0;
            System.out.println("Invalid seat type!");
        }
    }

    void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + ticketCount);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Total Price: ₹" + (ticketCount * pricePerTicket));
    }

    public static void main(String[] args) {
        MovieTicket booking1 = new MovieTicket("Inception", 2);
        booking1.displayTicketDetails();

        MovieTicket booking2 = new MovieTicket("Avatar", 3, "VIP");
        booking2.displayTicketDetails();
    }
}
