import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;

// 
// Decompiled by Procyon v0.6.0
// 

final class aft extends afv
{
    public int[] a;
    gl b;
    float c;
    gl d;
    float e;
    float f;
    float g;
    float h;
    float i;
    Paint$Cap j;
    Paint$Join k;
    float l;
    
    public aft() {
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint$Cap.BUTT;
        this.k = Paint$Join.MITER;
        this.l = 4.0f;
    }
    
    public aft(final aft aft) {
        super(aft);
        this.c = 0.0f;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint$Cap.BUTT;
        this.k = Paint$Join.MITER;
        this.l = 4.0f;
        final int[] a = aft.a;
        this.a = null;
        this.b = aft.b;
        this.c = aft.c;
        this.e = aft.e;
        this.d = aft.d;
        this.o = aft.o;
        this.f = aft.f;
        this.g = aft.g;
        this.h = aft.h;
        this.i = aft.i;
        this.j = aft.j;
        this.k = aft.k;
        this.l = aft.l;
    }
    
    @Override
    public final boolean b() {
        return this.d.c() || this.b.c();
    }
    
    @Override
    public final boolean c(final int[] array) {
        return this.b.d(array) | this.d.d(array);
    }
    
    float getFillAlpha() {
        return this.f;
    }
    
    int getFillColor() {
        return this.d.b;
    }
    
    float getStrokeAlpha() {
        return this.e;
    }
    
    int getStrokeColor() {
        return this.b.b;
    }
    
    float getStrokeWidth() {
        return this.c;
    }
    
    float getTrimPathEnd() {
        return this.h;
    }
    
    float getTrimPathOffset() {
        return this.i;
    }
    
    float getTrimPathStart() {
        return this.g;
    }
    
    void setFillAlpha(final float f) {
        this.f = f;
    }
    
    void setFillColor(final int b) {
        this.d.b = b;
    }
    
    void setStrokeAlpha(final float e) {
        this.e = e;
    }
    
    void setStrokeColor(final int b) {
        this.b.b = b;
    }
    
    void setStrokeWidth(final float c) {
        this.c = c;
    }
    
    void setTrimPathEnd(final float h) {
        this.h = h;
    }
    
    void setTrimPathOffset(final float i) {
        this.i = i;
    }
    
    void setTrimPathStart(final float g) {
        this.g = g;
    }
}
