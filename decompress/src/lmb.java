import android.content.ContentValues;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmb
{
    public static final lmb a;
    private final ContentValues b;
    
    static {
        a = b().a();
    }
    
    public lmb(final ContentValues b) {
        this.b = b;
    }
    
    public static lma b() {
        return new lma(new ContentValues());
    }
    
    public static lma c(final lmb lmb) {
        return new lma(new ContentValues(lmb.b));
    }
    
    final ContentValues a() {
        return new ContentValues(this.b);
    }
}
