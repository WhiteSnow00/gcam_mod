import java.util.Arrays;
import android.net.Uri$Builder;
import android.content.ComponentName;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvb
{
    public static final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    private final ComponentName f;
    
    static {
        a = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }
    
    public jvb(final String b, final String c, final boolean e) {
        jvu.h(b);
        this.b = b;
        jvu.h(c);
        this.c = c;
        this.f = null;
        this.d = 4225;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jvb)) {
            return false;
        }
        final jvb jvb = (jvb)o;
        if (jvu.m(this.b, jvb.b) && jvu.m(this.c, jvb.c)) {
            final ComponentName f = jvb.f;
            if (jvu.m(null, null)) {
                final int d = jvb.d;
                if (this.e == jvb.e) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, null, 4225, this.e });
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}
