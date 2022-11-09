import android.content.Context;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgk extends ImageView
{
    public final int a;
    public final int b;
    public float c;
    public float d;
    public float e;
    
    public dgk(final Context context) {
        super(context);
        this.a = this.getResources().getDimensionPixelSize(2131165445);
        this.b = this.getResources().getDimensionPixelSize(2131165447);
    }
    
    public final void a(final float c) {
        if (c <= 1.0f && c >= 0.0f) {
            this.c = c;
            return;
        }
        final StringBuilder sb = new StringBuilder(33);
        sb.append("Illegal fraction: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
}
