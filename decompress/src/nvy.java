// 
// Decompiled by Procyon v0.6.0
// 

final class nvy implements nvx
{
    public nvy() {
    }
    
    private static final int c(final StackTraceElement[] array, final Class clazz) {
        final String name = clazz.getName();
        int n = 0;
        int n2;
        for (int i = 3; i < array.length; ++i, n = n2) {
            if (array[i].getClassName().equals(name)) {
                n2 = 1;
            }
            else if ((n2 = n) != 0) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final StackTraceElement a(final Class clazz) {
        oce.h(true, "skipFrames must be >= 0");
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final int c = c(stackTrace, clazz);
        if (c != -1) {
            return stackTrace[c];
        }
        return null;
    }
    
    @Override
    public final StackTraceElement[] b(final Class clazz, int n) {
        oce.h(n == -1 || n > 0, "maxDepth must be > 0 or -1");
        oce.h(true, "skipFrames must be >= 0");
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final int c = c(stackTrace, clazz);
        if (c == -1) {
            return new StackTraceElement[0];
        }
        final int n2 = stackTrace.length - c;
        if (n <= 0 || n >= n2) {
            n = n2;
        }
        final StackTraceElement[] array = new StackTraceElement[n];
        System.arraycopy(stackTrace, c, array, 0, n);
        return array;
    }
}
