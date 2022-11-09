import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfu
{
    private final Context a;
    private final cxl b;
    private final krr c;
    
    public dfu(final Context a, final cxl b, final krq krq) {
        this.a = a;
        this.b = b;
        this.c = krq.a("ShotFailureHdlr");
    }
    
    public final void a(final dgh dgh) {
        this.c.i("Shot Exception!", dgh);
        brc.a(this.a, dgh);
        final cxl b = this.b;
        final cxo a = cxr.a;
        b.e();
    }
}
