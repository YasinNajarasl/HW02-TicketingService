package edu.ticket;

public class TicketService {

    /**
     * حالا فقط درخواست handle را به خود Ticket delegate می‌کند.
     * تمام منطق وضعیت‌ها، پردازش نوع و لاگینگ در الگوهای State و Strategy مدیریت می‌شود.
     */
    public void handle(Ticket ticket) {
        ticket.handle();  // ← تمام کار اینجا انجام می‌شود!
    }
}