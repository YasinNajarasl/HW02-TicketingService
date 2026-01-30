package edu.ticket;

public class EmailTicketFactory extends TicketFactory {

    @Override
    protected String getChannel() {
        return "EMAIL";
    }
}