import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkg
{
    private final SharedPreferences a;
    
    public hkg(final SharedPreferences a) {
        this.a = a;
    }
    
    private static String d(String concat) {
        if (concat.length() != 0) {
            concat = "tooltip_impression_count_for_".concat(concat);
        }
        else {
            concat = new String("tooltip_impression_count_for_");
        }
        return concat;
    }
    
    public final int a(final String s) {
        synchronized (this) {
            return this.a.getInt(d(s), 0);
        }
    }
    
    public final void b(final String s, final int n) {
        synchronized (this) {
            this.a.edit().putInt(d(s), n).apply();
        }
    }
    
    public final void c(String concat) {
        synchronized (this) {
            final String d = d(concat);
            final int int1 = this.a.getInt(d, 0);
            if (concat.length() != 0) {
                concat = "tooltip_latest_impression_timestamp_for_".concat(concat);
            }
            else {
                concat = new String("tooltip_latest_impression_timestamp_for_");
            }
            this.a.edit().putInt(d, int1 + 1).putLong(concat, System.currentTimeMillis()).apply();
        }
    }
}
