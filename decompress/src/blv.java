import java.util.Iterator;
import java.util.Collections;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.Collection;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.CaptureResult;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blv extends kxc
{
    private final eyt a;
    private final Boolean b;
    private final float c;
    private final klj d;
    private final lfu e;
    private final boolean f;
    private final jbm g;
    private final lfj h;
    private int i;
    private final List j;
    private ljm k;
    private int l;
    private int m;
    private int n;
    
    public blv(final eyt a, final Boolean b, final lfg lfg, final klj d, final lfj h, final jbm g) {
        this.j = new ArrayList();
        this.k = null;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.a = a;
        this.b = b;
        this.d = d;
        final Rect h2 = lfg.h();
        this.c = (float)(h2.width() * h2.height());
        this.e = lfg.l();
        this.h = h;
        this.f = lfg.I();
        this.g = g;
    }
    
    private final blu j(final ljm ljm) {
        final byte[] array = (byte[])ljm.d(jlk.i);
        nie nie;
        if (array != null && array.length > 0) {
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
            try {
                nie = (nie)oky.o(nie.o, byteArrayInputStream);
            }
            catch (final IOException ex) {
                ex.getMessage();
                nie = null;
            }
        }
        else {
            nie = null;
        }
        final byte[] array2 = (byte[])ljm.d(jlk.j);
        nic nic;
        if (array2 != null && array2.length > 0) {
            final ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(array2);
            try {
                nic = (nic)oky.o(nic.h, byteArrayInputStream2);
            }
            catch (final IOException ex2) {
                ex2.getMessage();
                nic = null;
            }
        }
        else {
            nic = null;
        }
        final byte[] array3 = (byte[])ljm.d(jlk.k);
        nid nid;
        if (array3 != null && array3.length > 0) {
            final ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(array3);
            try {
                nid = (nid)oky.o(nid.k, byteArrayInputStream3);
            }
            catch (final IOException ex3) {
                ex3.getMessage();
                nid = null;
            }
        }
        else {
            nid = null;
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final int n = 0;
        if (nie != null) {
            list.add(niz.i(nie.a));
            list.add(niz.i(nie.c));
            list.add(niz.i(nie.d));
            list.add(niz.i(nie.e));
            list.add(niz.i(nie.f));
            float n2;
            if (!nie.g) {
                n2 = 0.0f;
            }
            else {
                n2 = 1.0f;
            }
            list.add(niz.i(n2));
            list.add(niz.i(nie.h));
            list.add(niz.i(nie.i));
            list.add(niz.i(nie.j));
            list.add(niz.i(nie.k));
            list.add(niz.i(nie.l));
            list.add(niz.i(nie.m));
            list.add(niz.i(nie.n));
        }
        else {
            for (int i = 0; i < 13; ++i) {
                list.add(nii.a);
            }
        }
        if (nic != null) {
            list.add(niz.i(nic.a));
            float n3;
            if (!nic.b) {
                n3 = 0.0f;
            }
            else {
                n3 = 1.0f;
            }
            list.add(niz.i(n3));
            list.add(niz.i(nic.c));
            float n4;
            if (!nic.e) {
                n4 = 0.0f;
            }
            else {
                n4 = 1.0f;
            }
            list.add(niz.i(n4));
            list.add(niz.i(nic.g));
        }
        else {
            for (int j = 0; j < 5; ++j) {
                list.add(nii.a);
            }
        }
        final int n5 = 9;
        if (nid != null) {
            list.add(niz.i(nid.a));
            list.add(niz.i(nid.b));
            list.add(niz.i(nid.c));
            list.add(niz.i(nid.d));
            list.add(niz.i(nid.e));
            list.add(niz.i(nid.f));
            list.add(niz.i(nid.g));
            list.add(niz.i(nid.h));
            list.add(niz.i(nid.i));
        }
        else {
            for (int k = 0; k < 9; ++k) {
                list.add(nii.a);
            }
        }
        list.add(k(ljm, false, true, false));
        list.add(niz.h(ljm.d(CaptureResult.LENS_FOCUS_DISTANCE)));
        list.add(k(ljm, true, false, false));
        Float n6 = null;
        Float n7 = null;
        Float n8 = null;
        Label_0988: {
            if (nic != null) {
                final ole f = nic.f;
                if (f.size() >= 3) {
                    n6 = f.get(0);
                    n7 = f.get(1);
                    n8 = f.get(2);
                    break Label_0988;
                }
            }
            n8 = null;
            n6 = null;
            n7 = null;
        }
        list.add(niz.h(n6));
        list.add(niz.h(n7));
        list.add(niz.h(n8));
        list.add(k(ljm, false, false, true));
        list.add(niz.i(this.c));
        final Face[] array4 = (Face[])ljm.d(CaptureResult.STATISTICS_FACES);
        Float value = null;
        Float value2 = null;
        Label_1167: {
            if (array4 != null) {
                final int length = array4.length;
                if (length > 0) {
                    final float n9 = (float)length;
                    float n10 = 0.0f;
                    for (int l = n; l < length; ++l) {
                        final Face face = array4[l];
                        n10 += face.getBounds().width() * face.getBounds().height();
                    }
                    value = n10;
                    value2 = n9;
                    break Label_1167;
                }
            }
            value2 = null;
            value = null;
        }
        list.add(niz.h(value2));
        list.add(niz.h(value));
        list.add(niz.i(this.d.aQ()));
        final Integer n11 = (Integer)ljm.d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        niz niz;
        if (n11 != null) {
            niz = niz.i((float)n11);
        }
        else {
            niz = nii.a;
        }
        list.add(niz);
        final Boolean b = (Boolean)ljm.d(CaptureResult.CONTROL_AE_LOCK);
        if (b != null) {
            float n12;
            if (!b) {
                n12 = 0.0f;
            }
            else {
                n12 = 1.0f;
            }
            list.add(niz.i(n12));
        }
        else {
            list.add(nii.a);
        }
        list2.add(niz.h(ljm.d(CaptureResult.CONTROL_AE_STATE)));
        list2.add(niz.h(ljm.d(CaptureResult.CONTROL_AF_STATE)));
        list2.add(niz.h(ljm.d(CaptureResult.CONTROL_AWB_STATE)));
        if (nic != null) {
            int n13 = 0;
            switch (nic.d) {
                default: {
                    n13 = 0;
                    break;
                }
                case 3: {
                    n13 = 5;
                    break;
                }
                case 2: {
                    n13 = 4;
                    break;
                }
                case 1: {
                    n13 = 3;
                    break;
                }
                case 0: {
                    n13 = 2;
                    break;
                }
            }
            int n14 = n13;
            if (n13 == 0) {
                n14 = 1;
            }
            if (n14 == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            list2.add(niz.i(n14 - 2));
        }
        else {
            list2.add(nii.a);
        }
        if (nie != null) {
            list2.add(niz.i(nie.b));
        }
        else {
            list2.add(nii.a);
        }
        list2.add(niz.h(ljm.d(CaptureResult.FLASH_STATE)));
        if (nid != null) {
            list2.add(niz.i(nid.j));
        }
        else {
            list2.add(nii.a);
        }
        final lfu e = this.e;
        final String s = (String)ljm.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        int c;
        if (e == lfu.c) {
            c = 4;
        }
        else {
            final lfu a = lfu.a;
            if (s != null && this.f) {
                if (this.h.a.equals(s)) {
                    c = n5;
                    if (e == a) {
                        c = 11;
                    }
                }
                else if (e == a) {
                    c = 12;
                }
                else {
                    c = 10;
                }
            }
            else if (e == a) {
                c = 2;
            }
            else {
                c = 3;
            }
        }
        final blt blt = new blt();
        final nns m = nns.j(list);
        if (m == null) {
            throw new NullPointerException("Null dataFieldsFloat");
        }
        blt.a = m;
        final nns j2 = nns.j(list2);
        if (j2 != null) {
            blt.b = j2;
            blt.c = c;
            final jbm g = this.g;
            final jbm a2 = jbm.a;
            int d = 0;
            switch (g.ordinal()) {
                default: {
                    d = 1;
                    break;
                }
                case 12: {
                    d = 5;
                    break;
                }
                case 6: {
                    d = 4;
                    break;
                }
                case 2: {
                    d = 6;
                    break;
                }
                case 1: {
                    d = 3;
                    break;
                }
                case 0: {
                    d = 2;
                    break;
                }
            }
            blt.d = d;
            final nns a3 = blt.a;
            if (a3 != null) {
                final nns b2 = blt.b;
                if (b2 != null) {
                    final int c2 = blt.c;
                    if (c2 != 0) {
                        final blu blu = new blu(a3, b2, c2, d);
                        njo.u(blu.a.size() == 40 && blu.b.size() == 7, "Incorrect number of data fields. expected floats=%s, integers=%s. received floats=%s, integers=%s", 40, 7, blu.a.size(), blu.b.size());
                        return blu;
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            if (blt.a == null) {
                sb.append(" dataFieldsFloat");
            }
            if (blt.b == null) {
                sb.append(" dataFieldsInteger");
            }
            if (blt.c == 0) {
                sb.append(" cameraPosition");
            }
            if (blt.d == 0) {
                sb.append(" cameraApplicationMode");
            }
            final String value3 = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value3);
            throw new IllegalStateException(sb2.toString());
        }
        throw new NullPointerException("Null dataFieldsInteger");
    }
    
    private static niz k(final ljm ljm, final boolean b, final boolean b2, final boolean b3) {
        final ArrayList list = new ArrayList();
        if (b) {
            final MeteringRectangle[] array = (MeteringRectangle[])ljm.d(CaptureResult.CONTROL_AF_REGIONS);
            if (array != null) {
                Collections.addAll(list, array);
            }
        }
        if (b2) {
            final MeteringRectangle[] array2 = (MeteringRectangle[])ljm.d(CaptureResult.CONTROL_AE_REGIONS);
            if (array2 != null) {
                Collections.addAll(list, array2);
            }
        }
        if (b3) {
            final MeteringRectangle[] array3 = (MeteringRectangle[])ljm.d(CaptureResult.CONTROL_AWB_REGIONS);
            if (array3 != null) {
                Collections.addAll(list, array3);
            }
        }
        Float value;
        if (!list.isEmpty()) {
            final int size = list.size();
            int i = 0;
            float n = 0.0f;
            while (i < size) {
                final MeteringRectangle meteringRectangle = (MeteringRectangle)list.get(i);
                n += meteringRectangle.getWidth() * meteringRectangle.getHeight();
                ++i;
            }
            value = n;
        }
        else {
            value = null;
        }
        return niz.h(value);
    }
    
    private final void r(final List list, int n, int i) {
        monitorenter(this);
        try {
            if (list.isEmpty()) {
                monitorexit(this);
                return;
            }
            int n2;
            if ((n2 = i) != 3) {
                n2 = 2;
            }
            List<E> a = new ArrayList();
            List<E> list2 = new ArrayList();
            int n3;
            if (n2 == 2) {
                final blu blu = list.get(0);
                a = blu.a;
                list2 = blu.b;
                n3 = blu.c;
                i = blu.d;
            }
            else {
                n3 = 0;
                i = 0;
            }
            if (n2 == 3) {
                final int size = list.size();
                Iterator iterator;
                float n4;
                boolean b;
                niz niz;
                niz niz2;
                for (i = 0; i < 40; ++i) {
                    iterator = list.iterator();
                    n4 = 0.0f;
                    b = false;
                    while (iterator.hasNext()) {
                        niz = ((blu)iterator.next()).a.get(i);
                        if (niz.g()) {
                            n4 += (float)niz.c();
                            b = true;
                        }
                    }
                    if (b) {
                        niz2 = niz.i(n4 / size);
                    }
                    else {
                        niz2 = nii.a;
                    }
                    a.add((E)niz2);
                }
                final blu blu2 = (blu)nov.d(list);
                list2 = blu2.b;
                n3 = blu2.c;
                i = blu2.d;
            }
            final niz niz3 = (niz)a.get(0);
            final niz niz4 = (niz)a.get(1);
            final niz niz5 = (niz)a.get(2);
            final niz niz6 = (niz)a.get(3);
            final niz niz7 = (niz)a.get(4);
            final niz niz8 = (niz)a.get(5);
            final niz niz9 = (niz)a.get(6);
            final niz niz10 = (niz)a.get(7);
            final niz niz11 = (niz)a.get(8);
            final niz niz12 = (niz)a.get(9);
            final niz niz13 = (niz)a.get(10);
            final niz niz14 = (niz)a.get(11);
            final niz niz15 = (niz)a.get(12);
            final niz niz16 = (niz)a.get(13);
            final niz niz17 = (niz)a.get(14);
            final niz niz18 = (niz)a.get(15);
            final niz niz19 = (niz)a.get(16);
            final niz niz20 = (niz)a.get(17);
            final niz niz21 = (niz)a.get(18);
            final niz niz22 = (niz)a.get(19);
            final niz niz23 = (niz)a.get(20);
            final niz niz24 = (niz)a.get(21);
            final niz niz25 = (niz)a.get(22);
            final niz niz26 = (niz)a.get(23);
            final niz niz27 = (niz)a.get(24);
            final niz niz28 = (niz)a.get(25);
            final niz niz29 = (niz)a.get(26);
            final niz niz30 = (niz)a.get(27);
            final niz niz31 = (niz)a.get(28);
            final niz niz32 = (niz)a.get(29);
            final niz niz33 = (niz)a.get(30);
            final niz niz34 = (niz)a.get(31);
            final niz niz35 = (niz)a.get(32);
            final niz niz36 = (niz)a.get(33);
            final niz niz37 = (niz)a.get(34);
            final niz niz38 = (niz)a.get(35);
            final niz niz39 = (niz)a.get(36);
            final niz niz40 = (niz)a.get(37);
            final niz niz41 = (niz)a.get(38);
            final niz niz42 = (niz)a.get(39);
            final niz niz43 = (niz)list2.get(0);
            final niz niz44 = (niz)list2.get(1);
            final niz niz45 = (niz)list2.get(2);
            final niz niz46 = (niz)list2.get(3);
            final niz niz47 = (niz)list2.get(4);
            final niz niz48 = (niz)list2.get(5);
            final niz niz49 = (niz)list2.get(6);
            final okt m = obf.ad.m();
            final int size2 = list.size();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obf obf = (obf)m.b;
            obf.a |= 0x1;
            obf.c = size2;
            if (niz3.g()) {
                final float floatValue = (float)niz3.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf2 = (obf)m.b;
                obf2.a |= 0x2;
                obf2.d = floatValue;
            }
            if (niz4.g()) {
                final float floatValue2 = (float)niz4.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf3 = (obf)m.b;
                obf3.a |= 0x8;
                obf3.e = floatValue2;
            }
            if (niz5.g()) {
                final float floatValue3 = (float)niz5.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf4 = (obf)m.b;
                obf4.a |= 0x10;
                obf4.f = floatValue3;
            }
            if (niz6.g()) {
                final float floatValue4 = (float)niz6.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf5 = (obf)m.b;
                obf5.a |= 0x20;
                obf5.g = floatValue4;
            }
            if (niz7.g()) {
                final float floatValue5 = (float)niz7.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf6 = (obf)m.b;
                obf6.a |= 0x40;
                obf6.h = floatValue5;
            }
            if (niz8.g()) {
                final float floatValue6 = (float)niz8.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf7 = (obf)m.b;
                obf7.a |= 0x80;
                obf7.i = floatValue6;
            }
            if (niz9.g()) {
                final float floatValue7 = (float)niz9.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf8 = (obf)m.b;
                obf8.a |= 0x100;
                obf8.j = floatValue7;
            }
            if (niz10.g()) {
                final float floatValue8 = (float)niz10.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf9 = (obf)m.b;
                obf9.a |= 0x200;
                obf9.k = floatValue8;
            }
            if (niz11.g()) {
                final float floatValue9 = (float)niz11.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf10 = (obf)m.b;
                obf10.a |= 0x400;
                obf10.l = floatValue9;
            }
            if (niz12.g()) {
                final float floatValue10 = (float)niz12.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf11 = (obf)m.b;
                obf11.a |= 0x800;
                obf11.m = floatValue10;
            }
            if (niz13.g()) {
                final float floatValue11 = (float)niz13.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf12 = (obf)m.b;
                obf12.a |= 0x1000;
                obf12.n = floatValue11;
            }
            if (niz14.g()) {
                final float floatValue12 = (float)niz14.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf13 = (obf)m.b;
                obf13.a |= 0x2000;
                obf13.o = floatValue12;
            }
            if (niz15.g()) {
                final float floatValue13 = (float)niz15.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf14 = (obf)m.b;
                obf14.a |= 0x4000;
                obf14.p = floatValue13;
            }
            if (niz16.g()) {
                final float floatValue14 = (float)niz16.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf15 = (obf)m.b;
                obf15.a |= 0x8000;
                obf15.q = floatValue14;
            }
            if (niz17.g()) {
                final float floatValue15 = (float)niz17.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf16 = (obf)m.b;
                obf16.a |= 0x10000;
                obf16.r = floatValue15;
            }
            if (niz18.g()) {
                final float floatValue16 = (float)niz18.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf17 = (obf)m.b;
                obf17.a |= 0x20000;
                obf17.s = floatValue16;
            }
            if (niz19.g()) {
                final float floatValue17 = (float)niz19.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf18 = (obf)m.b;
                obf18.a |= 0x40000;
                obf18.t = floatValue17;
            }
            if (niz20.g()) {
                final float floatValue18 = (float)niz20.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf19 = (obf)m.b;
                obf19.a |= 0x80000;
                obf19.u = floatValue18;
            }
            if (niz21.g()) {
                final float floatValue19 = (float)niz21.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf20 = (obf)m.b;
                obf20.a |= 0x100000;
                obf20.v = floatValue19;
            }
            if (niz22.g()) {
                final float floatValue20 = (float)niz22.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf21 = (obf)m.b;
                obf21.a |= 0x200000;
                obf21.w = floatValue20;
            }
            if (niz23.g()) {
                final float floatValue21 = (float)niz23.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf22 = (obf)m.b;
                obf22.a |= 0x400000;
                obf22.x = floatValue21;
            }
            if (niz24.g()) {
                final float floatValue22 = (float)niz24.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf23 = (obf)m.b;
                obf23.a |= 0x800000;
                obf23.y = floatValue22;
            }
            if (niz25.g()) {
                final float floatValue23 = (float)niz25.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf24 = (obf)m.b;
                obf24.a |= 0x1000000;
                obf24.z = floatValue23;
            }
            if (niz26.g()) {
                final float floatValue24 = (float)niz26.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf25 = (obf)m.b;
                obf25.a |= 0x2000000;
                obf25.A = floatValue24;
            }
            if (niz27.g()) {
                final float floatValue25 = (float)niz27.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf26 = (obf)m.b;
                obf26.a |= 0x4000000;
                obf26.B = floatValue25;
            }
            if (niz28.g()) {
                final float floatValue26 = (float)niz28.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf27 = (obf)m.b;
                obf27.a |= 0x8000000;
                obf27.C = floatValue26;
            }
            if (niz29.g()) {
                final float floatValue27 = (float)niz29.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf28 = (obf)m.b;
                obf28.a |= 0x10000000;
                obf28.D = floatValue27;
            }
            if (niz43.g()) {
                final int intValue = (int)niz43.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf29 = (obf)m.b;
                obf29.a |= 0x20000000;
                obf29.E = intValue;
            }
            if (niz30.g()) {
                final float floatValue28 = (float)niz30.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf30 = (obf)m.b;
                obf30.a |= 0x40000000;
                obf30.F = floatValue28;
            }
            if (niz31.g()) {
                final float floatValue29 = (float)niz31.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf31 = (obf)m.b;
                obf31.a |= Integer.MIN_VALUE;
                obf31.G = floatValue29;
            }
            if (niz44.g()) {
                final int intValue2 = (int)niz44.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf32 = (obf)m.b;
                obf32.b |= 0x1;
                obf32.H = intValue2;
            }
            if (niz32.g()) {
                final float floatValue30 = (float)niz32.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf33 = (obf)m.b;
                obf33.b |= 0x2;
                obf33.I = floatValue30;
            }
            if (niz33.g()) {
                final float floatValue31 = (float)niz33.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf34 = (obf)m.b;
                obf34.b |= 0x4;
                obf34.J = floatValue31;
            }
            if (niz34.g()) {
                final float floatValue32 = (float)niz34.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf35 = (obf)m.b;
                obf35.b |= 0x8;
                obf35.K = floatValue32;
            }
            if (niz35.g()) {
                final float floatValue33 = (float)niz35.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf36 = (obf)m.b;
                obf36.b |= 0x10;
                obf36.L = floatValue33;
            }
            if (niz45.g()) {
                final int intValue3 = (int)niz45.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf37 = (obf)m.b;
                obf37.b |= 0x20;
                obf37.M = intValue3;
            }
            if (niz36.g()) {
                final float floatValue34 = (float)niz36.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf38 = (obf)m.b;
                obf38.b |= 0x40;
                obf38.N = floatValue34;
            }
            if (niz37.g()) {
                final float floatValue35 = (float)niz37.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf39 = (obf)m.b;
                obf39.b |= 0x80;
                obf39.O = floatValue35;
            }
            if (niz38.g()) {
                final float floatValue36 = (float)niz38.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf40 = (obf)m.b;
                obf40.b |= 0x100;
                obf40.P = floatValue36;
            }
            if (niz39.g()) {
                final float floatValue37 = (float)niz39.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf41 = (obf)m.b;
                obf41.b |= 0x200;
                obf41.Q = floatValue37;
            }
            if (niz40.g()) {
                final float floatValue38 = (float)niz40.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf42 = (obf)m.b;
                obf42.b |= 0x400;
                obf42.R = floatValue38;
            }
            if (niz46.g()) {
                final int intValue4 = (int)niz46.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf43 = (obf)m.b;
                obf43.b |= 0x1000;
                obf43.T = intValue4;
            }
            if (niz47.g()) {
                final int intValue5 = (int)niz47.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf44 = (obf)m.b;
                obf44.b |= 0x2000;
                obf44.U = intValue5;
            }
            if (niz41.g()) {
                final float floatValue39 = (float)niz41.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf45 = (obf)m.b;
                obf45.b |= 0x8000;
                obf45.W = floatValue39;
            }
            if (niz42.g()) {
                final float floatValue40 = (float)niz42.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf46 = (obf)m.b;
                obf46.b |= 0x10000;
                obf46.X = floatValue40;
            }
            if (niz48.g()) {
                final int intValue6 = (int)niz48.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf47 = (obf)m.b;
                obf47.b |= 0x20000;
                obf47.Y = intValue6;
            }
            if (niz49.g()) {
                final int intValue7 = (int)niz49.c();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf48 = (obf)m.b;
                obf48.b |= 0x40000;
                obf48.Z = intValue7;
            }
            if (n == 2) {
                final int l = this.l;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final obf obf49 = (obf)m.b;
                final int b2 = obf49.b | 0x80000;
                obf49.b = b2;
                obf49.aa = l;
                final int j = this.m;
                final int b3 = b2 | 0x100000;
                obf49.b = b3;
                obf49.ab = j;
                final int n5 = this.n;
                obf49.b = (b3 | 0x200000);
                obf49.ac = n5;
            }
            if (m.c) {
                m.m();
                m.c = false;
            }
            final obf obf50 = (obf)m.b;
            if (n3 == 0) {
                throw null;
            }
            obf50.S = n3 - 1;
            final int b4 = obf50.b | 0x800;
            obf50.b = b4;
            if (i != 0) {
                obf50.V = i - 1;
                obf50.b = (b4 | 0x4000);
                final obf d = (obf)m.h();
                final eyt a2 = this.a;
                final okt k = obg.e.m();
                if (k.c) {
                    k.m();
                    k.c = false;
                }
                final obg obg = (obg)k.b;
                obg.b = n - 1;
                n = (obg.a | 0x1);
                obg.a = n;
                obg.c = n2 - 1;
                n |= 0x2;
                obg.a = n;
                d.getClass();
                obg.d = d;
                obg.a = (n | 0x4);
                a2.D((obg)k.h());
                monitorexit(this);
                return;
            }
            throw null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void a(final int n) {
        monitorenter(this);
        try {
            if (this.b) {
                final ljm k = this.k;
                if (k != null) {
                    this.r(nns.m(this.j(k)), n, 2);
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final ljm k) {
        synchronized (this) {
            if (!this.b) {
                return;
            }
            this.k = k;
            ++this.i;
            if (this.l == -1) {
                final Integer n = (Integer)k.d(CaptureResult.CONTROL_AE_STATE);
                if (n != null) {
                    if (n == 2 || n == 4 || n == 3) {
                        this.l = this.i;
                    }
                }
            }
            if (this.m == -1) {
                final Integer n2 = (Integer)k.d(CaptureResult.CONTROL_AF_STATE);
                if (n2 != null) {
                    if (n2 == 2 || n2 == 4 || n2 == 5) {
                        this.m = this.i;
                    }
                }
            }
            if (this.n == -1) {
                final Integer n3 = (Integer)k.d(CaptureResult.CONTROL_AWB_STATE);
                if (n3 != null) {
                    if (n3 == 2 || n3 == 3) {
                        this.n = this.i;
                    }
                }
            }
            if (this.i > 60) {
                return;
            }
            this.j.add(this.j(k));
            if (this.i == 60) {
                this.r(this.j, 2, 3);
            }
        }
    }
}
