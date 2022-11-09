import java.util.Iterator;
import java.util.List;
import android.content.SharedPreferences;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mev implements mmw
{
    private final pii a;
    private final pii b;
    private final Set c;
    
    public mev(final pii a, final pii b, final Set c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final String b(final String s) {
        return ((SharedPreferences)this.b.get()).getString(c(s), (String)null);
    }
    
    private static final String c(String concat) {
        if (concat.length() != 0) {
            concat = "federatedLearningLastScheduledSession_".concat(concat);
        }
        else {
            concat = new String("federatedLearningLastScheduledSession_");
        }
        return concat;
    }
    
    @Override
    public final void a(final psp psp) {
        final meq meq = (meq)this.a.get();
        for (final mep mep : this.c) {
            if (!((ouu)mep.b.get()).a) {
                final String b = this.b(mep.a);
                if (b == null) {
                    continue;
                }
                meq.b(b);
            }
            else {
                final String replace = ((ouu)mep.b.get()).b.replace("%PACKAGE_NAME%", mep.c.getPackageName()).replace("%METRIC_NAME%", mep.a);
                final String c = ((ouu)mep.b.get()).c;
                final String a = mep.a;
                final noi a2 = mep.a(psp);
                if (a2.isEmpty()) {
                    continue;
                }
                meq.a(c, nqb.s(a2.v(), mcj.d));
                meq.c(replace);
                final String b2 = this.b(a);
                if (b2 == null || replace.equals(b2)) {
                    continue;
                }
                meq.b(b2);
                ((SharedPreferences)this.b.get()).edit().putString(c(a), replace).commit();
            }
        }
    }
}
