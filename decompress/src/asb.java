import java.util.Iterator;
import android.hardware.Camera$Size;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import android.hardware.Camera$Parameters;

// 
// Decompiled by Procyon v0.6.0
// 

final class asb extends atl
{
    private aab x;
    private aab y;
    
    static {
        new aub("AndCamCapabs");
    }
    
    public asb(final Camera$Parameters camera$Parameters) {
        super(new atj());
        this.x = new aab(4);
        this.y = new aab(5);
        this.o = camera$Parameters.getMaxExposureCompensation();
        this.n = camera$Parameters.getMinExposureCompensation();
        this.p = camera$Parameters.getExposureCompensationStep();
        this.q = camera$Parameters.getMaxNumDetectedFaces();
        this.s = camera$Parameters.getMaxNumMeteringAreas();
        this.m = new aua(camera$Parameters.getPreferredPreviewSizeForVideo());
        this.d.addAll(camera$Parameters.getSupportedPreviewFormats());
        this.g.addAll(camera$Parameters.getSupportedPictureFormats());
        this.u = camera$Parameters.getHorizontalViewAngle();
        this.v = camera$Parameters.getVerticalViewAngle();
        final List supportedPreviewFpsRange = camera$Parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            this.b.addAll(supportedPreviewFpsRange);
        }
        Collections.sort((List<Object>)this.b, this.x);
        final List supportedPreviewSizes = camera$Parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (final Camera$Size camera$Size : supportedPreviewSizes) {
                this.c.add(new aua(camera$Size.width, camera$Size.height));
            }
        }
        Collections.sort((List<Object>)this.c, this.y);
        final List supportedVideoSizes = camera$Parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (final Camera$Size camera$Size2 : supportedVideoSizes) {
                this.e.add(new aua(camera$Size2.width, camera$Size2.height));
            }
        }
        Collections.sort((List<Object>)this.e, this.y);
        final List supportedPictureSizes = camera$Parameters.getSupportedPictureSizes();
        if (supportedPictureSizes != null) {
            for (final Camera$Size camera$Size3 : supportedPictureSizes) {
                this.f.add(new aua(camera$Size3.width, camera$Size3.height));
            }
        }
        Collections.sort((List<Object>)this.f, this.y);
        final List supportedSceneModes = camera$Parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (final String s : supportedSceneModes) {
                if ("auto".equals(s)) {
                    this.h.add(ati.b);
                }
                else if ("action".equals(s)) {
                    this.h.add(ati.c);
                }
                else if ("barcode".equals(s)) {
                    this.h.add(ati.d);
                }
                else if ("beach".equals(s)) {
                    this.h.add(ati.e);
                }
                else if ("candlelight".equals(s)) {
                    this.h.add(ati.f);
                }
                else if ("fireworks".equals(s)) {
                    this.h.add(ati.g);
                }
                else if ("hdr".equals(s)) {
                    this.h.add(ati.h);
                }
                else if ("landscape".equals(s)) {
                    this.h.add(ati.i);
                }
                else if ("night".equals(s)) {
                    this.h.add(ati.j);
                }
                else if ("night-portrait".equals(s)) {
                    this.h.add(ati.k);
                }
                else if ("party".equals(s)) {
                    this.h.add(ati.l);
                }
                else if ("portrait".equals(s)) {
                    this.h.add(ati.m);
                }
                else if ("snow".equals(s)) {
                    this.h.add(ati.n);
                }
                else if ("sports".equals(s)) {
                    this.h.add(ati.o);
                }
                else if ("steadyphoto".equals(s)) {
                    this.h.add(ati.p);
                }
                else if ("sunset".equals(s)) {
                    this.h.add(ati.q);
                }
                else {
                    if (!"theatre".equals(s)) {
                        continue;
                    }
                    this.h.add(ati.r);
                }
            }
        }
        final List supportedFlashModes = camera$Parameters.getSupportedFlashModes();
        if (supportedFlashModes == null) {
            this.i.add(atg.a);
        }
        else {
            for (final String s2 : supportedFlashModes) {
                if ("auto".equals(s2)) {
                    this.i.add(atg.b);
                }
                else if ("off".equals(s2)) {
                    this.i.add(atg.c);
                }
                else if ("on".equals(s2)) {
                    this.i.add(atg.d);
                }
                else if ("red-eye".equals(s2)) {
                    this.i.add(atg.f);
                }
                else {
                    if (!"torch".equals(s2)) {
                        continue;
                    }
                    this.i.add(atg.e);
                }
            }
        }
        final List supportedFocusModes = camera$Parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (final String s3 : supportedFocusModes) {
                if ("auto".equals(s3)) {
                    this.j.add(ath.a);
                }
                else if ("continuous-picture".equals(s3)) {
                    this.j.add(ath.b);
                }
                else if ("continuous-video".equals(s3)) {
                    this.j.add(ath.c);
                }
                else if ("edof".equals(s3)) {
                    this.j.add(ath.d);
                }
                else if ("fixed".equals(s3)) {
                    this.j.add(ath.e);
                }
                else if ("infinity".equals(s3)) {
                    this.j.add(ath.f);
                }
                else {
                    if (!"macro".equals(s3)) {
                        continue;
                    }
                    this.j.add(ath.g);
                }
            }
        }
        final List supportedFocusModes2 = camera$Parameters.getSupportedFocusModes();
        if (supportedFocusModes2 != null) {
            for (final String s4 : supportedFocusModes2) {
                if ("auto".equals(s4)) {
                    this.k.add(atk.a);
                }
                else if ("cloudy-daylight".equals(s4)) {
                    this.k.add(atk.b);
                }
                else if ("daylight".equals(s4)) {
                    this.k.add(atk.c);
                }
                else if ("fluorescent".equals(s4)) {
                    this.k.add(atk.d);
                }
                else if ("incandescent".equals(s4)) {
                    this.k.add(atk.e);
                }
                else if ("shade".equals(s4)) {
                    this.k.add(atk.f);
                }
                else if ("twilight".equals(s4)) {
                    this.k.add(atk.g);
                }
                else {
                    if (!"warm-fluorescent".equals(s4)) {
                        continue;
                    }
                    this.k.add(atk.h);
                }
            }
        }
        if (camera$Parameters.isZoomSupported()) {
            this.t = camera$Parameters.getZoomRatios().get(camera$Parameters.getMaxZoom()) / 100.0f;
            this.l.add(atf.a);
        }
        if (camera$Parameters.isVideoSnapshotSupported()) {
            this.l.add(atf.b);
        }
        if (camera$Parameters.isAutoExposureLockSupported()) {
            this.l.add(atf.e);
        }
        if (camera$Parameters.isAutoWhiteBalanceLockSupported()) {
            this.l.add(atf.f);
        }
        if (this.f(ath.a) && (this.r = camera$Parameters.getMaxNumFocusAreas()) > 0) {
            this.l.add(atf.c);
        }
        if (this.s > 0) {
            this.l.add(atf.d);
        }
    }
    
    public asb(final asb asb) {
        super(asb);
        this.x = new aab(4);
        this.y = new aab(5);
    }
}
