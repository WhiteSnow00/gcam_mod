import java.util.Date;
import j$.util.DesugarTimeZone;
import java.util.Locale;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hia
{
    private static final SimpleDateFormat c;
    public final lkb a;
    public final boolean b;
    private final hie d;
    
    static {
        final SimpleDateFormat c2 = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        c2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        c = c2;
    }
    
    public hia(final hie d, final lkb a, final boolean b) {
        this.d = d;
        this.a = a;
        this.b = b;
        if (b) {
            d.a.c(a);
        }
    }
    
    public final drk a() {
        return this.d.c;
    }
    
    public final void b() {
        this.d.f(this, hid.b);
    }
    
    public final void c() {
        this.d.f(this, hid.a);
    }
    
    @Override
    public final String toString() {
        String concat;
        if (njb.d(this.d.f)) {
            concat = "";
        }
        else {
            final String value = String.valueOf(this.d.f);
            if (value.length() != 0) {
                concat = "-".concat(value);
            }
            else {
                concat = new String("-");
            }
        }
        final String format = hia.c.format(new Date(this.d.b));
        final String value2 = String.valueOf(this.a);
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 23 + String.valueOf(concat).length() + String.valueOf(value2).length());
        sb.append("PXL_");
        sb.append(format);
        sb.append(concat);
        sb.append(" (");
        sb.append(value2);
        sb.append(" isprimary=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
