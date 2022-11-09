import android.content.DialogInterface$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyb
{
    public final Context a;
    public final niz b;
    private final hkc c;
    
    public hyb(final Context a, final hkc c, final niz b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final boolean a() {
        final boolean booleanValue = (boolean)this.c.c(hjq.D);
        if (booleanValue) {
            final ndv ndv = new ndv(this.a);
            ndv.r(this.a.getString(2131952762));
            ndv.k(this.a.getString(2131952761));
            ndv.p(this.a.getString(2131952800), (DialogInterface$OnClickListener)new hya(this));
            ndv.m(this.a.getString(17039360), null);
            ndv.c();
        }
        return booleanValue;
    }
}
