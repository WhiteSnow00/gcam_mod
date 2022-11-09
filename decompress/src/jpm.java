import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpm extends jva
{
    public jpm(final Context context, final Looper looper, final juq juq, final jqu jqu, final jqv jqv) {
        super(context, looper, 40, juq, jqu, jqv);
    }
    
    @Override
    public final int a() {
        return 11925000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.clearcut.service.START";
    }
    
    @Override
    public final jpu[] f() {
        return jph.b;
    }
}
