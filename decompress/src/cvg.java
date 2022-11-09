import j$.util.function.IntFunction;
import j$.util.function.Function;
import j$.util.DesugarArrays;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvg
{
    private final float a;
    
    public cvg(final float a) {
        this.a = a;
    }
    
    final boolean a(final gzm[] array, final Rect rect) {
        if (array != null && rect != null) {
            final Rect[] array2 = (Rect[])DesugarArrays.stream((Object[])array).map((Function)cdd.g).toArray((IntFunction)cvf.a);
            final int length = array2.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                final Rect rect2 = array2[i];
                int n2 = n;
                if (rect2.width() / (float)rect.width() * (rect2.height() / (float)rect.height()) > this.a) {
                    n2 = n + 1;
                }
                ++i;
                n = n2;
            }
            return n > 0;
        }
        return false;
    }
}
