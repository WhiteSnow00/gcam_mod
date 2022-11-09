import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phn
{
    public static int a(final int n) {
        return 1 << 32 - Integer.numberOfLeadingZeros(n - 1);
    }
    
    public static long b(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, c(value, n)));
        return value;
    }
    
    public static long c(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static void d(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return;
            }
            n2 = value - n;
            if (n2 >= 0L) {
                continue;
            }
            final StringBuilder sb = new StringBuilder(50);
            sb.append("More produced than requested: ");
            sb.append(n2);
            pip.g(new IllegalStateException(sb.toString()));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
    }
    
    public static owx e(final Object o, final oyf oyf) {
        final pbo pbo = new pbo(o, oyf);
        pip.l();
        return pbo;
    }
    
    public static boolean f(psq psq, final psr psr, final oyf oyf) {
        if (psq instanceof Callable) {
            try {
                final Object call = ((Callable)psq).call();
                if (call == null) {
                    phb.e(psr);
                    return true;
                }
                try {
                    psq = (psq)oyf.a(call);
                    g(psq, "The mapper returned a null Publisher");
                    if (psq instanceof Callable) {
                        try {
                            final Object call2 = ((Callable)psq).call();
                            if (call2 == null) {
                                phb.e(psr);
                                return true;
                            }
                            psr.bY(new phc(psr, call2));
                            return true;
                        }
                        finally {
                            return;
                        }
                    }
                    psq.j(psr);
                    return true;
                }
                finally {
                    return;
                }
            }
            finally {
                final Throwable t;
                psn.e(t);
                phb.f(t, psr);
                return true;
            }
        }
        return false;
    }
    
    public static void g(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static void h(final int n, final String s) {
        if (n > 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder(s.length() + 36);
        sb.append(s);
        sb.append(" > 0 required but it was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int i(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 200: {
                return 201;
            }
            case 199: {
                return 200;
            }
            case 198: {
                return 199;
            }
            case 197: {
                return 198;
            }
            case 196: {
                return 197;
            }
            case 195: {
                return 196;
            }
            case 194: {
                return 195;
            }
            case 193: {
                return 194;
            }
            case 192: {
                return 193;
            }
            case 191: {
                return 192;
            }
            case 190: {
                return 191;
            }
            case 189: {
                return 190;
            }
            case 188: {
                return 189;
            }
            case 187: {
                return 188;
            }
            case 186: {
                return 187;
            }
            case 185: {
                return 186;
            }
            case 184: {
                return 185;
            }
            case 183: {
                return 184;
            }
            case 182: {
                return 183;
            }
            case 181: {
                return 182;
            }
            case 180: {
                return 181;
            }
            case 179: {
                return 180;
            }
            case 178: {
                return 179;
            }
            case 177: {
                return 178;
            }
            case 176: {
                return 177;
            }
            case 175: {
                return 176;
            }
            case 174: {
                return 175;
            }
            case 173: {
                return 174;
            }
            case 172: {
                return 173;
            }
            case 171: {
                return 172;
            }
            case 170: {
                return 171;
            }
            case 169: {
                return 170;
            }
            case 168: {
                return 169;
            }
            case 167: {
                return 168;
            }
            case 166: {
                return 167;
            }
            case 165: {
                return 166;
            }
            case 164: {
                return 165;
            }
            case 163: {
                return 164;
            }
            case 162: {
                return 163;
            }
            case 161: {
                return 162;
            }
            case 160: {
                return 161;
            }
            case 159: {
                return 160;
            }
            case 158: {
                return 159;
            }
            case 157: {
                return 158;
            }
            case 156: {
                return 157;
            }
            case 155: {
                return 156;
            }
            case 154: {
                return 155;
            }
            case 153: {
                return 154;
            }
            case 152: {
                return 153;
            }
            case 151: {
                return 152;
            }
            case 150: {
                return 151;
            }
            case 149: {
                return 150;
            }
            case 148: {
                return 149;
            }
            case 147: {
                return 148;
            }
            case 146: {
                return 147;
            }
            case 145: {
                return 146;
            }
            case 144: {
                return 145;
            }
            case 143: {
                return 144;
            }
            case 142: {
                return 143;
            }
            case 141: {
                return 142;
            }
            case 140: {
                return 141;
            }
            case 139: {
                return 140;
            }
            case 138: {
                return 139;
            }
            case 137: {
                return 138;
            }
            case 136: {
                return 137;
            }
            case 135: {
                return 136;
            }
            case 134: {
                return 135;
            }
            case 133: {
                return 134;
            }
            case 132: {
                return 133;
            }
            case 131: {
                return 132;
            }
            case 130: {
                return 131;
            }
            case 129: {
                return 130;
            }
            case 128: {
                return 129;
            }
            case 127: {
                return 128;
            }
            case 126: {
                return 127;
            }
            case 125: {
                return 126;
            }
            case 124: {
                return 125;
            }
            case 123: {
                return 124;
            }
            case 122: {
                return 123;
            }
            case 121: {
                return 122;
            }
            case 120: {
                return 121;
            }
            case 119: {
                return 120;
            }
            case 118: {
                return 119;
            }
            case 117: {
                return 118;
            }
            case 116: {
                return 117;
            }
            case 115: {
                return 116;
            }
            case 114: {
                return 115;
            }
            case 113: {
                return 114;
            }
            case 112: {
                return 113;
            }
            case 111: {
                return 112;
            }
            case 110: {
                return 111;
            }
            case 109: {
                return 110;
            }
            case 108: {
                return 109;
            }
            case 107: {
                return 108;
            }
            case 106: {
                return 107;
            }
            case 105: {
                return 106;
            }
            case 104: {
                return 105;
            }
            case 103: {
                return 104;
            }
            case 102: {
                return 103;
            }
            case 101: {
                return 102;
            }
            case 100: {
                return 101;
            }
            case 99: {
                return 100;
            }
            case 98: {
                return 99;
            }
            case 97: {
                return 98;
            }
            case 96: {
                return 97;
            }
            case 95: {
                return 96;
            }
            case 94: {
                return 95;
            }
            case 93: {
                return 94;
            }
            case 92: {
                return 93;
            }
            case 91: {
                return 92;
            }
            case 90: {
                return 91;
            }
            case 89: {
                return 90;
            }
            case 88: {
                return 89;
            }
            case 87: {
                return 88;
            }
            case 86: {
                return 87;
            }
            case 85: {
                return 86;
            }
            case 84: {
                return 85;
            }
            case 83: {
                return 84;
            }
            case 82: {
                return 83;
            }
            case 81: {
                return 82;
            }
            case 80: {
                return 81;
            }
            case 79: {
                return 80;
            }
            case 78: {
                return 79;
            }
            case 77: {
                return 78;
            }
            case 76: {
                return 77;
            }
            case 75: {
                return 76;
            }
            case 74: {
                return 75;
            }
            case 73: {
                return 74;
            }
            case 72: {
                return 73;
            }
            case 71: {
                return 72;
            }
            case 70: {
                return 71;
            }
            case 69: {
                return 70;
            }
            case 68: {
                return 69;
            }
            case 67: {
                return 68;
            }
            case 66: {
                return 67;
            }
            case 65: {
                return 66;
            }
            case 64: {
                return 65;
            }
            case 63: {
                return 64;
            }
            case 62: {
                return 63;
            }
            case 61: {
                return 62;
            }
            case 60: {
                return 61;
            }
            case 59: {
                return 60;
            }
            case 58: {
                return 59;
            }
            case 57: {
                return 58;
            }
            case 56: {
                return 57;
            }
            case 55: {
                return 56;
            }
            case 54: {
                return 55;
            }
            case 53: {
                return 54;
            }
            case 52: {
                return 53;
            }
            case 51: {
                return 52;
            }
            case 50: {
                return 51;
            }
            case 49: {
                return 50;
            }
            case 48: {
                return 49;
            }
            case 47: {
                return 48;
            }
            case 46: {
                return 47;
            }
            case 45: {
                return 46;
            }
            case 44: {
                return 45;
            }
            case 43: {
                return 44;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int j(final int n) {
        if (n != 1) {
            return n - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static int k(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 11;
            }
            case 8: {
                return 10;
            }
            case 7: {
                return 9;
            }
            case 6: {
                return 8;
            }
            case 5: {
                return 7;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    static final void l(final StringBuilder sb, final int n, final String s, final Object o) {
        if (o instanceof List) {
            final Iterator iterator = ((List)o).iterator();
            while (iterator.hasNext()) {
                l(sb, n, s, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                l(sb, n, s, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        sb.append(s);
        if (o instanceof String) {
            sb.append(": \"");
            sb.append(pjf.H(ojw.v((String)o)));
            sb.append('\"');
            return;
        }
        if (o instanceof ojw) {
            sb.append(": \"");
            sb.append(pjf.H((ojw)o));
            sb.append('\"');
            return;
        }
        if (o instanceof oky) {
            sb.append(" {");
            m((omj)o, sb, n + 2);
            sb.append("\n");
            for (int j = n3; j < n; ++j) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        if (o instanceof Map.Entry) {
            sb.append(" {");
            final Map.Entry entry = (Map.Entry)o;
            final int n4 = n + 2;
            l(sb, n4, "key", entry.getKey());
            l(sb, n4, "value", entry.getValue());
            sb.append("\n");
            for (int k = n2; k < n; ++k) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(o.toString());
    }
    
    public static void m(final omj omj, final StringBuilder sb, final int n) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final TreeSet set = new TreeSet();
        final Method[] declaredMethods = omj.getClass().getDeclaredMethods();
        final int length = declaredMethods.length;
        final int n2 = 0;
        for (final Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    set.add(method.getName());
                }
            }
        }
        for (final String s : set) {
            String substring;
            if (s.startsWith("get")) {
                substring = s.substring(3);
            }
            else {
                substring = s;
            }
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final String value = String.valueOf(substring.substring(0, 1).toLowerCase());
                final String value2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat;
                if (value2.length() != 0) {
                    concat = value.concat(value2);
                }
                else {
                    concat = new String(value);
                }
                final Method method2 = (Method)hashMap.get(s);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    l(sb, n, s(concat), oky.E(method2, omj, new Object[0]));
                    continue;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                final String value3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                final String value4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2;
                if (value4.length() != 0) {
                    concat2 = value3.concat(value4);
                }
                else {
                    concat2 = new String(value3);
                }
                final Method method3 = (Method)hashMap.get(s);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    l(sb, n, s(concat2), oky.E(method3, omj, new Object[0]));
                    continue;
                }
            }
            final String value5 = String.valueOf(substring);
            String concat3;
            if (value5.length() != 0) {
                concat3 = "set".concat(value5);
            }
            else {
                concat3 = new String("set");
            }
            if (hashMap2.get(concat3) != null) {
                if (substring.endsWith("Bytes")) {
                    final String value6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    String concat4;
                    if (value6.length() != 0) {
                        concat4 = "get".concat(value6);
                    }
                    else {
                        concat4 = new String("get");
                    }
                    if (hashMap.containsKey(concat4)) {
                        continue;
                    }
                }
                final String value7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                final String value8 = String.valueOf(substring.substring(1));
                String concat5;
                if (value8.length() != 0) {
                    concat5 = value7.concat(value8);
                }
                else {
                    concat5 = new String(value7);
                }
                final String value9 = String.valueOf(substring);
                String concat6;
                if (value9.length() != 0) {
                    concat6 = "get".concat(value9);
                }
                else {
                    concat6 = new String("get");
                }
                final Method method4 = (Method)hashMap.get(concat6);
                final String value10 = String.valueOf(substring);
                String concat7;
                if (value10.length() != 0) {
                    concat7 = "has".concat(value10);
                }
                else {
                    concat7 = new String("has");
                }
                final Method method5 = (Method)hashMap.get(concat7);
                if (method4 == null) {
                    continue;
                }
                final Object e = oky.E(method4, omj, new Object[0]);
                Label_1014: {
                    if (method5 == null) {
                        if (e instanceof Boolean) {
                            if (!(boolean)e) {
                                continue;
                            }
                        }
                        else if (e instanceof Integer) {
                            if ((int)e == 0) {
                                continue;
                            }
                        }
                        else if (e instanceof Float) {
                            if ((float)e == 0.0f) {
                                continue;
                            }
                        }
                        else if (e instanceof Double) {
                            if ((double)e == 0.0) {
                                continue;
                            }
                        }
                        else {
                            boolean b;
                            if (e instanceof String) {
                                b = e.equals("");
                            }
                            else if (e instanceof ojw) {
                                b = e.equals(ojw.b);
                            }
                            else if (e instanceof omj) {
                                if (e != ((omj)e).l()) {
                                    break Label_1014;
                                }
                                continue;
                            }
                            else {
                                if (!(e instanceof Enum)) {
                                    break Label_1014;
                                }
                                if (((Enum)e).ordinal() != 0) {
                                    break Label_1014;
                                }
                                continue;
                            }
                            if (b) {
                                continue;
                            }
                        }
                    }
                    else if (!(boolean)oky.E(method5, omj, new Object[0])) {
                        continue;
                    }
                }
                l(sb, n, s(concat5), e);
            }
        }
        if (omj instanceof okw) {
            final Iterator d = ((okw)omj).f.d();
            while (d.hasNext()) {
                final Map.Entry<okx, V> entry = d.next();
                final int b2 = entry.getKey().b;
                final StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(b2);
                sb2.append("]");
                l(sb, n, sb2.toString(), entry.getValue());
            }
        }
        final onk aa = ((oky)omj).aA;
        if (aa != null) {
            for (int j = n2; j < aa.b; ++j) {
                l(sb, n, String.valueOf(onx.a(aa.c[j])), aa.d[j]);
            }
        }
    }
    
    public static final omc n(final Object o) {
        return ((omd)o).a;
    }
    
    public static final int o(final int n, final Object o, final Object o2) {
        final ome ome = (ome)o;
        final omd omd = (omd)o2;
        final boolean empty = ome.isEmpty();
        final int n2 = 0;
        int n3 = 0;
        if (empty) {
            n3 = n2;
        }
        else {
            for (final Map.Entry<Object, V> entry : ome.entrySet()) {
                n3 += okg.ab(n) + okg.R(omd.a(omd.a, entry.getKey(), entry.getValue()));
            }
        }
        return n3;
    }
    
    public static final boolean p(final Object o) {
        return !((ome)o).b;
    }
    
    public static final Object q(final Object o, final Object o2) {
        final ome ome = (ome)o;
        final ome ome2 = (ome)o2;
        ome ome3 = ome;
        if (!ome2.isEmpty()) {
            ome a = ome;
            if (!ome.b) {
                a = ome.a();
            }
            a.b();
            ome3 = a;
            if (!ome2.isEmpty()) {
                a.putAll(ome2);
                ome3 = a;
            }
        }
        return ome3;
    }
    
    public static final Object r() {
        return ome.a.a();
    }
    
    private static final String s(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(char1));
        }
        return sb.toString();
    }
}
