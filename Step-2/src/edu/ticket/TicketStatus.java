package edu.ticket;

/**
 * Enum برای وضعیت‌های ممکن تیکت
 * جایگزین String خام شده تا ایمنی نوع و خوانایی افزایش یابد.
 */
public enum TicketStatus {
    NEW("NEW"),
    ASSIGNED("ASSIGNED"),
    IN_PROGRESS("IN_PROGRESS"),
    RESOLVED("RESOLVED"),
    CLOSED("CLOSED");

    private final String displayName;

    TicketStatus(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    /**
     * برای سازگاری با کد قبلی که از getStatus() انتظار String دارد
     */
    public String getDisplayName() {
        return displayName;
    }
}