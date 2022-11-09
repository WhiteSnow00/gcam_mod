import java.util.concurrent.Executor;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlh extends mlf implements mgx, mlc
{
    static {
        noi.M("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    }
    
    public mlh(final mgv mgv, final oui oui, final pii pii, final mma mma) {
        new ConcurrentHashMap();
        mgv.a(odx.a, oui, pii);
        nov.F(new mlg(mma, oui));
    }
}
