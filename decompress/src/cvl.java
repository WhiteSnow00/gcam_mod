// 
// Decompiled by Procyon v0.6.0
// 

final class cvl implements cwr
{
    final /* synthetic */ cvn a;
    private final /* synthetic */ int b;
    
    public cvl(final cvn a) {
        this.a = a;
    }
    
    public cvl(final cvn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean a() {
        final int b = this.b;
        boolean b2 = false;
        switch (b) {
            default: {
                if (this.a.c.g()) {
                    final float a = ((cvm)this.a.c.c()).a;
                    final float b3 = ((cvm)this.a.c.c()).b;
                    final boolean c = ((cvm)this.a.c.c()).c;
                    if (cvn.a.contains((Comparable)Math.toDegrees(a)) && Math.abs(Math.toDegrees(b3)) <= 10.0) {
                        if (!c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            case 0: {
                if (this.a.c.g()) {
                    final float a2 = ((cvm)this.a.c.c()).a;
                    final float b4 = ((cvm)this.a.c.c()).b;
                    final boolean c2 = ((cvm)this.a.c.c()).c;
                    if (Math.abs(Math.toDegrees(a2)) < 45.0 && Math.abs(Math.toDegrees(b4)) < 45.0 && !c2) {
                        return false;
                    }
                    b2 = true;
                }
                return b2;
            }
        }
    }
}
