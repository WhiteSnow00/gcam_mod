// 
// Decompiled by Procyon v0.6.0
// 

public final class nwl extends nwo
{
    final char[] a;
    
    public nwl(final nwk nwk) {
        super(nwk, null);
        this.a = new char[512];
        final int length = nwk.b.length;
        int i = 0;
        njo.d(length == 16);
        while (i < 256) {
            this.a[i] = nwk.a(i >>> 4);
            this.a[i | 0x100] = nwk.a(i & 0xF);
            ++i;
        }
    }
    
    @Override
    public final int a(final byte[] array, final CharSequence charSequence) {
        array.getClass();
        if (charSequence.length() % 2 != 1) {
            int i;
            int n;
            for (i = 0, n = 0; i < charSequence.length(); i += 2, ++n) {
                array[n] = (byte)(this.b.b(charSequence.charAt(i)) << 4 | this.b.b(charSequence.charAt(i + 1)));
            }
            return n;
        }
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new nwm(sb.toString());
    }
    
    @Override
    public final void b(final Appendable appendable, final byte[] array, final int n) {
        appendable.getClass();
        final int length = array.length;
        int i = 0;
        njo.n(0, n, length);
        while (i < n) {
            final int n2 = array[i] & 0xFF;
            appendable.append(this.a[n2]);
            appendable.append(this.a[n2 | 0x100]);
            ++i;
        }
    }
}
