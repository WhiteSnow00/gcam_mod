// 
// Decompiled by Procyon v0.6.0
// 

final class aou implements Runnable
{
    final aox a;
    final oey b;
    
    public aou(final aox a, final oey b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.a.d != this) {
            return;
        }
        if (aox.b.d(this.a, this, aox.a(this.b))) {
            aox.b(this.a);
        }
    }
}
