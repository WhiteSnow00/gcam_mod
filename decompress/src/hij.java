import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hij
{
    private final String a;
    private final String b;
    private File c;
    private final hhw d;
    
    public hij(final hhw d, final String a, final String b) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public final File a() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final boolean b() {
        monitorenter(this);
        try {
            final boolean b = this.a() != null;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean c() {
        synchronized (this) {
            if (this.c != null) {
                return true;
            }
            try {
                final hhw d = this.d;
                final String a = this.a;
                final String b = this.b;
                final File c = new File(new File(d.a(a), b), String.valueOf(b).concat(".jpg"));
                och.r(c);
                if (!c.createNewFile() || !c.canWrite()) {
                    if (!c.canWrite()) {
                        throw new IOException("Temporary output file is not writeable.");
                    }
                }
                this.c = c;
                return true;
            }
            catch (final IOException ex) {
                return false;
            }
        }
    }
}
