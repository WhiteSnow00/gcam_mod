import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public class sf extends ViewGroup$MarginLayoutParams
{
    public st c;
    public final Rect d;
    public boolean e;
    boolean f;
    
    public sf(final int n, final int n2) {
        super(n, n2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
    
    public sf(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
    
    public sf(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super(viewGroup$LayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
    
    public sf(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        super(viewGroup$MarginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
    
    public sf(final sf sf) {
        super((ViewGroup$LayoutParams)sf);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
    
    public final int a() {
        return this.c.b();
    }
    
    public final boolean b() {
        return this.c.w();
    }
    
    public final boolean c() {
        return this.c.t();
    }
}
