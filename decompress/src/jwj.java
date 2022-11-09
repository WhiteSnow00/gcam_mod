import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwj extends jva
{
    public jwj(final Context context, final Looper looper, final juq juq, final jsa jsa, final jtg jtg) {
        super(context, looper, 270, juq, jsa, jtg);
    }
    
    @Override
    protected final boolean B() {
        return true;
    }
    
    @Override
    public final int a() {
        return 203400000;
    }
    
    @Override
    protected final Bundle b() {
        return new Bundle();
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
    
    @Override
    public final jpu[] f() {
        return jpr.b;
    }
}
