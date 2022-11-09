// 
// Decompiled by Procyon v0.6.0
// 

final class jhz
{
    public long a;
    public long b;
    public boolean c;
    public final krr d;
    
    public jhz(final krr d) {
        this.d = d;
    }
    
    public final long a() {
        if (this.c) {
            return this.b + System.currentTimeMillis() - this.a;
        }
        return this.b;
    }
    
    public final void b() {
        if (this.c) {
            this.d.h("onSessionStart failed because session is already started!");
            return;
        }
        this.c = true;
        this.a = System.currentTimeMillis();
    }
}
