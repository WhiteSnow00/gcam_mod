import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krm implements krr, krq
{
    private final String a;
    private final krl b;
    
    public krm(final String a, final krl b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final krr a(final String s) {
        final krl b = this.b;
        final String a = b.a;
        final String value = String.valueOf(s);
        String concat;
        if (value.length() != 0) {
            concat = a.concat(value);
        }
        else {
            concat = new String(a);
        }
        final int length = s.length();
        final int b2 = b.b;
        krm a3;
        if (length > b2) {
            final krm a2 = b.a(concat.substring(0, b2 + b.a.length()));
            final int length2 = s.length();
            final int b3 = b.b;
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 44);
            sb.append("Tag ");
            sb.append(s);
            sb.append(" is ");
            sb.append(length2 - b3);
            sb.append(" chars longer than limit.");
            a2.h(sb.toString());
            a3 = a2;
        }
        else {
            a3 = b.a(concat);
        }
        return a3;
    }
    
    @Override
    public final void b(final String s) {
        this.b.b(this.a, 3);
    }
    
    @Override
    public final void c(final String s, final Throwable t) {
        this.b.b(this.a, 3);
    }
    
    @Override
    public final void d(final String s) {
        if (this.b.b(this.a, 6)) {
            Log.e(this.a, s);
        }
    }
    
    @Override
    public final void e(final String s, final Throwable t) {
        if (this.b.b(this.a, 6)) {
            Log.e(this.a, s, t);
        }
    }
    
    @Override
    public final void f(final String s) {
        this.b.b(this.a, 4);
    }
    
    @Override
    public final void g(final String s) {
        this.b.b(this.a, 2);
    }
    
    @Override
    public final void h(final String s) {
        if (this.b.b(this.a, 5)) {
            Log.w(this.a, s);
        }
    }
    
    @Override
    public final void i(final String s, final Throwable t) {
        if (this.b.b(this.a, 5)) {
            Log.w(this.a, s, t);
        }
    }
}
