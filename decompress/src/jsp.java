import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class jsp implements juh
{
    public final jqo a;
    public final jrq b;
    public Set c;
    public boolean d;
    final /* synthetic */ jsq e;
    public jvk f;
    
    public jsp(final jsq e, final jqo a, final jrq b) {
        this.e = e;
        this.f = null;
        this.c = null;
        this.d = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final jps jps) {
        this.e.o.post((Runnable)new jso(this, jps));
    }
    
    public final void b(final jps jps) {
        final jsm jsm = this.e.l.get(this.b);
        if (jsm != null) {
            jvu.d(jsm.j.o);
            final jqo b = jsm.b;
            final String name = b.getClass().getName();
            final String value = String.valueOf(jps);
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(value).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(value);
            b.k(sb.toString());
            jsm.i(jps);
        }
    }
    
    public final void c() {
        if (this.d) {
            final jvk f = this.f;
            if (f != null) {
                this.a.s(f, this.c);
            }
        }
    }
}
