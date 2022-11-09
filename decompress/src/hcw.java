import android.os.Handler;
import android.util.SparseArray;
import android.util.Size;
import j$.util.concurrent.ConcurrentHashMap;
import android.view.View$OnTouchListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnClickListener;
import com.google.android.apps.camera.rewind.RewindThumbnailScrollView;
import com.google.android.apps.camera.rewind.RewindExportShotView;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;
import android.graphics.drawable.Drawable;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.widget.ImageView;
import android.support.constraint.Guideline;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

class hcw extends hcu
{
    final /* synthetic */ hcz b;
    
    public hcw(final hcz b) {
        this.b = b;
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public final void f() {
        final nsx a = ntf.a;
        this.b.f.l();
        final hcp e = this.b.e;
        e.h.getClass();
        e.i.getClass();
        final Object systemService = e.c.getSystemService("layout_inflater");
        systemService.getClass();
        final LayoutInflater layoutInflater = (LayoutInflater)systemService;
        layoutInflater.inflate(2131624047, (ViewGroup)e.h, true);
        layoutInflater.inflate(2131624045, (ViewGroup)e.i, true);
        ((FrameLayout)e.i.findViewById(2131427737)).setClipToOutline(true);
        final ins b = ((inw)e.d.a()).b;
        final int width = b.b.getWidth();
        final Guideline guideline = (Guideline)e.i.findViewById(2131427730);
        final Guideline guideline2 = (Guideline)e.i.findViewById(2131427735);
        final jcb a2 = jcb.a;
        switch (((inw)e.d.a()).a.f.ordinal()) {
            case 2: {
                hcp.w(guideline, width - b.i.centerX());
                hcp.w(guideline2, width - b.l.left);
                break;
            }
            case 1: {
                hcp.w(guideline, b.i.centerX());
                hcp.w(guideline2, b.l.right);
                break;
            }
            case 0:
            case 3: {
                hcp.w(guideline, b.i.centerY());
                hcp.w(guideline2, b.l.bottom);
                break;
            }
        }
        final ImageView imageView = (ImageView)e.h.findViewById(2131427732);
        imageView.setClipToOutline(true);
        final hbv j = e.j;
        final hcr a3 = j.a();
        int i = 0;
        if (a3 != null) {
            final hby a4 = j.a;
            final List k = a3.a.i();
            if (!k.isEmpty()) {
                final nrw t = ((nns)k).t();
                while (t.hasNext()) {
                    final kvs kvs = t.next();
                    if (kvs == null) {
                        a.l(hby.a.b().g(ntf.a, "McFlyBuffer"), "Error adding Raw frame to Rewind buffer: Frame is null.", '\u08c6');
                    }
                    else {
                        final kvx b2 = kvs.b();
                        if (b2 == null) {
                            a.l(hby.a.b().g(ntf.a, "McFlyBuffer"), "Error adding Raw frame to Rewind buffer: Frame id is null.", '\u08c5');
                        }
                        else if (a4.c.containsKey((Object)b2.a)) {
                            kvs.close();
                        }
                        else {
                            a4.c.put((Object)b2.a, (Object)kvs);
                        }
                    }
                }
                if (a4.c.size() > 6) {
                    final ArrayList list = new ArrayList<Comparable<? super T>>(a4.c.keySet());
                    Collections.sort((List<Comparable>)list);
                    for (int l = 0; l < list.size() - 6; ++l) {
                        final long longValue = (long)list.get(l);
                        final ConcurrentHashMap c = a4.c;
                        final Long value = longValue;
                        try (final kvs kvs2 = (kvs)c.get((Object)value)) {}
                        a4.c.remove((Object)value);
                    }
                }
            }
        }
        Object a5 = j.a;
        ((hby)a5).b.readLock().lock();
        try {
            final ArrayList list2 = new ArrayList<Object>(((hby)a5).d.d());
            ((hby)a5).b.readLock().unlock();
            Collections.sort((List<E>)list2, bzj.k);
            final int n = list2.size() - 1;
            if (!list2.isEmpty()) {
                imageView.setImageDrawable((Drawable)e.v((hdb)list2.get(n)));
            }
            final CaptureAnimationOverlay captureAnimationOverlay = (CaptureAnimationOverlay)e.h.findViewById(2131427483);
            final RewindExportShotView rewindExportShotView = (RewindExportShotView)e.i.findViewById(2131427733);
            a5 = e.i.findViewById(2131427739);
            rewindExportShotView.setOnClickListener((View$OnClickListener)new hcg(e, (RewindThumbnailScrollView)a5, list2, captureAnimationOverlay));
            final Size b3 = ((inw)e.d.a()).b.b;
            int n2;
            if (jcb.d(jcb.a(e.e.getDefaultDisplay(), e.c))) {
                n2 = b3.getWidth();
            }
            else {
                n2 = b3.getHeight();
            }
            ((RewindThumbnailScrollView)a5).e(list2, n2);
            while (i < list2.size()) {
                if (e.j.b((hdb)list2.get(i))) {
                    ((RewindThumbnailScrollView)a5).d("Cannot set new high-quality indicators when uninitialized.");
                    final FrameLayout frameLayout = (FrameLayout)((RewindThumbnailScrollView)a5).findViewById(2131427734);
                    final ImageView imageView2 = new ImageView(((RewindThumbnailScrollView)a5).b);
                    imageView2.setImageDrawable(((RewindThumbnailScrollView)a5).c);
                    final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(((RewindThumbnailScrollView)a5).d);
                    layoutParams.leftMargin += ((RewindThumbnailScrollView)a5).c(i);
                    imageView2.setOnClickListener((View$OnClickListener)new hcs((RewindThumbnailScrollView)a5, i));
                    imageView2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    frameLayout.addView((View)imageView2);
                    final SparseArray a6 = ((RewindThumbnailScrollView)a5).a;
                    a6.getClass();
                    a6.put(i, (Object)imageView2);
                    if (((RewindThumbnailScrollView)a5).e < i) {
                        ((RewindThumbnailScrollView)a5).e = i;
                    }
                }
                ++i;
            }
            ((RewindThumbnailScrollView)a5).g = new hch(e, list2, imageView, rewindExportShotView);
            final hcm onTouchListener = new hcm((RewindThumbnailScrollView)a5, n, n2);
            imageView.setOnTouchListener((View$OnTouchListener)onTouchListener);
            if (e.o == null) {
                e.o = new hco(e, (View$OnTouchListener)onTouchListener);
                e.l.c.r(e.o);
            }
            final Handler m = e.m;
            a5.getClass();
            m.post((Runnable)new hci((RewindThumbnailScrollView)a5));
            e.n.c();
        }
        finally {
            ((hby)a5).b.readLock().unlock();
            while (true) {}
        }
    }
    
    @Override
    public final void g() {
    }
}
