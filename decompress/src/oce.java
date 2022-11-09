// 
// Decompiled by Procyon v0.6.0
// 

public class oce
{
    protected oce() {
    }
    
    public static okt a(final Throwable t) {
        final okt m = occ.f.m();
        final String name = t.getClass().getName();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final occ occ = (occ)m.b;
        name.getClass();
        occ.a |= 0x1;
        occ.b = name;
        if (t.getMessage() != null) {
            final String message = t.getMessage();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final occ occ2 = (occ)m.b;
            message.getClass();
            occ2.a |= 0x2;
            occ2.c = message;
        }
        StackTraceElement[] stackTrace;
        try {
            stackTrace = t.getStackTrace();
        }
        catch (final NullPointerException ex) {
            stackTrace = null;
        }
        if (stackTrace != null) {
            for (final StackTraceElement stackTraceElement : stackTrace) {
                final okt j = ocb.f.m();
                if (stackTraceElement != null) {
                    final String className = stackTraceElement.getClassName();
                    if (j.c) {
                        j.m();
                        j.c = false;
                    }
                    final ocb ocb = (ocb)j.b;
                    className.getClass();
                    ocb.a |= 0x1;
                    ocb.b = className;
                    final String methodName = stackTraceElement.getMethodName();
                    if (j.c) {
                        j.m();
                        j.c = false;
                    }
                    final ocb ocb2 = (ocb)j.b;
                    methodName.getClass();
                    ocb2.a |= 0x2;
                    ocb2.c = methodName;
                    final int lineNumber = stackTraceElement.getLineNumber();
                    if (j.c) {
                        j.m();
                        j.c = false;
                    }
                    final ocb ocb3 = (ocb)j.b;
                    ocb3.a |= 0x8;
                    ocb3.e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        final String fileName = stackTraceElement.getFileName();
                        if (j.c) {
                            j.m();
                            j.c = false;
                        }
                        final ocb ocb4 = (ocb)j.b;
                        fileName.getClass();
                        ocb4.a |= 0x4;
                        ocb4.d = fileName;
                    }
                }
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final occ occ3 = (occ)m.b;
                final ocb ocb5 = (ocb)j.h();
                ocb5.getClass();
                final olj e = occ3.e;
                if (!e.c()) {
                    occ3.e = oky.C(e);
                }
                occ3.e.add(ocb5);
            }
        }
        return m;
    }
    
    public static int b(final int n) {
        switch (n) {
            default: {
                return 0;
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
    
    public static int c(final int n) {
        switch (n) {
            default: {
                return 0;
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
    
    public static int d(final int n) {
        switch (n) {
            default: {
                return 0;
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
    
    public static int e(final int n) {
        switch (n) {
            default: {
                return 0;
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
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int f(final int n) {
        switch (n) {
            default: {
                return 0;
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
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static Object g(final Object o, final String s) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(s.concat(" must not be null"));
    }
    
    public static void h(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static boolean i(final char c) {
        final boolean b = true;
        if (c >= 'a') {
            final boolean b2 = b;
            if (c <= 'z') {
                return b2;
            }
        }
        boolean b2;
        if (c >= 'A') {
            if (c > 'Z') {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
}
