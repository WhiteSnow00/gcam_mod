import android.accounts.Account;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrt
{
    public static final Account a;
    
    static {
        a = new Account("shared", "mobstore");
    }
    
    public static Account a(final String s) {
        if ("shared".equals(s)) {
            return mrt.a;
        }
        final int index = s.indexOf(58);
        mug.c(index >= 0, "Malformed account", new Object[0]);
        return new Account(s.substring(index + 1), s.substring(0, index));
    }
    
    public static String b(final Account account) {
        mug.c(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        mug.c(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        mug.c(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (c(account)) {
            return "shared";
        }
        final String type = account.type;
        final String name = account.name;
        final StringBuilder sb = new StringBuilder(String.valueOf(type).length() + 1 + String.valueOf(name).length());
        sb.append(type);
        sb.append(":");
        sb.append(name);
        return sb.toString();
    }
    
    static boolean c(final Account account) {
        return mrt.a.equals((Object)account);
    }
}
