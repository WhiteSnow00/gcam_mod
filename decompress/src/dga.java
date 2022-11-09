import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dga extends Exception
{
    public final kst a;
    public final lfj b;
    public final long c;
    
    public dga(final lfj b, final kst a, final long c) {
        final String a2 = b.a;
        String string;
        if (c == 0L) {
            string = "before opening: ";
        }
        else {
            final long millis = Duration.ofNanos(c).toMillis();
            final StringBuilder sb = new StringBuilder(57);
            sb.append("after being open for ");
            sb.append(millis);
            sb.append(" milli seconds: ");
            string = sb.toString();
        }
        final String b2 = a.b();
        final StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 34 + String.valueOf(string).length() + String.valueOf(b2).length());
        sb2.append("Camera ");
        sb2.append(a2);
        sb2.append(" encountered a fatal error ");
        sb2.append(string);
        sb2.append(b2);
        super(sb2.toString());
        this.b = b;
        this.a = a;
        this.c = c;
    }
}
