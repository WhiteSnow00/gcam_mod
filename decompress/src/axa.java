import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axa implements awr
{
    public final bel a;
    
    public axa(final InputStream inputStream, final azi azi) {
        (this.a = new bel(inputStream, azi)).mark(5242880);
    }
    
    @Override
    public final void b() {
        this.a.b();
    }
    
    public final InputStream c() {
        this.a.reset();
        return this.a;
    }
}
