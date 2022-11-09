// 
// Decompiled by Procyon v0.6.0
// 

public final class fir implements oun
{
    private final pii a;
    
    public fir(final pii a) {
        this.a = a;
    }
    
    public final few a() {
        final fez a = ((fix)this.a).a();
        final fhk fhk = new fhk();
        final fgh fgh = new fgh();
        switch (a.ordinal()) {
            default: {
                final String value = String.valueOf(a);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 20);
                sb.append("Unknown muxer type: ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
            case 1: {
                return fhk;
            }
            case 0: {
                return fgh;
            }
        }
    }
}
