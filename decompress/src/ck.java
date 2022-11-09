// 
// Decompiled by Procyon v0.6.0
// 

public final class ck
{
    public final int a;
    public final char b;
    public short c;
    public int d;
    public final int e;
    
    public ck(final int e, final int a, final int n, final int n2) {
        this.e = e;
        this.a = a;
        this.b = (char)n;
        this.c = (short)n2;
    }
    
    public final int a() {
        return this.a + this.b;
    }
    
    public final int b() {
        final int e = this.e;
        if (e != 6 && e != 7) {
            return 1;
        }
        return cl.e[this.c];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ck ck = (ck)o;
            return this.e == ck.e && this.a == ck.a && this.b == ck.b && this.c == ck.c && this.d == ck.d;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.e * 37 + this.a) * 37 + this.b) * 37 + this.c;
    }
    
    @Override
    public final String toString() {
        final int e = this.e;
        String s;
        if (e != 6 && e != 7) {
            s = Integer.toString(this.c);
        }
        else {
            final int b = this.b();
            s = jp.j(b);
            if (b == 0) {
                throw null;
            }
        }
        String s2 = null;
        switch (this.e) {
            default: {
                s2 = "ARG_DOUBLE";
                break;
            }
            case 13: {
                s2 = "ARG_INT";
                break;
            }
            case 12: {
                s2 = "ARG_SELECTOR";
                break;
            }
            case 11: {
                s2 = "ARG_STYLE";
                break;
            }
            case 10: {
                s2 = "ARG_TYPE";
                break;
            }
            case 9: {
                s2 = "ARG_NAME";
                break;
            }
            case 8: {
                s2 = "ARG_NUMBER";
                break;
            }
            case 7: {
                s2 = "ARG_LIMIT";
                break;
            }
            case 6: {
                s2 = "ARG_START";
                break;
            }
            case 5: {
                s2 = "REPLACE_NUMBER";
                break;
            }
            case 4: {
                s2 = "INSERT_CHAR";
                break;
            }
            case 3: {
                s2 = "SKIP_SYNTAX";
                break;
            }
            case 2: {
                s2 = "MSG_LIMIT";
                break;
            }
            case 1: {
                s2 = "MSG_START";
                break;
            }
        }
        final int a = this.a;
        final StringBuilder sb = new StringBuilder(s2.length() + 14 + String.valueOf(s).length());
        sb.append(s2);
        sb.append("(");
        sb.append(s);
        sb.append(")@");
        sb.append(a);
        return sb.toString();
    }
}
