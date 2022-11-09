// 
// Decompiled by Procyon v0.6.0
// 

public final class krv implements krr
{
    private final krr a;
    private final String b;
    
    private krv(final krr a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static krv j(final String s, final krr krr) {
        return new krv(krr, s);
    }
    
    @Override
    public final krr a(final String s) {
        return new krv(this.a.a(s), this.b);
    }
    
    @Override
    public final void b(String s) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.b(s);
    }
    
    @Override
    public final void c(String s, final Throwable t) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.c(s, t);
    }
    
    @Override
    public final void d(String s) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.d(s);
    }
    
    @Override
    public final void e(String s, final Throwable t) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.e(s, t);
    }
    
    @Override
    public final void f(String s) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.f(s);
    }
    
    @Override
    public final void g(String s) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.g(s);
    }
    
    @Override
    public final void h(String s) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.h(s);
    }
    
    @Override
    public final void i(String s, final Throwable t) {
        final krr a = this.a;
        final String value = String.valueOf(this.b);
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = value.concat(s);
        }
        else {
            s = new String(value);
        }
        a.i(s, t);
    }
}
