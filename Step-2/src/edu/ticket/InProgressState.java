package edu.ticket;

public class InProgressState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Working on ticket");

        ticket.process();  // اینجا استراتژی پاسخ‌دهی فراخوانی می‌شود

        ticket.setStatus(TicketStatus.RESOLVED);
        ticket.setState(new ResolvedState());

        Ticket.log(ticket);
    }

}