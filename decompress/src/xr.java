import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.os.Trace;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class xr extends pls implements pkn
{
    final /* synthetic */ xs a;
    private final /* synthetic */ int b;
    
    public xr(final xs a) {
        this.a = a;
        super(0);
    }
    
    public xr(final xs a, final int b) {
        this.b = b;
        this.a = a;
        super(0);
    }
    
    public final Set b() {
        Label_0317: {
            switch (this.b) {
                default: {
                    break Label_0317;
                }
                case 4: {
                    break Label_0317;
                }
                case 3: {
                    break Label_0317;
                }
                case 2: {
                    break Label_0317;
                }
                case 1: {
                    break Label_0317;
                }
                case 0: {
                    pjc a12 = null;
                    Label_0407: {
                        break Label_0407;
                        try {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Camera-");
                            sb.append(this.a.a);
                            sb.append("#availableSessionKeys");
                            final String string = sb.toString();
                            final xs a = this.a;
                            try {
                                Trace.beginSection(string);
                                List list;
                                if ((list = xo.b(a.b)) == null) {
                                    list = pja.a;
                                }
                                pjf.l(list);
                            }
                            finally {
                                Trace.endSection();
                            }
                            return null;
                            pjc a4 = null;
                            try {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Camera-");
                                sb2.append(this.a.a);
                                sb2.append("#availableCaptureRequestKeys");
                                final String string2 = sb2.toString();
                                final xs a3 = this.a;
                                try {
                                    Trace.beginSection(string2);
                                    List list2;
                                    if ((list2 = a3.b.getAvailableCaptureRequestKeys()) == null) {
                                        list2 = pja.a;
                                    }
                                    pjf.l(list2);
                                }
                                finally {
                                    Trace.endSection();
                                }
                            }
                            catch (final AssertionError assertionError) {
                                a4 = pjc.a;
                            }
                            return a4;
                            pjc a6 = null;
                            try {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Camera-");
                                sb3.append(this.a.a);
                                sb3.append("#physicalCameraIds");
                                final String string3 = sb3.toString();
                                final xs a5 = this.a;
                                try {
                                    Trace.beginSection(string3);
                                    Set set;
                                    if ((set = xo.c(a5.b)) == null) {
                                        set = pjc.a;
                                    }
                                    final ArrayList list3 = new ArrayList(pjf.o(set));
                                    for (final String s : set) {
                                        s.getClass();
                                        list3.add((Object)xh.a(s));
                                    }
                                    pjf.l(list3);
                                }
                                finally {
                                    Trace.endSection();
                                }
                            }
                            catch (final AssertionError assertionError2) {
                                a6 = pjc.a;
                            }
                            return a6;
                            try {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("Camera-");
                                sb4.append(this.a.a);
                                sb4.append("#availablePhysicalCameraRequestKeys");
                                final String string4 = sb4.toString();
                                final xs a7 = this.a;
                                try {
                                    Trace.beginSection(string4);
                                    List list4;
                                    if ((list4 = xo.a(a7.b)) == null) {
                                        list4 = pja.a;
                                    }
                                    pjf.l(list4);
                                }
                                finally {
                                    Trace.endSection();
                                }
                            }
                            catch (final AssertionError assertionError3) {
                                a2 = pjc.a;
                            }
                            return a2;
                            pjc a9 = null;
                            try {
                                final StringBuilder sb5 = new StringBuilder();
                                sb5.append("Camera-");
                                sb5.append(this.a.a);
                                sb5.append("#availableCaptureResultKeys");
                                final String string5 = sb5.toString();
                                final xs a8 = this.a;
                                try {
                                    Trace.beginSection(string5);
                                    List list5;
                                    if ((list5 = a8.b.getAvailableCaptureResultKeys()) == null) {
                                        list5 = pja.a;
                                    }
                                    pjf.l(list5);
                                }
                                finally {
                                    Trace.endSection();
                                }
                            }
                            catch (final AssertionError assertionError4) {
                                a9 = pjc.a;
                            }
                            return a9;
                            pjc a11 = null;
                            try {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append("Camera-");
                                sb6.append(this.a.a);
                                sb6.append("#keys");
                                final String string6 = sb6.toString();
                                final xs a10 = this.a;
                                try {
                                    Trace.beginSection(string6);
                                    List list6;
                                    if ((list6 = a10.b.getKeys()) == null) {
                                        list6 = pja.a;
                                    }
                                    pjf.l(list6);
                                }
                                finally {
                                    Trace.endSection();
                                }
                            }
                            catch (final AssertionError assertionError5) {
                                a11 = pjc.a;
                            }
                            return a11;
                        }
                        catch (final AssertionError assertionError6) {
                            a12 = pjc.a;
                        }
                    }
                    return a12;
                }
            }
        }
    }
}
