import java.nio.BufferUnderflowException;
import java.util.Collection;
import java.util.ArrayList;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqv
{
    public static long a(final Uri uri) {
        return Long.parseLong(Uri.decode(uri.getLastPathSegment()));
    }
    
    public static nns b(final byte[] array) {
        try {
            final nnn e = nns.e();
            final ByteBuffer wrap = ByteBuffer.wrap(array);
            wrap.order(ByteOrder.nativeOrder());
            for (int int1 = wrap.getInt(), i = 0; i < int1; ++i) {
                final dqs dqs = new dqs();
                dqs.a = wrap.getInt();
                final int int2 = wrap.getInt();
                final ArrayList list = new ArrayList();
                for (int j = 0; j < int2; ++j) {
                    list.add(wrap.getFloat());
                }
                dqs.b = nns.j(nns.j(list));
                for (int k = 0; k < 6 - int2; ++k) {
                    wrap.getFloat();
                }
                dqs.c = wrap.getFloat();
                final Integer a = dqs.a;
                if (a == null || dqs.b == null || dqs.c == null) {
                    final StringBuilder sb = new StringBuilder();
                    if (dqs.a == null) {
                        sb.append(" id");
                    }
                    if (dqs.b == null) {
                        sb.append(" toneProbabilities");
                    }
                    if (dqs.c == null) {
                        sb.append(" toneConfidence");
                    }
                    final String value = String.valueOf(sb);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(value);
                    throw new IllegalStateException(sb2.toString());
                }
                final dqt dqt = new dqt(a, dqs.b, dqs.c);
                njo.d(dqt.b.size() == 4);
                e.g(dqt);
            }
            return e.f();
        }
        catch (final BufferUnderflowException ex) {
            return nns.l();
        }
    }
    
    public static void c(final klv klv, final cxl cxl) {
        if (!(boolean)klv.aQ()) {
            final cxm a = cxj.a;
            cxl.b();
            return;
        }
        final cxm a2 = cxj.a;
        cxl.c();
    }
}
