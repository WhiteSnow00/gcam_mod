import java.util.concurrent.ExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzm
{
    public final Context a;
    public final jzq b;
    public final ExecutorService c;
    public final Class d;
    
    public jzm(final Context a, final jzq b, final ExecutorService c, final Class d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static void a(final String s) {
        njo.i(s.startsWith("/"), "collection must start with \"/\" but is \"%s\"", s);
    }
}
