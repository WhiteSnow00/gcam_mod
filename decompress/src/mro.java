import java.util.Iterator;
import java.io.OutputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mro extends msj
{
    private final List a;
    
    public mro(final OutputStream outputStream, final List a) {
        super(outputStream);
        this.a = a;
        mug.c(true, "Output was null", new Object[0]);
    }
    
    @Override
    public final void close() {
        for (final msr msr : this.a) {
            try {
                msr.close();
            }
            finally {}
        }
        super.close();
    }
    
    @Override
    public final void write(final int n) {
        this.out.write(n);
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((msr)iterator.next()).a();
        }
    }
    
    @Override
    public final void write(final byte[] array) {
        this.out.write(array);
        for (final msr msr : this.a) {
            final int length = array.length;
            msr.a();
        }
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.out.write(array, n, n2);
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((msr)iterator.next()).a();
        }
    }
}
