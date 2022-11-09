// 
// Decompiled by Procyon v0.6.0
// 

public enum hjh
{
    a("RES_1080P", 0, kmv.h), 
    b("RES_2160P", 1, kmv.i);
    
    public final kmv c;
    
    private hjh(final String s, final int n, final kmv c) {
        this.c = c;
    }
    
    public static hjh a(final String s) {
        return Enum.valueOf(hjh.class, s);
    }
    
    public static niz b(final kmv kmv) {
        final hjb a = hjb.a;
        final kmv a2 = kmv.a;
        switch (kmv.ordinal()) {
            default: {
                return nii.a;
            }
            case 8: {
                return niz.i(hjh.b);
            }
            case 7: {
                return niz.i(hjh.a);
            }
        }
    }
}
