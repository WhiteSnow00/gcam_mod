import android.os.Looper;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class adu
{
    public int b;
    public final Context c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ado h;
    
    public adu(final Context context) {
        this.d = false;
        this.e = false;
        this.f = true;
        this.g = false;
        this.c = context.getApplicationContext();
    }
    
    public static final String j(final Object o) {
        final StringBuilder sb = new StringBuilder(64);
        if (o == null) {
            sb.append("null");
        }
        else {
            sb.append(o.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(o)));
            sb.append("}");
        }
        return sb.toString();
    }
    
    @Deprecated
    public void b(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.h);
        if (this.d || this.g) {
            printWriter.print(s);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (!this.e && !this.f) {
            return;
        }
        printWriter.print(s);
        printWriter.print("mAbandoned=");
        printWriter.print(this.e);
        printWriter.print(" mReset=");
        printWriter.println(this.f);
    }
    
    protected void d() {
    }
    
    public void f() {
        throw null;
    }
    
    public void g(final Object o) {
        final ado h = this.h;
        if (h != null) {
            if (adn.c(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(h);
                sb.toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                h.g(o);
                return;
            }
            h.h(o);
        }
    }
    
    public void h() {
    }
    
    public void i() {
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
