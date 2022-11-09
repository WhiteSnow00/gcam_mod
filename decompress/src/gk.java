import android.util.Log;
import android.content.res.TypedArray;
import java.lang.reflect.Array;
import android.graphics.Color;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gk
{
    private static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static ColorStateList a(final Resources resources, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, attributeSet, resources$Theme);
            }
            if (next != 1) {
                continue;
            }
            throw new XmlPullParserException("No start tag found");
        }
    }
    
    public static ColorStateList b(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            final int n = xmlPullParser.getDepth() + 1;
            int[][] array = new int[20][];
            int[] array2 = new int[20];
            int n2 = 0;
            while (true) {
                final int next = xmlPullParser.next();
                if (next == 1) {
                    break;
                }
                final int depth = xmlPullParser.getDepth();
                if (depth < n && next == 3) {
                    break;
                }
                if (next != 2 || depth > n || !xmlPullParser.getName().equals("item")) {
                    continue;
                }
                final int[] a = cq.a;
                TypedArray typedArray;
                if (resources$Theme == null) {
                    typedArray = resources.obtainAttributes(set, a);
                }
                else {
                    typedArray = resources$Theme.obtainStyledAttributes(set, a, 0, 0);
                }
                final int resourceId = typedArray.getResourceId(0, -1);
                int n3 = 0;
                Label_0269: {
                    if (resourceId != -1) {
                        final ThreadLocal a2 = gk.a;
                        TypedValue typedValue;
                        if ((typedValue = a2.get()) == null) {
                            typedValue = new TypedValue();
                            a2.set(typedValue);
                        }
                        resources.getValue(resourceId, typedValue, true);
                        if (typedValue.type < 28 || typedValue.type > 31) {
                            try {
                                n3 = a(resources, (XmlPullParser)resources.getXml(resourceId), resources$Theme).getDefaultColor();
                            }
                            catch (final Exception ex) {
                                n3 = typedArray.getColor(0, -65281);
                            }
                            break Label_0269;
                        }
                    }
                    n3 = typedArray.getColor(0, -65281);
                }
                final boolean hasValue = typedArray.hasValue(1);
                float n4 = 1.0f;
                if (hasValue) {
                    n4 = typedArray.getFloat(1, 1.0f);
                }
                else if (typedArray.hasValue(2)) {
                    n4 = typedArray.getFloat(2, 1.0f);
                }
                typedArray.recycle();
                final int attributeCount = set.getAttributeCount();
                final int[] array3 = new int[attributeCount];
                int i = 0;
                int n5 = 0;
                while (i < attributeCount) {
                    final int attributeNameResource = set.getAttributeNameResource(i);
                    int n6 = n5;
                    if (attributeNameResource != 16843173) {
                        n6 = n5;
                        if (attributeNameResource != 16843551) {
                            n6 = n5;
                            if (attributeNameResource != 2130968627) {
                                int n7 = attributeNameResource;
                                if (!set.getAttributeBooleanValue(i, false)) {
                                    n7 = -attributeNameResource;
                                }
                                array3[n5] = n7;
                                n6 = n5 + 1;
                            }
                        }
                    }
                    ++i;
                    n5 = n6;
                }
                final int[] trimStateSet = StateSet.trimStateSet(array3, n5);
                final int round = Math.round(Color.alpha(n3) * n4);
                final int n8 = n2 + 1;
                int[] array4 = array2;
                if (n8 > array2.length) {
                    array4 = new int[gz.q(n2)];
                    System.arraycopy(array2, 0, array4, 0, n2);
                }
                array4[n2] = (round << 24 | (0xFFFFFF & n3));
                Object o = array;
                if (n8 > array.length) {
                    o = Array.newInstance(array.getClass().getComponentType(), gz.q(n2));
                    System.arraycopy(array, 0, o, 0, n2);
                }
                o[n2] = trimStateSet;
                array = (int[][])o;
                n2 = n8;
                array2 = array4;
            }
            final int[] array5 = new int[n2];
            final int[][] array6 = new int[n2][];
            System.arraycopy(array2, 0, array5, 0, n2);
            System.arraycopy(array, 0, array6, 0, n2);
            return new ColorStateList(array6, array5);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    public static ColorStateList c(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        try {
            return a(resources, (XmlPullParser)resources.getXml(n), resources$Theme);
        }
        catch (final Exception ex) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", (Throwable)ex);
            return null;
        }
    }
}
