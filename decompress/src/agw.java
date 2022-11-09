import android.graphics.Rect;
import android.view.View;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.support.v7.widget.LinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agw extends LinearLayoutManager
{
    final /* synthetic */ ViewPager2 a;
    
    public agw(final ViewPager2 a) {
        this.a = a;
    }
    
    @Override
    protected final void M(final sq sq, final int[] array) {
        final ViewPager2 a = this.a;
        if (a.j == -1) {
            super.M(sq, array);
            return;
        }
        final RecyclerView e = a.e;
        if (a.a() == 0) {
            e.getWidth();
            e.getPaddingLeft();
            e.getPaddingRight();
        }
        else {
            e.getHeight();
            e.getPaddingTop();
            e.getPaddingBottom();
        }
        array[1] = (array[0] = 0);
    }
    
    @Override
    public final void aE(final sk sk, final sq sq, final jc jc) {
        super.aE(sk, sq, jc);
        this.a.k.g(jc);
    }
    
    @Override
    public final boolean aV(final sk sk, final sq sq, final int n, final Bundle bundle) {
        if (this.a.k.o(n)) {
            this.a.k.s(n);
            return false;
        }
        return super.aV(sk, sq, n, bundle);
    }
    
    @Override
    public final boolean aW(final RecyclerView recyclerView, final View view, final Rect rect, final boolean b, final boolean b2) {
        return false;
    }
    
    @Override
    public final void m(final sk sk, final sq sq, final View view, final jc jc) {
        this.a.k.h(view, jc);
    }
}
