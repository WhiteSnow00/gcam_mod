import android.util.Log;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgs extends ei
{
    public final bgc a;
    public final bgp b;
    public auz c;
    private final Set d;
    private bgs e;
    
    public bgs() {
        final bgc a = new bgc();
        this.b = new bgr(this);
        this.d = new HashSet();
        this.a = a;
    }
    
    private final void m() {
        final bgs e = this.e;
        if (e != null) {
            e.d.remove(this);
            this.e = null;
        }
    }
    
    @Override
    public final void E() {
        super.E();
        this.a.b();
        this.m();
    }
    
    @Override
    public final void d(final Context context) {
        super.d(context);
        bgs bgs = this;
        while (true) {
            final ei d = bgs.D;
            if (d == null) {
                break;
            }
            bgs = (bgs)d;
        }
        final fi a = bgs.A;
        if (a == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
            return;
        }
        try {
            final Context s = this.s();
            this.m();
            final bgs d2 = auf.b(s).e.d(a);
            this.e = d2;
            if (!this.equals(d2)) {
                this.e.d.add(this);
            }
        }
        catch (final IllegalStateException ex) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", (Throwable)ex);
            }
        }
    }
    
    @Override
    public final void g() {
        super.g();
        this.m();
    }
    
    @Override
    public final void i() {
        super.i();
        this.a.c();
    }
    
    @Override
    public final void j() {
        super.j();
        this.a.d();
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        ei d;
        if ((d = super.D) == null) {
            d = null;
        }
        final String value = String.valueOf(d);
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 9 + String.valueOf(value).length());
        sb.append(string);
        sb.append("{parent=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
