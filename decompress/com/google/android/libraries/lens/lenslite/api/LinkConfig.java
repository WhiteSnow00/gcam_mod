// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.api;

import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.HashMap;

public abstract class LinkConfig
{
    private static final String TAG = "LinkConfig";
    
    public static LinkConfig$Builder builder() {
        final lqa lqa = new lqa();
        lqa.a(lqp.b);
        final Boolean value = false;
        lqa.j = value;
        lqa.k = value;
        return lqa;
    }
    
    public static LinkConfig fromByteArray(final byte[] array) {
        final lrk lrk = (lrk)oky.t(lrk.L, array, okm.b());
        final LinkConfig$Builder builder = builder();
        if ((lrk.a & 0x1) != 0x0) {
            ((lqa)builder).a = lrk.c;
        }
        if ((lrk.a & 0x800000) != 0x0) {
            ((lqa)builder).b = lrk.c;
        }
        if ((lrk.a & 0x2) != 0x0) {
            ((lqa)builder).c = lrk.d;
        }
        if ((lrk.a & 0x10) != 0x0) {
            final boolean g = lrk.g;
            final lqa lqa = (lqa)builder;
            lqa.e = g;
            lrm lrm;
            if ((lrm = lrk.r) == null) {
                lrm = lrm.b;
            }
            lqa.f = lrm.a;
        }
        if ((lrk.a & 0x20) != 0x0) {
            ((lqa)builder).g = lrk.h;
        }
        lrn lrn;
        if ((lrn = lrk.i) == null) {
            lrn = lrn.c;
        }
        if ((lrn.a & 0x2) != 0x0) {
            lrn lrn2;
            if ((lrn2 = lrk.i) == null) {
                lrn2 = lrn.c;
            }
            ((lqa)builder).d = lrn2.b;
        }
        if ((lrk.a & 0x2) != 0x0) {
            final boolean d = lrk.d;
            final lqa lqa2 = (lqa)builder;
            lqa2.c = d;
            if (lrk.p.size() > 0) {
                final HashMap n = new HashMap();
                for (final lrp lrp : lrk.p) {
                    n.put(lrp.b, lrp.c);
                }
                lqa2.n = n;
            }
        }
        if ((lrk.a & 0x80) != 0x0) {
            int a;
            if ((a = lrx.a(lrk.j)) == 0) {
                a = 2;
            }
            ((lqa)builder).h = a - 1;
        }
        if ((lrk.a & 0x100) != 0x0) {
            ((lqa)builder).i = lrk.k;
        }
        if ((lrk.a & 0x100000) != 0x0) {
            final boolean x = lrk.x;
            final lqa lqa3 = (lqa)builder;
            lqa3.w = x;
            if ((lrk.a & 0x400000) != 0x0) {
                lrj x2;
                if ((x2 = lrk.z) == null) {
                    x2 = lrj.a;
                }
                lqa3.x = x2;
            }
        }
        if ((lrk.a & 0x200) != 0x0) {
            ((lqa)builder).l = lrk.l;
        }
        if ((lrk.a & 0x400) != 0x0) {
            ((lqa)builder).m = lrk.m;
        }
        if ((lrk.a & 0x800) != 0x0) {
            ((lqa)builder).o = lrk.n;
        }
        if ((lrk.a & 0x1000) != 0x0) {
            ((lqa)builder).p = lrk.o;
        }
        if ((lrk.a & 0x4) != 0x0) {
            ((lqa)builder).q = true;
        }
        if ((lrk.a & 0x10000) != 0x0) {
            ((lqa)builder).r = lrk.t;
        }
        lri lri;
        if ((lri = lri.b(lrk.q)) == null) {
            lri = lri.a;
        }
        lri lri2;
        if (lri == lri.a) {
            lri2 = lqp.b;
        }
        else if ((lri2 = lri.b(lrk.q)) == null) {
            lri2 = lri.a;
        }
        builder.a(lri2);
        if ((lrk.a & 0x20000) != 0x0) {
            int a2;
            if ((a2 = lrh.a(lrk.u)) == 0) {
                a2 = 1;
            }
            ((lqa)builder).s = a2 - 1;
        }
        if ((lrk.a & 0x40000) != 0x0) {
            ((lqa)builder).t = lrk.v;
        }
        if ((lrk.b & 0x2) != 0x0) {
            ((lqa)builder).u = lrk.K;
        }
        if ((lrk.a & 0x80000) != 0x0) {
            ((lqa)builder).v = lrk.w;
        }
        if ((lrk.a & 0x200000) != 0x0) {
            ((lqa)builder).y = lrk.y;
        }
        if ((lrk.a & 0x1000000) != 0x0) {
            ((lqa)builder).z = lrk.B;
        }
        if ((lrk.a & 0x2000000) != 0x0) {
            lrw lrw;
            if ((lrw = lrk.C) == null) {
                lrw = lrw.a;
            }
            ((lqa)builder).A = ByteBuffer.wrap(lrw.g());
        }
        if ((lrk.a & 0x4000000) != 0x0) {
            ((lqa)builder).B = lrk.D;
        }
        if ((lrk.a & 0x8000000) != 0x0) {
            ((lqa)builder).C = ByteBuffer.wrap(lrk.E.B());
        }
        if ((lrk.a & 0x10000000) != 0x0) {
            ((lqa)builder).D = lrk.F;
        }
        if ((lrk.b & 0x1) != 0x0) {
            ((lqa)builder).E = lrk.J;
        }
        if ((lrk.a & 0x20000000) != 0x0) {
            lro g2;
            if ((g2 = lrk.G) == null) {
                g2 = lro.a;
            }
            ((lqa)builder).G = g2;
        }
        if ((lrk.a & 0x40000000) != 0x0) {
            ((lqa)builder).F = lrk.H;
        }
        if ((lrk.a & Integer.MIN_VALUE) != 0x0) {
            ((lqa)builder).H = lrk.I;
        }
        return builder.build();
    }
    
    public abstract boolean aiAiShoppingDetectionEnabled();
    
    public abstract boolean aiAiTranslateDetectionEnabled();
    
    public abstract Boolean apparelDetectionEnabled();
    
    @Deprecated
    public abstract Integer apparelMode();
    
    public abstract Boolean barcodeEnabled();
    
    public abstract Boolean documentScanningEnabled();
    
    public abstract Integer dutyCycleMode();
    
    public abstract lri dynamicLoadingMode();
    
    public abstract Boolean embedderModeEnabled();
    
    public abstract Boolean foreignLanguageDetectionEnabled();
    
    public abstract Boolean freeTextCopyEnabled();
    
    public abstract Boolean gleamEngineEnabled();
    
    public abstract Boolean legacyPixelParity();
    
    public abstract Boolean lens2020ModeEnabled();
    
    public abstract lrj lens2020Params();
    
    public abstract Boolean lightweightSuggestionsModeEnabled();
    
    public abstract ByteBuffer linkEvalConfigMetadata();
    
    public abstract Boolean linkModelDownloadEnabled();
    
    public abstract Long minimumDynamicLoadingHostVersion();
    
    public abstract lro mobileRaidParams();
    
    public abstract Long modelDownloadCheckTimeoutMs();
    
    public abstract Boolean modelDownloadEnabled();
    
    public abstract Boolean nonEnPersonNameDetectionEnabled();
    
    public abstract Boolean pdpTextExtractionEnabled();
    
    public abstract Boolean pixelChipMode();
    
    public abstract Integer processorImagePoolSize();
    
    public abstract Integer processorMode();
    
    @Deprecated
    public abstract Boolean productDetectionEnabled();
    
    @Deprecated
    public abstract String productIndex();
    
    @Deprecated
    public abstract Integer productMode();
    
    public abstract Map sceneClassificationMap();
    
    public abstract Boolean sceneDetectionEnabled();
    
    public abstract ByteBuffer serializedPipelineConfig();
    
    public abstract Boolean stopPipelineOnPause();
    
    public abstract List supportedTranslateLanguages();
    
    @Deprecated
    public abstract Boolean textSelectionEnabled();
    
    public final byte[] toByteArray() {
        final okt m = lrk.L.m();
        final Boolean wifiConnectionEnabled = this.wifiConnectionEnabled();
        if (wifiConnectionEnabled != null) {
            final boolean booleanValue = wifiConnectionEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk = (lrk)m.b;
            lrk.a |= 0x1;
            lrk.c = booleanValue;
        }
        final Boolean wifiScanEnabled = this.wifiScanEnabled();
        if (wifiScanEnabled != null) {
            final boolean booleanValue2 = wifiScanEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk2 = (lrk)m.b;
            lrk2.a |= 0x800000;
            lrk2.A = booleanValue2;
        }
        final Boolean sceneDetectionEnabled = this.sceneDetectionEnabled();
        if (sceneDetectionEnabled != null) {
            final boolean booleanValue3 = sceneDetectionEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk3 = (lrk)m.b;
            lrk3.a |= 0x2;
            lrk3.d = booleanValue3;
        }
        final Boolean freeTextCopyEnabled = this.freeTextCopyEnabled();
        if (freeTextCopyEnabled != null) {
            final boolean booleanValue4 = freeTextCopyEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk4 = (lrk)m.b;
            lrk4.a |= 0x8;
            lrk4.f = booleanValue4;
        }
        final Boolean foreignLanguageDetectionEnabled = this.foreignLanguageDetectionEnabled();
        if (foreignLanguageDetectionEnabled != null) {
            final boolean booleanValue5 = foreignLanguageDetectionEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk5 = (lrk)m.b;
            lrk5.a |= 0x10;
            lrk5.g = booleanValue5;
            final List supportedTranslateLanguages = this.supportedTranslateLanguages();
            if (supportedTranslateLanguages != null) {
                final okt i = lrm.b.m();
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final lrm lrm = (lrm)i.b;
                final olj a = lrm.a;
                if (!a.c()) {
                    lrm.a = oky.C(a);
                }
                ojf.e(supportedTranslateLanguages, lrm.a);
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final lrk lrk6 = (lrk)m.b;
                final lrm r = (lrm)i.h();
                r.getClass();
                lrk6.r = r;
                lrk6.a |= 0x4000;
            }
        }
        final Integer processorMode = this.processorMode();
        if (processorMode != null) {
            final int intValue = processorMode;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk7 = (lrk)m.b;
            lrk7.a |= 0x20;
            lrk7.h = intValue;
        }
        final Boolean freeTextCopyEnabled2 = this.freeTextCopyEnabled();
        if (freeTextCopyEnabled2 != null && freeTextCopyEnabled2) {
            final okt j = lrn.c.m();
            if (j.c) {
                j.m();
                j.c = false;
            }
            final lrn lrn = (lrn)j.b;
            lrn.a |= 0x2;
            lrn.b = true;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk8 = (lrk)m.b;
            final lrn k = (lrn)j.h();
            k.getClass();
            lrk8.i = k;
            lrk8.a |= 0x40;
        }
        final Boolean sceneDetectionEnabled2 = this.sceneDetectionEnabled();
        if (sceneDetectionEnabled2 != null) {
            final boolean booleanValue6 = sceneDetectionEnabled2;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk9 = (lrk)m.b;
            lrk9.a |= 0x2;
            lrk9.d = booleanValue6;
            final Map sceneClassificationMap = this.sceneClassificationMap();
            if (sceneClassificationMap != null) {
                for (final Map.Entry<String, V> entry : sceneClassificationMap.entrySet()) {
                    final okt l = lrp.d.m();
                    final String b = entry.getKey();
                    if (l.c) {
                        l.m();
                        l.c = false;
                    }
                    final lrp lrp = (lrp)l.b;
                    b.getClass();
                    lrp.a |= 0x1;
                    lrp.b = b;
                    final float floatValue = (float)entry.getValue();
                    if (l.c) {
                        l.m();
                        l.c = false;
                    }
                    final lrp lrp2 = (lrp)l.b;
                    lrp2.a |= 0x2;
                    lrp2.c = floatValue;
                    final lrp lrp3 = (lrp)l.h();
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final lrk lrk10 = (lrk)m.b;
                    lrp3.getClass();
                    final olj p = lrk10.p;
                    if (!p.c()) {
                        lrk10.p = oky.C(p);
                    }
                    lrk10.p.add(lrp3);
                }
            }
        }
        final Integer triggerMode = this.triggerMode();
        if (triggerMode != null) {
            final int a2 = lrx.a(triggerMode);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk11 = (lrk)m.b;
            if (a2 == 0) {
                throw null;
            }
            lrk11.j = a2 - 1;
            lrk11.a |= 0x80;
        }
        final Boolean apparelDetectionEnabled = this.apparelDetectionEnabled();
        if (apparelDetectionEnabled != null) {
            final boolean booleanValue7 = apparelDetectionEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk12 = (lrk)m.b;
            final int a3 = lrk12.a | 0x100;
            lrk12.a = a3;
            lrk12.k = booleanValue7;
            lrk12.s = 1;
            lrk12.a = (0x8000 | a3);
        }
        final Integer processorImagePoolSize = this.processorImagePoolSize();
        if (processorImagePoolSize != null) {
            final int intValue2 = processorImagePoolSize;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk13 = (lrk)m.b;
            lrk13.a |= 0x200;
            lrk13.l = intValue2;
        }
        final Boolean nonEnPersonNameDetectionEnabled = this.nonEnPersonNameDetectionEnabled();
        if (nonEnPersonNameDetectionEnabled != null) {
            final boolean booleanValue8 = nonEnPersonNameDetectionEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk14 = (lrk)m.b;
            lrk14.a |= 0x400;
            lrk14.m = booleanValue8;
        }
        final Boolean legacyPixelParity = this.legacyPixelParity();
        if (legacyPixelParity != null) {
            final boolean booleanValue9 = legacyPixelParity;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk15 = (lrk)m.b;
            lrk15.a |= 0x800;
            lrk15.n = booleanValue9;
        }
        final Boolean pixelChipMode = this.pixelChipMode();
        if (pixelChipMode != null) {
            final boolean booleanValue10 = pixelChipMode;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk16 = (lrk)m.b;
            lrk16.a |= 0x1000;
            lrk16.o = booleanValue10;
        }
        final Boolean documentScanningEnabled = this.documentScanningEnabled();
        if (documentScanningEnabled != null && documentScanningEnabled) {
            final lrl a4 = lrl.a;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk17 = (lrk)m.b;
            a4.getClass();
            lrk17.e = a4;
            lrk17.a |= 0x4;
        }
        final Boolean gleamEngineEnabled = this.gleamEngineEnabled();
        if (gleamEngineEnabled != null) {
            final boolean booleanValue11 = gleamEngineEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk18 = (lrk)m.b;
            lrk18.a |= 0x10000;
            lrk18.t = booleanValue11;
        }
        final lri dynamicLoadingMode = this.dynamicLoadingMode();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final lrk lrk19 = (lrk)m.b;
        lrk19.q = dynamicLoadingMode.f;
        lrk19.a |= 0x2000;
        final Integer dutyCycleMode = this.dutyCycleMode();
        if (dutyCycleMode != null) {
            final int a5 = lrh.a(dutyCycleMode);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk20 = (lrk)m.b;
            if (a5 == 0) {
                throw null;
            }
            lrk20.u = a5 - 1;
            lrk20.a |= 0x20000;
        }
        final Boolean modelDownloadEnabled = this.modelDownloadEnabled();
        if (modelDownloadEnabled != null) {
            final boolean booleanValue12 = modelDownloadEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk21 = (lrk)m.b;
            lrk21.a |= 0x40000;
            lrk21.v = booleanValue12;
        }
        final Long modelDownloadCheckTimeoutMs = this.modelDownloadCheckTimeoutMs();
        if (modelDownloadCheckTimeoutMs != null) {
            final long longValue = modelDownloadCheckTimeoutMs;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk22 = (lrk)m.b;
            lrk22.b |= 0x2;
            lrk22.K = longValue;
        }
        final Boolean barcodeEnabled = this.barcodeEnabled();
        if (barcodeEnabled != null) {
            final boolean booleanValue13 = barcodeEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk23 = (lrk)m.b;
            lrk23.a |= 0x80000;
            lrk23.w = booleanValue13;
        }
        final Boolean lens2020ModeEnabled = this.lens2020ModeEnabled();
        if (lens2020ModeEnabled != null) {
            final boolean booleanValue14 = lens2020ModeEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk24 = (lrk)m.b;
            lrk24.a |= 0x100000;
            lrk24.x = booleanValue14;
            final lrj lens2020Params = this.lens2020Params();
            if (lens2020Params != null) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final lrk lrk25 = (lrk)m.b;
                lrk25.z = lens2020Params;
                lrk25.a |= 0x400000;
            }
        }
        final Long trivialFeatureEnabledBits = this.trivialFeatureEnabledBits();
        if (trivialFeatureEnabledBits != null) {
            final long longValue2 = trivialFeatureEnabledBits;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk26 = (lrk)m.b;
            lrk26.a |= 0x200000;
            lrk26.y = longValue2;
        }
        final Boolean pdpTextExtractionEnabled = this.pdpTextExtractionEnabled();
        if (pdpTextExtractionEnabled != null) {
            final boolean booleanValue15 = pdpTextExtractionEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk27 = (lrk)m.b;
            lrk27.a |= 0x1000000;
            lrk27.B = booleanValue15;
        }
        final ByteBuffer linkEvalConfigMetadata = this.linkEvalConfigMetadata();
        if (linkEvalConfigMetadata != null) {
            try {
                final lrw c = (lrw)oky.s(lrw.a, linkEvalConfigMetadata, okm.b());
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final lrk lrk28 = (lrk)m.b;
                c.getClass();
                lrk28.C = c;
                lrk28.a |= 0x2000000;
            }
            catch (final olm olm) {
                if (Log.isLoggable("LinkConfig", 6)) {
                    Log.e("LinkConfig", lrh.e("Unable to parse LinkEvalConfigMetadata.", new Object[0]));
                }
            }
        }
        final Boolean linkModelDownloadEnabled = this.linkModelDownloadEnabled();
        if (linkModelDownloadEnabled != null) {
            final boolean booleanValue16 = linkModelDownloadEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk29 = (lrk)m.b;
            lrk29.a |= 0x4000000;
            lrk29.D = booleanValue16;
        }
        final ByteBuffer serializedPipelineConfig = this.serializedPipelineConfig();
        if (serializedPipelineConfig != null) {
            final ojw s = ojw.s(serializedPipelineConfig);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk30 = (lrk)m.b;
            lrk30.a |= 0x8000000;
            lrk30.E = s;
        }
        final Boolean stopPipelineOnPause = this.stopPipelineOnPause();
        if (stopPipelineOnPause != null) {
            final boolean booleanValue17 = stopPipelineOnPause;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk31 = (lrk)m.b;
            lrk31.b |= 0x1;
            lrk31.J = booleanValue17;
        }
        final Boolean lightweightSuggestionsModeEnabled = this.lightweightSuggestionsModeEnabled();
        if (lightweightSuggestionsModeEnabled != null) {
            final boolean booleanValue18 = lightweightSuggestionsModeEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk32 = (lrk)m.b;
            lrk32.a |= 0x10000000;
            lrk32.F = booleanValue18;
        }
        final lro mobileRaidParams = this.mobileRaidParams();
        if (mobileRaidParams != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk33 = (lrk)m.b;
            lrk33.G = mobileRaidParams;
            lrk33.a |= 0x20000000;
        }
        final Boolean embedderModeEnabled = this.embedderModeEnabled();
        if (embedderModeEnabled != null) {
            final boolean booleanValue19 = embedderModeEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk34 = (lrk)m.b;
            lrk34.a |= 0x40000000;
            lrk34.H = booleanValue19;
        }
        final Boolean waitForVkpStartEnabled = this.waitForVkpStartEnabled();
        if (waitForVkpStartEnabled != null) {
            final boolean booleanValue20 = waitForVkpStartEnabled;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final lrk lrk35 = (lrk)m.b;
            lrk35.a |= Integer.MIN_VALUE;
            lrk35.I = booleanValue20;
        }
        return m.h().g();
    }
    
    public abstract Integer triggerMode();
    
    public abstract Long trivialFeatureEnabledBits();
    
    public abstract Boolean waitForVkpStartEnabled();
    
    public abstract Boolean wifiConnectionEnabled();
    
    public abstract Boolean wifiScanEnabled();
}
