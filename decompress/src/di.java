import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class di extends dd
{
    public final ArrayList al;
    
    public di() {
        this.al = new ArrayList();
    }
    
    public void D() {
        this.r();
        final ArrayList al = this.al;
        if (al == null) {
            return;
        }
        for (int size = al.size(), i = 0; i < size; ++i) {
            final dd dd = this.al.get(i);
            if (dd instanceof di) {
                ((di)dd).D();
            }
        }
    }
    
    public final void F(final dd dd) {
        this.al.remove(dd);
        dd.r = null;
    }
    
    @Override
    public void i() {
        this.al.clear();
        super.i();
    }
    
    @Override
    public final void j(final cx cx) {
        super.j(cx);
        for (int size = this.al.size(), i = 0; i < size; ++i) {
            ((dd)this.al.get(i)).j(cx);
        }
    }
    
    @Override
    public final void o(int i, int size) {
        super.o(i, size);
        for (size = this.al.size(), i = 0; i < size; ++i) {
            this.al.get(i).o(super.w + super.A, super.x + super.B);
        }
    }
    
    @Override
    public final void r() {
        super.r();
        final ArrayList al = this.al;
        if (al == null) {
            return;
        }
        for (int size = al.size(), i = 0; i < size; ++i) {
            final dd dd = this.al.get(i);
            dd.o(this.b(), this.c());
            if (!(dd instanceof de)) {
                dd.r();
            }
        }
    }
}
