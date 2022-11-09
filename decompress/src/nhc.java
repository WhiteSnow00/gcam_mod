// 
// Decompiled by Procyon v0.6.0
// 

final class nhc extends odc
{
    private nhe a;
    private final int b;
    
    public nhc(final nhe a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final String bp() {
        final nhe a = this.a;
        if (a == null) {
            return null;
        }
        final odo a2 = a.a.a;
        if (a2 == null) {
            return null;
        }
        final String value = String.valueOf(a2);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11);
        sb.append("callable=[");
        sb.append(value);
        sb.append("]");
        final String string = sb.toString();
        final nhd nhd = this.a.c.get();
        if (nhd != null) {
            final String value2 = String.valueOf(string);
            final String value3 = String.valueOf(nhd);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 10 + String.valueOf(value3).length());
            sb2.append(value2);
            sb2.append(", trial=[");
            sb2.append(value3);
            sb2.append("]");
            return sb2.toString();
        }
        return string;
    }
    
    @Override
    protected final void c() {
        final nhe a = this.a;
        this.a = null;
        if (a == null) {
            return;
        }
        long value;
        int n;
        int n2;
        do {
            value = a.b.get();
            n2 = (int)value;
            final int a2 = nhe.a(value);
            if (n2 == Integer.MIN_VALUE) {
                final StringBuilder sb = new StringBuilder(33);
                sb.append("Refcount is: ");
                sb.append(value);
                throw new AssertionError((Object)sb.toString());
            }
            n = a2;
            if (n2 != -2147483647) {
                continue;
            }
            n = a2 + 1;
        } while (!a.b.compareAndSet(value, nhe.b(n, n2 - 1)));
        if (n2 == -2147483647) {
            nhd nhd;
            do {
                nhd = a.c.get();
                if (nhd == null || nhd.a > this.b) {
                    break;
                }
                nhd.cancel(true);
            } while (!a.c.compareAndSet(nhd, null));
        }
    }
    
    @Override
    protected final boolean e(final oey oey) {
        return super.e(oey);
    }
}
