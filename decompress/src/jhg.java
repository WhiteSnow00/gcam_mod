import java.util.Iterator;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhg
{
    private static final Duration d;
    public String a;
    public final krr b;
    public final jqt c;
    private final Executor e;
    private final Executor f;
    private final jqt g;
    private final jqt h;
    
    static {
        d = Duration.ofSeconds(1L);
    }
    
    public jhg(final Executor e, final krr krr, final jqt c, final jqt g, final jqt h) {
        this.a = null;
        this.f = Executors.newSingleThreadExecutor();
        this.e = e;
        this.b = krr.a("WearMessageUtil");
        this.c = c;
        this.g = g;
        this.h = h;
    }
    
    private final Set f() {
        final ofn f = ofn.f();
        Object j = this.g.j;
        jvu.b(true);
        final kga kga = new kga((jqw)j);
        ((jqw)j).b(kga);
        jvu.k(kga, khs.b).g(this.f, new jhd(this, f, 1));
        try {
            j = f.get(jhg.d.getSeconds(), TimeUnit.SECONDS);
            return (Set)j;
        }
        catch (final TimeoutException j) {}
        catch (final ExecutionException j) {}
        catch (final InterruptedException ex) {}
        this.b.i("Failed to getNodesByCapabilitySync.", (Throwable)j);
        return null;
    }
    
    public final String a() {
        final Set f = this.f();
        String a = null;
        if (f != null && !f.isEmpty()) {
            final Iterator iterator = f.iterator();
            String s;
            while (true) {
                s = a;
                if (!iterator.hasNext()) {
                    break;
                }
                final khw khw = (khw)iterator.next();
                final krr b = this.b;
                final String value = String.valueOf(khw.a);
                String concat;
                if (value.length() != 0) {
                    concat = "Check node: ".concat(value);
                }
                else {
                    concat = new String("Check node: ");
                }
                b.b(concat);
                if (TextUtils.isEmpty((CharSequence)khw.a)) {
                    continue;
                }
                s = (a = khw.a);
                if (khw.d) {
                    break;
                }
            }
            final krr b2 = this.b;
            final String value2 = String.valueOf(s);
            String concat2;
            if (value2.length() != 0) {
                concat2 = "Found node: ".concat(value2);
            }
            else {
                concat2 = new String("Found node: ");
            }
            b2.b(concat2);
            return s;
        }
        this.b.b("findBestNode failed!");
        return null;
    }
    
    public final void b(final String s, final Runnable runnable) {
        this.e.execute(new jhf(this, s, runnable));
    }
    
    public final boolean c() {
        final ofn f = ofn.f();
        final jqw j = this.h.j;
        final khu khu = new khu(j);
        j.b(khu);
        jvu.k(khu, khs.c).g(this.f, new jhd(this, f));
        try {
            return (boolean)f.get(jhg.d.getSeconds(), TimeUnit.SECONDS);
        }
        catch (final TimeoutException f) {}
        catch (final ExecutionException f) {}
        catch (final InterruptedException ex) {}
        this.b.i("Failed to process isWearDeviceExistSync.", (Throwable)f);
        return false;
    }
    
    public final void d(final String s, final byte[] array) {
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            this.a = this.a();
        }
        final String a = this.a;
        if (TextUtils.isEmpty((CharSequence)a)) {
            return;
        }
        this.e(a, s, array);
    }
    
    final void e(String ex, final String s, final byte[] array) {
        final ofn f = ofn.f();
        final jqw j = this.c.j;
        final kho kho = new kho(j, (String)ex, s, array);
        j.b(kho);
        jvu.k(kho, khs.a).g(this.e, new jhe(this, f, s));
        final krr b = this.b;
        final String value = String.valueOf(f);
        ex = (TimeoutException)new StringBuilder(String.valueOf(s).length() + 15 + String.valueOf(value).length());
        ((StringBuilder)ex).append("Message:");
        ((StringBuilder)ex).append(s);
        ((StringBuilder)ex).append(" sent: ");
        ((StringBuilder)ex).append(value);
        b.b(((StringBuilder)ex).toString());
        try {
            ex = (TimeoutException)f.get(jhg.d.getSeconds(), TimeUnit.SECONDS);
            return;
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        this.b.i("Failed to sendMessage.", ex);
    }
}
