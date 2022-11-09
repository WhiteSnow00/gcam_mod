import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfd
{
    public final AtomicReferenceArray a;
    public volatile int b;
    public final int c;
    
    public mfd() {
        this.a = new AtomicReferenceArray(20);
        this.c = 28;
    }
}
