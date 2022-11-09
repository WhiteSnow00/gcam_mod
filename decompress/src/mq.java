import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mq extends BaseAdapter
{
    final /* synthetic */ mr a;
    private int b;
    
    public mq(final mr a) {
        this.a = a;
        this.b = -1;
        this.b();
    }
    
    public final my a(int n) {
        final ArrayList e = this.a.c.e();
        final int b = this.b;
        if (b >= 0 && n >= b) {
            ++n;
        }
        return (my)e.get(n);
    }
    
    final void b() {
        final mv c = this.a.c;
        final my h = c.h;
        if (h != null) {
            final ArrayList e = c.e();
            for (int size = e.size(), i = 0; i < size; ++i) {
                if (e.get(i) == h) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }
    
    public final int getCount() {
        final int size = this.a.c.e().size();
        if (this.b < 0) {
            return size;
        }
        return size - 1;
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.a.b.inflate(2131623952, viewGroup, false);
        }
        ((nk)inflate).f(this.a(n));
        return inflate;
    }
    
    public final void notifyDataSetChanged() {
        this.b();
        super.notifyDataSetChanged();
    }
}
