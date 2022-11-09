import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wn
{
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wt c;
    public final /* synthetic */ wp d;
    
    public wn() {
    }
    
    public wn(final wp d, final String a, final int b, final wt c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        final wp d = this.d;
        final String a = this.a;
        if (!d.e.contains(a)) {
            final Integer n = d.c.remove(a);
            if (n != null) {
                d.b.remove(n);
            }
        }
        d.f.remove(a);
        if (d.g.containsKey(a)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(a);
            sb.append(": ");
            sb.append(d.g.get(a));
            Log.w("ActivityResultRegistry", sb.toString());
            d.g.remove(a);
        }
        if (d.h.containsKey(a)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(a);
            sb2.append(": ");
            sb2.append(d.h.getParcelable(a));
            Log.w("ActivityResultRegistry", sb2.toString());
            d.h.remove(a);
        }
        if (d.d.get(a) == null) {
            return;
        }
        throw null;
    }
}
