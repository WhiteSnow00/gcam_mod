import java.util.Arrays;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class ave
{
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    public avd f;
    final /* synthetic */ avg g;
    
    public ave(final avg g, final String a) {
        this.g = g;
        this.a = a;
        final int b = g.b;
        this.b = new long[b];
        this.c = new File[b];
        this.d = new File[b];
        final StringBuilder sb = new StringBuilder(a);
        sb.append('.');
        final int length = sb.length();
        for (int i = 0; i < g.b; i = 1) {
            sb.append(0);
            this.c[0] = new File(g.a, sb.toString());
            sb.append(".tmp");
            this.d[0] = new File(g.a, sb.toString());
            sb.setLength(length);
        }
    }
    
    public static final IOException e(final String[] array) {
        final String value = String.valueOf(Arrays.toString(array));
        String concat;
        if (value.length() != 0) {
            concat = "unexpected journal line: ".concat(value);
        }
        else {
            concat = new String("unexpected journal line: ");
        }
        throw new IOException(concat);
    }
    
    public final String a() {
        final StringBuilder sb = new StringBuilder();
        final long[] b = this.b;
        for (int length = b.length, i = 0; i < length; i = 1) {
            final long n = b[0];
            sb.append(' ');
            sb.append(n);
        }
        return sb.toString();
    }
    
    public final File c() {
        return this.c[0];
    }
    
    public final File d() {
        return this.d[0];
    }
}
