import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxx extends jva
{
    public final Context a;
    
    public jxx(final Context a, final Looper looper, final jqu jqu, final jqv jqv, final juq juq) {
        super(a, looper, 29, juq, jqu, jqv);
        kiu.b(this.a = a);
    }
    
    @Override
    public final int a() {
        return 11925000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }
    
    @Override
    public final jpu[] f() {
        return jxl.b;
    }
}
