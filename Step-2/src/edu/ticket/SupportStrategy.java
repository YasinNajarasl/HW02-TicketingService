package edu.ticket;

public class SupportStrategy implements ProcessingStrategy {

    @Override
    public void process(Ticket ticket) {
        System.out.println("Assigned to support");
        System.out.println("Sending generic response");
        // ticket.setResponse("Your issue is under review");
    }
}