import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pod
{
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;
    
    static {
        final String a2 = pqg.a("kotlinx.coroutines.debug");
        final boolean b2 = true;
        boolean a3 = false;
        Label_0120: {
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case 3005871: {
                        if (a2.equals("auto")) {
                            a3 = false;
                            break Label_0120;
                        }
                        break;
                    }
                    case 109935: {
                        if (a2.equals("off")) {
                            a3 = false;
                            break Label_0120;
                        }
                        break;
                    }
                    case 3551: {
                        if (a2.equals("on")) {
                            a3 = true;
                            break Label_0120;
                        }
                        break;
                    }
                    case 0: {
                        if (a2.equals("")) {
                            a3 = true;
                            break Label_0120;
                        }
                        break;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("System property 'kotlinx.coroutines.debug' has unrecognized value '");
                sb.append(a2);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            a3 = false;
        }
        a = a3;
        boolean b3 = false;
        Label_0157: {
            if (a3) {
                final String a4 = pqg.a("kotlinx.coroutines.stacktrace.recovery");
                if (a4 == null) {
                    b3 = b2;
                    break Label_0157;
                }
                if (Boolean.parseBoolean(a4)) {
                    b3 = b2;
                    break Label_0157;
                }
            }
            b3 = false;
        }
        b = b3;
        c = new AtomicLong(0L);
    }
}
