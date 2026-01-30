package edu.ticket;

public class BugStrategy implements ProcessingStrategy {

    @Override
    public void process(Ticket ticket) {
        System.out.println("Assigned to engineering");
        System.out.println("Sending bug response");
        // می‌توانی اینجا response را هم set کنی اگر لازم شد:
        // ticket.setResponse("Bug fixed in next release");
    }
}