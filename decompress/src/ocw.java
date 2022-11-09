// 
// Decompiled by Procyon v0.6.0
// 

final class ocw extends ocp
{
    public ocw() {
    }
    
    @Override
    public final void a(final odb odb, final odb next) {
        odb.next = next;
    }
    
    @Override
    public final void b(final odb odb, final Thread thread) {
        odb.thread = thread;
    }
    
    @Override
    public final boolean c(final odc odc, final oct oct, final oct listeners) {
        synchronized (odc) {
            if (odc.listeners == oct) {
                odc.listeners = listeners;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean d(final odc odc, final Object o, final Object value) {
        synchronized (odc) {
            if (odc.value == o) {
                odc.value = value;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean e(final odc odc, final odb odb, final odb waiters) {
        synchronized (odc) {
            if (odc.waiters == odb) {
                odc.waiters = waiters;
                return true;
            }
            return false;
        }
    }
}
