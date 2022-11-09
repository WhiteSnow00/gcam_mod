import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdf implements jqn
{
    public static final kdf a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;
    private final boolean h;
    private final Long i;
    private final Long j;
    
    static {
        a = new kdf();
    }
    
    public kdf() {
        this.b = false;
        this.c = false;
        this.d = null;
        this.e = false;
        this.h = false;
        this.f = null;
        this.g = null;
        this.i = null;
        this.j = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof kdf)) {
            return false;
        }
        final kdf kdf = (kdf)o;
        final boolean b = kdf.b;
        final boolean c = kdf.c;
        final String d = kdf.d;
        if (jvu.m(null, null)) {
            final boolean e = kdf.e;
            final boolean h = kdf.h;
            final String f = kdf.f;
            if (jvu.m(null, null)) {
                final String g = kdf.g;
                if (jvu.m(null, null)) {
                    final Long i = kdf.i;
                    if (jvu.m(null, null)) {
                        final Long j = kdf.j;
                        if (jvu.m(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Boolean value = false;
        return Arrays.hashCode(new Object[] { value, value, null, value, value, null, null, null, null });
    }
}
