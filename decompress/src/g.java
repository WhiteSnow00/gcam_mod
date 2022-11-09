// 
// Decompiled by Procyon v0.6.0
// 

public enum g
{
    a("ON_CREATE", 0), 
    b("ON_START", 1), 
    c("ON_RESUME", 2), 
    d("ON_PAUSE", 3), 
    e("ON_STOP", 4), 
    f("ON_DESTROY", 5), 
    g("ON_ANY", 6);
    
    private g(final String s, final int n) {
    }
    
    public static g a(final h h) {
        final h a = h.a;
        switch (h.ordinal()) {
            default: {
                return null;
            }
            case 4: {
                return g.d;
            }
            case 3: {
                return g.e;
            }
            case 2: {
                return g.f;
            }
        }
    }
    
    public static g b(final h h) {
        final h a = h.a;
        switch (h.ordinal()) {
            default: {
                return null;
            }
            case 3: {
                return g.c;
            }
            case 2: {
                return g.b;
            }
            case 1: {
                return g.a;
            }
        }
    }
    
    public final h c() {
        final h a = h.a;
        switch (this.ordinal()) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
            }
            case 5: {
                return h.a;
            }
            case 2: {
                return h.e;
            }
            case 1:
            case 3: {
                return h.d;
            }
            case 0:
            case 4: {
                return h.c;
            }
        }
    }
}
