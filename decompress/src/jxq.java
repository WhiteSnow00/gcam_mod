import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxq
{
    public static final jqp a;
    private static final lio b;
    
    static {
        new Status(13);
        a = new jqp("Feedback.API", b = new jxm(), null, null);
    }
    
    @Deprecated
    public static jqz a(final jqw jqw, final jxs jxs) {
        final jxo jxo = new jxo(jqw, jxs);
        jqw.b(jxo);
        return jxo;
    }
    
    @Deprecated
    public static jqz b(final jqw jqw, final jxs jxs) {
        System.nanoTime();
        final jqt a = ((jsr)jqw).a;
        final jxn jxn = new jxn(jqw, jxs);
        jqw.b(jxn);
        return jxn;
    }
}
