import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class isf
{
    final ViewGroup a;
    final ViewGroup b;
    final TextView c;
    final TextView d;
    final ImageView e;
    final ImageView f;
    
    public isf(final View view, final boolean b) {
        this.a = (ViewGroup)view.findViewById(2131427672);
        final ViewGroup b2 = (ViewGroup)view.findViewById(2131427673);
        this.b = b2;
        final TextView c = (TextView)view.findViewById(2131427676);
        this.c = c;
        final TextView d = (TextView)view.findViewById(2131427670);
        this.d = d;
        final ImageView e = (ImageView)view.findViewById(2131427668);
        this.e = e;
        final ImageView f = (ImageView)view.findViewById(2131427669);
        this.f = f;
        if (!b) {
            final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)b2.getLayoutParams();
            layoutParams.topMargin = view.getResources().getDimensionPixelSize(2131165823);
            layoutParams.bottomMargin = view.getResources().getDimensionPixelSize(2131165823);
            layoutParams.leftMargin = view.getResources().getDimensionPixelSize(2131165821);
            layoutParams.rightMargin = view.getResources().getDimensionPixelSize(2131165822);
            b2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            e.setColorFilter(-1);
            f.setColorFilter(-1);
            c.setTextAppearance(2132017537);
            c.setPadding(view.getResources().getDimensionPixelSize(2131165825), 0, 0, 0);
            d.setTextAppearance(2132017536);
            d.setPadding(view.getResources().getDimensionPixelSize(2131165824), 0, 0, 0);
        }
    }
}
