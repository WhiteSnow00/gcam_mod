import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class kli implements klj
{
    public final List a;
    
    public kli(final Collection collection) {
        this.a = nns.j(collection);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        if (this.a.isEmpty()) {
            executor.execute(new kle(kri));
            return new kqz();
        }
        final klh klh = new klh(this, kri, executor);
        final kjk kjk = new kjk();
        final klw klw = new klw();
        for (int i = 0; i < this.a.size(); ++i) {
            kjk.c(((klj)this.a.get(i)).a(new klg(klh, i), klw));
        }
        return kjk;
    }
}
