import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcb
{
    public final kwg a;
    public final ktc b;
    public final lcc c;
    public final ldj d;
    public final kjk e;
    public final kse f;
    public final krr g;
    public final lcq h;
    public final Handler i;
    public lbw j;
    public final lbu k;
    private final lbk l;
    
    public lcb(final kwg a, final ktc b, final lcc c, final ldj d, final Handler i, final lcq h, final kjk e, final kse f, final krr krr, final lbk l, final lbu k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = i;
        this.h = h;
        this.e = e;
        this.f = f;
        this.l = l;
        this.g = krr.a("CameraOpener");
        this.k = k;
    }
    
    public final lcd a(final lcq lcq, final Handler handler) {
        return new lcd(lcq, this.d, handler, this.f, this.g, this.l);
    }
}
