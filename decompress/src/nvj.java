// 
// Decompiled by Procyon v0.6.0
// 

enum nvj
{
    a("BOOLEAN", 0), 
    b("STRING", 1), 
    c("LONG", 2), 
    d("DOUBLE", 3);
    
    private nvj(final String s, final int n) {
    }
    
    public static nvj a(final Object o) {
        if (o instanceof String) {
            return nvj.b;
        }
        if (o instanceof Boolean) {
            return nvj.a;
        }
        if (o instanceof Long) {
            return nvj.c;
        }
        if (o instanceof Double) {
            return nvj.d;
        }
        final String value = String.valueOf(o.getClass());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
        sb.append("invalid tag type: ");
        sb.append(value);
        throw new AssertionError((Object)sb.toString());
    }
}
