import android.util.Log;
import android.os.IInterface;
import android.app.PendingIntent;
import android.text.TextUtils;
import android.os.Message;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

final class juf extends kax
{
    final /* synthetic */ jum a;
    
    public juf(final jum a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    private static final void a(final Message message) {
        final jug jug = (jug)message.obj;
        jug.b();
        jug.f();
    }
    
    private static final boolean c(final Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
    
    public final void handleMessage(Message ex) {
        if (this.a.o.get() != ((Message)ex).arg1) {
            if (c((Message)ex)) {
                a((Message)ex);
            }
            return;
        }
        Label_0075: {
            if (((Message)ex).what != 1 && ((Message)ex).what != 7) {
                if (((Message)ex).what != 4) {
                    if (((Message)ex).what != 5) {
                        break Label_0075;
                    }
                }
            }
            if (!this.a.m()) {
                a((Message)ex);
                return;
            }
        }
        final int what = ((Message)ex).what;
        PendingIntent pendingIntent = null;
        if (what == 4) {
            this.a.l = new jps(((Message)ex).arg2);
            final jum a = this.a;
            if (!a.m) {
                if (!TextUtils.isEmpty((CharSequence)a.d()) && !TextUtils.isEmpty((CharSequence)null)) {
                    try {
                        Class.forName(a.d());
                        final jum a2 = this.a;
                        if (!a2.m) {
                            jum.F(a2, 3);
                            return;
                        }
                    }
                    catch (final ClassNotFoundException ex2) {}
                }
            }
            jps l;
            if ((l = this.a.l) == null) {
                l = new jps(8);
            }
            this.a.g.a(l);
            System.currentTimeMillis();
            return;
        }
        if (((Message)ex).what == 5) {
            jps i;
            if ((i = this.a.l) == null) {
                i = new jps(8);
            }
            this.a.g.a(i);
            System.currentTimeMillis();
            return;
        }
        if (((Message)ex).what == 3) {
            if (((Message)ex).obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent)((Message)ex).obj;
            }
            this.a.g.a(new jps(((Message)ex).arg2, pendingIntent));
            System.currentTimeMillis();
            return;
        }
        if (((Message)ex).what == 6) {
            jum.F(this.a, 5);
            final juy p = this.a.p;
            if (p != null) {
                p.a.a(((Message)ex).arg2);
            }
            final int arg2 = ((Message)ex).arg2;
            System.currentTimeMillis();
            this.a.A(5, 1, null);
            return;
        }
        if (((Message)ex).what == 2 && !this.a.l()) {
            a((Message)ex);
            return;
        }
        if (c((Message)ex)) {
            ex = (RuntimeException)((Message)ex).obj;
            synchronized (ex) {
                final Object d = ((jug)ex).d;
                if (((jug)ex).e) {
                    final String value = String.valueOf(ex);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(value);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
                monitorexit(ex);
                if (d != null) {
                    try {
                        ((jug)ex).d();
                    }
                    catch (final RuntimeException ex) {
                        throw ex;
                    }
                }
                synchronized (ex) {
                    ((jug)ex).e = true;
                    monitorexit(ex);
                    ((jug)ex).f();
                    return;
                }
            }
        }
        final int what2 = ((Message)ex).what;
        final StringBuilder sb2 = new StringBuilder(45);
        sb2.append("Don't know how to handle message: ");
        sb2.append(what2);
        Log.wtf("GmsClient", sb2.toString(), (Throwable)new Exception());
    }
}
