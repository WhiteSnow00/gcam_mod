// 
// Decompiled by Procyon v0.6.0
// 

public final class phm
{
    public int a;
    public int b;
    public int c;
    public Object[] d;
    
    public phm() {
        final int a = phn.a(16);
        this.a = a - 1;
        this.c = (int)(a * 0.75f);
        this.d = new Object[a];
    }
    
    public static int a(int n) {
        n *= -1640531527;
        return n ^ n >>> 16;
    }
    
    public final void b(int n, final Object[] array, final int n2) {
        --this.b;
        int n3 = n;
    Block_1:
        while (true) {
            n = (n3 + 1 & n2);
            Object o;
            while (true) {
                o = array[n];
                if (o == null) {
                    break Block_1;
                }
                final int n4 = a(o.hashCode()) & n2;
                if (n3 <= n) {
                    if (n3 >= n4) {
                        break;
                    }
                    if (n4 > n) {
                        break;
                    }
                }
                else if (n3 >= n4 && n4 > n) {
                    break;
                }
                n = (n + 1 & n2);
            }
            array[n3] = o;
            n3 = n;
        }
        array[n3] = null;
    }
}
