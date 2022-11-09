import android.util.Size;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.graphics.ImageDecoder$Source;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcy implements ImageDecoder$OnHeaderDecodedListener
{
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ avq d;
    final /* synthetic */ bdt e;
    final /* synthetic */ awh f;
    final /* synthetic */ bcz g;
    
    public bcy(final bcz g, final int a, final int b, final boolean c, final avq d, final bdt e, final awh f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void onHeaderDecoded(final ImageDecoder imageDecoder, final ImageDecoder$ImageInfo imageDecoder$ImageInfo, final ImageDecoder$Source imageDecoder$Source) {
        if (this.g.a.b(this.a, this.b, this.c, false)) {
            imageDecoder.setAllocator(3);
        }
        else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == avq.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener((ImageDecoder$OnPartialImageListener)new bcx());
        final Size size = imageDecoder$ImageInfo.getSize();
        int n;
        if ((n = this.a) == Integer.MIN_VALUE) {
            n = size.getWidth();
        }
        int n2;
        if ((n2 = this.b) == Integer.MIN_VALUE) {
            n2 = size.getHeight();
        }
        final float a = this.e.a(size.getWidth(), size.getHeight(), n, n2);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * a), Math.round(a * size.getHeight()));
        final awh f = this.f;
        if (f != null) {
            ColorSpace$Named colorSpace$Named;
            if (f == awh.b && imageDecoder$ImageInfo.getColorSpace() != null && imageDecoder$ImageInfo.getColorSpace().isWideGamut()) {
                colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
            }
            else {
                colorSpace$Named = ColorSpace$Named.SRGB;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(colorSpace$Named));
        }
    }
}
