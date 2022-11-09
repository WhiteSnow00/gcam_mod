// 
// Decompiled by Procyon v0.6.0
// 

final class kuh
{
    private final ljg a;
    private final krr b;
    
    public kuh(final ljg a, final krr b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(int n) {
        if (n != 0) {
            final int n2 = 0;
            switch (n - 1) {
                default: {
                    n = n2;
                    break;
                }
                case 2: {
                    n = 3;
                    break;
                }
                case 1: {
                    n = 1;
                    break;
                }
                case 0: {
                    n = n2;
                    break;
                }
            }
            try {
                if (this.a.a() != n) {
                    this.a.g(n);
                }
                return;
            }
            catch (final kuw kuw) {
                this.b.i("Failed to set audio restriction on camera device.", kuw);
                return;
            }
        }
        throw null;
    }
}
