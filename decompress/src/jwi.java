import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwi extends jqt implements jwa
{
    private static final jqp a;
    private static final lio b;
    
    static {
        a = new jqp("ClientTelemetry.API", b = new jwh(), null, null);
    }
    
    public jwi(final Context context, final jwb jwb) {
        super(context, jwi.a, jwb, jqs.a);
    }
    
    @Override
    public final void a(final jvz jvz) {
        final jtt a = jtu.a();
        a.c = new jpu[] { jpr.a };
        a.b = false;
        a.a = new jwg(jvz);
        super.d(2, a.a());
    }
}
