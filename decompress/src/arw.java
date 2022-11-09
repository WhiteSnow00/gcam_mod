// 
// Decompiled by Procyon v0.6.0
// 

final class arw implements Runnable
{
    final /* synthetic */ byte[] a;
    final /* synthetic */ arx b;
    
    public arw(final arx b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final esl a = this.b.a;
        final byte[] a2 = this.a;
        final ess a3 = a.a;
        if (!a3.s) {
            a3.b.c();
            final ess a4 = a.a;
            if (a4.t) {
                final esv b = a4.b;
                b.C = a2;
                b.z = true;
                final ers c = a4.c;
                if (c.c) {
                    c.b.i(a2);
                }
            }
        }
    }
}
