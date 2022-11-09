import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jno extends jmc
{
    public SharedPreferences a;
    public long c;
    public final jnn d;
    private long e;
    
    protected jno(final jmf jmf) {
        super(jmf);
        this.e = -1L;
        this.d = new jnn(this, (long)jnd.A.a());
    }
    
    @Override
    protected final void a() {
        this.a = this.d().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }
    
    public final long b() {
        jlw.a();
        this.z();
        long e;
        if ((e = this.e) == -1L) {
            e = this.a.getLong("last_dispatch", 0L);
            this.e = e;
        }
        return e;
    }
    
    public final void c() {
        jlw.a();
        this.z();
        final long currentTimeMillis = System.currentTimeMillis();
        final SharedPreferences$Editor edit = this.a.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.e = currentTimeMillis;
    }
}
