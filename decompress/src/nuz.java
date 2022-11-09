import java.util.logging.Level;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class nuz extends num
{
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    
    public nuz(final String a, final String s, final boolean b, final boolean c, final boolean d) {
        super(s);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void c(final ntk ntk) {
        String a;
        if ((a = (String)ntk.j().d(ntf.a)) == null) {
            a = this.a();
        }
        String substring;
        if ((substring = a) == null) {
            final String b = ntk.f().b();
            final int index = b.indexOf(36, b.lastIndexOf(46));
            substring = b;
            if (index >= 0) {
                substring = b.substring(0, index);
            }
        }
        final String d = nvb.d(this.a, substring, this.b);
        final Level m = ntk.m();
        if (!this.d) {
            final int e = nvb.e(m);
            if (!Log.isLoggable(d, e) && !Log.isLoggable("all", e)) {
                return;
            }
        }
        nva.e(ntk, d, this.c);
    }
    
    @Override
    public final boolean d(final Level level) {
        return true;
    }
}
