import android.content.DialogInterface$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxd
{
    public final Context a;
    
    public hxd(final Context a) {
        this.a = a;
    }
    
    public static final kc e(final kb kb) {
        final kc b = kb.b();
        b.setCancelable(false);
        b.setCanceledOnTouchOutside(false);
        return b;
    }
    
    private final kb f(final String s, final String s2, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final ndv ndv = new ndv(this.a);
        ndv.r(s);
        ndv.k(s2);
        ndv.p(this.a.getResources().getString(2131952794), (DialogInterface$OnClickListener)new hxc(this));
        ndv.m(this.a.getResources().getString(2131951906), dialogInterface$OnClickListener);
        return ndv;
    }
    
    public final kb a(final String s, final String s2, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final ndv ndv = new ndv(this.a);
        ndv.r(s);
        ndv.k(s2);
        ndv.p(this.a.getResources().getString(2131951909), dialogInterface$OnClickListener);
        return ndv;
    }
    
    public final kc b(final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return e(this.f(this.a.getResources().getString(2131951902), this.a.getResources().getString(2131951901), dialogInterface$OnClickListener));
    }
    
    public final kc c(final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return e(this.f(this.a.getResources().getString(2131951902), this.a.getResources().getString(2131951901), dialogInterface$OnClickListener));
    }
    
    public final kc d(final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        return e(this.f(this.a.getResources().getString(2131952796), this.a.getResources().getString(2131951901), dialogInterface$OnClickListener));
    }
}
