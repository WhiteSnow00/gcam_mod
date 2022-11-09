// 
// Decompiled by Procyon v0.6.0
// 

public enum okq
{
    A("STRING_LIST", 26, 26, 2, olo.g), 
    B("MESSAGE_LIST", 27, 27, 2, olo.j), 
    C("BYTES_LIST", 28, 28, 2, olo.h), 
    D("UINT32_LIST", 29, 29, 2, olo.b), 
    E("ENUM_LIST", 30, 30, 2, olo.i), 
    F("SFIXED32_LIST", 31, 31, 2, olo.b), 
    G("SFIXED64_LIST", 32, 32, 2, olo.c), 
    H("SINT32_LIST", 33, 33, 2, olo.b), 
    I("SINT64_LIST", 34, 34, 2, olo.c), 
    J("DOUBLE_LIST_PACKED", 35, 35, 3, olo.e), 
    K("FLOAT_LIST_PACKED", 36, 36, 3, olo.d), 
    L("INT64_LIST_PACKED", 37, 37, 3, olo.c), 
    M("UINT64_LIST_PACKED", 38, 38, 3, olo.c), 
    N("INT32_LIST_PACKED", 39, 39, 3, olo.b), 
    O("FIXED64_LIST_PACKED", 40, 40, 3, olo.c), 
    P("FIXED32_LIST_PACKED", 41, 41, 3, olo.b), 
    Q("BOOL_LIST_PACKED", 42, 42, 3, olo.f), 
    R("UINT32_LIST_PACKED", 43, 43, 3, olo.b), 
    S("ENUM_LIST_PACKED", 44, 44, 3, olo.i), 
    T("SFIXED32_LIST_PACKED", 45, 45, 3, olo.b), 
    U("SFIXED64_LIST_PACKED", 46, 46, 3, olo.c), 
    V("SINT32_LIST_PACKED", 47, 47, 3, olo.b), 
    W("SINT64_LIST_PACKED", 48, 48, 3, olo.c), 
    X("GROUP_LIST", 49, 49, 2, olo.j), 
    Y("MAP", 50, 50, 4, olo.a), 
    a("DOUBLE", 0, 0, 1, olo.e);
    
    private static final okq[] aa;
    
    b("FLOAT", 1, 1, 1, olo.d), 
    c("INT64", 2, 2, 1, olo.c), 
    d("UINT64", 3, 3, 1, olo.c), 
    e("INT32", 4, 4, 1, olo.b), 
    f("FIXED64", 5, 5, 1, olo.c), 
    g("FIXED32", 6, 6, 1, olo.b), 
    h("BOOL", 7, 7, 1, olo.f), 
    i("STRING", 8, 8, 1, olo.g), 
    j("MESSAGE", 9, 9, 1, olo.j), 
    k("BYTES", 10, 10, 1, olo.h), 
    l("UINT32", 11, 11, 1, olo.b), 
    m("ENUM", 12, 12, 1, olo.i), 
    n("SFIXED32", 13, 13, 1, olo.b), 
    o("SFIXED64", 14, 14, 1, olo.c), 
    p("SINT32", 15, 15, 1, olo.b), 
    q("SINT64", 16, 16, 1, olo.c), 
    r("GROUP", 17, 17, 1, olo.j), 
    s("DOUBLE_LIST", 18, 18, 2, olo.e), 
    t("FLOAT_LIST", 19, 19, 2, olo.d), 
    u("INT64_LIST", 20, 20, 2, olo.c), 
    v("UINT64_LIST", 21, 21, 2, olo.c), 
    w("INT32_LIST", 22, 22, 2, olo.b), 
    x("FIXED64_LIST", 23, 23, 2, olo.c), 
    y("FIXED32_LIST", 24, 24, 2, olo.b), 
    z("BOOL_LIST", 25, 25, 2, olo.f);
    
    public final int Z;
    
    static {
        final okq[] values = values();
        final int length = values.length;
        aa = new okq[length];
        for (final okq okq : values) {
            okq.aa[okq.Z] = okq;
        }
    }
    
    private okq(final String s, final int n, final int z, final int n2, final olo olo) {
        this.Z = z;
        final olo a = olo.a;
        switch (n2 - 1) {
            case 1:
            case 3: {
                final Class k = olo.k;
                break;
            }
        }
        if (n2 == 1) {
            olo.ordinal();
        }
    }
}
