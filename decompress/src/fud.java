// 
// Decompiled by Procyon v0.6.0
// 

public final class fud implements ftk
{
    public static final nsd a;
    private final ftk b;
    private int c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/moments/SafeMomentsTrackEncoder");
    }
    
    public fud(final ftk b) {
        this.c = 1;
        this.b = b;
    }
    
    @Override
    public final frl a(final lup lup, final kra kra) {
        synchronized (this) {
            final int c = this.c;
            if (c > 0) {
                this.c = c + 1;
                return new fuc(this, this.b.a(lup, kra));
            }
            return new fub();
        }
    }
    
    @Override
    public final void b() {
        synchronized (this) {
            if (this.c > 0) {
                this.b.b();
            }
        }
    }
    
    public final void c() {
        synchronized (this) {
            final int c = this.c - 1;
            this.c = c;
            if (c == 0) {
                this.b.close();
            }
        }
    }
    
    @Override
    public final void close() {
        this.c();
    }
}
