package edu.ticket;

public class ResolvedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket resolved");

        ticket.setStatus(TicketStatus.CLOSED);
        ticket.setState(new ClosedState());

        log(ticket);
    }

    private void log(Ticket ticket) {
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}