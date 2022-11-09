import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class hug implements huh
{
    public List a;
    
    public hug() {
        this.a = null;
    }
    
    public final void a(final huq... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final hup hup = new hup(array[i]);
            if (this.a == null) {
                this.a = new ArrayList();
            }
            this.a.add(hup);
        }
    }
    
    public void b() {
    }
    
    public void c() {
    }
    
    public void d() {
    }
    
    @Override
    public void f() {
        final List a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                ((hui)iterator.next()).f();
            }
        }
    }
    
    @Override
    public void g() {
        final List a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                ((hui)iterator.next()).g();
            }
        }
    }
    
    public void i() {
    }
}
