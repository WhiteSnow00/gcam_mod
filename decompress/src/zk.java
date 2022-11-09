// 
// Decompiled by Procyon v0.6.0
// 

final class zk extends zd
{
    public zk() {
    }
    
    @Override
    public final void a(final zl zl, final zl next) {
        zl.next = next;
    }
    
    @Override
    public final void b(final zl zl, final Thread thread) {
        zl.thread = thread;
    }
    
    @Override
    public final boolean c(final zm zm, final zh zh, final zh listeners) {
        synchronized (zm) {
            if (zm.listeners == zh) {
                zm.listeners = listeners;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean d(final zm zm, final Object o, final Object value) {
        synchronized (zm) {
            if (zm.value == o) {
                zm.value = value;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean e(final zm zm, final zl zl, final zl waiters) {
        synchronized (zm) {
            if (zm.waiters == zl) {
                zm.waiters = waiters;
                return true;
            }
            return false;
        }
    }
}
