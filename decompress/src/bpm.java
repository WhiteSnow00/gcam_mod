// 
// Decompiled by Procyon v0.6.0
// 

public final class bpm implements bor
{
    public final klv a;
    public final klv b;
    public final byz c;
    private final hjl d;
    private final cxl e;
    private final klv f;
    
    public bpm(final hjl d, final byz c, final cxl e, final klv f, final byte[] array) {
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.a = new kkz(0);
        this.b = new kkz(false);
    }
    
    @Override
    public final klj a() {
        return klq.d(this.b, this.f);
    }
    
    @Override
    public final klv b() {
        return this.a;
    }
    
    @Override
    public final boolean c() {
        throw null;
    }
    
    final bpl d(final lfj lfj) {
        final hjl d = this.d;
        final String value = String.valueOf(lfj.a);
        String concat;
        if (value.length() != 0) {
            concat = "pref_camera_dirty_lens_history_key".concat(value);
        }
        else {
            concat = new String("pref_camera_dirty_lens_history_key");
        }
        return new bpl(d.c(concat, ""), this.e);
    }
}
