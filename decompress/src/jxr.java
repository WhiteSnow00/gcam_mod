import android.graphics.Bitmap;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.ApplicationErrorReport;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxr
{
    public String a;
    public String b;
    public boolean c;
    public ApplicationErrorReport d;
    private final Bundle e;
    private final List f;
    private final String g;
    
    @Deprecated
    public jxr() {
        this.e = new Bundle();
        this.f = new ArrayList();
        this.d = new ApplicationErrorReport();
        final long currentTimeMillis = System.currentTimeMillis();
        final long abs = Math.abs(new SecureRandom().nextLong());
        final StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        this.g = sb.toString();
    }
    
    public final jxs a() {
        final jxs jxs = new jxs(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L);
        jxs.m = null;
        jxs.f = null;
        jxs.a = null;
        jxs.c = this.a;
        jxs.b = this.e;
        jxs.e = this.b;
        jxs.h = this.f;
        jxs.i = this.c;
        jxs.j = null;
        jxs.k = null;
        jxs.l = false;
        jxs.n = this.g;
        jxs.o = false;
        jxs.p = 0L;
        return jxs;
    }
}
