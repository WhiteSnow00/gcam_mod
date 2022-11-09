import java.util.concurrent.Executor;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcx implements oen
{
    final /* synthetic */ kjk a;
    final /* synthetic */ lcd b;
    final /* synthetic */ List c;
    final /* synthetic */ ljg d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ Handler g;
    final /* synthetic */ Executor h;
    final /* synthetic */ lcz i;
    
    public lcx(final lcz i, final kjk a, final lcd b, final List c, final ljg d, final List e, final List f, final Handler g, final Executor h) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void a(final Throwable t) {
        final krr b = this.i.b;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 41 + String.valueOf(value2).length());
        sb.append("Failed to receive required outputs for ");
        sb.append(value);
        sb.append(" ");
        sb.append(value2);
        sb.append(".");
        b.i(sb.toString(), t);
        this.b.b();
    }
}
