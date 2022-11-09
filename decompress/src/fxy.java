// 
// Decompiled by Procyon v0.6.0
// 

final class fxy implements Runnable
{
    final /* synthetic */ fxz a;
    private final fxx b;
    
    public fxy(final fxz a, final fxx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        while (true) {
            while (true) {
                try {
                    try {
                        final kse a = this.a.a;
                        final String value = String.valueOf(this.b);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 8);
                        sb.append("Command#");
                        sb.append(value);
                        a.f(sb.toString());
                        this.b.a();
                        final kse kse = this.a.a;
                        kse.g();
                        return;
                    }
                    finally {}
                }
                catch (final Exception ex) {
                    this.a.b.execute(new gcc(ex, 1));
                    final kse kse = this.a.a;
                    continue;
                }
                catch (final InterruptedException ex2) {}
                catch (final kuw kuw) {}
                final kse kse = this.a.a;
                continue;
            }
        }
    }
}
