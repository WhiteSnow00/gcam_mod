import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ivn implements ivq
{
    final /* synthetic */ ivp a;
    
    public ivn(final ivp a) {
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            for (final ivq ivq : this.a.c) {
                final jbj f = this.a.f;
                if (f != null && f.h) {
                    ivq.onShutterButtonLongPressUnlock();
                }
                else {
                    ivq.onShutterButtonClick();
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterButtonDown() {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterButtonDown();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterButtonLongPressRelease() {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            this.a.a.setVisualFeedbackForEnableState(true);
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterButtonLongPressRelease();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterButtonLongPressUnlock() {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            this.a.a.setVisualFeedbackForEnableState(true);
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterButtonLongPressUnlock();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterButtonLongPressed() {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            this.a.a.setVisualFeedbackForEnableState(false);
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterButtonLongPressed();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterButtonPressedStateChanged(final boolean b) {
        final Object b2 = this.a.b;
        monitorenter(b2);
        try {
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterButtonPressedStateChanged(b);
            }
            monitorexit(b2);
        }
        finally {
            monitorexit(b2);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterTouch(final jby jby) {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterTouch(jby);
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final void onShutterTouchStart() {
        final Object b = this.a.b;
        monitorenter(b);
        try {
            final Iterator iterator = this.a.c.iterator();
            while (iterator.hasNext()) {
                ((ivq)iterator.next()).onShutterTouchStart();
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
