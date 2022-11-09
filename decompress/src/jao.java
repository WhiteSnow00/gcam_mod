import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class jao extends jwn
{
    final /* synthetic */ cqk a;
    
    public jao(final cqk a) {
        this.a = a;
    }
    
    @Override
    public final boolean b(final jdh jdh) {
        if (!this.a.c()) {
            return false;
        }
        if (!jwn.ab(jdh.a(), (View)((cqi)this.a).c.a)) {
            this.a.b();
            return true;
        }
        return false;
    }
}
