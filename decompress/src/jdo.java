// 
// Decompiled by Procyon v0.6.0
// 

public final class jdo implements Comparable
{
    private final int[] a;
    
    public jdo(String s) {
        final String[] split = s.split("\\.");
        final int length = split.length;
        if (length < 2) {
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "Unrecognized version name is found: ".concat(s);
            }
            else {
                s = new String("Unrecognized version name is found: ");
            }
            throw new IllegalArgumentException(s);
        }
        this.a = new int[length];
        int i = 0;
        while (i < split.length) {
            try {
                this.a[i] = Integer.parseInt(split[i]);
                ++i;
                continue;
            }
            catch (final NumberFormatException ex) {
                s = String.valueOf(s);
                if (s.length() != 0) {
                    s = "Unrecognized version name is found: ".concat(s);
                }
                else {
                    s = new String("Unrecognized version name is found: ");
                }
                throw new IllegalArgumentException(s);
            }
            break;
        }
    }
    
    public final int a(final jdo jdo) {
        int n = 0;
        int length;
        while (true) {
            final int[] a = this.a;
            length = a.length;
            if (n >= length) {
                break;
            }
            final int[] a2 = jdo.a;
            if (n >= a2.length) {
                break;
            }
            final int n2 = a[n];
            final int n3 = a2[n];
            if (n2 > n3) {
                return 1;
            }
            if (n2 < n3) {
                return -1;
            }
            ++n;
        }
        int length2 = jdo.a.length;
        if (length < length2) {
            int n4 = length;
            while (true) {
                final int[] a3 = jdo.a;
                if (n4 >= a3.length) {
                    break;
                }
                final int n5 = a3[n4];
                if (n5 > 0) {
                    return 1;
                }
                if (n5 < 0) {
                    return -1;
                }
                ++n4;
            }
        }
        else {
            while (true) {
                final int[] a4 = this.a;
                if (length2 >= a4.length) {
                    break;
                }
                final int n6 = a4[length2];
                if (n6 > 0) {
                    return 1;
                }
                if (n6 < 0) {
                    return -1;
                }
                ++length2;
            }
        }
        return 0;
    }
}
