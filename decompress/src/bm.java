import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.io.IOException;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.io.InputStream;
import java.util.Properties;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bm
{
    private static final Properties a;
    
    static {
        final Properties properties = a = new Properties();
        try {
            InputStream resourceAsStream;
            if (System.getSecurityManager() != null) {
                resourceAsStream = AccessController.doPrivileged((PrivilegedAction<InputStream>)new bn(bo.class));
            }
            else {
                resourceAsStream = bo.class.getResourceAsStream("/android/icumessageformat/ICUConfig.properties");
            }
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
            }
        }
        catch (final IOException ex) {}
        catch (final MissingResourceException ex2) {}
    }
    
    public static String a() {
        String property;
        if (System.getSecurityManager() != null) {
            try {
                property = AccessController.doPrivileged((PrivilegedAction<String>)new bl());
            }
            catch (final AccessControlException ex) {
                property = null;
            }
        }
        else {
            property = System.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode");
        }
        String property2 = property;
        if (property == null) {
            property2 = bm.a.getProperty("android.icumessageformat.text.MessagePattern.ApostropheMode", "DOUBLE_OPTIONAL");
        }
        return property2;
    }
}
