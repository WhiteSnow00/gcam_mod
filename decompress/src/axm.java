import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class axm implements ThreadFactory
{
    public axm() {
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new Thread(new axl(runnable), "glide-active-resources");
    }
}
