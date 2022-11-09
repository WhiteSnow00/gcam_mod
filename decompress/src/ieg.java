import android.graphics.Canvas;
import android.view.View;
import android.graphics.Paint$Align;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.graphics.Paint;
import android.content.Context;
import android.widget.SeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ieg extends SeekBar
{
    private static final nsd f;
    public final Context a;
    public final Paint b;
    public final int c;
    public float d;
    public int e;
    private final nnx g;
    private final ieh h;
    private final WindowManager i;
    private final int j;
    
    static {
        f = nsd.g("com/google/android/apps/camera/timelapse/ui/SpeedUpSeekBar");
    }
    
    public ieg(final Context a, final ieh h, final WindowManager i) {
        super(a, (AttributeSet)null, 0, 2132018651);
        this.a = a;
        final nnh c = h.a.c;
        this.g = c;
        this.c = ((nqk)c).c - 1;
        this.h = h;
        this.j = a.getResources().getDimensionPixelSize(2131166316);
        this.i = i;
        final Paint b = new Paint();
        (this.b = b).setAntiAlias(true);
        gu.c(this.getContext(), 2131296290, new iee(this));
        b.setTextSize((float)this.getResources().getDimensionPixelSize(2131166317));
        b.setColor(this.getResources().getColor(2131101458, (Resources$Theme)null));
        b.setLetterSpacing(igu.a(this.getResources().getDimension(2131166314)));
        b.setTextAlign(Paint$Align.CENTER);
    }
    
    final int a() {
        final int width = this.getWidth();
        final int progress = this.getProgress();
        ik.f((View)this);
        return (int)(this.j / 2 + this.d * progress - width / 2);
    }
    
    public final int b(final idb idb) {
        if (this.g.containsKey(idb)) {
            return idb.ordinal();
        }
        throw new IndexOutOfBoundsException("Unsupported speed up ratio");
    }
    
    public final idb c(final int n) {
        if (n <= this.c) {
            return idb.values()[n];
        }
        throw new IndexOutOfBoundsException("No speed up ratio found");
    }
    
    final String d(final int n) {
        if (n <= this.c) {
            final Double n2 = (Double)this.g.get(this.c(n));
            n2.getClass();
            return ieh.a(this.a, this.h.a, n2);
        }
        throw new IndexOutOfBoundsException("No speed up ratio found");
    }
    
    public final void e(final idb idb) {
        int progress;
        if (!this.g.containsKey(idb)) {
            progress = this.h.a.d.ordinal();
            a.k(ieg.f.c(), "Unsupported speed up ratio: %s", idb, '\u0a92');
        }
        else {
            progress = this.b(idb);
        }
        this.setProgress(progress);
    }
    
    protected final void onDraw(final Canvas canvas) {
        monitorenter(this);
        try {
            final float n = this.b.measureText("X") / 2.0f;
            final idb c = this.c(this.getProgress());
            final int f = ik.f((View)this);
            final idb[] values = idb.values();
            final int length = values.length;
            int i = 0;
            int n2 = 0;
            while (i < length) {
                final idb idb = values[i];
                int n3 = n2;
                if (this.g.containsKey(idb)) {
                    final Double n4 = (Double)this.g.get(idb);
                    n4.getClass();
                    final String a = ieh.a(this.a, this.h.a, n4);
                    a.getClass();
                    float n6;
                    final float n5 = n6 = this.e + n2 * this.d;
                    if (f == 1) {
                        n6 = this.getWidth() - n5;
                    }
                    n3 = n2 + 1;
                    canvas.save();
                    canvas.rotate((float)(360 - jcb.a(this.i.getDefaultDisplay(), this.a).e), n6, (float)(this.getHeight() / 2));
                    if (idb.equals(c)) {
                        this.b.setColor(0);
                    }
                    else {
                        this.b.setColor(this.getResources().getColor(2131101458, (Resources$Theme)null));
                    }
                    canvas.drawText(a, n6, this.getHeight() / 2 + n, this.b);
                    canvas.restore();
                }
                ++i;
                n2 = n3;
            }
            super.onDraw(canvas);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
