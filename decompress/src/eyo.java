import android.util.Log;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyo implements egi
{
    final /* synthetic */ egi a;
    final /* synthetic */ TimeUnit b;
    final /* synthetic */ String l;
    
    public eyo(final egi a, final TimeUnit b) {
        this.a = a;
        this.b = b;
        this.l = "AppSettings";
    }
    
    @Override
    public final Object a(final egh egh) {
        final long currentTimeMillis = System.currentTimeMillis();
        final Object a = this.a.a(egh);
        final long n = System.currentTimeMillis() - currentTimeMillis;
        if (n > TimeUnit.MILLISECONDS.convert(5L, this.b)) {
            final String l = this.l;
            final String b = egh.b;
            final StringBuilder sb = new StringBuilder(b.length() + 63);
            sb.append("Warning: providing system service ");
            sb.append(b);
            sb.append(" took ");
            sb.append(n);
            sb.append(" ms");
            Log.w(l, sb.toString());
        }
        return a;
    }
}
