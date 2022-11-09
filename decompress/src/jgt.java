import android.graphics.Point;
import android.view.View;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

final class jgt implements eip
{
    final /* synthetic */ jgu a;
    
    public jgt(final jgu a) {
        this.a = a;
    }
    
    @Override
    public final void c() {
        final View viewById = this.a.i.findViewById(2131427861);
        if (viewById != null) {
            final Point z = jwn.Z(viewById);
            this.a.f.e(new PointF((float)(z.x + viewById.getWidth() / 2), (float)(z.y + viewById.getHeight() / 2)));
        }
    }
}
