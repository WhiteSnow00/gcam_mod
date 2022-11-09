import java.util.Collection;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bhz implements ViewTreeObserver$OnPreDrawListener
{
    private final WeakReference a;
    
    public bhz(final bia bia) {
        this.a = new WeakReference((T)bia);
    }
    
    public final boolean onPreDraw() {
        final bia bia = (bia)this.a.get();
        if (bia != null) {
            if (!bia.c.isEmpty()) {
                final int b = bia.b();
                final int a = bia.a();
                if (bia.d(b, a)) {
                    final ArrayList list = new ArrayList(bia.c);
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        ((bhx)list.get(i)).g(b, a);
                    }
                    bia.c();
                }
            }
        }
        return true;
    }
}
