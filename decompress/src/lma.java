import android.content.ContentValues;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lma
{
    private final ContentValues a;
    
    public lma() {
        this(new ContentValues());
    }
    
    public lma(final ContentValues a) {
        this.a = a;
    }
    
    public final lmb a() {
        return new lmb(new ContentValues(this.a));
    }
    
    public final void b(final String s, final int n) {
        this.a.put(s, Integer.valueOf(n));
    }
    
    public final void c(final String s, final long n) {
        this.a.put(s, Long.valueOf(n));
    }
    
    public final void d(final String s, final String s2) {
        this.a.put(s, s2);
    }
}
