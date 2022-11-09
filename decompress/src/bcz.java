import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcz implements awi
{
    final bec a;
    private final azk b;
    
    public bcz() {
        this.a = bec.a();
    }
    
    public bcz(final byte[] array) {
        this.a = bec.a();
        this.b = new azl();
    }
    
    public final aza c(final ImageDecoder$Source imageDecoder$Source, final int n, final int n2, final awg awg) {
        return new bdf(ImageDecoder.decodeBitmap(imageDecoder$Source, (ImageDecoder$OnHeaderDecodedListener)new bcy(this, n, n2, awg.b(bdw.d) != null && (boolean)awg.b(bdw.d), (avq)awg.b(bdw.a), (bdt)awg.b(bdt.f), (awh)awg.b(bdw.b))), this.b);
    }
}
