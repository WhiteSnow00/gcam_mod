import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class kbv extends jva
{
    protected final kbu a;
    private final String t;
    
    public kbv(final Context context, final Looper looper, final jqu jqu, final jqv jqv, final juq juq) {
        super(context, looper, 23, juq, jqu, jqv);
        this.a = new kbu(this);
        this.t = "locationServices";
    }
    
    @Override
    public final int a() {
        return 11717000;
    }
    
    @Override
    protected final Bundle b() {
        final Bundle bundle = new Bundle();
        bundle.putString("client_name", this.t);
        return bundle;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
    
    @Override
    public final jpu[] f() {
        return kaz.f;
    }
}
