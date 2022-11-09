// 
// Decompiled by Procyon v0.6.0
// 

public class ksz extends Exception
{
    public final kst a;
    public final lfj b;
    public final boolean c;
    
    public ksz(final lfj b, final kst a, final boolean c) {
        final String a2 = b.a;
        String s;
        if (!c) {
            s = "before opening: ";
        }
        else {
            s = "after open: ";
        }
        final String b2 = a.b();
        final StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 34 + s.length() + String.valueOf(b2).length());
        sb.append("Camera ");
        sb.append(a2);
        sb.append(" encountered a fatal error ");
        sb.append(s);
        sb.append(b2);
        super(sb.toString());
        this.b = b;
        this.a = a;
        this.c = c;
    }
}
