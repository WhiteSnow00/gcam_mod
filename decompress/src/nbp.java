import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbp
{
    private final ork a;
    
    public nbp(final ork a) {
        a.getClass();
        this.a = a;
    }
    
    public final oxc a(final oqw oqw, final String s, final String s2) {
        ore ore;
        if (s != null) {
            final pqf a = this.a.a;
            ore = new ore(s, "PUT", null, oqw, true);
        }
        else {
            final oqy oqy = new oqy();
            oqy.d("X-Goog-Upload-Header-Content-Length", String.valueOf(oqw.d()));
            final ork a2 = this.a;
            final boolean h = nov.H("POST", "put");
            boolean b = true;
            if (!h) {
                if (!nov.H("POST", "post")) {
                    b = false;
                }
            }
            njo.d(b);
            final pqf a3 = a2.a;
            ore = new ore(s2, "POST", oqy, oqw, false);
        }
        final nte a4 = nbq.a;
        final nbn nbn = new nbn(ore);
        ore.g(nbn, 4194304, 250);
        final oez a5 = oez.a(new orc(ore));
        final ofp ofp = new ofp();
        ofp.c("Scotty-Uploader-ResumableTransfer-%d");
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(ofp.b(ofp));
        singleThreadExecutor.submit(a5);
        singleThreadExecutor.shutdown();
        a5.d(new nbo(oqw), odx.a);
        final oxc a6 = nbn.a;
        a6.getClass();
        return a6;
    }
}
