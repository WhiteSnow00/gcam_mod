import android.text.Layout$Alignment;
import android.graphics.Rect;
import android.support.wearable.complications.ComplicationData;

// 
// Decompiled by Procyon v0.6.0
// 

public class uy
{
    public ComplicationData a;
    private final Rect b;
    
    public uy() {
        this.b = new Rect();
    }
    
    public void a(final Rect rect) {
        rect.setEmpty();
    }
    
    public void b(final Rect rect) {
        rect.setEmpty();
    }
    
    public int c() {
        return 17;
    }
    
    public int d() {
        return 17;
    }
    
    public int e() {
        return 17;
    }
    
    public int f() {
        return 17;
    }
    
    public Layout$Alignment g() {
        return Layout$Alignment.ALIGN_CENTER;
    }
    
    public Layout$Alignment h() {
        return Layout$Alignment.ALIGN_CENTER;
    }
    
    public Layout$Alignment i() {
        return Layout$Alignment.ALIGN_CENTER;
    }
    
    public Layout$Alignment j() {
        return Layout$Alignment.ALIGN_CENTER;
    }
    
    public final void k(final Rect rect) {
        rect.set(this.b);
    }
    
    public void l(final Rect rect) {
        rect.setEmpty();
    }
    
    public void m(final Rect rect) {
        rect.setEmpty();
    }
    
    public void n(final Rect rect) {
        rect.setEmpty();
    }
    
    public void o(final Rect rect) {
        rect.setEmpty();
    }
    
    public void p(final Rect rect) {
        rect.setEmpty();
    }
    
    public void q(final Rect rect) {
        rect.setEmpty();
    }
    
    public void r(final ComplicationData a) {
        this.a = a;
    }
    
    public void s(final int bottom) {
        this.b.bottom = bottom;
    }
    
    public void t(final int right) {
        this.b.right = right;
    }
    
    public final void u(final int n, final int n2, final ComplicationData complicationData) {
        this.t(n);
        this.s(n2);
        this.r(complicationData);
    }
}
