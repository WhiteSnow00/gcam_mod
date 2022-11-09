import android.view.View;
import java.util.Arrays;
import android.database.MatrixCursor;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.graphics.Shader$TileMode;
import android.util.Log;
import android.graphics.SweepGradient;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import java.util.List;
import android.graphics.RadialGradient;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.TypedValue;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gz
{
    public gz() {
        new HashMap();
    }
    
    public static gy[] a(final String s) {
        final ArrayList list = new ArrayList();
        int i = 1;
        int n = 0;
        while (i < s.length()) {
            while (i < s.length()) {
                final char char1 = s.charAt(i);
                if (((char1 - 'A') * (char1 - 'Z') <= 0 || (char1 - 'a') * (char1 - 'z') <= 0) && char1 != 'e' && char1 != 'E') {
                    break;
                }
                ++i;
            }
            final String trim = s.substring(n, i).trim();
            if (trim.length() > 0) {
                float[] c = null;
                Label_0484: {
                    if (trim.charAt(0) != 'z') {
                        if (trim.charAt(0) != 'Z') {
                            try {
                                final float[] array = new float[trim.length()];
                                final gx gx = new gx();
                                final int length = trim.length();
                                int j = 1;
                                int n2 = 0;
                                while (j < length) {
                                    gx.a = false;
                                    int k = j;
                                    int n3 = 0;
                                    int n4 = 0;
                                    boolean b = false;
                                    while (k < trim.length()) {
                                        int n5 = 0;
                                        Label_0340: {
                                            int n6 = 0;
                                            Label_0335: {
                                                switch (trim.charAt(k)) {
                                                    default: {
                                                        n5 = 0;
                                                        break Label_0340;
                                                    }
                                                    case 'E':
                                                    case 'e': {
                                                        n5 = 1;
                                                        break Label_0340;
                                                    }
                                                    case '.': {
                                                        if (n3 == 0) {
                                                            n6 = 1;
                                                            break;
                                                        }
                                                        gx.a = true;
                                                        n3 = 1;
                                                        break Label_0335;
                                                    }
                                                    case '-': {
                                                        n6 = n3;
                                                        if (k == j) {
                                                            break;
                                                        }
                                                        n6 = n3;
                                                        if (n4 == 0) {
                                                            gx.a = true;
                                                            break Label_0335;
                                                        }
                                                        break;
                                                    }
                                                    case ' ':
                                                    case ',': {
                                                        n5 = 0;
                                                        b = true;
                                                        break Label_0340;
                                                    }
                                                }
                                            }
                                            final int n7 = 0;
                                            n3 = n6;
                                            n5 = n7;
                                        }
                                        if (b) {
                                            break;
                                        }
                                        ++k;
                                        n4 = n5;
                                    }
                                    int n8 = n2;
                                    if (j < k) {
                                        array[n2] = Float.parseFloat(trim.substring(j, k));
                                        n8 = n2 + 1;
                                    }
                                    if (gx.a) {
                                        j = k;
                                        n2 = n8;
                                    }
                                    else {
                                        j = k + 1;
                                        n2 = n8;
                                    }
                                }
                                c = c(array, n2);
                                break Label_0484;
                            }
                            catch (final NumberFormatException ex) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("error in parsing \"");
                                sb.append(trim);
                                sb.append("\"");
                                throw new RuntimeException(sb.toString(), ex);
                            }
                        }
                    }
                    c = new float[0];
                }
                x(list, trim.charAt(0), c);
            }
            n = i;
            ++i;
        }
        if (i - n == 1 && n < s.length()) {
            x(list, s.charAt(n), new float[0]);
        }
        return list.toArray(new gy[list.size()]);
    }
    
    public static gy[] b(final gy[] array) {
        if (array == null) {
            return null;
        }
        final gy[] array2 = new gy[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new gy(array[i]);
        }
        return array2;
    }
    
    static float[] c(final float[] array, final int n) {
        if (n >= 0) {
            final int min = Math.min(n, array.length);
            final float[] array2 = new float[n];
            System.arraycopy(array, 0, array2, 0, min);
            return array2;
        }
        throw new IllegalArgumentException();
    }
    
    public static float d(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final float n2) {
        if (!k(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int e(final Context context, final int n, final int n2) {
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n;
        }
        return n2;
    }
    
    public static int f(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!k(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    public static TypedArray g(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
    
    public static CharSequence h(final TypedArray typedArray, final int n, final int n2) {
        final CharSequence text = typedArray.getText(n);
        if (text == null) {
            return typedArray.getText(n2);
        }
        return text;
    }
    
    public static String i(final TypedArray typedArray, final int n, final int n2) {
        final String string = typedArray.getString(n);
        if (string == null) {
            return typedArray.getString(n2);
        }
        return string;
    }
    
    public static boolean j(final TypedArray typedArray, final int n, final int n2, final boolean b) {
        return typedArray.getBoolean(n, typedArray.getBoolean(n2, b));
    }
    
    public static boolean k(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static CharSequence[] l(final TypedArray typedArray, final int n, final int n2) {
        final CharSequence[] textArray = typedArray.getTextArray(n);
        if (textArray == null) {
            return typedArray.getTextArray(n2);
        }
        return textArray;
    }
    
    public static int m(final TypedArray typedArray, final int n, final int n2) {
        return typedArray.getInt(n, typedArray.getInt(n2, Integer.MAX_VALUE));
    }
    
    public static int n(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!k(xmlPullParser, s)) {
            return 0;
        }
        return typedArray.getColor(n, 0);
    }
    
    public static gl o(TypedArray xml, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme, final String s, int n) {
        if (k(xmlPullParser, s)) {
            final TypedValue typedValue = new TypedValue();
            ((TypedArray)xml).getValue(n, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return gl.a(typedValue.data);
            }
            final Resources resources = ((TypedArray)xml).getResources();
            n = ((TypedArray)xml).getResourceId(n, 0);
            gl gl = null;
            Label_1024: {
                Label_1011: {
                    try {
                        xml = (Exception)resources.getXml(n);
                        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                        String name;
                        StringBuilder sb;
                        float d;
                        float d2;
                        float d3;
                        gq gq;
                        Object o;
                        StringBuilder sb2;
                        String name2;
                        int next;
                        int depth;
                        int n2;
                        ArrayList list;
                        ArrayList list2;
                        float d4;
                        float d5;
                        float d6;
                        float d7;
                        TypedArray g;
                        boolean hasValue;
                        boolean hasValue2;
                        int color;
                        float float1;
                        StringBuilder sb3;
                        int n3;
                        int n4;
                        int f;
                        TypedArray g2;
                        boolean k;
                        int n5;
                        ColorStateList b;
                        Label_0885_Outer:Block_13_Outer:Label_0734_Outer:
                        while (true) {
                            n = ((XmlPullParser)xml).next();
                            if (n != 2) {
                                if (n != 1) {
                                    continue;
                                }
                                xml = (Exception)new XmlPullParserException("No start tag found");
                                throw xml;
                            }
                            else {
                                name = ((XmlPullParser)xml).getName();
                                n = name.hashCode();
                                Label_0195: {
                                    switch (n) {
                                        case 1191572447: {
                                            if (name.equals("selector")) {
                                                n = 0;
                                                break Label_0195;
                                            }
                                            break;
                                        }
                                        case 89650992: {
                                            if (name.equals("gradient")) {
                                                n = 1;
                                                break Label_0195;
                                            }
                                            break;
                                        }
                                    }
                                    n = -1;
                                }
                                Label_0227: {
                                    switch (n) {
                                        default: {
                                            break Label_0227;
                                        }
                                        case 1: {
                                            break Label_0227;
                                        }
                                        case 0: {
                                            Label_0933: {
                                                break Label_0933;
                                                try {
                                                    sb = new StringBuilder();
                                                    sb.append(((XmlPullParser)xml).getPositionDescription());
                                                    sb.append(": unsupported complex color tag ");
                                                    sb.append(name);
                                                    throw new XmlPullParserException(sb.toString());
                                                    while (true) {
                                                    Label_0734:
                                                        while (true) {
                                                            while (true) {
                                                                Label_0464: {
                                                                    while (true) {
                                                                        Label_0867: {
                                                                            Block_24: {
                                                                                while (true) {
                                                                                    Block_16: {
                                                                                        Block_12:Block_20_Outer:
                                                                                        while (true) {
                                                                                            o = new RadialGradient(d, d2, d3, gq.a, gq.b, r(n));
                                                                                            break Label_0867;
                                                                                            sb2 = new StringBuilder();
                                                                                            sb2.append(((XmlPullParser)xml).getPositionDescription());
                                                                                            sb2.append(": invalid gradient color tag ");
                                                                                            sb2.append(name2);
                                                                                            throw new XmlPullParserException(sb2.toString());
                                                                                            Label_0660: {
                                                                                                break Label_0464;
                                                                                            }
                                                                                            name2 = ((XmlPullParser)xml).getName();
                                                                                            iftrue(Label_0885:)(!name2.equals("gradient"));
                                                                                            break Block_12;
                                                                                            Label_0691:
                                                                                            gq = null;
                                                                                            Label_0693: {
                                                                                                break Label_0693;
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        iftrue(Label_0663:)(next != 2 || depth > n2);
                                                                                                        break Block_16;
                                                                                                        gq = new gq(list, list2);
                                                                                                        break Label_0693;
                                                                                                        Label_0760:
                                                                                                        o = new LinearGradient(d4, d5, d6, d7, gq.a, gq.b, r(n));
                                                                                                        break Block_24;
                                                                                                        depth = ((XmlPullParser)xml).getDepth();
                                                                                                        iftrue(Label_0666:)(depth < n2 && next == 3);
                                                                                                        continue Block_20_Outer;
                                                                                                    }
                                                                                                    Label_0666:
                                                                                                    iftrue(Label_0691:)(list.size() <= 0);
                                                                                                    continue Block_13_Outer;
                                                                                                }
                                                                                                g = g(resources, resources$Theme, attributeSet, cq.e);
                                                                                                hasValue = g.hasValue(0);
                                                                                                hasValue2 = g.hasValue(1);
                                                                                                iftrue(Label_0619:)(!hasValue || !hasValue2);
                                                                                                color = g.getColor(0, 0);
                                                                                                float1 = g.getFloat(1, 0.0f);
                                                                                                g.recycle();
                                                                                                list.add(color);
                                                                                                list2.add(float1);
                                                                                                break Label_0464;
                                                                                                Label_0619:
                                                                                                sb3 = new StringBuilder();
                                                                                                sb3.append(((XmlPullParser)xml).getPositionDescription());
                                                                                                sb3.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                                                                                                throw new XmlPullParserException(sb3.toString());
                                                                                                Label_0722:
                                                                                                gq = new gq(n3, n4);
                                                                                                break Label_0734;
                                                                                            }
                                                                                            iftrue(Label_0700:)(gq == null);
                                                                                            switch([Lcom.strobel.decompiler.ast.Label;@c3a7fe)(f);
                                                                                            Label_0663:
                                                                                            break Label_0464;
                                                                                            Label_0790:
                                                                                            iftrue(Label_0827:)(d3 <= 0.0f);
                                                                                            continue Label_0885_Outer;
                                                                                        }
                                                                                        g2 = g(resources, resources$Theme, attributeSet, cq.d);
                                                                                        d4 = d(g2, (XmlPullParser)xml, "startX", 8, 0.0f);
                                                                                        d5 = d(g2, (XmlPullParser)xml, "startY", 9, 0.0f);
                                                                                        d6 = d(g2, (XmlPullParser)xml, "endX", 10, 0.0f);
                                                                                        d7 = d(g2, (XmlPullParser)xml, "endY", 11, 0.0f);
                                                                                        d = d(g2, (XmlPullParser)xml, "centerX", 3, 0.0f);
                                                                                        d2 = d(g2, (XmlPullParser)xml, "centerY", 4, 0.0f);
                                                                                        f = f(g2, (XmlPullParser)xml, "type", 2, 0);
                                                                                        n3 = n(g2, (XmlPullParser)xml, "startColor", 0);
                                                                                        k = k((XmlPullParser)xml, "centerColor");
                                                                                        n5 = n(g2, (XmlPullParser)xml, "centerColor", 7);
                                                                                        n4 = n(g2, (XmlPullParser)xml, "endColor", 1);
                                                                                        n = f(g2, (XmlPullParser)xml, "tileMode", 6, 0);
                                                                                        d3 = d(g2, (XmlPullParser)xml, "gradientRadius", 5, 0.0f);
                                                                                        g2.recycle();
                                                                                        n2 = ((XmlPullParser)xml).getDepth() + 1;
                                                                                        list2 = new ArrayList(20);
                                                                                        list = new ArrayList(20);
                                                                                        break Label_0464;
                                                                                    }
                                                                                    iftrue(Label_0660:)(!((XmlPullParser)xml).getName().equals("item"));
                                                                                    continue Label_0734_Outer;
                                                                                }
                                                                                Label_0827: {
                                                                                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                                                                                }
                                                                            }
                                                                            try {
                                                                                gl = new gl((Shader)o, null, 0);
                                                                                break Label_1024;
                                                                            }
                                                                            catch (final Exception xml) {
                                                                                break Label_1011;
                                                                            }
                                                                        }
                                                                        continue Block_13_Outer;
                                                                    }
                                                                    b = gk.b(resources, (XmlPullParser)xml, attributeSet, resources$Theme);
                                                                    n = b.getDefaultColor();
                                                                    gl = new gl(null, b, n);
                                                                    break Label_1024;
                                                                    gq = new gq(n3, n5, n4);
                                                                    continue Label_0734;
                                                                }
                                                                next = ((XmlPullParser)xml).next();
                                                                iftrue(Label_0666:)(next == 1);
                                                                continue Label_0734_Outer;
                                                            }
                                                            continue Label_0734;
                                                        }
                                                        Label_0700: {
                                                            iftrue(Label_0722:)(!k);
                                                        }
                                                        continue;
                                                    }
                                                    Label_0767: {
                                                        o = new SweepGradient(d, d2, gq.a, gq.b);
                                                    }
                                                }
                                                catch (final Exception xml) {}
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    catch (final Exception ex) {}
                }
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", (Throwable)xml);
                gl = null;
            }
            if (gl != null) {
                return gl;
            }
        }
        return gl.a(0);
    }
    
    public static void p(final TypedArray typedArray, final int n, final int n2, final int n3) {
        typedArray.getResourceId(n, typedArray.getResourceId(n2, n3));
    }
    
    public static int q(final int n) {
        if (n <= 4) {
            return 8;
        }
        return n + n;
    }
    
    public static Shader$TileMode r(final int n) {
        switch (n) {
            default: {
                return Shader$TileMode.CLAMP;
            }
            case 2: {
                return Shader$TileMode.MIRROR;
            }
            case 1: {
                return Shader$TileMode.REPEAT;
            }
        }
    }
    
    public static Cursor s(aq aq, final aff aff, final boolean b) {
        final Cursor o = aq.o(aff);
        if (b && o instanceof AbstractWindowedCursor) {
            aq = (aq)o;
            final int count = ((AbstractWindowedCursor)aq).getCount();
            int numRows;
            if (((AbstractWindowedCursor)aq).hasWindow()) {
                numRows = ((AbstractWindowedCursor)aq).getWindow().getNumRows();
            }
            else {
                numRows = count;
            }
            if (numRows < count) {
                try {
                    final MatrixCursor matrixCursor = new MatrixCursor(((Cursor)aq).getColumnNames(), ((Cursor)aq).getCount());
                    while (((Cursor)aq).moveToNext()) {
                        final Object[] array = new Object[((Cursor)aq).getColumnCount()];
                        for (int i = 0; i < ((Cursor)aq).getColumnCount(); ++i) {
                            switch (((Cursor)aq).getType(i)) {
                                default: {
                                    throw new IllegalStateException();
                                }
                                case 4: {
                                    array[i] = ((Cursor)aq).getBlob(i);
                                    break;
                                }
                                case 3: {
                                    array[i] = ((Cursor)aq).getString(i);
                                    break;
                                }
                                case 2: {
                                    array[i] = ((Cursor)aq).getDouble(i);
                                    break;
                                }
                                case 1: {
                                    array[i] = ((Cursor)aq).getLong(i);
                                    break;
                                }
                                case 0: {
                                    array[i] = null;
                                    break;
                                }
                            }
                        }
                        matrixCursor.addRow(array);
                    }
                    return (Cursor)matrixCursor;
                }
                finally {
                    ((Cursor)aq).close();
                }
            }
        }
        return o;
    }
    
    public static void t(final afh afh) {
        final ArrayList list = new ArrayList();
        Object b = afh.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            int i;
            while (true) {
                final boolean moveToNext = ((Cursor)b).moveToNext();
                i = 0;
                if (!moveToNext) {
                    break;
                }
                list.add(((Cursor)b).getString(0));
            }
            ((Cursor)b).close();
            while (i < list.size()) {
                b = list.get(i);
                if (((String)b).startsWith("room_fts_content_sync_")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("DROP TRIGGER IF EXISTS ");
                    sb.append((String)b);
                    afh.g(sb.toString());
                }
                ++i;
            }
        }
        finally {
            ((Cursor)b).close();
            while (true) {}
        }
    }
    
    public static int u(final Cursor cursor, final String s) {
        final int columnIndex = cursor.getColumnIndex(s);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("`");
        sb.append(s);
        sb.append("`");
        final int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }
    
    public static int v(final Cursor cursor, final String s) {
        final int u = u(cursor, s);
        if (u >= 0) {
            return u;
        }
        String string;
        try {
            string = Arrays.toString(cursor.getColumnNames());
        }
        catch (final Exception ex) {
            string = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("column '");
        sb.append(s);
        sb.append("' does not exist. Available columns: ");
        sb.append(string);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static void w(final View view, final k k) {
        view.setTag(2131428130, (Object)k);
    }
    
    private static void x(final ArrayList list, final char c, final float[] array) {
        list.add(new gy(c, array));
    }
}
