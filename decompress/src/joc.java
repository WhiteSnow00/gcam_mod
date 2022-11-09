import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joc extends jva
{
    private final joa a;
    
    public joc(final Context context, final Looper looper, final juq juq, joa a, final jqu jqu, final jqv jqv) {
        super(context, looper, 68, juq, jqu, jqv);
        if (a == null) {
            a = joa.a;
        }
        final jnz jnz = new jnz(a);
        jnz.b = jys.a();
        this.a = jnz.a();
    }
    
    @Override
    public final int a() {
        return 12800000;
    }
    
    @Override
    protected final Bundle b() {
        final joa a = this.a;
        final Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String)null);
        bundle.putBoolean("force_save_dialog", a.c);
        bundle.putString("log_session_id", a.d);
        return bundle;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
