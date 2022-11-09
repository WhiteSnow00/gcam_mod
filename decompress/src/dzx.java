import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import com.google.googlex.gcam.InterleavedImageU16;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzx implements dwr
{
    public static final nsd b;
    public final fxu c;
    public final dzr d;
    public final AtomicLong e;
    public final cxl f;
    public final boolean g;
    public final Map h;
    public final dxy i;
    private final niz j;
    
    static {
        b = nsd.g("com/google/android/apps/camera/hdrplus/portrait/PostProcessingPortraitImageSaverImpl");
    }
    
    public dzx(final niz j, final fxu c, final dzr d, final cxl f, final boolean g, final dxy i) {
        this.e = new AtomicLong(0L);
        this.j = j;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.i = i;
        this.h = new HashMap();
    }
    
    public static InterleavedImageU16 d(final oey oey) {
        InterleavedImageU16 interleavedImageU16 = null;
        try {
            interleavedImageU16 = oey.get(100L, TimeUnit.MILLISECONDS);
        }
        catch (final CancellationException ex) {
            goto Label_0028;
        }
        catch (final TimeoutException ex2) {
            goto Label_0028;
        }
        catch (final ExecutionException ex3) {}
        catch (final InterruptedException ex4) {
            Thread.currentThread().interrupt();
            interleavedImageU16 = new InterleavedImageU16();
        }
        return interleavedImageU16;
    }
    
    private final dzw e(final gen gen) {
        final String s = gen.b.s();
        dzw dzw;
        if ((dzw = this.h.get(s)) == null) {
            final hhy b = gen.b;
            dzw = new dzw(this, b, gen.d, this.j, UUID.randomUUID(), ((hgm)b).c);
            this.h.put(s, dzw);
        }
        return dzw;
    }
    
    @Override
    public final gdf a(final gen gen) {
        return this.e(gen);
    }
    
    @Override
    public final dws c(final gen gen) {
        return this.e(gen);
    }
}
