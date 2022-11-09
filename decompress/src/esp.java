import android.view.WindowManager;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

final class esp implements aso
{
    final /* synthetic */ ess a;
    
    public esp(final ess a) {
        this.a = a;
    }
    
    @Override
    public final void a(final byte[] array) {
        final ess a = this.a;
        int i = 0;
        a.s = false;
        final ers c = a.c;
        final WindowManager a2 = a.r.a();
        final ess a3 = this.a;
        if (c.a(a2, a3.q, a3.J, false) != null) {
            this.a.g();
            final ess a4 = this.a;
            a4.t = false;
            a4.c.b.r(a4.I, new eso(this));
        }
        final ess a5 = this.a;
        final float[] f = a5.g.f();
        final float[] array2 = { f[0], f[1], f[2], f[4], f[5], f[6], f[8], f[9], f[10] };
        String string = new String();
        float n = 0.0f;
        while (i < 9) {
            final float n2 = array2[i];
            final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 16);
            sb.append(string);
            sb.append(n2);
            sb.append(" ");
            string = sb.toString();
            n += array2[i];
            ++i;
        }
        final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 16);
        sb2.append(string);
        sb2.append(n);
        sb2.append("\n");
        final String string2 = sb2.toString();
        try {
            a5.o.write(string2);
            a5.o.flush();
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        final ess a6 = this.a;
        a6.z.post((Runnable)new esr(a6, array));
        if (esh.d() == esh.e()) {
            this.a.b.c();
            if (this.a.y != null && esh.e() == 1) {
                this.a.y.a(null);
            }
            else {
                final euc x = this.a.x;
                if (x != null) {
                    x.a(null);
                }
            }
        }
        final euc c2 = this.a.C;
        if (c2 != null) {
            c2.a(null);
        }
    }
}
