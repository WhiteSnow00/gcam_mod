import android.content.Context;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrx
{
    public lrx() {
        Executors.newSingleThreadScheduledExecutor();
        new luw((byte[])null);
        new lux((byte[])null);
    }
    
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int b(final int n, final Context context) {
        return new ndx(context).a(neq.c(context, 2130968905, 0), context.getResources().getDimension(n));
    }
}
