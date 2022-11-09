// 
// Decompiled by Procyon v0.6.0
// 

public final class nfh
{
    public ney a;
    public ney b;
    public ney c;
    public ney d;
    public nfa e;
    public nfa f;
    public nfa g;
    public nfa h;
    public njo i;
    public njo j;
    public njo k;
    public njo l;
    
    public nfh() {
        this.i = nfa.k();
        this.j = nfa.k();
        this.k = nfa.k();
        this.l = nfa.k();
        this.a = new new(0.0f);
        this.b = new new(0.0f);
        this.c = new new(0.0f);
        this.d = new new(0.0f);
        this.e = nfa.a();
        this.f = nfa.a();
        this.g = nfa.a();
        this.h = nfa.a();
    }
    
    public nfh(final nfi nfi) {
        this.i = nfa.k();
        this.j = nfa.k();
        this.k = nfa.k();
        this.l = nfa.k();
        this.a = new new(0.0f);
        this.b = new new(0.0f);
        this.c = new new(0.0f);
        this.d = new new(0.0f);
        this.e = nfa.a();
        this.f = nfa.a();
        this.g = nfa.a();
        this.h = nfa.a();
        this.i = nfi.i;
        this.j = nfi.j;
        this.k = nfi.k;
        this.l = nfi.l;
        this.a = nfi.a;
        this.b = nfi.b;
        this.c = nfi.c;
        this.d = nfi.d;
        this.e = nfi.e;
        this.f = nfi.f;
        this.g = nfi.g;
        this.h = nfi.h;
    }
    
    public static void b(final njo njo) {
        if (njo instanceof nfg) {
            final nfg nfg = (nfg)njo;
            return;
        }
        if (njo instanceof nez) {
            final nez nez = (nez)njo;
        }
    }
    
    public final nfi a() {
        return new nfi(this);
    }
}
