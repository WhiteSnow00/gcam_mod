import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myl implements kdy
{
    final /* synthetic */ mys a;
    final /* synthetic */ myz b;
    final /* synthetic */ pbw c;
    
    public myl(final mys a, final pbw c, final myz b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void a(final keg keg) {
        final boolean e = keg.e();
        final Throwable t = null;
        final piu piu = null;
        if (e) {
            final GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount)keg.c();
            googleSignInAccount.getClass();
            final String b = googleSignInAccount.b;
            piu a;
            if (b != null) {
                final pbw c = this.c;
                final muo muo = new muo(b, googleSignInAccount.d, googleSignInAccount.e, googleSignInAccount.f);
                if (c.get() != oyj.a) {
                    final oxp oxp = c.getAndSet(oyj.a);
                    if (oxp != oyj.a) {
                        try {
                            c.a.a(muo);
                            if (oxp != null) {
                                oxp.bX();
                            }
                        }
                        finally {
                            if (oxp != null) {
                                oxp.bX();
                            }
                        }
                    }
                }
                a = piu.a;
            }
            else {
                a = piu;
            }
            if (a != null) {
                return;
            }
            final ozp ozp = new ozp(new myq(this.a, this.b));
            pip.i();
            final myj myj = new myj(this);
            final myk myk = new myk(this);
            if (myj == phw.a && myk == phw.b) {
                ozp.i(new ozi());
                return;
            }
            if (myj != phw.a) {
                oyb c2;
                if (myk == phw.b) {
                    c2 = oyw.c;
                }
                else {
                    c2 = new phu(myk);
                }
                ozp.i(new ozh(new phv(myj), c2));
                return;
            }
            ozp.i(new ozh(new phu(myk)));
        }
        else {
            Exception b2;
            if (!((b2 = keg.b()) instanceof jqq)) {
                b2 = null;
            }
            final jqq jqq = (jqq)b2;
            if (jqq != null && jqq.a() == 4) {
                final mza b3 = this.a.b;
                final myz b4 = this.b;
                final Exception b5 = keg.b();
                Throwable cause;
                if (b5 != null) {
                    cause = b5.getCause();
                }
                else {
                    cause = t;
                }
                b3.a(myz.c(b4, 15, cause));
                this.c.b();
                return;
            }
            this.a.b.a(myz.c(this.b, 16, keg.b()));
            final pbw c3 = this.c;
            Exception b6;
            if ((b6 = keg.b()) == null) {
                b6 = new IllegalStateException("Unknown F250Authenticator error");
            }
            c3.c(b6);
        }
    }
}
