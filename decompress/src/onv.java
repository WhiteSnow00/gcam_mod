// 
// Decompiled by Procyon v0.6.0
// 

public enum onv
{
    a("DOUBLE", 0, onw.d, 1), 
    b("FLOAT", 1, onw.c, 5), 
    c("INT64", 2, onw.b, 0), 
    d("UINT64", 3, onw.b, 0), 
    e("INT32", 4, onw.a, 0), 
    f("FIXED64", 5, onw.b, 1), 
    g("FIXED32", 6, onw.a, 5), 
    h("BOOL", 7, onw.e, 0), 
    i("STRING", 8, onw.f, 2), 
    j("GROUP", 9, onw.i, 3), 
    k("MESSAGE", 10, onw.i, 2), 
    l("BYTES", 11, onw.g, 2), 
    m("UINT32", 12, onw.a, 0), 
    n("ENUM", 13, onw.h, 0), 
    o("SFIXED32", 14, onw.a, 5), 
    p("SFIXED64", 15, onw.b, 1), 
    q("SINT32", 16, onw.a, 0), 
    r("SINT64", 17, onw.b, 0);
    
    public final onw s;
    public final int t;
    
    private onv(final String s, final int n, final onw s2, final int t) {
        this.s = s2;
        this.t = t;
    }
}
