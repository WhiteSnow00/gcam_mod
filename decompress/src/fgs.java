// 
// Decompiled by Procyon v0.6.0
// 

public final class fgs
{
    public int a;
    public int b;
    public long c;
    public long d;
    
    public fgs() {
        this.d = 0L;
        this.c = 0L;
        this.b = 0;
        this.a = 0;
    }
    
    public final fgs a() {
        synchronized (this) {
            final fgs fgs = new fgs();
            fgs.a = this.a;
            fgs.b = this.b;
            fgs.c = this.c;
            fgs.d = this.d;
            return fgs;
        }
    }
}
