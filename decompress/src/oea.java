import java.util.logging.Level;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oea
{
    private static final Logger c;
    public odz a;
    public boolean b;
    
    static {
        c = Logger.getLogger(oea.class.getName());
    }
    
    public static void a(final Runnable runnable, final Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger c = oea.c;
            final Level severe = Level.SEVERE;
            final String value = String.valueOf(runnable);
            final String value2 = String.valueOf(executor);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(value2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(value);
            sb.append(" with executor ");
            sb.append(value2);
            c.logp(severe, "com.google.common.util.concurrent.ExecutionList", "executeListener", sb.toString(), ex);
        }
    }
}
