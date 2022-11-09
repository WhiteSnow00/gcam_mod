import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@pka(b = "androidx.camera.camera2.pipe.compat.Camera2CameraDevices$findAll$1", c = "Camera2CameraDevices.kt", d = "invokeSuspend", e = { 34 })
public final class xp extends pkf implements plc
{
    int a;
    final /* synthetic */ xq b;
    
    public xp(final xq b, final pjl pjl) {
        this.b = b;
        super(pjl);
    }
    
    public final Object b(Object o) {
        final pjs a = pjs.a;
        final Object o2;
        switch (this.a) {
            default: {
                pip.b(o);
                o2 = o;
                break;
            }
            case 0: {
                pip.b(o);
                final xu a2 = this.b.a;
                this.a = 1;
                o = a2.b;
                synchronized (o) {
                    final List c = a2.c;
                    monitorexit(o);
                    if (c == null) {
                        o = null;
                    }
                    else {
                        o = (c.isEmpty() ^ true);
                    }
                    Label_0399: {
                        if (plr.b(o, true)) {
                            o = c;
                        }
                        else {
                            final pnw a3 = a2.a.a;
                            o = new xt(a2, null);
                            final pjq d = this.d();
                            final pjq ch = d.ch(a3);
                            ch.getClass();
                            final pou pou = (pou)ch.b(pou.b);
                            if (pou != null && !pou.r()) {
                                throw pou.n();
                            }
                            if (ch == d) {
                                final pqc pqc = new pqc(ch, this);
                                o = pqj.a(pqc, pqc, (plc)o);
                            }
                            else {
                                if (plr.b(ch.b(pjm.a), d.b(pjm.a))) {
                                    final ppj ppj = new ppj(ch, this);
                                    final Object b = pqh.b(ch, null);
                                    try {
                                        o = pqj.a(ppj, ppj, (plc)o);
                                        break Label_0399;
                                    }
                                    finally {
                                        pqh.c(ch, b);
                                    }
                                }
                                final pog pog = new pog(ch, this);
                                pqj.b((plc)o, pog, pog);
                                o = pog.a;
                                do {
                                    switch (((pnd)o).a) {
                                        default: {
                                            throw new IllegalStateException("Already suspended".toString());
                                        }
                                        case 2: {
                                            o = ppc.b(pog.v());
                                            if (!(o instanceof pnq)) {
                                                break Label_0399;
                                            }
                                            throw ((pnq)o).b;
                                        }
                                        case 0: {
                                            continue;
                                        }
                                    }
                                } while (!pog.a.c(0, 1));
                                o = pjs.a;
                            }
                        }
                    }
                    if (o == a) {
                        return a;
                    }
                }
                break;
            }
        }
        return o2;
    }
    
    @Override
    public final pjl c(final Object o, final pjl pjl) {
        return new xp(this.b, pjl);
    }
}
