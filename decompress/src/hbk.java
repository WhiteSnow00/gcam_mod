// 
// Decompiled by Procyon v0.6.0
// 

public final class hbk
{
    public static void a() {
        krk.a(hbk.class);
    }
    
    public static int b(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown aspect ratio ");
                sb.append(n);
                throw new RuntimeException(sb.toString());
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
}
