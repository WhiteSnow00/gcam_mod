import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class div implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public div(final pii a) {
        this.a = a;
    }
    
    public div(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static div a(final pii pii) {
        return new div(pii, 10);
    }
}
