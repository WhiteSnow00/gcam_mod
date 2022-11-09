// 
// Decompiled by Procyon v0.6.0
// 

public final class itx
{
    public final itw a;
    
    public itx(final itw a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.e(true);
    }
    
    public final void b() {
        this.a.e(false);
    }
    
    public final void c(final String text, final String contentDescription) {
        this.a.e.setText((CharSequence)text);
        this.a.e.setContentDescription((CharSequence)contentDescription);
    }
}
