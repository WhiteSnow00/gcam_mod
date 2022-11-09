import java.io.IOException;
import android.media.MediaDataSource;

// 
// Decompiled by Procyon v0.6.0
// 

final class acp extends MediaDataSource
{
    long a;
    final /* synthetic */ acq b;
    
    public acp(final acq b) {
        this.b = b;
    }
    
    public final void close() {
    }
    
    public final long getSize() {
        return -1L;
    }
    
    public final int readAt(final long a, final byte[] array, int read, final int n) {
        if (n == 0) {
            return 0;
        }
        if (a < 0L) {
            return -1;
        }
        try {
            final long a2 = this.a;
            if (a2 != a) {
                if (a2 >= 0L && a >= a2 + this.b.available()) {
                    return -1;
                }
                this.b.c(a);
                this.a = a;
            }
            int available;
            if ((available = n) > this.b.available()) {
                available = this.b.available();
            }
            read = this.b.read(array, read, available);
            if (read >= 0) {
                this.a += read;
                return read;
            }
        }
        catch (final IOException ex) {}
        this.a = -1L;
        return -1;
    }
}
