import android.content.ServiceConnection;
import android.os.Parcel;
import java.util.Map;
import android.os.RemoteException;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jml extends jmc
{
    public final jmk a;
    public jnh c;
    private final jmy d;
    private final jnv e;
    
    protected jml(final jmf jmf) {
        super(jmf);
        this.e = new jnv();
        this.a = new jmk(this);
        this.d = new jmh(this, jmf);
    }
    
    public final void C() {
        this.e.b();
        this.d.d((long)jnd.x.a());
    }
    
    public final boolean D() {
        jlw.a();
        this.z();
        return this.c != null;
    }
    
    public final boolean E(final jng jng) {
        jvu.a(jng);
        jlw.a();
        this.z();
        final jnh c = this.c;
        if (c == null) {
            return false;
        }
        String s;
        if (jng.d) {
            s = jmv.f();
        }
        else {
            s = jmv.h();
        }
        final List<Object> emptyList = Collections.emptyList();
        try {
            final Map a = jng.a;
            final long c2 = jng.c;
            final Parcel a2 = c.a();
            a2.writeMap(a);
            a2.writeLong(c2);
            a2.writeString(s);
            a2.writeTypedList((List)emptyList);
            c.z(1, a2);
            this.C();
            return true;
        }
        catch (final RemoteException ex) {
            this.q("Failed to send hits to AnalyticsService");
            return false;
        }
    }
    
    @Override
    protected final void a() {
    }
    
    public final void b() {
        jlw.a();
        this.z();
        try {
            jwl.a().b(this.d(), (ServiceConnection)this.a);
        }
        catch (final IllegalArgumentException ex) {}
        catch (final IllegalStateException ex2) {}
        if (this.c != null) {
            this.c = null;
            this.c();
        }
    }
    
    public final void c() {
        final jma f = this.f();
        f.z();
        jlw.a();
        final jmt a = f.a;
        jlw.a();
        a.z();
        a.q("Service disconnected");
    }
}
