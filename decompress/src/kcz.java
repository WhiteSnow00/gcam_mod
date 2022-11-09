import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcz extends jva
{
    public kcz(final Context context, final Looper looper, final juq juq, final jqu jqu, final jqv jqv) {
        super(context, looper, 51, juq, jqu, jqv);
    }
    
    @Override
    public final int a() {
        return 9410000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.phenotype.service.START";
    }
    
    @Override
    public final jpu[] f() {
        return kcm.e;
    }
}
