package edu.ticket;

/**
 * اینترفیس Strategy برای الگوی Strategy Pattern
 * این الگو مسئول پردازش تیکت (ارجاع به واحد + ارسال پاسخ) بر اساس نوع (BUG یا غیر BUG) است.
 */
public interface ProcessingStrategy {
    /**
     * عملیات پردازش و پاسخ‌دهی را انجام می‌دهد.
     * منطق خاص هر نوع تیکت اینجا encapsulate می‌شود.
     */
    void process(Ticket ticket);
}