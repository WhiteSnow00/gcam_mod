import android.os.Parcel;
import java.util.Arrays;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcl extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public static final byte[][] a;
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;
    
    static {
        final byte[][] array = a = new byte[0][];
        CREATOR = (Parcelable$Creator)new kbr(10);
        new kcl("", null, array, array, array, array, null, null, null);
    }
    
    public kcl(final String b, final byte[] c, final byte[][] d, final byte[][] e, final byte[][] f, final byte[][] g, final int[] h, final byte[][] i, final int[] j) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private static List a(final int[] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final int length = array.length;
        final ArrayList list = new ArrayList(length);
        for (int i = 0; i < length; ++i) {
            list.add((Object)array[i]);
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    private static List b(final byte[][] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final int length = array.length;
        final ArrayList list = new ArrayList(length);
        for (final byte[] array2 : array) {
            jvu.a(array2);
            list.add((Object)Base64.encodeToString(array2, 3));
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    private static List c(final int[] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final ArrayList list = new ArrayList(array.length >> 1);
        for (int i = 0; i < array.length; i += 2) {
            list.add(new kcq(array[i], array[i + 1]));
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    private static void d(final StringBuilder sb, final String s, final byte[][] array) {
        sb.append(s);
        sb.append("=");
        if (array == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        final int length = array.length;
        int n = 1;
        for (int i = 0; i < length; ++i, n = 0) {
            final byte[] array2 = array[i];
            if (n == 0) {
                sb.append(", ");
            }
            sb.append("'");
            jvu.a(array2);
            sb.append(Base64.encodeToString(array2, 3));
            sb.append("'");
        }
        sb.append(")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kcl) {
            final kcl kcl = (kcl)o;
            if (lwt.o(this.b, kcl.b) && Arrays.equals(this.c, kcl.c) && lwt.o(b(this.d), b(kcl.d)) && lwt.o(b(this.e), b(kcl.e)) && lwt.o(b(this.f), b(kcl.f)) && lwt.o(b(this.g), b(kcl.g)) && lwt.o(a(this.h), a(kcl.h)) && lwt.o(b(this.i), b(kcl.i)) && lwt.o(c(this.j), c(kcl.j))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        final String b = this.b;
        String string;
        if (b == null) {
            string = "null";
        }
        else {
            final StringBuilder sb2 = new StringBuilder(b.length() + 2);
            sb2.append("'");
            sb2.append(b);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        final byte[] c = this.c;
        sb.append(", direct==");
        if (c == null) {
            sb.append("null");
        }
        else {
            sb.append("'");
            sb.append(Base64.encodeToString(c, 3));
            sb.append("'");
        }
        sb.append(", ");
        d(sb, "GAIA=", this.d);
        sb.append(", ");
        d(sb, "PSEUDO=", this.e);
        sb.append(", ");
        d(sb, "ALWAYS=", this.f);
        sb.append(", ");
        d(sb, "OTHER=", this.g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.h));
        sb.append(", ");
        d(sb, "directs=", this.i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(c(this.j).toArray()));
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.b);
        jwn.q(parcel, 3, this.c);
        jwn.r(parcel, 4, this.d);
        jwn.r(parcel, 5, this.e);
        jwn.r(parcel, 6, this.f);
        jwn.r(parcel, 7, this.g);
        jwn.t(parcel, 8, this.h);
        jwn.r(parcel, 9, this.i);
        jwn.t(parcel, 10, this.j);
        jwn.i(parcel, g);
    }
}
