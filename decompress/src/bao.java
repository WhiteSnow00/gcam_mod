import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bao
{
    public String a;
    private final boolean b;
    private int c;
    private int d;
    
    public bao(final boolean b) {
        this.b = b;
    }
    
    public final bar a() {
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "Name must be non-null and non-empty, but given: ".concat(value);
            }
            else {
                concat = new String("Name must be non-null and non-empty, but given: ");
            }
            throw new IllegalArgumentException(concat);
        }
        return new bar(new ThreadPoolExecutor(this.c, this.d, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>(), new baq(this.a, this.b)));
    }
    
    public final void b(final int n) {
        this.c = n;
        this.d = n;
    }
}
