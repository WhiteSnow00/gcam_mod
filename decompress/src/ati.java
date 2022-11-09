// 
// Decompiled by Procyon v0.6.0
// 

public enum ati
{
    a("NO_SCENE_MODE", 0), 
    b("AUTO", 1), 
    c("ACTION", 2), 
    d("BARCODE", 3), 
    e("BEACH", 4), 
    f("CANDLELIGHT", 5), 
    g("FIREWORKS", 6), 
    h("HDR", 7), 
    i("LANDSCAPE", 8), 
    j("NIGHT", 9), 
    k("NIGHT_PORTRAIT", 10), 
    l("PARTY", 11), 
    m("PORTRAIT", 12), 
    n("SNOW", 13), 
    o("SPORTS", 14), 
    p("STEADYPHOTO", 15), 
    q("SUNSET", 16), 
    r("THEATRE", 17);
    
    private ati(final String s, final int n) {
    }
    
    public static ati a(final String s) {
        return Enum.valueOf(ati.class, s);
    }
}
