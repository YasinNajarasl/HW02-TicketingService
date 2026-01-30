package edu.ticket;

public interface TicketState {
    /**
     * عملیات اصلی که در هر وضعیت متفاوت است.
     * این متد وضعیت فعلی را پردازش می‌کند، اقدامات لازم (چاپ، تغییر وضعیت، لاگ و ...) را انجام می‌دهد
     * و در صورت نیاز وضعیت بعدی را set می‌کند.
     */
    void handle(Ticket ticket);
}