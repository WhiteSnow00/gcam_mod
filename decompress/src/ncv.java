import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncv implements jl
{
    final /* synthetic */ SwipeDismissBehavior a;
    
    public ncv(final SwipeDismissBehavior a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final View view) {
        final boolean w = this.a.w(view);
        final int n = 0;
        if (w) {
            int n2;
            if (ik.f(view) == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            final int b = this.a.b;
            int width = 0;
            Label_0084: {
                Label_0068: {
                    if (b == 0) {
                        if (n2 != 0) {
                            break Label_0068;
                        }
                        n2 = n;
                    }
                    if (b != 1 || n2 != 0) {
                        width = view.getWidth();
                        break Label_0084;
                    }
                }
                width = -view.getWidth();
            }
            ik.x(view, width);
            view.setAlpha(0.0f);
            return true;
        }
        return false;
    }
}
