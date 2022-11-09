// 
// Decompiled by Procyon v0.6.0
// 

public final class fbq
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    
    public fbq() {
        this.a = false;
        this.b = false;
        this.c = false;
    }
    
    public fbq(final fbp fbp) {
        final float n = fbp.c * 360.0f / fbp.e;
        final float n2 = fbp.d * 180.0f / fbp.f;
        final boolean b = fbp.b;
        final boolean b2 = true;
        this.a = (b && !fbp.g && (n >= 70.0f || n2 >= 70.0f));
        this.b = (!fbp.g && n == 360.0f && b2);
        this.c = fbp.h;
    }
}
