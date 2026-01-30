package edu.ticket;

/**
 * Abstract Factory برای ایجاد تیکت بر اساس کانال ورودی.
 * این الگو اجازه می‌دهد ساخت تیکت با تنظیمات خاص هر کانال encapsulate شود.
 */
public abstract class TicketFactory {

    /**
     * متد کارخانه (Factory Method) برای ایجاد تیکت.
     * @param id شناسه تیکت
     * @param type نوع تیکت (BUG, QUESTION و ...)
     * @return نمونه جدید Ticket با کانال و تنظیمات اولیه مناسب
     */
    public Ticket createTicket(int id, String type) {
        String channel = getChannel();           // توسط subclass تعیین می‌شود
        Ticket ticket = new Ticket(id, channel, type);

        // تنظیمات مشترک اولیه (اگر لازم باشد)
        ticket.setStatus(TicketStatus.NEW);

        // می‌توانیم اینجا لاگ اولیه یا کارهای مشترک دیگر بگذاریم
        System.out.println("Ticket created via Factory from channel: " + channel);

        return ticket;
    }

    /**
     * متد abstract که توسط subclassها پیاده‌سازی می‌شود
     * @return نام کانال خاص این کارخانه (WEB, EMAIL و ...)
     */
    protected abstract String getChannel();
}