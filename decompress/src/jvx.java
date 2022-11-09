// 
// Decompiled by Procyon v0.6.0
// 

public final class jvx
{
    private static jvx b;
    private static final jvy c;
    public jvy a;
    
    static {
        jvx.b = null;
        c = new jvy(0, false, false, 0, 0);
    }
    
    private jvx() {
    }
    
    public static jvx a() {
        synchronized (jvx.class) {
            if (jvx.b == null) {
                jvx.b = new jvx();
            }
            return jvx.b;
        }
    }
    
    public final void b(final jvy a) {
        monitorenter(this);
        Label_0016: {
            if (a != null) {
                break Label_0016;
            }
            try {
                this.a = jvx.c;
                return;
                final jvy a2 = this.a;
                iftrue(Label_0048:)(a2 == null || a2.a < a.a);
                return;
                Label_0048: {
                    this.a = a;
                }
            }
            finally {
                monitorexit(this);
            }
        }
    }
}
