import android.support.v7.widget.LinearLayoutManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxs extends RecyclerView
{
    public hxs(final Context context) {
        super(context);
        this.setFocusable(false);
        this.setOverScrollMode(2);
        super.r = true;
        this.setPaddingRelative(this.getResources().getDimensionPixelSize(2131166237), 0, 0, 0);
        this.getContext();
        this.Q(new LinearLayoutManager());
        this.ai(new hxp(this.getResources()));
        this.P(new hxr(this.getResources()));
    }
}
