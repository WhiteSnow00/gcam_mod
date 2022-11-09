import com.google.android.gms.common.data.DataHolder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgk extends juc
{
    private final int d;
    
    public kgk(final DataHolder dataHolder, final int n, final int d) {
        super(dataHolder, n);
        this.d = d;
    }
    
    @Override
    public final String toString() {
        String s;
        if (this.b() == 1) {
            s = "changed";
        }
        else if (this.b() == 2) {
            s = "deleted";
        }
        else {
            s = "unknown";
        }
        final String value = String.valueOf(new kgm(this.a, this.b, this.d));
        final StringBuilder sb = new StringBuilder(s.length() + 32 + String.valueOf(value).length());
        sb.append("DataEventRef{ type=");
        sb.append(s);
        sb.append(", dataitem=");
        sb.append(value);
        sb.append(" }");
        return sb.toString();
    }
}
