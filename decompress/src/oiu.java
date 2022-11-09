import android.graphics.PointF;
import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oiu
{
    public Uri a;
    public Bitmap b;
    public Long c;
    public lpw d;
    public Integer e;
    public Integer f;
    public PointF g;
    
    public oiu() {
    }
    
    public oiu(final oiv oiv) {
        this.a = oiv.a;
        this.b = oiv.b;
        this.c = oiv.d;
        this.d = oiv.e;
        this.e = oiv.f;
        this.f = oiv.g;
        this.g = oiv.h;
    }
    
    public final oiv a() {
        return new oiv(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
