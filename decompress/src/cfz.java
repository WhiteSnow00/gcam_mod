import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfz
{
    public final cek a;
    public final iqg b;
    public final kjm c;
    public bqo d;
    public kc e;
    public final hxd f;
    
    public cfz(final hxd f, final cek a, final iqg b, final kjm c) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final DialogInterface$OnClickListener a() {
        return (DialogInterface$OnClickListener)new cfw(this, 1);
    }
    
    public final DialogInterface$OnClickListener b() {
        return (DialogInterface$OnClickListener)new cfw(this);
    }
    
    public final void c() {
        this.c.execute(new cfy(this));
    }
}
