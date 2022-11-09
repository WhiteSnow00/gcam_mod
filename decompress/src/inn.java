import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inn extends inm
{
    private final float[] j;
    
    public inn(final float[] array, final boolean b, final boolean b2) {
        final boolean b3 = false;
        super(false, b, b2);
        this.j = array;
        njo.o((!b && array.length == 2) || array.length == 3 || b3);
    }
    
    @Override
    public final void a(final RectF rectF) {
        if (!this.h) {
            this.a = Math.round(rectF.width() * this.j[0]);
            this.b = Math.round(rectF.width() * this.j[1]);
            this.c = Math.round(rectF.height() * this.j[0]);
            this.d = Math.round(rectF.height() * this.j[1]);
            return;
        }
        this.a = Math.round(rectF.width() * this.j[0]);
        this.e = Math.round(rectF.width() * this.j[1]);
        this.b = Math.round(rectF.width() * this.j[2]);
        this.c = Math.round(rectF.height() * this.j[0]);
        this.f = Math.round(rectF.height() * this.j[1]);
        this.d = Math.round(rectF.height() * this.j[2]);
    }
}
