import android.content.Context;
import java.util.Map;
import java.util.List;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auk extends ContextWrapper
{
    static final ava a;
    public final azi b;
    public final auu c;
    public final List d;
    public final Map e;
    public final ayn f;
    public final aun g;
    public final int h;
    private bho i;
    
    static {
        a = new ava();
    }
    
    public auk(final Context context, final azi b, final auu c, final Map e, final List d, final ayn f, final aun g) {
        super(context.getApplicationContext());
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = 4;
    }
    
    public final bho a() {
        synchronized (this) {
            if (this.i == null) {
                final bho i = new bho();
                i.K();
                this.i = i;
            }
            return this.i;
        }
    }
}
