import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtn implements dvw
{
    final /* synthetic */ gen a;
    final /* synthetic */ dtv b;
    
    public dtn(final dtv b, final gen a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final dwi dwi) {
        this.b.k.f("JpegCallback");
        final dwk a = this.b.a;
        final gen a2 = this.a;
        final kjk f = a2.a.f;
        final int b = dwi.b;
        final int c = dwi.c;
        final ByteBuffer duplicate = dwi.a.duplicate();
        byte[] array = null;
        Label_0120: {
            if (duplicate.hasArray() && duplicate.arrayOffset() == 0) {
                array = duplicate.array();
                if (array.length == duplicate.limit()) {
                    break Label_0120;
                }
            }
            final ByteBuffer duplicate2 = duplicate.duplicate();
            duplicate2.rewind();
            array = new byte[duplicate.limit()];
            duplicate2.get(array);
        }
        a.a(a2, f, b, c, array, nii.a);
        this.b.k.g();
    }
}
