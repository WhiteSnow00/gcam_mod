// 
// Decompiled by Procyon v0.6.0
// 

public abstract class php
{
    public abstract int a();
    
    public final boolean c(final psr[] array) {
        final int a = this.a();
        final int length = array.length;
        if (length != a) {
            final StringBuilder sb = new StringBuilder(52);
            sb.append("parallelism = ");
            sb.append(a);
            sb.append(", subscribers = ");
            sb.append(length);
            final IllegalArgumentException ex = new IllegalArgumentException(sb.toString());
            for (int i = 0; i < length; ++i) {
                phb.f(ex, array[i]);
            }
            return false;
        }
        return true;
    }
}
