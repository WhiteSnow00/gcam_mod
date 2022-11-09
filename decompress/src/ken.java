import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ken implements kee, keb
{
    public final CountDownLatch a;
    
    public ken() {
        this.a = new CountDownLatch(1);
    }
    
    @Override
    public final void a(final Exception ex) {
        this.a.countDown();
    }
    
    @Override
    public final void b(final Object o) {
        this.a.countDown();
    }
}
