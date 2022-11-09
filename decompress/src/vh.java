import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vh
{
    public final float a;
    public final float b;
    public float c;
    private final int[] d;
    private final float[] e;
    private final RectF f;
    private final Paint g;
    private float h;
    private final float i;
    
    public vh(final float a, final float c, final float i) {
        this.d = new int[] { -16777216, 0 };
        this.e = new float[] { 0.6f, 1.0f };
        this.f = new RectF();
        final Paint g = new Paint();
        this.g = g;
        this.a = a;
        this.b = 0.0f;
        this.c = c;
        this.i = i;
        this.h = c + i + a * 0.0f;
        g.setColor(-16777216);
        g.setStyle(Paint$Style.FILL);
        g.setAntiAlias(true);
        this.b();
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4) {
        this.f.set((float)n, (float)n2, (float)n3, (float)n4);
        this.b();
    }
    
    public final void b() {
        final float h = this.c + this.i + this.a * 0.0f;
        this.h = h;
        if (h > 0.0f) {
            this.g.setShader((Shader)new RadialGradient(this.f.centerX(), this.f.centerY(), this.h, this.d, this.e, Shader$TileMode.MIRROR));
        }
    }
}
