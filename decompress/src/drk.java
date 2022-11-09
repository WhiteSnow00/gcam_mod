// 
// Decompiled by Procyon v0.6.0
// 

public enum drk
{
    a("NONE", 0, jlf.a, 2131952402, 2131952401, 2131231454), 
    b("PANORAMA", 1, jlf.a, 2131952383, 2131952378, 2131231559), 
    c("PHOTOSPHERE", 2, jlf.a, 2131952419, 2131952416, 2131231592), 
    d("BURSTS", 3, jlf.a, 2131951772, 2131951771, 2131231451), 
    e("PORTRAIT", 4, jlf.a, 2131952429, 2131952428, 2131231517), 
    f("NIGHT", 5, jlf.a, 2131951889, 2131951887, 2131231227), 
    g("TIMELAPSE", 6, jlf.a, 2131952289, 2131951846, 2131231469), 
    h("LASAGNA", 7, jlf.a, 2131952157, 2131952156, 2131231469), 
    i("CINEMATIC", 8, jlf.a, 2131951848, 2131951847, 2131231537), 
    j("DOGFOOD_ONLY", 9, jlf.a, 2131951922, 2131951921, 2131231463);
    
    public final jlf k;
    public final int l;
    public final int m;
    public final int n;
    
    private drk(final String s, final int n, final jlf k, final int l, final int m, final int n2) {
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n2;
        e(m, "description");
        e(n2, "icon");
        e(l, "name");
        if (k.equals(jlf.a)) {
            d(true, "Action activity must be null");
            d(true, "Action description must be null");
            d(true, "Action promotion message must be null");
            return;
        }
        d(false, "Action activity cannot be null");
        d(false, "Action description cannot be null");
        d(false, "Action promotion message cannot be null");
    }
    
    public static drk a(final String s) {
        return Enum.valueOf(drk.class, s);
    }
    
    public static niz b(final String s) {
        if (njb.d(s)) {
            return nii.a;
        }
        try {
            return niz.h(a(s));
        }
        catch (final IllegalArgumentException ex) {
            final String[] split = s.split("-");
            if (split.length == 2 && split[0].equals("com.google.android.apps.camera.gallery.specialtype.SpecialType")) {
                try {
                    return niz.h(a(split[1]));
                }
                catch (final NullPointerException ex2) {}
                catch (final IllegalArgumentException ex3) {}
                return nii.a;
            }
            return nii.a;
        }
    }
    
    private static void d(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    private static void e(final int n, final String s) {
        d(n != 0, s.concat(" must be a valid resource id"));
    }
    
    public final String c() {
        final String value = String.valueOf(this.name());
        String concat;
        if (value.length() != 0) {
            concat = "com.google.android.apps.camera.gallery.specialtype.SpecialType-".concat(value);
        }
        else {
            concat = new String("com.google.android.apps.camera.gallery.specialtype.SpecialType-");
        }
        return concat;
    }
}
