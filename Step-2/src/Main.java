import edu.ticket.Ticket;
import edu.ticket.TicketService;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        // Example 1: Bug reported from web
        Ticket ticket = new Ticket(1, "WEB", "BUG");
        ticket.setRequest("I see a very very BAD BUG!");
        ticketService.handle(ticket);

        Ticket ticket_1 = new Ticket(1, "WEB", "BUG");
        ticket_1.handle(); // باید NewState اجرا بشه → چاپ created + received from web + log
        ticket_1.handle(); // AssignedState → process + log
        ticket_1.handle(); // InProgressState → working + process + log
    }
}
