import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lhe
{
    public final ofn a;
    public final long b;
    final /* synthetic */ lhf c;
    
    public lhe(final lhf c, final long b) {
        this.c = c;
        this.b = b;
        (this.a = ofn.f()).d(new lhd(this), odx.a);
    }
    
    final void a(final lhc lhc) {
        if (lhc == null) {
            this.a.a(new kuw());
            return;
        }
        if (!this.a.o(lhc)) {
            lhc.close();
        }
    }
}
