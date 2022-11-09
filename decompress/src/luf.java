import java.util.Locale;
import java.nio.charset.StandardCharsets;

// 
// Decompiled by Procyon v0.6.0
// 

public final class luf
{
    public final String a;
    public final luj b;
    final int c;
    final /* synthetic */ lul d;
    
    public luf(final lul d, final luj luj) {
        this.d = d;
        final int int1 = d.a.getInt(luj.a);
        njo.o(int1 > 0);
        njo.p(int1 == 1 || int1 >= 8, "Box size too small");
        final byte[] array = new byte[4];
        for (int i = 0; i < 4; ++i) {
            array[i] = d.a.get(luj.a + 4 + i);
        }
        final String a = new String(array, StandardCharsets.US_ASCII);
        this.a = a;
        njo.o(a.length() == 4);
        int n;
        if (int1 == 1) {
            final long long1 = d.a.getLong(luj.a + 8);
            njo.e(long1 < 2147483647L, "We don't support >2GB boxes (since we're using ByteBuffers).");
            n = (int)long1;
            this.c = 16;
        }
        else {
            this.c = 8;
            n = int1;
        }
        njo.p(n <= luj.b, String.format(Locale.US, "Signalled box length %d does not fit length of %d", this.c + n, luj.b));
        final int a2 = luj.a;
        final int c = this.c;
        this.b = new luj(a2 + c, n - c);
    }
}
