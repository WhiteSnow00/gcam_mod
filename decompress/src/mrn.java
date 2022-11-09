import java.util.Iterator;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrn extends msi
{
    private final List a;
    
    public mrn(final InputStream inputStream, final List a) {
        super(inputStream);
        this.a = a;
        mug.c(true, "Input was null", new Object[0]);
    }
    
    @Override
    public final void close() {
        for (final msq msq : this.a) {
            try {
                msq.close();
            }
            finally {}
        }
        super.close();
    }
    
    @Override
    public final int read() {
        final int read = this.in.read();
        if (read != -1) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((msq)iterator.next()).a();
            }
        }
        return read;
    }
    
    @Override
    public final int read(final byte[] array) {
        final int read = this.in.read(array);
        if (read != -1) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((msq)iterator.next()).a();
            }
        }
        return read;
    }
    
    @Override
    public final int read(final byte[] array, int read, final int n) {
        read = this.in.read(array, read, n);
        if (read != -1) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((msq)iterator.next()).a();
            }
        }
        return read;
    }
}
