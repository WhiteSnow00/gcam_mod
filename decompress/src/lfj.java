import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfj
{
    public final String a;
    public final int b;
    private final Integer c;
    
    private lfj(final Integer c, final String a) {
        this.c = c;
        this.a = a;
        this.b = Objects.hash(new Object[] { a, 0 });
    }
    
    public static lfj b(final String s) {
        Integer value;
        try {
            value = Integer.parseInt(s);
        }
        catch (final NumberFormatException ex) {
            value = null;
        }
        return new lfj(value, s);
    }
    
    public final int a() {
        final Integer c = this.c;
        if (c == null) {
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "Attempted to access a camera id that is not supported on legacy camera API's: ".concat(value);
            }
            else {
                concat = new String("Attempted to access a camera id that is not supported on legacy camera API's: ");
            }
            throw new UnsupportedOperationException(concat);
        }
        return c;
    }
    
    public final boolean c() {
        return this.c != null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((lfj)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
