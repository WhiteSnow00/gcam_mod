import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.text.TextUtils;
import java.util.Locale;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$NotFoundException;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.content.Context;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.List;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfe
{
    public lfe() {
        new HashMap();
        new ArrayList();
    }
    
    public lfe(final kwe kwe) {
        kwe.c().h();
    }
    
    public static double a(final float n, double atan) {
        final boolean b = true;
        njo.i(n > 0.0f, "Focal length cannot be zero (%s)", n);
        njo.i(atan > 0.0 && b, "Diagonal size cannot be zero (%s)", atan);
        final double n2 = n + n;
        Double.isNaN(n2);
        atan = Math.atan(atan / n2);
        return atan + atan;
    }
    
    public static double b(double tan, final float n) {
        final double n2 = n + n;
        tan = Math.tan(tan / 2.0);
        Double.isNaN(n2);
        return n2 * tan;
    }
    
    public static double c(final lfg lfg) {
        final SizeF sizeF = (SizeF)lfg.o(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot(sizeF.getHeight(), sizeF.getWidth());
    }
    
    public static Object d(final ljc ljc) {
        return ljc.g().a;
    }
    
    public static List e(final List list) {
        final ArrayList list2 = new ArrayList(list.size());
        for (int i = 0; i < list.size(); ++i) {
            list2.add(d((ljc)list.get(i)));
        }
        return list2;
    }
    
    public static final ley f(final Surface surface, final int n) {
        return new ley(ImageWriter.newInstance(surface, n));
    }
    
    public static joe h(final Context context, final GoogleSignInOptions googleSignInOptions) {
        jvu.a(googleSignInOptions);
        return new joe(context, googleSignInOptions);
    }
    
    public static boolean i(final Context context, final String s, final boolean b) {
        try {
            final ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, s), 0);
            if (receiverInfo != null && receiverInfo.enabled && (!b || receiverInfo.exported)) {
                return true;
            }
        }
        catch (final PackageManager$NameNotFoundException ex) {}
        return false;
    }
    
    public static final jnf j(final int n, final jne jne, final jmb jmb) {
        try {
            return k(jmb.b.b.getResources().getXml(n), jne, jmb);
        }
        catch (final Resources$NotFoundException ex) {
            jmb.u("inflate() called with unknown resourceId", ex);
            return null;
        }
    }
    
    private static final jnf k(final XmlResourceParser xmlResourceParser, final jne jne, final jmb jmb) {
        try {
            xmlResourceParser.next();
            for (int i = xmlResourceParser.getEventType(); i != 1; i = xmlResourceParser.next()) {
                if (xmlResourceParser.getEventType() == 2) {
                    final String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    if (lowerCase.equals("screenname")) {
                        final String attributeValue = xmlResourceParser.getAttributeValue((String)null, "name");
                        final String trim = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)attributeValue)) {
                            TextUtils.isEmpty((CharSequence)trim);
                        }
                    }
                    else if (lowerCase.equals("string")) {
                        final String attributeValue2 = xmlResourceParser.getAttributeValue((String)null, "name");
                        final String trim2 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)attributeValue2) && trim2 != null) {
                            if ("ga_appName".equals(attributeValue2)) {
                                jne.b.a = trim2;
                            }
                            else if ("ga_appVersion".equals(attributeValue2)) {
                                jne.b.b = trim2;
                            }
                            else if ("ga_logLevel".equals(attributeValue2)) {
                                jne.b.c = trim2;
                            }
                            else {
                                jne.a.d().u("String xml configuration name not recognized", attributeValue2);
                            }
                        }
                    }
                    else if (lowerCase.equals("bool")) {
                        final String attributeValue3 = xmlResourceParser.getAttributeValue((String)null, "name");
                        final String trim3 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)attributeValue3) && !TextUtils.isEmpty((CharSequence)trim3)) {
                            try {
                                final boolean boolean1 = Boolean.parseBoolean(trim3);
                                if ("ga_dryRun".equals(attributeValue3)) {
                                    jne.b.e = (boolean1 ? 1 : 0);
                                }
                                else {
                                    jne.a.d().u("Bool xml configuration name not recognized", attributeValue3);
                                }
                            }
                            catch (final NumberFormatException ex) {
                                jmb.v("Error parsing bool configuration value", trim3, ex);
                            }
                        }
                    }
                    else if (lowerCase.equals("integer")) {
                        final String attributeValue4 = xmlResourceParser.getAttributeValue((String)null, "name");
                        final String trim4 = xmlResourceParser.nextText().trim();
                        if (!TextUtils.isEmpty((CharSequence)attributeValue4) && !TextUtils.isEmpty((CharSequence)trim4)) {
                            try {
                                final int int1 = Integer.parseInt(trim4);
                                if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                    jne.b.d = int1;
                                }
                                else {
                                    jne.a.d().u("Int xml configuration name not recognized", attributeValue4);
                                }
                            }
                            catch (final NumberFormatException ex2) {
                                jmb.v("Error parsing int configuration value", trim4, ex2);
                            }
                        }
                    }
                }
            }
        }
        catch (final IOException ex3) {
            jmb.o("Error parsing tracker configuration file", ex3);
        }
        catch (final XmlPullParserException ex4) {
            jmb.o("Error parsing tracker configuration file", ex4);
        }
        return jne.b;
    }
    
    public final void g() {
        monitorenter(this);
        monitorexit(this);
    }
}
