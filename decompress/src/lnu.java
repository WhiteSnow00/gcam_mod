import android.accounts.Account;
import android.content.Context;
import android.accounts.AccountManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnu
{
    public static final lnu a;
    private final Object b;
    private final lnt[] c;
    private volatile lny d;
    
    static {
        a = new lnu();
    }
    
    private lnu() {
        this.b = new Object();
        final ood[] values = ood.values();
        final int length = values.length;
        final int n = 0;
        int i = 0;
        int max = 0;
        while (i < length) {
            max = Math.max(max, values[i].v);
            ++i;
        }
        this.c = new lnt[max + 1];
        final ood[] values2 = ood.values();
        for (int length2 = values2.length, j = n; j < length2; ++j) {
            final ood ood = values2[j];
            switch (ood.ordinal()) {
                case 1:
                case 13:
                case 14:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20: {
                    this.c[ood.v] = new lnt();
                    this.c[ood.v].a = nns.l();
                    break;
                }
            }
        }
    }
    
    public final lns a(final ood ood, final lne a) {
        final ood a2 = ood.a;
        final int ordinal = ood.ordinal();
        final int n = 0;
        int i = 0;
        switch (ordinal) {
            default: {
                final lnt lnt = this.c[ood.v];
                lns a3 = null;
                if (lnt != null) {
                    final nns a4 = lnt.a;
                    for (int c = ((nql)a4).c, j = n; j < c; ++j) {
                        final lnr lnr = a4.get(j);
                        final niz a5 = lnr.b().a();
                        if (!a5.g() || ((nns)a5.c()).isEmpty()) {
                            a3 = lnr.a();
                            break;
                        }
                    }
                }
                if (a3 != null) {
                    return a3;
                }
                return lno.a;
            }
            case 12: {
                return lno.b;
            }
            case 11: {
                return lno.b;
            }
            case 10: {
                return lno.b;
            }
            case 8: {
                return lno.b;
            }
            case 7: {
                return lno.b;
            }
            case 6: {
                return lno.b;
            }
            case 5: {
                return lno.b;
            }
            case 4: {
                pqf.j(new lnz().a = a, lne.class);
                return new lno(2);
            }
            case 3: {
                if (a.d) {
                    final AccountManager value = AccountManager.get(a.a);
                    try {
                        for (Account[] accountsByType = value.getAccountsByType("com.google"); i < accountsByType.length; ++i) {
                            final Account account = accountsByType[i];
                            if (account.name != null && account.type != null && account.name.endsWith("@google.com")) {
                                return lno.b;
                            }
                        }
                    }
                    catch (final SecurityException ex) {}
                }
                if (this.d == null) {
                    synchronized (this.b) {
                        if (this.d == null) {
                            final lnx lnx = new lnx();
                            final Context applicationContext = a.a.getApplicationContext();
                            applicationContext.getClass();
                            pqf.j(lnx.a = applicationContext, Context.class);
                            this.d = new lny(lnx.a);
                        }
                    }
                }
                return (lob)this.d.a.get();
            }
            case 2: {
                return lno.b;
            }
            case 0: {
                return lno.a;
            }
        }
    }
}
