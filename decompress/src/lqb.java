import java.util.Map;
import java.util.List;
import java.nio.ByteBuffer;
import com.google.android.libraries.lens.lenslite.api.LinkConfig;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqb extends LinkConfig
{
    private final Boolean A;
    private final ByteBuffer B;
    private final Boolean C;
    private final ByteBuffer D;
    private final Boolean E;
    private final Boolean F;
    private final Boolean G;
    private final lro H;
    private final Boolean I;
    public final lri a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final Boolean f;
    private final List g;
    private final Integer h;
    private final Integer i;
    private final Boolean j;
    private final boolean k;
    private final boolean l;
    private final Integer m;
    private final Boolean n;
    private final Map o;
    private final Boolean p;
    private final Boolean q;
    private final Boolean r;
    private final Boolean s;
    private final Integer t;
    private final Boolean u;
    private final Long v;
    private final Boolean w;
    private final Boolean x;
    private final lrj y;
    private final Long z;
    
    public lqb(final Boolean b, final Boolean c, final Boolean d, final Boolean e, final Boolean f, final List g, final Integer h, final Integer i, final Boolean j, final boolean k, final boolean l, final Integer m, final Boolean n, final Map o, final Boolean p35, final Boolean q, final Boolean r, final lri a, final Boolean s, final Integer t, final Boolean u, final Long v, final Boolean w, final Boolean x, final lrj y, final Long z, final Boolean a2, final ByteBuffer b2, final Boolean c2, final ByteBuffer d2, final Boolean e2, final Boolean f2, final Boolean g2, final lro h2, final Boolean i2) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p35;
        this.q = q;
        this.r = r;
        this.a = a;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.B = b2;
        this.C = c2;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
    }
    
    @Override
    public final boolean aiAiShoppingDetectionEnabled() {
        return this.k;
    }
    
    @Override
    public final boolean aiAiTranslateDetectionEnabled() {
        return this.l;
    }
    
    @Override
    public final Boolean apparelDetectionEnabled() {
        return this.j;
    }
    
    @Deprecated
    @Override
    public final Integer apparelMode() {
        return null;
    }
    
    @Override
    public final Boolean barcodeEnabled() {
        return this.w;
    }
    
    @Override
    public final Boolean documentScanningEnabled() {
        return this.r;
    }
    
    @Override
    public final Integer dutyCycleMode() {
        return this.t;
    }
    
    @Override
    public final lri dynamicLoadingMode() {
        return this.a;
    }
    
    @Override
    public final Boolean embedderModeEnabled() {
        return this.G;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof LinkConfig) {
            final LinkConfig linkConfig = (LinkConfig)o;
            final Boolean b = this.b;
            if (b == null) {
                if (linkConfig.wifiConnectionEnabled() != null) {
                    return false;
                }
            }
            else if (!b.equals(linkConfig.wifiConnectionEnabled())) {
                return false;
            }
            final Boolean c = this.c;
            if (c == null) {
                if (linkConfig.wifiScanEnabled() != null) {
                    return false;
                }
            }
            else if (!c.equals(linkConfig.wifiScanEnabled())) {
                return false;
            }
            final Boolean d = this.d;
            if (d == null) {
                if (linkConfig.sceneDetectionEnabled() != null) {
                    return false;
                }
            }
            else if (!d.equals(linkConfig.sceneDetectionEnabled())) {
                return false;
            }
            final Boolean e = this.e;
            if (e == null) {
                if (linkConfig.freeTextCopyEnabled() != null) {
                    return false;
                }
            }
            else if (!e.equals(linkConfig.freeTextCopyEnabled())) {
                return false;
            }
            final Boolean f = this.f;
            if (f == null) {
                if (linkConfig.foreignLanguageDetectionEnabled() != null) {
                    return false;
                }
            }
            else if (!f.equals(linkConfig.foreignLanguageDetectionEnabled())) {
                return false;
            }
            final List g = this.g;
            if (g == null) {
                if (linkConfig.supportedTranslateLanguages() != null) {
                    return false;
                }
            }
            else if (!g.equals(linkConfig.supportedTranslateLanguages())) {
                return false;
            }
            if (linkConfig.productDetectionEnabled() == null && linkConfig.productMode() == null && linkConfig.productIndex() == null) {
                final Integer h = this.h;
                if (h == null) {
                    if (linkConfig.processorMode() != null) {
                        return false;
                    }
                }
                else if (!h.equals(linkConfig.processorMode())) {
                    return false;
                }
                if (linkConfig.textSelectionEnabled() == null) {
                    final Integer i = this.i;
                    if (i == null) {
                        if (linkConfig.triggerMode() != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(linkConfig.triggerMode())) {
                        return false;
                    }
                    final Boolean j = this.j;
                    if (j == null) {
                        if (linkConfig.apparelDetectionEnabled() != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(linkConfig.apparelDetectionEnabled())) {
                        return false;
                    }
                    if (linkConfig.apparelMode() == null && this.k == linkConfig.aiAiShoppingDetectionEnabled() && this.l == linkConfig.aiAiTranslateDetectionEnabled()) {
                        final Integer m = this.m;
                        if (m == null) {
                            if (linkConfig.processorImagePoolSize() != null) {
                                return false;
                            }
                        }
                        else if (!m.equals(linkConfig.processorImagePoolSize())) {
                            return false;
                        }
                        final Boolean n = this.n;
                        if (n == null) {
                            if (linkConfig.nonEnPersonNameDetectionEnabled() != null) {
                                return false;
                            }
                        }
                        else if (!n.equals(linkConfig.nonEnPersonNameDetectionEnabled())) {
                            return false;
                        }
                        final Map o2 = this.o;
                        if (o2 == null) {
                            if (linkConfig.sceneClassificationMap() != null) {
                                return false;
                            }
                        }
                        else if (!o2.equals(linkConfig.sceneClassificationMap())) {
                            return false;
                        }
                        final Boolean p = this.p;
                        if (p == null) {
                            if (linkConfig.legacyPixelParity() != null) {
                                return false;
                            }
                        }
                        else if (!p.equals(linkConfig.legacyPixelParity())) {
                            return false;
                        }
                        final Boolean q = this.q;
                        if (q == null) {
                            if (linkConfig.pixelChipMode() != null) {
                                return false;
                            }
                        }
                        else if (!q.equals(linkConfig.pixelChipMode())) {
                            return false;
                        }
                        final Boolean r = this.r;
                        if (r == null) {
                            if (linkConfig.documentScanningEnabled() != null) {
                                return false;
                            }
                        }
                        else if (!r.equals(linkConfig.documentScanningEnabled())) {
                            return false;
                        }
                        if (this.a.equals(linkConfig.dynamicLoadingMode()) && linkConfig.minimumDynamicLoadingHostVersion() == null) {
                            final Boolean s = this.s;
                            if (s == null) {
                                if (linkConfig.gleamEngineEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!s.equals(linkConfig.gleamEngineEnabled())) {
                                return false;
                            }
                            final Integer t = this.t;
                            if (t == null) {
                                if (linkConfig.dutyCycleMode() != null) {
                                    return false;
                                }
                            }
                            else if (!t.equals(linkConfig.dutyCycleMode())) {
                                return false;
                            }
                            final Boolean u = this.u;
                            if (u == null) {
                                if (linkConfig.modelDownloadEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!u.equals(linkConfig.modelDownloadEnabled())) {
                                return false;
                            }
                            final Long v = this.v;
                            if (v == null) {
                                if (linkConfig.modelDownloadCheckTimeoutMs() != null) {
                                    return false;
                                }
                            }
                            else if (!v.equals(linkConfig.modelDownloadCheckTimeoutMs())) {
                                return false;
                            }
                            final Boolean w = this.w;
                            if (w == null) {
                                if (linkConfig.barcodeEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!w.equals(linkConfig.barcodeEnabled())) {
                                return false;
                            }
                            final Boolean x = this.x;
                            if (x == null) {
                                if (linkConfig.lens2020ModeEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!x.equals(linkConfig.lens2020ModeEnabled())) {
                                return false;
                            }
                            final lrj y = this.y;
                            if (y == null) {
                                if (linkConfig.lens2020Params() != null) {
                                    return false;
                                }
                            }
                            else if (!y.equals(linkConfig.lens2020Params())) {
                                return false;
                            }
                            final Long z = this.z;
                            if (z == null) {
                                if (linkConfig.trivialFeatureEnabledBits() != null) {
                                    return false;
                                }
                            }
                            else if (!z.equals(linkConfig.trivialFeatureEnabledBits())) {
                                return false;
                            }
                            final Boolean a = this.A;
                            if (a == null) {
                                if (linkConfig.pdpTextExtractionEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!a.equals(linkConfig.pdpTextExtractionEnabled())) {
                                return false;
                            }
                            final ByteBuffer b2 = this.B;
                            if (b2 == null) {
                                if (linkConfig.linkEvalConfigMetadata() != null) {
                                    return false;
                                }
                            }
                            else if (!b2.equals(linkConfig.linkEvalConfigMetadata())) {
                                return false;
                            }
                            final Boolean c2 = this.C;
                            if (c2 == null) {
                                if (linkConfig.linkModelDownloadEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!c2.equals(linkConfig.linkModelDownloadEnabled())) {
                                return false;
                            }
                            final ByteBuffer d2 = this.D;
                            if (d2 == null) {
                                if (linkConfig.serializedPipelineConfig() != null) {
                                    return false;
                                }
                            }
                            else if (!d2.equals(linkConfig.serializedPipelineConfig())) {
                                return false;
                            }
                            final Boolean e2 = this.E;
                            if (e2 == null) {
                                if (linkConfig.lightweightSuggestionsModeEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!e2.equals(linkConfig.lightweightSuggestionsModeEnabled())) {
                                return false;
                            }
                            final Boolean f2 = this.F;
                            if (f2 == null) {
                                if (linkConfig.stopPipelineOnPause() != null) {
                                    return false;
                                }
                            }
                            else if (!f2.equals(linkConfig.stopPipelineOnPause())) {
                                return false;
                            }
                            final Boolean g2 = this.G;
                            if (g2 == null) {
                                if (linkConfig.embedderModeEnabled() != null) {
                                    return false;
                                }
                            }
                            else if (!g2.equals(linkConfig.embedderModeEnabled())) {
                                return false;
                            }
                            final lro h2 = this.H;
                            if (h2 == null) {
                                if (linkConfig.mobileRaidParams() != null) {
                                    return false;
                                }
                            }
                            else if (!h2.equals(linkConfig.mobileRaidParams())) {
                                return false;
                            }
                            final Boolean k = this.I;
                            if (k == null) {
                                if (linkConfig.waitForVkpStartEnabled() == null) {
                                    return true;
                                }
                            }
                            else if (k.equals(linkConfig.waitForVkpStartEnabled())) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final Boolean foreignLanguageDetectionEnabled() {
        return this.f;
    }
    
    @Override
    public final Boolean freeTextCopyEnabled() {
        return this.e;
    }
    
    @Override
    public final Boolean gleamEngineEnabled() {
        return this.s;
    }
    
    @Override
    public final int hashCode() {
        final Boolean b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final List g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final Integer h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final Integer i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final Boolean j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = j.hashCode();
        }
        final boolean k = this.k;
        int n = 1237;
        int n2;
        if (!k) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.l) {
            n = 1231;
        }
        final Integer m = this.m;
        int hashCode11;
        if (m == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = m.hashCode();
        }
        final Boolean n3 = this.n;
        int hashCode12;
        if (n3 == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = n3.hashCode();
        }
        final Map o = this.o;
        int hashCode13;
        if (o == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = o.hashCode();
        }
        final Boolean p = this.p;
        int hashCode14;
        if (p == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = p.hashCode();
        }
        final Boolean q = this.q;
        int hashCode15;
        if (q == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = q.hashCode();
        }
        final Boolean r = this.r;
        int hashCode16;
        if (r == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = r.hashCode();
        }
        final int hashCode17 = this.a.hashCode();
        final Boolean s = this.s;
        int hashCode18;
        if (s == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = s.hashCode();
        }
        final Integer t = this.t;
        int hashCode19;
        if (t == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = t.hashCode();
        }
        final Boolean u = this.u;
        int hashCode20;
        if (u == null) {
            hashCode20 = 0;
        }
        else {
            hashCode20 = u.hashCode();
        }
        final Long v = this.v;
        int hashCode21;
        if (v == null) {
            hashCode21 = 0;
        }
        else {
            hashCode21 = v.hashCode();
        }
        final Boolean w = this.w;
        int hashCode22;
        if (w == null) {
            hashCode22 = 0;
        }
        else {
            hashCode22 = w.hashCode();
        }
        final Boolean x = this.x;
        int hashCode23;
        if (x == null) {
            hashCode23 = 0;
        }
        else {
            hashCode23 = x.hashCode();
        }
        final lrj y = this.y;
        int ay;
        if (y == null) {
            ay = 0;
        }
        else {
            ay = y.ay;
            if (ay == 0) {
                ay = omr.a.b(y).b(y);
                y.ay = ay;
            }
        }
        final Long z = this.z;
        int hashCode24;
        if (z == null) {
            hashCode24 = 0;
        }
        else {
            hashCode24 = z.hashCode();
        }
        final Boolean a = this.A;
        int hashCode25;
        if (a == null) {
            hashCode25 = 0;
        }
        else {
            hashCode25 = a.hashCode();
        }
        final ByteBuffer b2 = this.B;
        int hashCode26;
        if (b2 == null) {
            hashCode26 = 0;
        }
        else {
            hashCode26 = b2.hashCode();
        }
        final Boolean c2 = this.C;
        int hashCode27;
        if (c2 == null) {
            hashCode27 = 0;
        }
        else {
            hashCode27 = c2.hashCode();
        }
        final ByteBuffer d2 = this.D;
        int hashCode28;
        if (d2 == null) {
            hashCode28 = 0;
        }
        else {
            hashCode28 = d2.hashCode();
        }
        final Boolean e2 = this.E;
        int hashCode29;
        if (e2 == null) {
            hashCode29 = 0;
        }
        else {
            hashCode29 = e2.hashCode();
        }
        final Boolean f2 = this.F;
        int hashCode30;
        if (f2 == null) {
            hashCode30 = 0;
        }
        else {
            hashCode30 = f2.hashCode();
        }
        final Boolean g2 = this.G;
        int hashCode31;
        if (g2 == null) {
            hashCode31 = 0;
        }
        else {
            hashCode31 = g2.hashCode();
        }
        final lro h2 = this.H;
        int ay2;
        if (h2 == null) {
            ay2 = 0;
        }
        else {
            ay2 = h2.ay;
            if (ay2 == 0) {
                ay2 = omr.a.b(h2).b(h2);
                h2.ay = ay2;
            }
        }
        final Boolean l = this.I;
        if (l != null) {
            hashCode = l.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1525764945 ^ hashCode8) * -721379959 ^ hashCode9) * 1000003 ^ hashCode10) * -721379959 ^ n2) * 1000003 ^ n) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ hashCode14) * 1000003 ^ hashCode15) * 1000003 ^ hashCode16) * 1000003 ^ hashCode17) * -721379959 ^ hashCode18) * 1000003 ^ hashCode19) * 1000003 ^ hashCode20) * 1000003 ^ hashCode21) * 1000003 ^ hashCode22) * 1000003 ^ hashCode23) * 1000003 ^ ay) * 1000003 ^ hashCode24) * 1000003 ^ hashCode25) * 1000003 ^ hashCode26) * 1000003 ^ hashCode27) * 1000003 ^ hashCode28) * 1000003 ^ hashCode29) * 1000003 ^ hashCode30) * 1000003 ^ hashCode31) * 1000003 ^ ay2) * 1000003 ^ hashCode;
    }
    
    @Override
    public final Boolean legacyPixelParity() {
        return this.p;
    }
    
    @Override
    public final Boolean lens2020ModeEnabled() {
        return this.x;
    }
    
    @Override
    public final lrj lens2020Params() {
        return this.y;
    }
    
    @Override
    public final Boolean lightweightSuggestionsModeEnabled() {
        return this.E;
    }
    
    @Override
    public final ByteBuffer linkEvalConfigMetadata() {
        return this.B;
    }
    
    @Override
    public final Boolean linkModelDownloadEnabled() {
        return this.C;
    }
    
    @Override
    public final Long minimumDynamicLoadingHostVersion() {
        return null;
    }
    
    @Override
    public final lro mobileRaidParams() {
        return this.H;
    }
    
    @Override
    public final Long modelDownloadCheckTimeoutMs() {
        return this.v;
    }
    
    @Override
    public final Boolean modelDownloadEnabled() {
        return this.u;
    }
    
    @Override
    public final Boolean nonEnPersonNameDetectionEnabled() {
        return this.n;
    }
    
    @Override
    public final Boolean pdpTextExtractionEnabled() {
        return this.A;
    }
    
    @Override
    public final Boolean pixelChipMode() {
        return this.q;
    }
    
    @Override
    public final Integer processorImagePoolSize() {
        return this.m;
    }
    
    @Override
    public final Integer processorMode() {
        return this.h;
    }
    
    @Deprecated
    @Override
    public final Boolean productDetectionEnabled() {
        return null;
    }
    
    @Deprecated
    @Override
    public final String productIndex() {
        return null;
    }
    
    @Deprecated
    @Override
    public final Integer productMode() {
        return null;
    }
    
    @Override
    public final Map sceneClassificationMap() {
        return this.o;
    }
    
    @Override
    public final Boolean sceneDetectionEnabled() {
        return this.d;
    }
    
    @Override
    public final ByteBuffer serializedPipelineConfig() {
        return this.D;
    }
    
    @Override
    public final Boolean stopPipelineOnPause() {
        return this.F;
    }
    
    @Override
    public final List supportedTranslateLanguages() {
        return this.g;
    }
    
    @Deprecated
    @Override
    public final Boolean textSelectionEnabled() {
        return null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final String value5 = String.valueOf(this.f);
        final String value6 = String.valueOf(this.g);
        final String value7 = String.valueOf((Object)null);
        final String value8 = String.valueOf((Object)null);
        final String value9 = String.valueOf(this.h);
        final String value10 = String.valueOf((Object)null);
        final String value11 = String.valueOf(this.i);
        final String value12 = String.valueOf(this.j);
        final String value13 = String.valueOf((Object)null);
        final boolean k = this.k;
        final boolean l = this.l;
        final String value14 = String.valueOf(this.m);
        final String value15 = String.valueOf(this.n);
        final String value16 = String.valueOf(this.o);
        final String value17 = String.valueOf(this.p);
        final String value18 = String.valueOf(this.q);
        final String value19 = String.valueOf(this.r);
        final String value20 = String.valueOf(this.a);
        final String value21 = String.valueOf((Object)null);
        final String value22 = String.valueOf(this.s);
        final String value23 = String.valueOf(this.t);
        final String value24 = String.valueOf(this.u);
        final String value25 = String.valueOf(this.v);
        final String value26 = String.valueOf(this.w);
        final String value27 = String.valueOf(this.x);
        final String value28 = String.valueOf(this.y);
        final String value29 = String.valueOf(this.z);
        final String value30 = String.valueOf(this.A);
        final String value31 = String.valueOf(this.B);
        final String value32 = String.valueOf(this.C);
        final String value33 = String.valueOf(this.D);
        final String value34 = String.valueOf(this.E);
        final String value35 = String.valueOf(this.F);
        final String value36 = String.valueOf(this.G);
        final String value37 = String.valueOf(this.H);
        final String value38 = String.valueOf(this.I);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 989 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf((Object)null).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length() + String.valueOf(value14).length() + String.valueOf(value15).length() + String.valueOf(value16).length() + String.valueOf(value17).length() + String.valueOf(value18).length() + String.valueOf(value19).length() + String.valueOf(value20).length() + String.valueOf(value21).length() + String.valueOf(value22).length() + String.valueOf(value23).length() + String.valueOf(value24).length() + String.valueOf(value25).length() + String.valueOf(value26).length() + String.valueOf(value27).length() + String.valueOf(value28).length() + String.valueOf(value29).length() + String.valueOf(value30).length() + String.valueOf(value31).length() + String.valueOf(value32).length() + String.valueOf(value33).length() + String.valueOf(value34).length() + String.valueOf(value35).length() + String.valueOf(value36).length() + String.valueOf(value37).length() + String.valueOf(value38).length());
        sb.append("LinkConfig{wifiConnectionEnabled=");
        sb.append(value);
        sb.append(", wifiScanEnabled=");
        sb.append(value2);
        sb.append(", sceneDetectionEnabled=");
        sb.append(value3);
        sb.append(", freeTextCopyEnabled=");
        sb.append(value4);
        sb.append(", foreignLanguageDetectionEnabled=");
        sb.append(value5);
        sb.append(", supportedTranslateLanguages=");
        sb.append(value6);
        sb.append(", productDetectionEnabled=");
        sb.append(value7);
        sb.append(", productMode=");
        sb.append(value8);
        sb.append(", productIndex=null, processorMode=");
        sb.append(value9);
        sb.append(", textSelectionEnabled=");
        sb.append(value10);
        sb.append(", triggerMode=");
        sb.append(value11);
        sb.append(", apparelDetectionEnabled=");
        sb.append(value12);
        sb.append(", apparelMode=");
        sb.append(value13);
        sb.append(", aiAiShoppingDetectionEnabled=");
        sb.append(k);
        sb.append(", aiAiTranslateDetectionEnabled=");
        sb.append(l);
        sb.append(", processorImagePoolSize=");
        sb.append(value14);
        sb.append(", nonEnPersonNameDetectionEnabled=");
        sb.append(value15);
        sb.append(", sceneClassificationMap=");
        sb.append(value16);
        sb.append(", legacyPixelParity=");
        sb.append(value17);
        sb.append(", pixelChipMode=");
        sb.append(value18);
        sb.append(", documentScanningEnabled=");
        sb.append(value19);
        sb.append(", dynamicLoadingMode=");
        sb.append(value20);
        sb.append(", minimumDynamicLoadingHostVersion=");
        sb.append(value21);
        sb.append(", gleamEngineEnabled=");
        sb.append(value22);
        sb.append(", dutyCycleMode=");
        sb.append(value23);
        sb.append(", modelDownloadEnabled=");
        sb.append(value24);
        sb.append(", modelDownloadCheckTimeoutMs=");
        sb.append(value25);
        sb.append(", barcodeEnabled=");
        sb.append(value26);
        sb.append(", lens2020ModeEnabled=");
        sb.append(value27);
        sb.append(", lens2020Params=");
        sb.append(value28);
        sb.append(", trivialFeatureEnabledBits=");
        sb.append(value29);
        sb.append(", pdpTextExtractionEnabled=");
        sb.append(value30);
        sb.append(", linkEvalConfigMetadata=");
        sb.append(value31);
        sb.append(", linkModelDownloadEnabled=");
        sb.append(value32);
        sb.append(", serializedPipelineConfig=");
        sb.append(value33);
        sb.append(", lightweightSuggestionsModeEnabled=");
        sb.append(value34);
        sb.append(", stopPipelineOnPause=");
        sb.append(value35);
        sb.append(", embedderModeEnabled=");
        sb.append(value36);
        sb.append(", mobileRaidParams=");
        sb.append(value37);
        sb.append(", waitForVkpStartEnabled=");
        sb.append(value38);
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public final Integer triggerMode() {
        return this.i;
    }
    
    @Override
    public final Long trivialFeatureEnabledBits() {
        return this.z;
    }
    
    @Override
    public final Boolean waitForVkpStartEnabled() {
        return this.I;
    }
    
    @Override
    public final Boolean wifiConnectionEnabled() {
        return this.b;
    }
    
    @Override
    public final Boolean wifiScanEnabled() {
        return this.c;
    }
}
