import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class odm extends odk
{
    public odm() {
    }
    
    @Override
    public final int a(final odn odn) {
        synchronized (odn) {
            return --odn.remaining;
        }
    }
    
    @Override
    public final void b(final odn odn, final Set seenExceptions) {
        synchronized (odn) {
            if (odn.seenExceptions == null) {
                odn.seenExceptions = seenExceptions;
            }
        }
    }
}
