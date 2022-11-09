import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class sc implements ua
{
    final /* synthetic */ se a;
    private final /* synthetic */ int b;
    
    public sc(final se a) {
        this.a = a;
    }
    
    public sc(final se a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final int a(final View view) {
        switch (this.b) {
            default: {
                return se.bo(view) + ((sf)view.getLayoutParams()).rightMargin;
            }
            case 0: {
                return se.bm(view) + ((sf)view.getLayoutParams()).bottomMargin;
            }
        }
    }
    
    @Override
    public final int b(final View view) {
        switch (this.b) {
            default: {
                return se.bn(view) - ((sf)view.getLayoutParams()).leftMargin;
            }
            case 0: {
                return se.bp(view) - ((sf)view.getLayoutParams()).topMargin;
            }
        }
    }
    
    @Override
    public final int c() {
        switch (this.b) {
            default: {
                final se a = this.a;
                return a.C - a.ap();
            }
            case 0: {
                final se a2 = this.a;
                return a2.D - a2.an();
            }
        }
    }
    
    @Override
    public final int d() {
        switch (this.b) {
            default: {
                return this.a.ao();
            }
            case 0: {
                return this.a.aq();
            }
        }
    }
    
    @Override
    public final View e(final int n) {
        switch (this.b) {
            default: {
                return this.a.at(n);
            }
            case 0: {
                return this.a.at(n);
            }
        }
    }
}
