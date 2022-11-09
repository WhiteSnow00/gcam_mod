// 
// Decompiled by Procyon v0.6.0
// 

final class nil extends nik
{
    private final char a;
    
    public nil(final char c) {
        this.a = c;
    }
    
    @Override
    public final boolean b(final char c) {
        return c == this.a;
    }
    
    @Override
    public final String toString() {
        int a = this.a;
        final char[] array2;
        final char[] array = array2 = new char[6];
        array2[0] = '\\';
        array2[1] = 'u';
        array2[3] = (array2[2] = '\0');
        array2[5] = (array2[4] = '\0');
        for (int i = 0; i < 4; ++i) {
            array[5 - i] = "0123456789ABCDEF".charAt(a & 0xF);
            a >>= 4;
        }
        final String copyValue = String.copyValueOf(array);
        final StringBuilder sb = new StringBuilder(String.valueOf(copyValue).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValue);
        sb.append("')");
        return sb.toString();
    }
}
