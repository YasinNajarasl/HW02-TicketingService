package edu.ticket;

public class AssignedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        ticket.process();  // اینجا استراتژی پردازش (ارجاع به واحد) فراخوانی می‌شود

        ticket.setStatus(TicketStatus.IN_PROGRESS);
        ticket.setState(new InProgressState());

        log(ticket);
    }

    private void log(Ticket ticket) {
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }
}