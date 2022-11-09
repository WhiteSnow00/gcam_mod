import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btg
{
    public static void a(final kjk kjk, final Future future) {
        kjk.c(new hlr(future, 1));
    }
    
    public static boolean b(final int n, final int n2, final int n3) {
        return n / n3 % 2 == 0 && n2 / n3 % 2 == 0;
    }
}
