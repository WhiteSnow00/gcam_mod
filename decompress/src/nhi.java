import android.os.StrictMode$ThreadPolicy;
import java.security.SecureRandom;
import android.os.StrictMode;
import java.util.concurrent.atomic.AtomicLong;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

final class nhi
{
    public static final nhi a;
    private final UUID b;
    private final AtomicLong c;
    
    static {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new nhi(UUID.randomUUID(), new SecureRandom().nextLong());
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    public nhi(final UUID b, final long n) {
        this.b = b;
        this.c = new AtomicLong((n ^ 0x5DEECE66DL) & 0xFFFFFFFFFFFFL);
    }
    
    final long a() {
        long value;
        long n;
        long n3;
        long n4;
        do {
            value = this.c.get();
            final long n2 = value * 25214903917L + 11L & 0xFFFFFFFFFFFFL;
            n = (25214903917L * n2 + 11L & 0xFFFFFFFFFFFFL);
            n3 = (int)(n2 >>> 16);
            n4 = (int)(n >>> 16);
        } while (!this.c.compareAndSet(value, n));
        return (n3 << 32) + n4;
    }
    
    public final UUID b() {
        return new UUID((this.a() & 0xFFFFFFFFFFFF0FFFL) ^ this.b.getMostSignificantBits(), this.a() >>> 2 ^ this.b.getLeastSignificantBits());
    }
}
