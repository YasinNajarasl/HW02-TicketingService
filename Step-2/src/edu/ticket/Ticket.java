package edu.ticket;

public class Ticket {
    private int id;
    private String status = "NEW";
    private String channel;
    private String type;
    private String request;
    private String response;

    private TicketState state = new NewState();
    private ProcessingStrategy strategy;

    public Ticket(int id, String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.strategy = determineStrategy(type);
    }

    private ProcessingStrategy determineStrategy(String type) {
        if ("BUG".equals(type)) {
            return new BugStrategy();
        } else {
            return new SupportStrategy();
        }
    }

    public void handle() {
        state.handle(this);
    }

    public void process() {
        strategy.process(this);
    }

    void setState(TicketState state) {
        this.state = state;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    static void log(Ticket ticket) {
        System.out.println("Logging ticket handling : " + ticket.getId() + " -> " + ticket.getStatus());
    }

    // بقیه getterها و setterها بدون تغییر باقی می‌مانند
    public String getStatus() {
        return status;
    }

    public String getChannel() {
        return channel;
    }

    public String getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getId() {
        return id;
    }
}