import android.util.Log;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvo extends OutputStream
{
    private final kvn a;
    
    public kvo(final kvn a) {
        this.a = a;
    }
    
    @Override
    public final void close() {
        final kvn a = this.a;
        if (a.b.a() > 0) {
            final String value = String.valueOf(a.b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 40);
            sb.append("Warning: unwritten bytes in the buffer: ");
            sb.append(value);
            Log.w("CAM_ProcFSM", sb.toString());
        }
        final int e = a.e;
        if (e > 0) {
            final StringBuilder sb2 = new StringBuilder(48);
            sb2.append("Warning: still need to forward ");
            sb2.append(e);
            sb2.append(" bytes");
            Log.w("CAM_ProcFSM", sb2.toString());
        }
        if (a.d > 0) {
            final int e2 = a.e;
            final StringBuilder sb3 = new StringBuilder(45);
            sb3.append("Warning: still need to skip ");
            sb3.append(e2);
            sb3.append(" bytes");
            Log.w("CAM_ProcFSM", sb3.toString());
        }
        a.c.close();
    }
    
    @Override
    public final void flush() {
        this.a.c.flush();
    }
    
    @Override
    public final void write(int e) {
        final kvn a = this.a;
        final int d = a.d;
        if (d != 0) {
            if (d > 0) {
                a.d = d - 1;
            }
        }
        else {
            if (a.e == 0) {
                final kux b = a.b;
                b.b(1);
                final byte[] a2 = b.a;
                final int c = b.c;
                a2[c] = (byte)(e & 0xFF);
                b.c = c + 1;
                a.f();
                return;
            }
            a.c.write(e);
            e = a.e;
            if (e > 0) {
                a.e = e - 1;
            }
        }
    }
    
    @Override
    public final void write(final byte[] array) {
        this.a.e(array, 0, array.length);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        this.a.e(array, n, n2);
    }
}
