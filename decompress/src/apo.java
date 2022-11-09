import java.util.Date;
import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.Calendar;
import j$.util.DesugarTimeZone;
import java.util.TimeZone;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apo implements Comparable
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public TimeZone g;
    public int h;
    
    public apo() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = DesugarTimeZone.getTimeZone("UTC");
    }
    
    public apo(final Calendar calendar) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = DesugarTimeZone.getTimeZone("UTC");
        final Date time = calendar.getTime();
        final TimeZone timeZone = calendar.getTimeZone();
        final GregorianCalendar gregorianCalendar = (GregorianCalendar)Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.a = gregorianCalendar.get(1);
        this.b = gregorianCalendar.get(2) + 1;
        this.c = gregorianCalendar.get(5);
        this.d = gregorianCalendar.get(11);
        this.e = gregorianCalendar.get(12);
        this.f = gregorianCalendar.get(13);
        this.h = gregorianCalendar.get(14) * 1000000;
        this.g = gregorianCalendar.getTimeZone();
    }
    
    public apo(final Date time, final TimeZone g) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = DesugarTimeZone.getTimeZone("UTC");
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(g);
        gregorianCalendar.setTime(time);
        this.a = gregorianCalendar.get(1);
        this.b = gregorianCalendar.get(2) + 1;
        this.c = gregorianCalendar.get(5);
        this.d = gregorianCalendar.get(11);
        this.e = gregorianCalendar.get(12);
        this.f = gregorianCalendar.get(13);
        this.h = gregorianCalendar.get(14) * 1000000;
        this.g = g;
    }
    
    public final Calendar a() {
        final GregorianCalendar gregorianCalendar = (GregorianCalendar)Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(this.g);
        gregorianCalendar.set(1, this.a);
        gregorianCalendar.set(2, this.b - 1);
        gregorianCalendar.set(5, this.c);
        gregorianCalendar.set(11, this.d);
        gregorianCalendar.set(12, this.e);
        gregorianCalendar.set(13, this.f);
        gregorianCalendar.set(14, this.h / 1000000);
        return gregorianCalendar;
    }
    
    public final void b(final int c) {
        if (c <= 0) {
            this.c = 1;
            return;
        }
        if (c > 31) {
            this.c = 31;
            return;
        }
        this.c = c;
    }
    
    public final void c(final int b) {
        if (b <= 0) {
            this.b = 1;
            return;
        }
        if (b > 12) {
            this.b = 12;
            return;
        }
        this.b = b;
    }
    
    @Override
    public final int compareTo(final Object o) {
        final long timeInMillis = this.a().getTimeInMillis();
        final apo apo = (apo)o;
        long n = timeInMillis - apo.a().getTimeInMillis();
        if (n == 0L) {
            n = this.h - apo.h;
        }
        return (int)(n % 2L);
    }
    
    @Override
    public final String toString() {
        return zv.u(this);
    }
}
