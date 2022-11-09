import java.util.ArrayList;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lbr extends lcz
{
    public lbr(final lfg lfg, final kwg kwg, final ldy ldy, final ldj ldj, final krr krr, final kse kse) {
        super(lfg.L(), kwg.b, ldy, ldj, krr, kse);
    }
    
    @Override
    protected final void a(final ljg ljg, final lcd lcd, final List list, final Handler handler) {
        try {
            final ArrayList list2 = new ArrayList(((nql)list).c);
            final nrw t = ((nns)list).t();
            while (t.hasNext()) {
                final ljo a = t.next().a();
                a.getClass();
                list2.add(a);
            }
            ljg.e(list2, lcd, handler);
        }
        finally {
            final krr b = this.b;
            final String value = String.valueOf(lcd);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 35);
            sb.append("Unable to createCaptureSession for ");
            sb.append(value);
            final Throwable t2;
            b.i(sb.toString(), t2);
            lcd.b();
        }
    }
}
