import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpn implements jds
{
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ long c;
    
    public dpn(final AtomicBoolean a, final AtomicBoolean b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean a(final nra nra) {
        if (!this.a.get()) {
            return true;
        }
        final nps k = nra.k();
        k.getClass();
        final nps j = nra.j();
        j.getClass();
        final long longValue = (long)k.b();
        final long longValue2 = (long)j.b();
        return this.b.get() && longValue - longValue2 > this.c;
    }
}
