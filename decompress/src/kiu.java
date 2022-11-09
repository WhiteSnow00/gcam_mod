import android.content.Context;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kiu
{
    public static ContentResolver a;
    protected final String b;
    protected final Object c;
    
    static {
        kiu.a = null;
    }
    
    protected kiu(final String b, final Object c) {
        this.b = b;
        this.c = c;
    }
    
    public static void b(final Context context) {
        kiu.a = context.getContentResolver();
    }
    
    public static kiu c(final String s) {
        return new kis(s, false);
    }
    
    public abstract Object a();
}
