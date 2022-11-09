import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njn
{
    public boolean a;
    private final nju b;
    private long c;
    private long d;
    
    public njn() {
        throw null;
    }
    
    public njn(final nju b) {
        b.getClass();
        this.b = b;
    }
    
    public static njn b(final nju nju) {
        return new njn(nju);
    }
    
    private final long f() {
        long c;
        if (this.a) {
            c = this.b.a() - this.d + this.c;
        }
        else {
            c = this.c;
        }
        return c;
    }
    
    public final long a(final TimeUnit timeUnit) {
        return timeUnit.convert(this.f(), TimeUnit.NANOSECONDS);
    }
    
    public final void c() {
        this.c = 0L;
        this.a = false;
    }
    
    public final void d() {
        njo.p(this.a ^ true, "This stopwatch is already running.");
        this.a = true;
        this.d = this.b.a();
    }
    
    public final void e() {
        final long a = this.b.a();
        njo.p(this.a, "This stopwatch is already stopped.");
        this.a = false;
        this.c += a - this.d;
    }
    
    @Override
    public final String toString() {
        final long f = this.f();
        TimeUnit timeUnit;
        if (TimeUnit.DAYS.convert(f, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.DAYS;
        }
        else if (TimeUnit.HOURS.convert(f, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.HOURS;
        }
        else if (TimeUnit.MINUTES.convert(f, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.MINUTES;
        }
        else if (TimeUnit.SECONDS.convert(f, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.SECONDS;
        }
        else if (TimeUnit.MILLISECONDS.convert(f, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        else if (TimeUnit.MICROSECONDS.convert(f, TimeUnit.NANOSECONDS) > 0L) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        final double n = (double)f;
        final double n2 = (double)TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        Double.isNaN(n);
        Double.isNaN(n2);
        final String b = njb.b(n / n2);
        String s = null;
        switch (njm.a[timeUnit.ordinal()]) {
            default: {
                throw new AssertionError();
            }
            case 7: {
                s = "d";
                break;
            }
            case 6: {
                s = "h";
                break;
            }
            case 5: {
                s = "min";
                break;
            }
            case 4: {
                s = "s";
                break;
            }
            case 3: {
                s = "ms";
                break;
            }
            case 2: {
                s = "\u03bcs";
                break;
            }
            case 1: {
                s = "ns";
                break;
            }
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + s.length());
        sb.append(b);
        sb.append(" ");
        sb.append(s);
        return sb.toString();
    }
}
