import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wy extends aaf
{
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;
    
    public wy() {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new wx());
    }
}
