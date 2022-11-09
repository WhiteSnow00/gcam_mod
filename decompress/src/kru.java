import java.util.logging.LogRecord;
import java.util.logging.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kru extends Handler
{
    public static final kru a;
    private final kjm b;
    
    static {
        a = new kru();
    }
    
    private kru() {
        this.b = kjm.b;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final void flush() {
    }
    
    @Override
    public final void publish(final LogRecord logRecord) {
        final Throwable thrown = logRecord.getThrown();
        final String message = logRecord.getMessage();
        if (thrown != null) {
            this.b.execute(new krs(message, thrown));
        }
    }
}
