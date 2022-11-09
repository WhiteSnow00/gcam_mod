import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkj extends pkl
{
    private boolean b;
    private File[] c;
    private int d;
    private boolean e;
    
    public pkj(final File file) {
        super(file);
    }
    
    public pkj(final File file, final byte[] array) {
        this(file);
    }
    
    @Override
    public final File a() {
        if (!this.e && this.c == null && (this.c = super.a.listFiles()) == null) {
            this.e = true;
        }
        final File[] c = this.c;
        if (c != null) {
            final int d = this.d;
            if (d < c.length) {
                this.d = d + 1;
                return c[d];
            }
        }
        if (!this.b) {
            this.b = true;
            return super.a;
        }
        return null;
    }
}
