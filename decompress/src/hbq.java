import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.content.pm.PackageManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbq
{
    private static final nsd b;
    private static final String[] c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/remotecontrol/SignatureValidator");
        c = new String[] { "13:86:84:D0:65:DB:A8:0B:62:77:7E:2C:E3:5E:08:1A:97:22:BC:0E:43:F1:39:0E:CA:11:DC:20:AA:BE:B2:B5" };
    }
    
    public static final boolean a(final String s, PackageManager d) {
        Label_0490: {
            try {
                final PackageInfo packageInfo = ((PackageManager)d).getPackageInfo(s, 134217728);
                d = (NoSuchAlgorithmException)MessageDigest.getInstance("SHA-256");
                final Signature[] signingCertificateHistory = packageInfo.signingInfo.getSigningCertificateHistory();
                if (signingCertificateHistory.length == 0) {
                    a.l(hbq.b.b(), "Unsigned package", '\u08be');
                    d = (NoSuchAlgorithmException)"";
                }
                else {
                    final byte[] digest = ((MessageDigest)d).digest(signingCertificateHistory[0].toByteArray());
                    final nwp e = nwp.e;
                    if ((d = (NoSuchAlgorithmException)((nwo)e).d) == null) {
                        d = (NoSuchAlgorithmException)((nwo)e).b;
                        final char[] b = ((nwk)d).b;
                    Label_0285:
                        for (int length = b.length, i = 0; i < length; ++i) {
                            if (nov.I(b[i])) {
                                while (true) {
                                    for (final char c : ((nwk)d).b) {
                                        if (c >= 'A' && c <= 'Z') {
                                            final int n = 1;
                                            njo.p((boolean)((n ^ 0x1) != 0x0), "Cannot call upperCase() on a mixed-case alphabet");
                                            final char[] array = new char[((nwk)d).b.length];
                                            int n2 = 0;
                                            while (true) {
                                                final char[] b3 = ((nwk)d).b;
                                                if (n2 >= b3.length) {
                                                    break;
                                                }
                                                int n3;
                                                final char c2 = (char)(n3 = b3[n2]);
                                                if (nov.I(c2)) {
                                                    n3 = (c2 ^ ' ');
                                                }
                                                array[n2] = (char)n3;
                                                ++n2;
                                            }
                                            d = (NoSuchAlgorithmException)new nwk(((nwk)d).a.concat(".upperCase()"), array);
                                            break Label_0285;
                                        }
                                    }
                                    final int n = 0;
                                    continue;
                                }
                            }
                        }
                        if (d == ((nwo)e).b) {
                            d = (NoSuchAlgorithmException)e;
                        }
                        else {
                            final Character c3 = ((nwo)e).c;
                            d = (NoSuchAlgorithmException)new nwl((nwk)d);
                        }
                        ((nwo)e).d = (nwp)d;
                    }
                    for (int k = 0; k <= 0; ++k) {
                        final nwo nwo = (nwo)d;
                        njo.i(((nwo)d).b.c(":".charAt(k)) ^ true, "Separator (%s) cannot contain alphabet characters", ":");
                    }
                    final nwo nwo2 = (nwo)d;
                    final Character c4 = ((nwo)d).c;
                    if (c4 != null) {
                        njo.i(":".indexOf(c4) < 0, "Separator (%s) cannot contain padding character", ":");
                    }
                    d = (NoSuchAlgorithmException)new nwn((nwp)d).f(digest);
                }
                final String[] c5 = hbq.c;
                for (int l = 0; l <= 0; ++l) {
                    if (c5[l].equals(d)) {
                        return true;
                    }
                }
                break Label_0490;
            }
            catch (final NoSuchAlgorithmException d) {}
            catch (final PackageManager$NameNotFoundException ex) {}
            a.n(hbq.b.b(), "Error validating package %s", s, '\u08c0', d);
        }
        a.k(hbq.b.b(), "Validation failed for %s", s, '\u08c1');
        return false;
    }
}
