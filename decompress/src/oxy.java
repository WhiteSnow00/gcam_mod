// 
// Decompiled by Procyon v0.6.0
// 

public final class oxy extends RuntimeException
{
    private static final long serialVersionUID = -6298857009889503852L;
    
    public oxy(final Throwable t) {
        final String value = String.valueOf(t);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 168);
        sb.append("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(value);
        final String string = sb.toString();
        Throwable t2 = t;
        if (t == null) {
            t2 = new NullPointerException();
        }
        super(string, t2);
    }
}
