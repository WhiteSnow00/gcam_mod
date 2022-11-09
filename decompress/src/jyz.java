import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyz
{
    private String a;
    private int b;
    private boolean c;
    private String d;
    private final byte[] e;
    
    public jyz() {
        this.e = new byte[0];
    }
    
    public final jza a() {
        return new jza(this.a, this.b, this.c, this.d, 0, null, null, null, 0L, null, null, this.e, null);
    }
    
    public final void b(final String d) {
        d.getClass();
        njo.d(d.isEmpty() ^ true);
        this.d = d;
    }
    
    public final void c(final int b) {
        this.b = b;
        this.c = true;
    }
    
    public final void d(final String a) {
        a.getClass();
        njo.d(a.isEmpty() ^ true);
        this.a = a;
    }
}
