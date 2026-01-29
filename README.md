# HW02-TicketingService

## ساختار فعلی سیستم 

### توضیح کلی
در کد اولیه ارائه‌شده (Ticket.java, TicketService.java, Main.java)، سیستم به صورت procedural (رویه‌ای) پیاده‌سازی شده است. 
- **Ticket** فقط یک کلاس داده‌ای (POJO) با فیلدها و getter/setterها است.
- **TicketService** تمام منطق پردازش (if-else برای وضعیت‌ها، نوع‌ها و کانال‌ها) را در یک متد بزرگ `handle()` مدیریت می‌کند.
- **Main** فقط برای تست استفاده می‌شود.

این ساختار ساده است اما فاقد اصول شی‌گرایی است و مشکلات زیادی در نگهداری و گسترش دارد.

### Class Diagram ساختار فعلی (UML)
برای نمایش دیاگرام کلاس‌ها، از PlantUML استفاده شده است. 

### کد PlantUML (برای رندر)

![ساختار فعلی سیستم - Class Diagram](images/current_diagram.png)

### مشکلات و ایرادات اصلی ساختار فعلی
این ساختار (و متد handle در TicketService) مشکلات زیر را دارد:

۱. نقض اصول SOLID

SRP (Single Responsibility): TicketService مسئولیت‌های متعدد (تغییر وضعیت، پردازش نوع، پاسخ‌دهی، لاگینگ) را دارد.
OCP (Open-Closed): برای اضافه کردن وضعیت/نوع/کانال جدید، باید if-elseها را تغییر داد (closed for modification).
DIP: وابستگی مستقیم به جزئیات Ticket (بدون abstraction).

۲. نقض PLK (Law of Demeter) و CRP

TicketService مستقیم به فیلدهای داخلی Ticket دسترسی دارد (coupling بالا).
هیچ composition واقعی وجود ندارد – همه چیز متمرکز در یک متد.

۳. مشکلات عملی

Long Method & Complexity: متد handle بیش از حد بزرگ و پر از شرط است.
Hard to extend/test: اضافه کردن ویژگی جدید (مثل وضعیت جدید) ریسک باگ دارد.
Code Duplication: منطق نوع (BUG vs. other) در چند جا تکرار شده.
No encapsulation: رفتار تیکت خارج از کلاس Ticket است.

۴. نتیجه
این کد "کار می‌کند" اما برای پروژه واقعی نامناسب است. هدف تمرین: بازطراحی با State + Strategy + Factory برای حل این مشکلات.