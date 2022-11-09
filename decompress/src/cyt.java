import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyt
{
    public static final nsd a;
    public final cyp b;
    public final SharedPreferences c;
    private final ljb d;
    private final niz e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/configuration/impl/GcaConfigHelper");
    }
    
    public cyt(final ljb d, final SharedPreferences c, final cyp b, final cyn cyn) {
        this.b = b;
        this.d = d;
        this.c = c;
        niz e;
        if (cyn.b(cyn.b)) {
            e = niz.i(cyy.a());
        }
        else {
            e = nii.a;
        }
        this.e = e;
    }
    
    static moh a(final cxm cxm, final Float n) {
        if (cxm.b != null) {
            n.getClass();
            final double n2 = n;
            final String b = cxm.b;
            b.getClass();
            final String a = cxm.a;
            final mof a2 = cyr.a;
            final StringBuilder sb = new StringBuilder(b.length() + 2 + String.valueOf(a).length());
            sb.append(b);
            sb.append("__");
            sb.append(a);
            return new moc(a2, sb.toString(), n2);
        }
        return null;
    }
    
    static moh b(final cxm cxm, final Integer n) {
        final String b = cxm.b;
        if (b != null) {
            final String a = cxm.a;
            n.getClass();
            final mof a2 = cyr.a;
            final StringBuilder sb = new StringBuilder(b.length() + 2 + String.valueOf(a).length());
            sb.append(b);
            sb.append("__");
            sb.append(a);
            return new moa(a2, sb.toString(), n);
        }
        return null;
    }
    
    static moh c(final cxm cxm, final boolean b) {
        final String b2 = cxm.b;
        if (b2 != null) {
            final String a = cxm.a;
            final mof a2 = cyr.a;
            final StringBuilder sb = new StringBuilder(b2.length() + 2 + String.valueOf(a).length());
            sb.append(b2);
            sb.append("__");
            sb.append(a);
            return a2.c(sb.toString(), b);
        }
        return null;
    }
    
    static boolean e(final Boolean b) {
        return b != null && b;
    }
    
    final String d(String concat) {
        if (concat == null) {
            return null;
        }
        final String a = this.d.a(concat);
        if (a != null) {
            return a;
        }
        if (this.e.g() && ((cyx)this.e.c()).a && ((cyx)this.e.c()).b) {
            return null;
        }
        final ljb d = this.d;
        if (concat.length() != 0) {
            concat = "persist.".concat(concat);
        }
        else {
            concat = new String("persist.");
        }
        return d.a(concat);
    }
}
