package edu.ticket;

public class NewState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");

        if ("WEB".equals(ticket.getChannel())) {
            System.out.println("Received from web");
        } else if ("EMAIL".equals(ticket.getChannel())) {
            System.out.println("Received from email");
        }

        ticket.setStatus(TicketStatus.ASSIGNED);
        ticket.setState(new AssignedState());

        Ticket.log(ticket);
    }
}