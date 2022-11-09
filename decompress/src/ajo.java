import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

final class ajo implements Runnable
{
    private final ajm a;
    private final String b;
    private final oey c;
    
    public ajo(final ajm a, final String b, final oey c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        boolean booleanValue = false;
        Label_0026: {
            try {
                booleanValue = this.c.get();
                break Label_0026;
            }
            catch (final ExecutionException ex) {}
            catch (final InterruptedException ex2) {}
            booleanValue = true;
        }
        this.a.a(this.b, booleanValue);
    }
}
