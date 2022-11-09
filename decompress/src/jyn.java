import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyn extends jva
{
    public jyn(final Context context, final Looper looper, final juq juq, final jqu jqu, final jqv jqv) {
        super(context, looper, 63, juq, jqu, jqv);
    }
    
    @Override
    public final int a() {
        return 11925000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }
}
