// 
// Decompiled by Procyon v0.6.0
// 

public final class lik extends lim
{
    public double a;
    public double b;
    public double c;
    public double d;
    public double e;
    
    public lik(final double n) {
        this.a = 1.0;
        this.b = n;
        this.c = n;
        this.d = n;
        this.e = n;
    }
    
    @Override
    public final lim a() {
        final lik lik = new lik(this.e);
        lik.a = this.a;
        lik.b = this.b;
        lik.c = this.c;
        lik.d = this.d;
        lik.e = this.e;
        return lik;
    }
}
