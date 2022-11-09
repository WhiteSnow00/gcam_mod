import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lia implements lhz, lhr, lhw
{
    public final String a;
    public final lht[] b;
    public final lhq c;
    private final lib d;
    
    public lia(final String a, final lht[] b, final lib d, final lhq c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final void a(final Object... array) {
        this.c(1L, array);
    }
    
    @Override
    public final void b(final double n, final Object... array) {
        this.c(n, array);
    }
    
    protected final void c(Object o, final Object[] array) {
        final String a = this.a;
        final lht[] b = this.b;
        Label_0167: {
            if (b.length == array.length) {
                for (int i = 0; i < b.length; ++i) {
                    final Class b2 = b[i].b;
                    if (b2 == String.class) {
                        if (!(array[i] instanceof String)) {
                            break Label_0167;
                        }
                    }
                    else if (b2 == Integer.class && !(array[i] instanceof Integer)) {
                        break Label_0167;
                    }
                    if (b2 == Boolean.class && !(array[i] instanceof Boolean)) {
                        break Label_0167;
                    }
                }
                this.c.a(o, lhu.a(array));
                final lib a2 = ((lif)this.d).a;
                if (a2 != null) {
                    synchronized (((lii)a2).a) {
                        System.nanoTime();
                        ((lii)a2).c.d(((lii)a2).b);
                    }
                }
                return;
            }
        }
        final String string = Arrays.toString(b);
        final String string2 = Arrays.toString(array);
        final StringBuilder sb = new StringBuilder(a.length() + 29 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(a);
        sb.append(" has: ");
        sb.append(string);
        sb.append(" which does not match: ");
        sb.append(string2);
        o = new IllegalArgumentException(sb.toString());
        throw o;
    }
}
