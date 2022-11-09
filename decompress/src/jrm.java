import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrm extends jrk
{
    public final jtj b;
    
    public jrm(final jtj b, final kej kej) {
        super(3, kej);
        this.b = b;
    }
    
    @Override
    public final boolean a(final jsm jsm) {
        return true;
    }
    
    @Override
    public final jpu[] b(final jsm jsm) {
        return null;
    }
    
    public final void c(final jsm jsm) {
        final jtb a = this.b.a.a();
        if (a != null && jsm.e.containsKey(a)) {
            this.a.d(null);
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 50);
            sb.append("Dropping registration call for already registered ");
            sb.append(value);
            Log.w("ApiCallRunner", sb.toString());
            return;
        }
        this.b.a.b(jsm.b, this.a);
        if (a != null) {
            jsm.e.put(a, this.b);
        }
    }
}
