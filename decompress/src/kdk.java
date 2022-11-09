import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdk extends jva implements kde
{
    public final juq a;
    public final Integer t;
    private final boolean u;
    private final Bundle v;
    
    public kdk(final Context context, final Looper looper, final juq a, final Bundle v, final jqu jqu, final jqv jqv) {
        super(context, looper, 44, a, jqu, jqv);
        this.u = true;
        this.a = a;
        this.v = v;
        this.t = a.h;
    }
    
    @Override
    public final int a() {
        return 12451000;
    }
    
    @Override
    protected final Bundle b() {
        if (!super.c.getPackageName().equals(this.a.e)) {
            this.v.putString("com.google.android.gms.signin.internal.realClientPackageName", this.a.e);
        }
        return this.v;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.signin.service.START";
    }
    
    @Override
    public final boolean o() {
        return this.u;
    }
}
