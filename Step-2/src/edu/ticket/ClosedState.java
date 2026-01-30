package edu.ticket;

public class ClosedState implements TicketState {

    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket closed - no further actions possible");

        // اینجا معمولاً هیچ تغییری نمی‌دیم یا exception می‌ندازیم
        // اما برای سادگی فقط لاگ می‌زنیم
        Ticket.log(ticket);
    }
}