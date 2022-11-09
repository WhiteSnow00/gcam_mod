import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import android.graphics.BitmapFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byb implements bya
{
    private final /* synthetic */ int a;
    
    public byb() {
    }
    
    public byb(final int a) {
        this.a = a;
    }
    
    @Override
    public final niz a(final byte[] array) {
        Label_0024: {
            switch (this.a) {
                default: {
                    break Label_0024;
                }
                case 0: {
                    niz niz = null;
                    Label_0030: {
                        break Label_0030;
                        try {
                            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length);
                            final int width = decodeByteArray.getWidth();
                            final int height = decodeByteArray.getHeight();
                            final okt m = psx.b.m();
                            final okt i = psv.c.m();
                            final okt j = psz.b.m();
                            j.ak(width);
                            final psz b = (psz)j.h();
                            if (i.c) {
                                i.m();
                                i.c = false;
                            }
                            final psv psv = (psv)i.b;
                            b.getClass();
                            psv.b = b;
                            psv.a = 3;
                            m.aj("image/width", (psv)i.h());
                            final okt k = psv.c.m();
                            final okt l = psz.b.m();
                            l.ak(height);
                            final psz b2 = (psz)l.h();
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final psv psv2 = (psv)k.b;
                            b2.getClass();
                            psv2.b = b2;
                            psv2.a = 3;
                            m.aj("image/height", (psv)k.h());
                            final okt m2 = psv.c.m();
                            final okt m3 = pst.b.m();
                            m3.ai(ojw.s((ByteBuffer)mdb.a(decodeByteArray).c().c()));
                            final pst b3 = (pst)m3.h();
                            if (m2.c) {
                                m2.m();
                                m2.c = false;
                            }
                            final psv psv3 = (psv)m2.b;
                            b3.getClass();
                            psv3.b = b3;
                            psv3.a = 1;
                            m.aj("image/pixel_data", (psv)m2.h());
                            niz = niz.i(m.h());
                            return niz;
                            niz niz2;
                            try {
                                psx psx;
                                if ((psx = ((psu)oky.t(psu.b, array, okm.b())).a) == null) {
                                    psx = psx.b;
                                }
                                niz2 = niz.i(psx);
                            }
                            catch (final olm olm) {
                                niz2 = nii.a;
                            }
                            return niz2;
                        }
                        catch (final RuntimeException ex) {
                            niz = nii.a;
                        }
                    }
                    return niz;
                }
            }
        }
    }
}
