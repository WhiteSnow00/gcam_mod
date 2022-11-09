import android.view.MotionEvent;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.PointF;
import java.util.Collection;
import android.view.ViewGroup;
import android.graphics.Point;
import android.view.View;
import android.animation.Animator;
import java.util.ArrayList;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.IBinder;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public class jwn
{
    private static Boolean a;
    private static Boolean b;
    public static Boolean c;
    public static Boolean d;
    
    public static byte A(final Parcel parcel, final int n) {
        P(parcel, n, 4);
        return (byte)parcel.readInt();
    }
    
    public static float B(final Parcel parcel, final int n) {
        P(parcel, n, 4);
        return parcel.readFloat();
    }
    
    public static int C(final int n) {
        return (char)n;
    }
    
    public static int D(final Parcel parcel) {
        return parcel.readInt();
    }
    
    public static int E(final Parcel parcel, final int n) {
        P(parcel, n, 4);
        return parcel.readInt();
    }
    
    public static int F(final Parcel parcel, final int n) {
        if ((n & 0xFFFF0000) != 0xFFFF0000) {
            return (char)(n >> 16);
        }
        return parcel.readInt();
    }
    
    public static int G(final Parcel parcel) {
        final int int1 = parcel.readInt();
        final int f = F(parcel, int1);
        final int dataPosition = parcel.dataPosition();
        if (C(int1) != 20293) {
            final String value = String.valueOf(Integer.toHexString(int1));
            String concat;
            if (value.length() != 0) {
                concat = "Expected object header. Got 0x".concat(value);
            }
            else {
                concat = new String("Expected object header. Got 0x");
            }
            throw new jwd(concat, parcel);
        }
        final int n = f + dataPosition;
        if (n >= dataPosition && n <= parcel.dataSize()) {
            return n;
        }
        final StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(n);
        throw new jwd(sb.toString(), parcel);
    }
    
    public static long H(final Parcel parcel, final int n) {
        P(parcel, n, 8);
        return parcel.readLong();
    }
    
    public static Bundle I(final Parcel parcel, int f) {
        f = F(parcel, f);
        final int dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + f);
        return bundle;
    }
    
    public static IBinder J(final Parcel parcel, int f) {
        f = F(parcel, f);
        final int dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + f);
        return strongBinder;
    }
    
    public static Parcelable K(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int f = F(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + f);
        return parcelable;
    }
    
    public static String L(final Parcel parcel, int f) {
        f = F(parcel, f);
        final int dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final String string = parcel.readString();
        parcel.setDataPosition(dataPosition + f);
        return string;
    }
    
    public static ArrayList M(final Parcel parcel, int dataPosition) {
        final int f = F(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final ArrayList stringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + f);
        return stringArrayList;
    }
    
    public static ArrayList N(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int f = F(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final ArrayList typedArrayList = parcel.createTypedArrayList(parcelable$Creator);
        parcel.setDataPosition(dataPosition + f);
        return typedArrayList;
    }
    
    public static void O(final Parcel parcel, final int n) {
        if (parcel.dataPosition() == n) {
            return;
        }
        final StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(n);
        throw new jwd(sb.toString(), parcel);
    }
    
    public static void P(final Parcel parcel, int f, final int n) {
        f = F(parcel, f);
        if (f == n) {
            return;
        }
        final String hexString = Integer.toHexString(f);
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(n);
        sb.append(" got ");
        sb.append(f);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new jwd(sb.toString(), parcel);
    }
    
    public static void Q(final Parcel parcel, int f) {
        f = F(parcel, f);
        parcel.setDataPosition(parcel.dataPosition() + f);
    }
    
    public static boolean R(final Parcel parcel, final int n) {
        P(parcel, n, 4);
        return parcel.readInt() != 0;
    }
    
    public static byte[] S(final Parcel parcel, int f) {
        f = F(parcel, f);
        final int dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final byte[] byteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + f);
        return byteArray;
    }
    
    public static int[] T(final Parcel parcel, int f) {
        f = F(parcel, f);
        final int dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final int[] intArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + f);
        return intArray;
    }
    
    public static Object[] U(final Parcel parcel, int dataPosition, final Parcelable$Creator parcelable$Creator) {
        final int f = F(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final Object[] typedArray = parcel.createTypedArray(parcelable$Creator);
        parcel.setDataPosition(dataPosition + f);
        return typedArray;
    }
    
    public static String[] V(final Parcel parcel, int dataPosition) {
        final int f = F(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final String[] stringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + f);
        return stringArray;
    }
    
    public static byte[][] W(final Parcel parcel, int i) {
        final int f = F(parcel, i);
        final int dataPosition = parcel.dataPosition();
        if (f == 0) {
            return null;
        }
        final int int1 = parcel.readInt();
        final byte[][] array = new byte[int1][];
        for (i = 0; i < int1; ++i) {
            array[i] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + f);
        return array;
    }
    
    public static Point Y(final View view) {
        final int[] array = new int[2];
        view.getLocationInWindow(array);
        return new Point(array[0], array[1]);
    }
    
    public static Point Z(final View view) {
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        return new Point(array[0], array[1]);
    }
    
    public static Collection aa(final ViewGroup viewGroup) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); ++i) {
            list.add(viewGroup.getChildAt(i));
        }
        return list;
    }
    
    public static boolean ab(final PointF pointF, final View view) {
        final int[] w = jvu.w(view.getRootView());
        final float n = pointF.x + w[0];
        final float n2 = pointF.y + w[1];
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final float n3 = (float)(array[0] + view.getWidth());
        final float n4 = (float)(array[1] + view.getHeight());
        return n >= array[0] && n <= n3 && n2 >= array[1] && n2 <= n4;
    }
    
    public static void ac(final View view) {
        view.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
    }
    
    public static iwv ad(final int n, final Object... array) {
        return new iwz(n, array);
    }
    
    public static iwv ae(final int n, final int n2, final Object... array) {
        return new iwy(n, n2, array);
    }
    
    public static boolean af(final iwv iwv) {
        return iwv == iwx.a;
    }
    
    private static void ag(final Parcel parcel, final Parcelable parcelable, int dataPosition) {
        final int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(1);
        final int dataPosition3 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, dataPosition);
        dataPosition = parcel.dataPosition();
        parcel.setDataPosition(dataPosition2);
        parcel.writeInt(dataPosition - dataPosition3);
        parcel.setDataPosition(dataPosition);
    }
    
    public static boolean c(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        if (jwn.a == null) {
            jwn.a = packageManager.hasSystemFeature("android.hardware.type.watch");
        }
        return jwn.a;
    }
    
    public static void d(final Context context) {
        if (c(context)) {
            if (jwn.b == null) {
                jwn.b = context.getPackageManager().hasSystemFeature("cn.google");
            }
            jwn.b.booleanValue();
        }
    }
    
    public static boolean e(final int[] array, final int n) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean f(final Object[] array, final Object o) {
        final int length = array.length;
        int i = 0;
        while (i < length) {
            if (jvu.m(array[i], o)) {
                if (i >= 0) {
                    return true;
                }
                break;
            }
            else {
                ++i;
            }
        }
        return false;
    }
    
    public static int g(final Parcel parcel) {
        return h(parcel, 20293);
    }
    
    public static int h(final Parcel parcel, final int n) {
        parcel.writeInt(n | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
    
    public static void i(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(n - 4);
        parcel.writeInt(dataPosition - n);
        parcel.setDataPosition(dataPosition);
    }
    
    public static void j(final Parcel parcel, final int n, final boolean b) {
        m(parcel, n, 4);
        parcel.writeInt((int)(b ? 1 : 0));
    }
    
    public static void k(final Parcel parcel, final int n, final byte b) {
        m(parcel, n, 4);
        parcel.writeInt((int)b);
    }
    
    public static void l(final Parcel parcel, final int n, final float n2) {
        m(parcel, n, 4);
        parcel.writeFloat(n2);
    }
    
    public static void m(final Parcel parcel, final int n, final int n2) {
        parcel.writeInt(n | n2 << 16);
    }
    
    public static void n(final Parcel parcel, final int n, final int n2) {
        m(parcel, n, 4);
        parcel.writeInt(n2);
    }
    
    public static void o(final Parcel parcel, final int n, final long n2) {
        m(parcel, n, 8);
        parcel.writeLong(n2);
    }
    
    public static void p(final Parcel parcel, int h, final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeBundle(bundle);
        i(parcel, h);
    }
    
    public static void q(final Parcel parcel, int h, final byte[] array) {
        if (array == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeByteArray(array);
        i(parcel, h);
    }
    
    public static void r(final Parcel parcel, int i, final byte[][] array) {
        if (array == null) {
            return;
        }
        final int h = h(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        for (i = 0; i < length; ++i) {
            parcel.writeByteArray(array[i]);
        }
        i(parcel, h);
    }
    
    public static void s(final Parcel parcel, int h, final IBinder binder) {
        if (binder == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeStrongBinder(binder);
        i(parcel, h);
    }
    
    public static void t(final Parcel parcel, int h, final int[] array) {
        if (array == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeIntArray(array);
        i(parcel, h);
    }
    
    public static void u(final Parcel parcel, int h, final Parcelable parcelable, final int n) {
        if (parcelable == null) {
            return;
        }
        h = h(parcel, h);
        parcelable.writeToParcel(parcel, n);
        i(parcel, h);
    }
    
    public static void v(final Parcel parcel, int h, final String s) {
        if (s == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeString(s);
        i(parcel, h);
    }
    
    public static void w(final Parcel parcel, int h, final String[] array) {
        if (array == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeStringArray(array);
        i(parcel, h);
    }
    
    public static void x(final Parcel parcel, int h, final List list) {
        if (list == null) {
            return;
        }
        h = h(parcel, h);
        parcel.writeStringList(list);
        i(parcel, h);
    }
    
    public static void y(final Parcel parcel, int i, final Parcelable[] array, final int n) {
        if (array == null) {
            return;
        }
        final int h = h(parcel, i);
        final int length = array.length;
        parcel.writeInt(length);
        Parcelable parcelable;
        for (i = 0; i < length; ++i) {
            parcelable = array[i];
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                ag(parcel, parcelable, n);
            }
        }
        i(parcel, h);
    }
    
    public static void z(final Parcel parcel, int i, final List list) {
        if (list == null) {
            return;
        }
        final int h = h(parcel, i);
        final int size = list.size();
        parcel.writeInt(size);
        Parcelable parcelable;
        for (i = 0; i < size; ++i) {
            parcelable = list.get(i);
            if (parcelable == null) {
                parcel.writeInt(0);
            }
            else {
                ag(parcel, parcelable, 0);
            }
        }
        i(parcel, h);
    }
    
    public boolean a(final MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }
    
    public boolean b(final jdh jdh) {
        throw null;
    }
}
