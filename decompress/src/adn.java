import java.lang.reflect.Modifier;
import android.os.Looper;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adn
{
    public final adr a;
    private final k b;
    
    public adn() {
    }
    
    public adn(final k b, final ac ac) {
        this.b = b;
        this.a = (adr)a.a(adr.class, adr.c, ac);
    }
    
    public static adn a(final k k) {
        return new adn(k, ((ad)k).bg());
    }
    
    public static boolean c(final int n) {
        return Log.isLoggable("LoaderManager", n);
    }
    
    @Deprecated
    public final void b(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final adr a = this.a;
        if (a.d.b() > 0) {
            printWriter.print(s);
            printWriter.println("Loaders:");
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("    ");
            final String string = sb.toString();
            for (int i = 0; i < a.d.b(); ++i) {
                final ado ado = (ado)a.d.e(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(a.d.a(i));
                printWriter.print(": ");
                printWriter.println(ado.toString());
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(ado.j);
                printWriter.print(" mArgs=");
                Object o = null;
                printWriter.println((Object)null);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println(ado.k);
                final adu k = ado.k;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append("  ");
                k.b(sb2.toString(), fileDescriptor, printWriter, array);
                if (ado.l != null) {
                    printWriter.print(string);
                    printWriter.print("mCallbacks=");
                    printWriter.println(ado.l);
                    final adp l = ado.l;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append("  ");
                    printWriter.print(sb3.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(l.c);
                }
                printWriter.print(string);
                printWriter.print("mData=");
                final adu j = ado.k;
                final Object f = ado.f;
                if (f != s.a) {
                    o = f;
                }
                printWriter.println(adu.j(o));
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.println(ado.d > 0);
            }
        }
    }
    
    public final void d(final int n, final adm adm) {
        if (this.a.e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            final ado b = this.a.b(n);
            if (c(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append((Object)null);
                sb.toString();
            }
            if (b == null) {
                try {
                    this.a.e = true;
                    final adu a = adm.a();
                    if (a.getClass().isMemberClass() && !Modifier.isStatic(a.getClass().getModifiers())) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb2.append(a);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    final ado ado = new ado(n, a);
                    if (c(3)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("  Created new loader ");
                        sb3.append(ado);
                        sb3.toString();
                    }
                    this.a.d.g(n, ado);
                    this.a.c();
                    ado.k(this.b, adm);
                    return;
                }
                finally {
                    this.a.c();
                }
            }
            if (c(3)) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("  Re-using existing loader ");
                sb4.append(b);
                sb4.toString();
            }
            b.k(this.b, adm);
            return;
        }
        throw new IllegalStateException("initLoader must be called on the main thread");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.b)));
        sb.append("}}");
        return sb.toString();
    }
}
