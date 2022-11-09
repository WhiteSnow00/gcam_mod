import android.os.IInterface;
import android.os.IBinder;
import java.util.Iterator;
import com.google.android.gms.common.api.Scope;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joj extends jva
{
    public final GoogleSignInOptions a;
    
    public joj(final Context context, final Looper looper, final juq juq, final GoogleSignInOptions googleSignInOptions, final jqu jqu, final jqv jqv) {
        super(context, looper, 91, juq, jqu, jqv);
        jof jof;
        if (googleSignInOptions != null) {
            jof = new jof(googleSignInOptions);
        }
        else {
            jof = new jof();
        }
        jof.b = jys.a();
        if (!juq.c.isEmpty()) {
            final Iterator iterator = juq.c.iterator();
            while (iterator.hasNext()) {
                jof.c((Scope)iterator.next(), new Scope[0]);
            }
        }
        this.a = jof.a();
    }
    
    @Override
    public final int a() {
        return 12451000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
