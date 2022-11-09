// 
// Decompiled by Procyon v0.6.0
// 

final class aya
{
    private boolean a;
    private boolean b;
    private boolean c;
    
    public aya() {
    }
    
    private final boolean e() {
        return (this.c || this.b) && this.a;
    }
    
    final void a() {
        synchronized (this) {
            this.b = false;
            this.a = false;
            this.c = false;
        }
    }
    
    final boolean b() {
        synchronized (this) {
            this.b = true;
            return this.e();
        }
    }
    
    final boolean c() {
        synchronized (this) {
            this.c = true;
            return this.e();
        }
    }
    
    final boolean d() {
        synchronized (this) {
            this.a = true;
            return this.e();
        }
    }
}
