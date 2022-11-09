import android.view.View;
import android.widget.TextView;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pq extends gs
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ ps d;
    
    public pq(final ps d, final int a, final int b, final WeakReference c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Typeface typeface) {
        final int a = this.a;
        Typeface create = typeface;
        if (a != -1) {
            create = Typeface.create(typeface, a, (this.b & 0x2) != 0x0);
        }
        final ps d = this.d;
        final WeakReference c = this.c;
        if (d.c) {
            d.b = create;
            final TextView textView = (TextView)c.get();
            if (textView != null) {
                if (ik.T((View)textView)) {
                    textView.post((Runnable)new pr(textView, create, d.a));
                    return;
                }
                textView.setTypeface(create, d.a);
            }
        }
    }
}
