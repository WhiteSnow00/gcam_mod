import com.google.android.libraries.camera.exif.ExifInterface;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kvc
{
    a("TOP_LEFT", 0, (short)1), 
    b("TOP_RIGHT", 1, (short)2), 
    c("BOTTOM_RIGHT", 2, (short)3), 
    d("BOTTOM_LEFT", 3, (short)4), 
    e("LEFT_TOP", 4, (short)5), 
    f("RIGHT_TOP", 5, (short)6), 
    g("RIGHT_BOTTOM", 6, (short)7), 
    h("LEFT_BOTTOM", 7, (short)8);
    
    private static final nnx j;
    public final short i;
    
    static {
        final List<kvc> list = Arrays.asList(values());
        final bol bol = new bol(7);
        final Iterator<Object> iterator = list.iterator();
        final nnt l = nnx.l();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            l.d(bol.a(next), next);
        }
        try {
            j = l.b();
        }
        catch (final IllegalArgumentException ex) {
            throw new IllegalArgumentException(String.valueOf(ex.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }
    
    private kvc(final String s, final int n, final short n2) {
        this.i = n2;
    }
    
    public static kra a(final kvc kvc) {
        if (kvc == null) {
            Log.w("CAM_ExifOrientation", "Computing rotation for an null exif orientation, returning 0");
            return kra.a;
        }
        final kra a = kra.a;
        switch (kvc.ordinal()) {
            default: {
                final String value = String.valueOf(kvc);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47);
                sb.append("Computing rotation for an invalid orientation: ");
                sb.append(value);
                Log.w("CAM_ExifOrientation", sb.toString());
                return kra.a;
            }
            case 7: {
                return kra.d;
            }
            case 5: {
                return kra.b;
            }
            case 2: {
                return kra.c;
            }
            case 0: {
                return kra.a;
            }
        }
    }
    
    public static kvc b(final kra kra) {
        kra.getClass();
        final kra a = kra.a;
        switch (kra.ordinal()) {
            default: {
                throw new IllegalArgumentException("Orientation must be one of 4 defined values!");
            }
            case 3: {
                return kvc.h;
            }
            case 2: {
                return kvc.c;
            }
            case 1: {
                return kvc.f;
            }
            case 0: {
                return kvc.a;
            }
        }
    }
    
    public static kvc c(final ExifInterface exifInterface) {
        if (exifInterface == null) {
            return null;
        }
        final Integer b = exifInterface.b(ExifInterface.j);
        if (b == null) {
            return null;
        }
        return (kvc)kvc.j.get(b.shortValue());
    }
}
