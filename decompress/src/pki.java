// 
// Decompiled by Procyon v0.6.0
// 

public final class pki
{
    static {
        final String property = System.getProperty("java.specification.version");
        final int n = 65542;
        int n2 = 0;
        Label_0133: {
            Label_0131: {
                if (property != null) {
                    final int m = plr.m(property, '.', 0, 6);
                    if (m < 0) {
                        try {
                            n2 = Integer.parseInt(property) * 65536;
                            break Label_0133;
                        }
                        catch (final NumberFormatException ex) {
                            break Label_0131;
                        }
                    }
                    final int n3 = m + 1;
                    int n4;
                    if ((n4 = plr.m(property, '.', n3, 4)) < 0) {
                        n4 = property.length();
                    }
                    final String substring = property.substring(0, m);
                    substring.getClass();
                    final String substring2 = property.substring(n3, n4);
                    substring2.getClass();
                    try {
                        n2 = Integer.parseInt(substring) * 65536 + Integer.parseInt(substring2);
                    }
                    catch (final NumberFormatException ex2) {
                        n2 = n;
                    }
                    break Label_0133;
                }
            }
            n2 = n;
        }
        if (n2 >= 65544) {
            try {
                final Object instance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                instance.getClass();
                if (instance != null) {
                    Label_0184: {
                        try {
                            final pkh pkh = (pkh)instance;
                            return;
                        }
                        catch (final ClassCastException ex3) {
                            break Label_0184;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    final ClassLoader classLoader = ((pkh)instance).getClass().getClassLoader();
                    final ClassLoader classLoader2 = pkh.class.getClassLoader();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Instance classloader: ");
                    sb.append(classLoader);
                    sb.append(", base type classloader: ");
                    sb.append(classLoader2);
                    final ClassCastException ex3;
                    final Throwable initCause = new ClassCastException(sb.toString()).initCause(ex3);
                    initCause.getClass();
                    throw initCause;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            catch (final ClassNotFoundException ex4) {
                try {
                    final Object instance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    instance2.getClass();
                    if (instance2 != null) {
                        Label_0319: {
                            try {
                                final pkh pkh2 = (pkh)instance2;
                                return;
                            }
                            catch (final ClassCastException ex5) {
                                break Label_0319;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        final ClassLoader classLoader3 = ((pkh)instance2).getClass().getClassLoader();
                        final ClassLoader classLoader4 = pkh.class.getClassLoader();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Instance classloader: ");
                        sb2.append(classLoader3);
                        sb2.append(", base type classloader: ");
                        sb2.append(classLoader4);
                        final ClassCastException ex5;
                        final Throwable initCause2 = new ClassCastException(sb2.toString()).initCause(ex5);
                        initCause2.getClass();
                        throw initCause2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                catch (final ClassNotFoundException ex6) {}
            }
        }
        if (n2 >= 65543) {
            try {
                final Object instance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                instance3.getClass();
                if (instance3 != null) {
                    Label_0461: {
                        try {
                            final pkh pkh3 = (pkh)instance3;
                            return;
                        }
                        catch (final ClassCastException ex7) {
                            break Label_0461;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    final ClassLoader classLoader5 = ((pkh)instance3).getClass().getClassLoader();
                    final ClassLoader classLoader6 = pkh.class.getClassLoader();
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Instance classloader: ");
                    sb3.append(classLoader5);
                    sb3.append(", base type classloader: ");
                    sb3.append(classLoader6);
                    final ClassCastException ex7;
                    final Throwable initCause3 = new ClassCastException(sb3.toString()).initCause(ex7);
                    initCause3.getClass();
                    throw initCause3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            catch (final ClassNotFoundException ex8) {
                try {
                    final Object instance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    instance4.getClass();
                    if (instance4 != null) {
                        Label_0592: {
                            try {
                                final pkh pkh4 = (pkh)instance4;
                                return;
                            }
                            catch (final ClassCastException ex9) {
                                break Label_0592;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        final ClassLoader classLoader7 = ((pkh)instance4).getClass().getClassLoader();
                        final ClassLoader classLoader8 = pkh.class.getClassLoader();
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Instance classloader: ");
                        sb4.append(classLoader7);
                        sb4.append(", base type classloader: ");
                        sb4.append(classLoader8);
                        final ClassCastException ex9;
                        final Throwable initCause4 = new ClassCastException(sb4.toString()).initCause(ex9);
                        initCause4.getClass();
                        throw initCause4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                catch (final ClassNotFoundException ex10) {}
            }
        }
    }
}
