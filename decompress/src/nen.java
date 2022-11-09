import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nen implements ie
{
    final /* synthetic */ nep a;
    final /* synthetic */ nda b;
    
    public nen(final nda b, final nep a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ix a(final View view, final ix ix) {
        final nda b = this.b;
        final nep nep = new nep(this.a);
        b.b.i = ix.d();
        final int f = ik.f(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        final BottomSheetBehavior b2 = b.b;
        if (b2.e) {
            b2.h = ix.a();
            paddingBottom = nep.d + b.b.h;
        }
        if (b.b.f) {
            int n;
            if (f == 1) {
                n = nep.c;
            }
            else {
                n = nep.a;
            }
            paddingLeft = n + ix.b();
        }
        if (b.b.g) {
            int n2;
            if (f == 1) {
                n2 = nep.a;
            }
            else {
                n2 = nep.c;
            }
            paddingRight = n2 + ix.c();
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (b.a) {
            b.b.d = ix.e().e;
        }
        final BottomSheetBehavior b3 = b.b;
        if (b3.e || b.a) {
            b3.J();
        }
        return ix;
    }
}
