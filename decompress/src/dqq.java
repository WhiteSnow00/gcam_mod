import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqq implements dqo
{
    public final dnp a;
    public final dqn[] b;
    public final Object c;
    
    public dqq() {
        final int n = (int)(TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30L);
        this.c = new Object();
        this.a = new dnp(n);
        this.b = new dqn[n];
    }
}
