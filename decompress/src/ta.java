import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class ta extends aak
{
    boolean a;
    final /* synthetic */ sg b;
    
    public ta(final sg b) {
        this.b = b;
        this.a = false;
    }
    
    @Override
    public final void a(final RecyclerView recyclerView, final int n, final int n2) {
        if (n == 0 && n2 == 0) {
            return;
        }
        this.a = true;
    }
    
    @Override
    public final void b(final int n) {
        if (n == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }
}
