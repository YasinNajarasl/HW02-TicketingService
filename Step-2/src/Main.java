import edu.ticket.Ticket;
import edu.ticket.TicketFactory;
import edu.ticket.TicketService;
import edu.ticket.WebTicketFactory;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        // Example 1: Bug reported from web
        TicketFactory factory = new WebTicketFactory();   // یا EmailTicketFactory بسته به سناریو
        Ticket ticket = factory.createTicket(1, "BUG");
        ticket.setRequest("I see a very very BAD BUG!");
        ticket.setRequest("I see a very very BAD BUG!");
        ticketService.handle(ticket);
    }
}
