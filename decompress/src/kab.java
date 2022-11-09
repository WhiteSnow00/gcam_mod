import android.os.IBinder;
import android.database.Cursor;
import android.content.Intent;
import android.os.RemoteException;
import android.os.Parcel;
import android.util.Log;
import android.os.SystemClock;
import android.os.IInterface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class kab implements kac
{
    private static final Object a;
    private static jxi b;
    private static boolean c;
    
    static {
        a = new Object();
        kab.c = false;
    }
    
    public kab(final Context context) {
    }
    
    @Override
    public final IInterface a(final Context context, final String s, final kae kae) {
        try {
            synchronized (kab.a) {
                if (kab.b == null) {
                    try {
                        final Boolean a = jxi.a;
                        final jxd jxd = jxi.c.get();
                        Object o = new jxd();
                        jxi.c.set(o);
                        final long longValue = jxi.d.get();
                        try {
                            jxi.d.set(SystemClock.elapsedRealtime());
                            final jxh a2 = jxc.a(context, jxi.e);
                            final int c = a2.c;
                            Label_1484: {
                                if (c == 0 || (c == -1 && a2.a == 0) || (c == 1 && a2.b == 0)) {
                                    break Label_1484;
                                }
                                Label_1422: {
                                    if (c == -1) {
                                        b = jxi.c(context);
                                        if (longValue == 0L) {
                                            jxi.d.remove();
                                        }
                                        else {
                                            jxi.d.set(longValue);
                                        }
                                        o = ((jxd)o).a;
                                        if (o != null) {
                                            ((Cursor)o).close();
                                        }
                                        jxi.c.set(jxd);
                                        break Label_1422;
                                    }
                                    Label_1444: {
                                        if (c != 1) {
                                            break Label_1444;
                                        }
                                        try {
                                            final int b2 = a2.b;
                                            while (true) {
                                                try {
                                                    synchronized (jxi.class) {
                                                        final Boolean a3 = jxi.a;
                                                        monitorexit(jxi.class);
                                                        if (a3 != null) {
                                                            Label_1117: {
                                                                if (a3) {
                                                                    synchronized (jxi.class) {
                                                                        final jxk f = jxi.f;
                                                                        monitorexit(jxi.class);
                                                                        if (f != null) {
                                                                            final jxd jxd2 = jxi.c.get();
                                                                            if (jxd2 != null && jxd2.a != null) {
                                                                                Object o2 = context.getApplicationContext();
                                                                                final Cursor a4 = jxd2.a;
                                                                                jww.b(null);
                                                                                synchronized (jxi.class) {
                                                                                    final boolean b3 = jxi.b >= 2;
                                                                                    monitorexit(jxi.class);
                                                                                    jwx jwx;
                                                                                    if ((boolean)b3) {
                                                                                        o2 = jww.b(o2);
                                                                                        final jwx b4 = jww.b(a4);
                                                                                        final Parcel a5 = f.a();
                                                                                        bjg.e(a5, (IInterface)o2);
                                                                                        a5.writeString("com.google.android.gms.brella_dynamite");
                                                                                        a5.writeInt(b2);
                                                                                        bjg.e(a5, (IInterface)b4);
                                                                                        o2 = f.y(3, a5);
                                                                                        final IBinder strongBinder = ((Parcel)o2).readStrongBinder();
                                                                                        if (strongBinder == null) {
                                                                                            jwx = null;
                                                                                        }
                                                                                        else {
                                                                                            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                                            if (queryLocalInterface instanceof jwx) {
                                                                                                jwx = (jwx)queryLocalInterface;
                                                                                            }
                                                                                            else {
                                                                                                jwx = new jwv(strongBinder);
                                                                                            }
                                                                                        }
                                                                                        ((Parcel)o2).recycle();
                                                                                    }
                                                                                    else {
                                                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                                        o2 = jww.b(o2);
                                                                                        final jwx b5 = jww.b(a4);
                                                                                        final Parcel a6 = f.a();
                                                                                        bjg.e(a6, (IInterface)o2);
                                                                                        a6.writeString("com.google.android.gms.brella_dynamite");
                                                                                        a6.writeInt(b2);
                                                                                        bjg.e(a6, (IInterface)b5);
                                                                                        o2 = f.y(2, a6);
                                                                                        final IBinder strongBinder2 = ((Parcel)o2).readStrongBinder();
                                                                                        if (strongBinder2 == null) {
                                                                                            jwx = null;
                                                                                        }
                                                                                        else {
                                                                                            final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                                            if (queryLocalInterface2 instanceof jwx) {
                                                                                                jwx = (jwx)queryLocalInterface2;
                                                                                            }
                                                                                            else {
                                                                                                jwx = new jwv(strongBinder2);
                                                                                            }
                                                                                        }
                                                                                        ((Parcel)o2).recycle();
                                                                                    }
                                                                                    o2 = jww.c(jwx);
                                                                                    if (o2 != null) {
                                                                                        final jxi jxi = new jxi((Context)o2);
                                                                                        break Label_1117;
                                                                                    }
                                                                                    throw new jxf("Failed to get module context");
                                                                                }
                                                                            }
                                                                            throw new jxf("No result cursor");
                                                                        }
                                                                        throw new jxf("DynamiteLoaderV2 was not cached.");
                                                                    }
                                                                }
                                                                final jxj d = jxi.d(context);
                                                                if (d == null) {
                                                                    throw new jxf("Failed to create IDynamiteLoader.");
                                                                }
                                                                final int e = d.e();
                                                                jwx jwx2;
                                                                if (e >= 3) {
                                                                    final jxd jxd3 = jxi.c.get();
                                                                    if (jxd3 == null) {
                                                                        throw new jxf("No cached result cursor holder");
                                                                    }
                                                                    Object o2 = jww.b(context);
                                                                    final jwx b6 = jww.b(jxd3.a);
                                                                    final Parcel a7 = d.a();
                                                                    bjg.e(a7, (IInterface)o2);
                                                                    a7.writeString("com.google.android.gms.brella_dynamite");
                                                                    a7.writeInt(b2);
                                                                    bjg.e(a7, (IInterface)b6);
                                                                    o2 = d.y(8, a7);
                                                                    final IBinder strongBinder3 = ((Parcel)o2).readStrongBinder();
                                                                    if (strongBinder3 == null) {
                                                                        jwx2 = null;
                                                                    }
                                                                    else {
                                                                        final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                        if (queryLocalInterface3 instanceof jwx) {
                                                                            jwx2 = (jwx)queryLocalInterface3;
                                                                        }
                                                                        else {
                                                                            jwx2 = new jwv(strongBinder3);
                                                                        }
                                                                    }
                                                                    ((Parcel)o2).recycle();
                                                                }
                                                                else if (e == 2) {
                                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                                    Object o2 = jww.b(context);
                                                                    final Parcel a8 = d.a();
                                                                    bjg.e(a8, (IInterface)o2);
                                                                    a8.writeString("com.google.android.gms.brella_dynamite");
                                                                    a8.writeInt(b2);
                                                                    o2 = d.y(4, a8);
                                                                    final IBinder strongBinder4 = ((Parcel)o2).readStrongBinder();
                                                                    if (strongBinder4 == null) {
                                                                        jwx2 = null;
                                                                    }
                                                                    else {
                                                                        final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                        if (queryLocalInterface4 instanceof jwx) {
                                                                            jwx2 = (jwx)queryLocalInterface4;
                                                                        }
                                                                        else {
                                                                            jwx2 = new jwv(strongBinder4);
                                                                        }
                                                                    }
                                                                    ((Parcel)o2).recycle();
                                                                }
                                                                else {
                                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                                    final jwx b7 = jww.b(context);
                                                                    Object o2 = d.a();
                                                                    bjg.e((Parcel)o2, (IInterface)b7);
                                                                    ((Parcel)o2).writeString("com.google.android.gms.brella_dynamite");
                                                                    ((Parcel)o2).writeInt(b2);
                                                                    o2 = d.y(2, (Parcel)o2);
                                                                    final IBinder strongBinder5 = ((Parcel)o2).readStrongBinder();
                                                                    if (strongBinder5 == null) {
                                                                        jwx2 = null;
                                                                    }
                                                                    else {
                                                                        final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                                                        if (queryLocalInterface5 instanceof jwx) {
                                                                            jwx2 = (jwx)queryLocalInterface5;
                                                                        }
                                                                        else {
                                                                            jwx2 = new jwv(strongBinder5);
                                                                        }
                                                                    }
                                                                    ((Parcel)o2).recycle();
                                                                }
                                                                if (jww.c(jwx2) == null) {
                                                                    throw new jxf("Failed to load remote module.");
                                                                }
                                                                final jxi jxi2 = new jxi((Context)jww.c(jwx2));
                                                            }
                                                            if (longValue == 0L) {
                                                                jxi.d.remove();
                                                            }
                                                            else {
                                                                jxi.d.set(longValue);
                                                            }
                                                            o = ((jxd)o).a;
                                                            if (o != null) {
                                                                ((Cursor)o).close();
                                                            }
                                                            o = jxi.c;
                                                            ((ThreadLocal<jxd>)o).set(jxd);
                                                            break Label_1422;
                                                        }
                                                        throw new jxf("Failed to determine which loading route to use.");
                                                    }
                                                }
                                                catch (final jxf jxf) {
                                                    throw jxf;
                                                }
                                                catch (final RemoteException o2) {
                                                    try {
                                                        return (IInterface)o2;
                                                    }
                                                    catch (final jxf o2) {
                                                        final String value = String.valueOf(((Throwable)o2).getMessage());
                                                        String concat;
                                                        if (value.length() != 0) {
                                                            concat = "Failed to load remote module: ".concat(value);
                                                        }
                                                        else {
                                                            concat = new String("Failed to load remote module: ");
                                                        }
                                                        Log.w("DynamiteModule", concat);
                                                        final int a9 = a2.a;
                                                        if (a9 != 0 && jxc.a(context, new jxe(a9)).c == -1) {
                                                            jxi.c(context);
                                                            if (longValue == 0L) {
                                                                jxi.d.remove();
                                                            }
                                                            else {
                                                                jxi.d.set(longValue);
                                                            }
                                                            o = ((jxd)o).a;
                                                            if (o != null) {
                                                                ((Cursor)o).close();
                                                            }
                                                            o = jxi.c;
                                                            continue;
                                                        }
                                                        throw new jxf("Remote load failed. No local fallback found.", (Throwable)o2);
                                                        final int a10 = a2.a;
                                                        final int b8 = a2.b;
                                                        final StringBuilder sb = new StringBuilder(91);
                                                        sb.append("No acceptable module found. Local version is ");
                                                        sb.append(a10);
                                                        sb.append(" and remote version is ");
                                                        sb.append(b8);
                                                        sb.append(".");
                                                        throw new jxf(sb.toString());
                                                        kab.b = (jxi)b;
                                                        final StringBuilder sb2 = new StringBuilder(47);
                                                        sb2.append("VersionPolicy returned invalid code:");
                                                        sb2.append(0);
                                                        throw new jxf(sb2.toString());
                                                    }
                                                }
                                                finally {
                                                    final Throwable t;
                                                    throw new jxf("Failed to load remote module.", t);
                                                }
                                                break;
                                            }
                                            try {
                                                final jxf jxf;
                                                throw jxf;
                                            }
                                            catch (final jxf jxf3) {}
                                            finally {
                                                if (longValue == 0L) {
                                                    jxi.d.remove();
                                                }
                                                else {
                                                    jxi.d.set(longValue);
                                                }
                                                try (final Object b = ((jxd)o).a) {}
                                                jxi.c.set(jxd);
                                            }
                                        }
                                        catch (final jxf jxf4) {}
                                    }
                                }
                            }
                        }
                        finally {}
                    }
                    catch (final jxf jxf5) {
                        if (!kab.c) {
                            context.sendBroadcast(new Intent("com.google.android.gms.learning.REQUEST_FULL_FEATURE").setPackage("com.google.android.gms").putExtra("requester_package", context.getPackageName()));
                            kab.c = true;
                        }
                        throw jxf5;
                    }
                }
                final jxi b9 = kab.b;
                monitorexit(kab.a);
                final IBinder b10 = b9.b(s);
                IInterface a11;
                if (b10 == null) {
                    a11 = null;
                }
                else {
                    a11 = kae.a(b10);
                }
                if (a11 == null) {
                    String concat2;
                    if (s.length() != 0) {
                        concat2 = "null impl for ".concat(s);
                    }
                    else {
                        concat2 = new String("null impl for ");
                    }
                    throw new kad(concat2);
                }
                return a11;
            }
        }
        catch (final jxf jxf6) {
            final String message = jxf6.getMessage();
            final StringBuilder sb3 = new StringBuilder(s.length() + 21 + String.valueOf(message).length());
            sb3.append("Couldn't load impl ");
            sb3.append(s);
            sb3.append(": ");
            sb3.append(message);
            throw new kad(sb3.toString(), jxf6);
        }
    }
}
