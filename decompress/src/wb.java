// 
// Decompiled by Procyon v0.6.0
// 

public final class wb implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ ws b;
    final /* synthetic */ wp c;
    
    public wb(final wp c, final int a, final ws b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final wp c = this.c;
        final int a = this.a;
        final Object a2 = this.b.a;
        final String s = c.b.get(a);
        if (s == null) {
            return;
        }
        c.e.remove(s);
        final wo wo = c.f.get(s);
        if (wo != null) {
            final wm a3 = wo.a;
            if (a3 != null) {
                a3.a(a2);
                return;
            }
        }
        c.h.remove(s);
        c.g.put(s, a2);
    }
}
