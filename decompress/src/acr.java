import java.io.InputStream;
import java.io.IOException;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acr
{
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;
    
    public acr(final int a, final int b, final long c, final byte[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public acr(final int n, final int n2, final byte[] array) {
        this(n, n2, -1L, array);
    }
    
    public static acr b(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append('\0');
        final byte[] bytes = sb.toString().getBytes(acu.h);
        return new acr(2, bytes.length, bytes);
    }
    
    public static acr c(final long n, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[acu.e[4]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            wrap.putInt((int)(new long[] { n })[i]);
            ++i;
        }
        return new acr(4, 1, wrap.array());
    }
    
    public static acr d(final act act, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[acu.e[5]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            final act act2 = (new act[] { act })[i];
            wrap.putInt((int)act2.a);
            wrap.putInt((int)act2.b);
            ++i;
        }
        return new acr(5, 1, wrap.array());
    }
    
    public static acr e(final int n, final ByteOrder byteOrder) {
        int i = 0;
        final ByteBuffer wrap = ByteBuffer.wrap(new byte[acu.e[3]]);
        wrap.order(byteOrder);
        while (i <= 0) {
            wrap.putShort((short)(new int[] { n })[i]);
            ++i;
        }
        return new acr(3, 1, wrap.array());
    }
    
    public final int a(final ByteOrder byteOrder) {
        final Object f = this.f(byteOrder);
        if (f == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (f instanceof String) {
            return Integer.parseInt((String)f);
        }
        if (f instanceof long[]) {
            final long[] array = (long[])f;
            if (array.length == 1) {
                return (int)array[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        else {
            if (!(f instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            final int[] array2 = (int[])f;
            if (array2.length == 1) {
                return array2[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
    }
    
    final Object f(ByteOrder string) {
        final IOException ex = null;
        IOException ex3 = null;
        Label_0909: {
            try {
                final acq acq = new acq(this.d);
                try {
                    acq.b = (ByteOrder)string;
                    final int a = this.a;
                    final int n = 0;
                    final int n2 = 0;
                    final int n3 = 0;
                    final int n4 = 0;
                    final int n5 = 0;
                    final int n6 = 0;
                    final int n7 = 0;
                    final int n8 = 0;
                    int n9 = 0;
                    Label_0570: {
                        switch (a) {
                            default: {
                                break Label_0570;
                            }
                            case 12: {
                                break Label_0570;
                            }
                            case 11: {
                                break Label_0570;
                            }
                            case 10: {
                                break Label_0570;
                            }
                            case 9: {
                                break Label_0570;
                            }
                            case 8: {
                                break Label_0570;
                            }
                            case 5: {
                                break Label_0570;
                            }
                            case 4: {
                                break Label_0570;
                            }
                            case 3: {
                                break Label_0570;
                            }
                            case 2:
                            case 7: {
                                break Label_0570;
                            }
                            case 1:
                            case 6: {
                                Label_0740: {
                                    break Label_0740;
                                    try {
                                        acq.close();
                                        return null;
                                        Label_0634: {
                                            final int length = acu.f.length;
                                        }
                                        int n10 = 8;
                                        int n11;
                                        int n12;
                                        byte[] d;
                                        int n13 = 0;
                                        int n14;
                                        int length2;
                                        int n15;
                                        byte b;
                                        StringBuilder sb;
                                        int n16;
                                        int n17;
                                        byte b2;
                                        int n18;
                                        int b3;
                                        int length3;
                                        Label_0592_Outer:Block_28_Outer:
                                        while (true) {
                                            Label_0357: {
                                                while (true) {
                                                Block_27:
                                                    while (true) {
                                                        Block_24: {
                                                            Block_10_Outer:Block_22_Outer:Block_20_Outer:
                                                            while (true) {
                                                                break Label_0651;
                                                                string = (IOException)(Object)new double[this.b];
                                                                n11 = n;
                                                                Block_26: {
                                                                Label_0716:
                                                                    while (true) {
                                                                        Label_0475: {
                                                                            while (true) {
                                                                                Label_0528: {
                                                                                    while (true) {
                                                                                        Label_0130: {
                                                                                        Label_0710:
                                                                                            while (true) {
                                                                                            Block_29:
                                                                                                while (true) {
                                                                                                    Label_0183: {
                                                                                                        break Label_0183;
                                                                                                        string[n11] = (double)acq.readFloat();
                                                                                                        ++n11;
                                                                                                        break Label_0183;
                                                                                                        string = (IOException)(Object)new int[this.b];
                                                                                                        n12 = n3;
                                                                                                        while (true) {
                                                                                                            Block_12: {
                                                                                                                Label_0659: {
                                                                                                                    Block_33: {
                                                                                                                        Block_25: {
                                                                                                                            while (true) {
                                                                                                                                Label_0304: {
                                                                                                                                    break Label_0304;
                                                                                                                                    d = this.d;
                                                                                                                                    iftrue(Label_0806:)(d.length != 1);
                                                                                                                                    Block_31: {
                                                                                                                                        break Block_31;
                                                                                                                                        string[n13] = acq.readShort();
                                                                                                                                        ++n13;
                                                                                                                                        break Label_0357;
                                                                                                                                        Label_0806:
                                                                                                                                        string = (IOException)new String(d, acu.h);
                                                                                                                                        try {
                                                                                                                                            acq.close();
                                                                                                                                        }
                                                                                                                                        catch (final IOException acq) {
                                                                                                                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                                        }
                                                                                                                                        return string;
                                                                                                                                        string[n12] = acq.readInt();
                                                                                                                                        ++n12;
                                                                                                                                        break Label_0304;
                                                                                                                                        try {
                                                                                                                                            Label_0274:
                                                                                                                                            acq.close();
                                                                                                                                        }
                                                                                                                                        catch (final IOException acq) {
                                                                                                                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                                        }
                                                                                                                                        return string;
                                                                                                                                        while (true) {
                                                                                                                                            string[n14] = new act(acq.a(), acq.a());
                                                                                                                                            ++n14;
                                                                                                                                            Label_0411: {
                                                                                                                                                break Label_0411;
                                                                                                                                                try {
                                                                                                                                                    Label_0327:
                                                                                                                                                    acq.close();
                                                                                                                                                }
                                                                                                                                                catch (final IOException acq) {
                                                                                                                                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                                                }
                                                                                                                                                return string;
                                                                                                                                                string = (IOException)(Object)new act[this.b];
                                                                                                                                                n14 = n5;
                                                                                                                                                break Label_0411;
                                                                                                                                                length2 = acu.f.length;
                                                                                                                                                iftrue(Label_0634:)(n15 >= 8);
                                                                                                                                                break Block_25;
                                                                                                                                                Label_0685:
                                                                                                                                                iftrue(Label_0703:)(b < 32);
                                                                                                                                                break Block_29;
                                                                                                                                            }
                                                                                                                                            iftrue(Label_0445:)(n14 >= this.b);
                                                                                                                                            continue Label_0592_Outer;
                                                                                                                                        }
                                                                                                                                        Label_0703:
                                                                                                                                        sb.append('?');
                                                                                                                                        break Label_0710;
                                                                                                                                        iftrue(Label_0274:)(n16 >= this.b);
                                                                                                                                        break Block_12;
                                                                                                                                        string = (IOException)(Object)new int[this.b];
                                                                                                                                        n17 = n7;
                                                                                                                                        break Label_0528;
                                                                                                                                    }
                                                                                                                                    b2 = d[0];
                                                                                                                                    iftrue(Label_0806:)(b2 < 0 || b2 > 1);
                                                                                                                                    break Block_33;
                                                                                                                                    try {
                                                                                                                                        Label_0380:
                                                                                                                                        acq.close();
                                                                                                                                    }
                                                                                                                                    catch (final IOException acq) {
                                                                                                                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                                    }
                                                                                                                                    return string;
                                                                                                                                    string = (IOException)(Object)new long[this.b];
                                                                                                                                    n18 = n6;
                                                                                                                                    break Label_0475;
                                                                                                                                }
                                                                                                                                iftrue(Label_0327:)(n12 >= this.b);
                                                                                                                                continue Label_0592_Outer;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                Label_0498:
                                                                                                                                acq.close();
                                                                                                                            }
                                                                                                                            catch (final IOException acq) {
                                                                                                                                Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                            }
                                                                                                                            return string;
                                                                                                                        }
                                                                                                                        iftrue(Label_0628:)(this.d[n15] == acu.f[n15]);
                                                                                                                        break Block_26;
                                                                                                                        string[n17] = acq.readUnsignedShort();
                                                                                                                        ++n17;
                                                                                                                        break Label_0528;
                                                                                                                        ++n10;
                                                                                                                        break Label_0659;
                                                                                                                        string = (IOException)(Object)new act[this.b];
                                                                                                                        n16 = n2;
                                                                                                                        continue Block_22_Outer;
                                                                                                                        try {
                                                                                                                            Label_0445:
                                                                                                                            acq.close();
                                                                                                                        }
                                                                                                                        catch (final IOException acq) {
                                                                                                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                        }
                                                                                                                        return string;
                                                                                                                        sb = new StringBuilder();
                                                                                                                        break Label_0659;
                                                                                                                    }
                                                                                                                    string = (IOException)new String(new char[] { (char)(b2 + 48) });
                                                                                                                    try {
                                                                                                                        acq.close();
                                                                                                                    }
                                                                                                                    catch (final IOException acq) {
                                                                                                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                                                                    }
                                                                                                                    return string;
                                                                                                                    string = (IOException)(Object)new double[this.b];
                                                                                                                    break Label_0130;
                                                                                                                    string[n9] = acq.readDouble();
                                                                                                                    ++n9;
                                                                                                                    break Label_0130;
                                                                                                                }
                                                                                                                iftrue(Label_0716:)(n10 >= this.b);
                                                                                                                break Block_27;
                                                                                                            }
                                                                                                            string[n16] = new act(acq.readInt(), acq.readInt());
                                                                                                            ++n16;
                                                                                                            continue Block_22_Outer;
                                                                                                        }
                                                                                                    }
                                                                                                    iftrue(Label_0207:)(n11 >= this.b);
                                                                                                    continue Label_0592_Outer;
                                                                                                }
                                                                                                sb.append((char)b);
                                                                                                continue Label_0710;
                                                                                            }
                                                                                            string[n18] = acq.a();
                                                                                            ++n18;
                                                                                            break Label_0475;
                                                                                        }
                                                                                        iftrue(Label_0153:)(n9 >= this.b);
                                                                                        continue Block_20_Outer;
                                                                                    }
                                                                                    break Label_0716;
                                                                                }
                                                                                iftrue(Label_0551:)(n17 >= this.b);
                                                                                continue Block_20_Outer;
                                                                            }
                                                                            try {
                                                                                Label_0551:
                                                                                acq.close();
                                                                            }
                                                                            catch (final IOException acq) {
                                                                                Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                            }
                                                                            return string;
                                                                            b3 = this.b;
                                                                            length3 = acu.f.length;
                                                                            iftrue(Label_0647:)(b3 < 8);
                                                                            break Block_24;
                                                                            Label_0647:
                                                                            n10 = n8;
                                                                            continue Block_10_Outer;
                                                                            try {
                                                                                Label_0153:
                                                                                acq.close();
                                                                            }
                                                                            catch (final IOException acq) {
                                                                                Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                            }
                                                                            return string;
                                                                        }
                                                                        iftrue(Label_0498:)(n18 >= this.b);
                                                                        continue Block_28_Outer;
                                                                    }
                                                                    string = (IOException)sb.toString();
                                                                    try {
                                                                        acq.close();
                                                                    }
                                                                    catch (final IOException acq) {
                                                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                                    }
                                                                    return string;
                                                                }
                                                                n10 = n8;
                                                                continue Block_10_Outer;
                                                            }
                                                        }
                                                        n15 = 0;
                                                        continue Block_28_Outer;
                                                        string = (IOException)(Object)new int[this.b];
                                                        n13 = n4;
                                                        break Label_0357;
                                                        Label_0628:
                                                        ++n15;
                                                        continue Block_28_Outer;
                                                    }
                                                    b = this.d[n10];
                                                    iftrue(Label_0685:)(b != 0);
                                                    continue;
                                                }
                                                try {
                                                    Label_0207:
                                                    acq.close();
                                                }
                                                catch (final IOException acq) {
                                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)acq);
                                                }
                                                return string;
                                            }
                                            iftrue(Label_0380:)(n13 >= this.b);
                                            continue;
                                        }
                                    }
                                    catch (final IOException ex2) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)ex2);
                                    }
                                }
                                return null;
                            }
                        }
                    }
                }
                catch (final IOException ex) {}
            }
            catch (final IOException ex3) {
                string = null;
            }
            finally {
                ex3 = ex;
                break Label_0909;
            }
            try {
                Log.w("ExifInterface", "IOException occurred during reading a value", (Throwable)ex3);
                if (string != null) {
                    try {
                        ((InputStream)string).close();
                    }
                    catch (final IOException string) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)string);
                    }
                }
                return null;
            }
            finally {
                final IOException ex4 = string;
                final IOException ex5;
                string = ex5;
                ex3 = ex4;
            }
        }
        if (ex3 != null) {
            try {
                ((InputStream)ex3).close();
            }
            catch (final IOException ex6) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", (Throwable)ex6);
            }
        }
        throw string;
    }
    
    public final String g(final ByteOrder byteOrder) {
        final Object f = this.f(byteOrder);
        if (f == null) {
            return null;
        }
        if (f instanceof String) {
            return (String)f;
        }
        final StringBuilder sb = new StringBuilder();
        final boolean b = f instanceof long[];
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        int n4 = 0;
        if (b) {
            final long[] array = (long[])f;
            while (true) {
                final int length = array.length;
                if (n4 >= length) {
                    break;
                }
                sb.append(array[n4]);
                final int n5 = n4 + 1;
                if ((n4 = n5) == length) {
                    continue;
                }
                sb.append(",");
                n4 = n5;
            }
            return sb.toString();
        }
        if (f instanceof int[]) {
            final int[] array2 = (int[])f;
            int n6 = n;
            while (true) {
                final int length2 = array2.length;
                if (n6 >= length2) {
                    break;
                }
                sb.append(array2[n6]);
                final int n7 = n6 + 1;
                if ((n6 = n7) == length2) {
                    continue;
                }
                sb.append(",");
                n6 = n7;
            }
            return sb.toString();
        }
        if (f instanceof double[]) {
            final double[] array3 = (double[])f;
            int n8 = n2;
            while (true) {
                final int length3 = array3.length;
                if (n8 >= length3) {
                    break;
                }
                sb.append(array3[n8]);
                final int n9 = n8 + 1;
                if ((n8 = n9) == length3) {
                    continue;
                }
                sb.append(",");
                n8 = n9;
            }
            return sb.toString();
        }
        if (f instanceof act[]) {
            final act[] array4 = (act[])f;
            int n10 = n3;
            while (true) {
                final int length4 = array4.length;
                if (n10 >= length4) {
                    break;
                }
                sb.append(array4[n10].a);
                sb.append('/');
                sb.append(array4[n10].b);
                final int n11 = n10 + 1;
                if ((n10 = n11) == length4) {
                    continue;
                }
                sb.append(",");
                n10 = n11;
            }
            return sb.toString();
        }
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(acu.d[this.a]);
        sb.append(", data length:");
        sb.append(this.d.length);
        sb.append(")");
        return sb.toString();
    }
}
