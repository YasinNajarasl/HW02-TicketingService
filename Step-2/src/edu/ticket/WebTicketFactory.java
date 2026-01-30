package edu.ticket;

public class WebTicketFactory extends TicketFactory {

    @Override
    protected String getChannel() {
        return "WEB";
    }
}