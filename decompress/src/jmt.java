import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.List;
import android.content.ServiceConnection;
import android.content.Intent;
import android.app.job.JobInfo;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.content.ComponentName;
import android.os.SystemClock;
import android.database.sqlite.SQLiteException;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmt extends jmc
{
    public boolean a;
    public final jmn c;
    public final jmy d;
    public long e;
    public boolean f;
    private final jnm g;
    private final jnk h;
    private final jml i;
    private final jmy j;
    private final jnv k;
    
    protected jmt(final jmf jmf) {
        super(jmf);
        this.h = new jnk(jmf);
        this.c = new jmn(jmf);
        this.g = new jnm(jmf);
        this.i = new jml(jmf);
        this.k = new jnv();
        this.j = new jmp(this, jmf);
        this.d = new jmq(this, jmf);
    }
    
    private final void H() {
        if (this.j.e()) {
            this.q("All hits dispatched or no network/service. Going to power save mode");
        }
        this.j.c();
        final jna h = this.h();
        if (h.c) {
            h.c();
        }
    }
    
    private final void I() {
        final jna h = this.h();
        if (h.a && !h.c) {
            jlw.a();
            this.z();
            long long1 = 0L;
            try {
                final jmn c = this.c;
                jlw.a();
                c.z();
                final String c2 = jmn.c;
                final SQLiteDatabase b = c.b();
                Cursor rawQuery = null;
                Label_0168: {
                    try {
                        final Cursor cursor = rawQuery = b.rawQuery(c2, (String[])null);
                        try {
                            try {
                                if (cursor.moveToFirst()) {
                                    rawQuery = cursor;
                                    long1 = cursor.getLong(0);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                }
                                else {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    long1 = 0L;
                                }
                            }
                            finally {}
                        }
                        catch (final SQLiteException ex) {}
                    }
                    catch (final SQLiteException ex) {}
                    finally {
                        break Label_0168;
                    }
                    final SQLiteException ex;
                    c.p("Database error", c2, ex);
                    throw ex;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            }
            catch (final SQLiteException ex2) {
                this.o("Failed to get min/max hit times from local store", ex2);
                long1 = 0L;
            }
            if (long1 != 0L && Math.abs(System.currentTimeMillis() - long1) <= (long)jnd.f.a()) {
                this.r("Dispatch alarm scheduled (ms)", jmv.b());
                h.z();
                jvu.g(h.a, "Receiver not registered");
                h.g();
                final long b2 = jmv.b();
                if (b2 > 0L) {
                    h.c();
                    h.y();
                    SystemClock.elapsedRealtime();
                    h.c = true;
                    ((Boolean)jnd.C.a()).booleanValue();
                    h.q("Scheduling upload with JobScheduler");
                    final Context d = h.d();
                    final ComponentName componentName = new ComponentName(d, "com.google.android.gms.analytics.AnalyticsJobService");
                    final int b3 = h.b();
                    final PersistableBundle extras = new PersistableBundle();
                    extras.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                    final JobInfo build = new JobInfo$Builder(b3, componentName).setMinimumLatency(b2).setOverrideDeadline(b2 + b2).setExtras(extras).build();
                    h.r("Scheduling job. JobID", b3);
                    kav.a(d, build);
                }
            }
        }
    }
    
    protected final void C() {
        if (this.f) {
            return;
        }
        if (!jmv.i()) {
            return;
        }
        if (!this.i.D() && this.k.c((long)jnd.z.a())) {
            this.k.b();
            this.q("Connecting to service");
            final jml i = this.i;
            jlw.a();
            i.z();
            Label_0332: {
                if (i.c != null) {
                    break Label_0332;
                }
                final jmk a = i.a;
                final jml b = a.b;
                jlw.a();
                final Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
                final Context d = a.b.d();
                intent.putExtra("app_package_name", d.getPackageName());
                final jwl a2 = jwl.a();
                monitorenter(a);
                jnh c = null;
                try {
                    a.c = null;
                    a.a = true;
                    final boolean c2 = a2.c(d, d.getClass().getName(), intent, (ServiceConnection)a.b.a, 129);
                    a.b.r("Bind to service requested", c2);
                    if (!c2) {
                        a.a = false;
                        monitorexit(a);
                    }
                    else {
                        try {
                            a.wait((long)jnd.y.a());
                        }
                        catch (final InterruptedException ex) {
                            a.b.t("Wait for service connect was interrupted");
                        }
                        a.a = false;
                        c = a.c;
                        a.c = null;
                        if (c == null) {
                            a.b.n("Successfully bound to service but never got onServiceConnected callback");
                        }
                        monitorexit(a);
                    }
                    if (c != null) {
                        i.c = c;
                        i.C();
                        this.q("Connected to service");
                        this.k.a();
                        this.D();
                    }
                }
                finally {
                    monitorexit(a);
                }
            }
        }
    }
    
    protected final void D() {
        jlw.a();
        jlw.a();
        this.z();
        if (!jmv.i()) {
            this.t("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.i.D()) {
            this.q("Service not connected");
            return;
        }
        if (this.c.H()) {
            return;
        }
        this.q("Dispatching local hits to device AnalyticsService");
        try {
        Label_0154:
            while (true) {
                final List c = this.c.c(jmv.e());
                if (c.isEmpty()) {
                    break;
                }
                while (!c.isEmpty()) {
                    final jng jng = c.get(0);
                    if (!this.i.E(jng)) {
                        this.F();
                        return;
                    }
                    c.remove(jng);
                    try {
                        this.c.D(jng.b);
                        continue;
                    }
                    catch (final SQLiteException ex) {
                        this.o("Failed to remove hit that was send for delivery", ex);
                        this.H();
                        return;
                    }
                    break Label_0154;
                }
            }
            this.F();
        }
        catch (final SQLiteException ex2) {
            this.o("Failed to read hits from store", ex2);
            this.H();
        }
    }
    
    public final void E() {
        this.z();
        jlw.a();
        this.f = true;
        this.i.b();
        this.F();
    }
    
    public final void F() {
        jlw.a();
        this.z();
        if (!this.f) {
            final long b = this.b();
            final long n = 0L;
            if (b > 0L) {
                if (this.c.H()) {
                    this.h.c();
                    this.H();
                    return;
                }
                if (!(boolean)jnd.w.a()) {
                    final jnk h = this.h;
                    h.b();
                    if (!h.c) {
                        final Context a = h.a();
                        a.registerReceiver((BroadcastReceiver)h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        final IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(a.getPackageName());
                        a.registerReceiver((BroadcastReceiver)h, intentFilter);
                        h.d = h.d();
                        h.b.d().r("Registering connectivity change receiver. Network connected", h.d);
                        h.c = true;
                    }
                    final jnk h2 = this.h;
                    if (!h2.c) {
                        h2.b.d().t("Connectivity unknown. Receiver not registered");
                    }
                    if (!h2.d) {
                        this.H();
                        this.I();
                        return;
                    }
                }
                this.I();
                final long b2 = this.b();
                final long b3 = this.j().b();
                long n2;
                if (b3 != 0L) {
                    n2 = b2 - Math.abs(System.currentTimeMillis() - b3);
                    if (n2 <= 0L) {
                        n2 = Math.min(jmv.c(), b2);
                    }
                }
                else {
                    n2 = Math.min(jmv.c(), b2);
                }
                this.r("Dispatch scheduled (ms)", n2);
                if (this.j.e()) {
                    final jmy j = this.j;
                    long abs;
                    if (j.d == 0L) {
                        abs = 0L;
                    }
                    else {
                        final jmf b4 = j.b;
                        abs = Math.abs(System.currentTimeMillis() - j.d);
                    }
                    final long max = Math.max(1L, n2 + abs);
                    final jmy i = this.j;
                    if (i.e()) {
                        if (max < 0L) {
                            i.c();
                            return;
                        }
                        final jmf b5 = i.b;
                        long n3 = max - Math.abs(System.currentTimeMillis() - i.d);
                        if (n3 < 0L) {
                            n3 = n;
                        }
                        i.b().removeCallbacks(i.c);
                        if (!i.b().postDelayed(i.c, n3)) {
                            i.b.d().o("Failed to adjust delayed post. time", n3);
                        }
                    }
                    return;
                }
                this.j.d(n2);
                return;
            }
        }
        this.h.c();
        this.H();
    }
    
    public final boolean G(final String s) {
        return jwu.b(this.d()).a(s) == 0;
    }
    
    @Override
    protected final void a() {
        this.c.A();
        this.g.A();
        this.i.A();
    }
    
    public final long b() {
        long longValue = (long)jnd.c.a();
        final jnw k = this.k();
        k.z();
        if (k.d) {
            final jnw i = this.k();
            i.z();
            longValue = i.e * 1000L;
        }
        return longValue;
    }
    
    public final void c(final jnb p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jmt.e:J
        //     4: lstore_2       
        //     5: invokestatic    jlw.a:()V
        //     8: aload_0        
        //     9: invokevirtual   jmc.z:()V
        //    12: aload_0        
        //    13: invokevirtual   jmb.j:()Ljno;
        //    16: invokevirtual   jno.b:()J
        //    19: lstore          4
        //    21: lconst_0       
        //    22: lstore          6
        //    24: lload           4
        //    26: lconst_0       
        //    27: lcmp           
        //    28: ifeq            45
        //    31: invokestatic    java/lang/System.currentTimeMillis:()J
        //    34: lload           4
        //    36: lsub           
        //    37: invokestatic    java/lang/Math.abs:(J)J
        //    40: lstore          4
        //    42: goto            50
        //    45: ldc2_w          -1
        //    48: lstore          4
        //    50: aload_0        
        //    51: ldc_w           "Dispatching local hits. Elapsed time since last dispatch (ms)"
        //    54: lload           4
        //    56: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    59: invokevirtual   jmb.m:(Ljava/lang/String;Ljava/lang/Object;)V
        //    62: aload_0        
        //    63: invokevirtual   jmt.C:()V
        //    66: invokestatic    jlw.a:()V
        //    69: aload_0        
        //    70: invokevirtual   jmc.z:()V
        //    73: aload_0        
        //    74: ldc_w           "Dispatching a batch of local hits"
        //    77: invokevirtual   jmb.q:(Ljava/lang/String;)V
        //    80: aload_0        
        //    81: getfield        jmt.i:Ljml;
        //    84: invokevirtual   jml.D:()Z
        //    87: istore          8
        //    89: aload_0        
        //    90: getfield        jmt.g:Ljnm;
        //    93: invokevirtual   jnm.H:()Z
        //    96: istore          9
        //    98: iload           8
        //   100: iconst_1       
        //   101: ixor           
        //   102: ifeq            122
        //   105: iload           9
        //   107: iconst_1       
        //   108: ixor           
        //   109: ifeq            122
        //   112: aload_0        
        //   113: ldc_w           "No network or service available. Will retry later"
        //   116: invokevirtual   jmb.q:(Ljava/lang/String;)V
        //   119: goto            2482
        //   122: invokestatic    jmv.e:()I
        //   125: invokestatic    jmv.d:()I
        //   128: invokestatic    java/lang/Math.max:(II)I
        //   131: i2l            
        //   132: lstore          10
        //   134: new             Ljava/util/ArrayList;
        //   137: astore          12
        //   139: aload           12
        //   141: invokespecial   java/util/ArrayList.<init>:()V
        //   144: lload           6
        //   146: lstore          4
        //   148: aload_0        
        //   149: getfield        jmt.c:Ljmn;
        //   152: astore          13
        //   154: aload           13
        //   156: invokevirtual   jmc.z:()V
        //   159: aload           13
        //   161: invokevirtual   jmn.b:()Landroid/database/sqlite/SQLiteDatabase;
        //   164: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   167: aload           12
        //   169: invokeinterface java/util/List.clear:()V
        //   174: aload_0        
        //   175: getfield        jmt.c:Ljmn;
        //   178: lload           10
        //   180: invokevirtual   jmn.c:(J)Ljava/util/List;
        //   183: astore          13
        //   185: aload           13
        //   187: invokeinterface java/util/List.isEmpty:()Z
        //   192: ifeq            241
        //   195: aload_0        
        //   196: ldc_w           "Store is empty, nothing to dispatch"
        //   199: invokevirtual   jmb.q:(Ljava/lang/String;)V
        //   202: aload_0        
        //   203: invokespecial   jmt.H:()V
        //   206: aload_0        
        //   207: getfield        jmt.c:Ljmn;
        //   210: invokevirtual   jmn.G:()V
        //   213: aload_0        
        //   214: getfield        jmt.c:Ljmn;
        //   217: invokevirtual   jmn.F:()V
        //   220: goto            2482
        //   223: astore          13
        //   225: aload_0        
        //   226: ldc_w           "Failed to commit local dispatch transaction"
        //   229: aload           13
        //   231: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //   234: aload_0        
        //   235: invokespecial   jmt.H:()V
        //   238: goto            2482
        //   241: aload_0        
        //   242: ldc_w           "Hits loaded from store. count"
        //   245: aload           13
        //   247: invokeinterface java/util/List.size:()I
        //   252: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   255: invokevirtual   jmb.r:(Ljava/lang/String;Ljava/lang/Object;)V
        //   258: aload           13
        //   260: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   265: astore          14
        //   267: aload           14
        //   269: invokeinterface java/util/Iterator.hasNext:()Z
        //   274: ifeq            353
        //   277: aload           14
        //   279: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   284: checkcast       Ljng;
        //   287: getfield        jng.b:J
        //   290: lload           4
        //   292: lcmp           
        //   293: ifne            267
        //   296: aload_0        
        //   297: ldc_w           "Database contains successfully uploaded hit"
        //   300: lload           4
        //   302: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   305: aload           13
        //   307: invokeinterface java/util/List.size:()I
        //   312: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   315: invokevirtual   jmb.p:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   318: aload_0        
        //   319: invokespecial   jmt.H:()V
        //   322: aload_0        
        //   323: getfield        jmt.c:Ljmn;
        //   326: invokevirtual   jmn.G:()V
        //   329: aload_0        
        //   330: getfield        jmt.c:Ljmn;
        //   333: invokevirtual   jmn.F:()V
        //   336: goto            220
        //   339: astore          13
        //   341: aload_0        
        //   342: ldc_w           "Failed to commit local dispatch transaction"
        //   345: aload           13
        //   347: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //   350: goto            234
        //   353: lload           4
        //   355: lstore          6
        //   357: lload           10
        //   359: lstore          15
        //   361: aload_0        
        //   362: getfield        jmt.i:Ljml;
        //   365: invokevirtual   jml.D:()Z
        //   368: ifeq            532
        //   371: aload_0        
        //   372: ldc_w           "Service connected, sending hits to the service"
        //   375: invokevirtual   jmb.q:(Ljava/lang/String;)V
        //   378: lload           4
        //   380: lstore          6
        //   382: lload           10
        //   384: lstore          15
        //   386: aload           13
        //   388: invokeinterface java/util/List.isEmpty:()Z
        //   393: ifne            532
        //   396: aload           13
        //   398: iconst_0       
        //   399: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   404: checkcast       Ljng;
        //   407: astore          14
        //   409: aload_0        
        //   410: getfield        jmt.i:Ljml;
        //   413: aload           14
        //   415: invokevirtual   jml.E:(Ljng;)Z
        //   418: ifne            424
        //   421: goto            540
        //   424: lload           4
        //   426: aload           14
        //   428: getfield        jng.b:J
        //   431: invokestatic    java/lang/Math.max:(JJ)J
        //   434: lstore          4
        //   436: aload           13
        //   438: aload           14
        //   440: invokeinterface java/util/List.remove:(Ljava/lang/Object;)Z
        //   445: pop            
        //   446: aload_0        
        //   447: ldc_w           "Hit sent do device AnalyticsService for delivery"
        //   450: aload           14
        //   452: invokevirtual   jmb.m:(Ljava/lang/String;Ljava/lang/Object;)V
        //   455: aload_0        
        //   456: getfield        jmt.c:Ljmn;
        //   459: aload           14
        //   461: getfield        jng.b:J
        //   464: invokevirtual   jmn.D:(J)V
        //   467: aload           12
        //   469: aload           14
        //   471: getfield        jng.b:J
        //   474: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   477: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   482: pop            
        //   483: goto            378
        //   486: astore          13
        //   488: aload_0        
        //   489: ldc_w           "Failed to remove hit that was send for delivery"
        //   492: aload           13
        //   494: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //   497: aload_0        
        //   498: invokespecial   jmt.H:()V
        //   501: aload_0        
        //   502: getfield        jmt.c:Ljmn;
        //   505: invokevirtual   jmn.G:()V
        //   508: aload_0        
        //   509: getfield        jmt.c:Ljmn;
        //   512: invokevirtual   jmn.F:()V
        //   515: goto            220
        //   518: astore          13
        //   520: aload_0        
        //   521: ldc_w           "Failed to commit local dispatch transaction"
        //   524: aload           13
        //   526: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //   529: goto            234
        //   532: lload           15
        //   534: lstore          10
        //   536: lload           6
        //   538: lstore          4
        //   540: aload_0        
        //   541: getfield        jmt.g:Ljnm;
        //   544: invokevirtual   jnm.H:()Z
        //   547: ifeq            2303
        //   550: aload_0        
        //   551: getfield        jmt.g:Ljnm;
        //   554: astore          17
        //   556: invokestatic    jlw.a:()V
        //   559: aload           17
        //   561: invokevirtual   jmc.z:()V
        //   564: aload           17
        //   566: invokevirtual   jmb.g:()Ljmv;
        //   569: invokevirtual   jmv.a:()Ljava/util/Set;
        //   572: invokeinterface java/util/Set.isEmpty:()Z
        //   577: ifne            747
        //   580: aload           17
        //   582: getfield        jnm.c:Ljnv;
        //   585: getstatic       jnd.t:Ljnc;
        //   588: invokevirtual   jnc.a:()Ljava/lang/Object;
        //   591: checkcast       Ljava/lang/Integer;
        //   594: invokevirtual   java/lang/Integer.intValue:()I
        //   597: i2l            
        //   598: ldc2_w          1000
        //   601: lmul           
        //   602: invokevirtual   jnv.c:(J)Z
        //   605: ifne            617
        //   608: iconst_0       
        //   609: istore          18
        //   611: iconst_0       
        //   612: istore          9
        //   614: goto            753
        //   617: getstatic       jnd.n:Ljnc;
        //   620: invokevirtual   jnc.a:()Ljava/lang/Object;
        //   623: checkcast       Ljava/lang/String;
        //   626: astore          14
        //   628: ldc_w           "BATCH_BY_SESSION"
        //   631: aload           14
        //   633: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   636: ifeq            645
        //   639: iconst_1       
        //   640: istore          18
        //   642: goto            716
        //   645: ldc_w           "BATCH_BY_TIME"
        //   648: aload           14
        //   650: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   653: ifeq            662
        //   656: iconst_1       
        //   657: istore          18
        //   659: goto            716
        //   662: ldc_w           "BATCH_BY_BRUTE_FORCE"
        //   665: aload           14
        //   667: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   670: ifeq            679
        //   673: iconst_1       
        //   674: istore          18
        //   676: goto            716
        //   679: ldc_w           "BATCH_BY_COUNT"
        //   682: aload           14
        //   684: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   687: ifeq            696
        //   690: iconst_1       
        //   691: istore          18
        //   693: goto            716
        //   696: ldc_w           "BATCH_BY_SIZE"
        //   699: aload           14
        //   701: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   704: ifeq            713
        //   707: iconst_1       
        //   708: istore          18
        //   710: goto            716
        //   713: iconst_0       
        //   714: istore          18
        //   716: iconst_1       
        //   717: ldc_w           "GZIP"
        //   720: getstatic       jnd.o:Ljnc;
        //   723: invokevirtual   jnc.a:()Ljava/lang/Object;
        //   726: checkcast       Ljava/lang/String;
        //   729: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   732: if_icmpeq       741
        //   735: iconst_0       
        //   736: istore          9
        //   738: goto            753
        //   741: iconst_1       
        //   742: istore          9
        //   744: goto            753
        //   747: iconst_0       
        //   748: istore          18
        //   750: iconst_0       
        //   751: istore          9
        //   753: iload           18
        //   755: ifeq            1695
        //   758: aload           13
        //   760: invokeinterface java/util/List.isEmpty:()Z
        //   765: iconst_1       
        //   766: ixor           
        //   767: invokestatic    jvu.b:(Z)V
        //   770: aload           17
        //   772: ldc_w           "Uploading batched hits. compression, count"
        //   775: iload           9
        //   777: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   780: aload           13
        //   782: invokeinterface java/util/List.size:()I
        //   787: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   790: invokevirtual   jmb.s:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   793: new             Ljnl;
        //   796: astore          19
        //   798: aload           19
        //   800: aload           17
        //   802: invokespecial   jnl.<init>:(Ljnm;)V
        //   805: new             Ljava/util/ArrayList;
        //   808: astore          20
        //   810: aload           20
        //   812: invokespecial   java/util/ArrayList.<init>:()V
        //   815: aload           13
        //   817: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   822: astore          14
        //   824: aload           14
        //   826: invokeinterface java/util/Iterator.hasNext:()Z
        //   831: ifeq            1085
        //   834: aload           14
        //   836: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   841: checkcast       Ljng;
        //   844: astore          13
        //   846: aload           13
        //   848: invokestatic    jvu.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   851: pop            
        //   852: aload           19
        //   854: getfield        jnl.a:I
        //   857: iconst_1       
        //   858: iadd           
        //   859: invokestatic    jmv.d:()I
        //   862: if_icmple       868
        //   865: goto            1085
        //   868: aload           19
        //   870: getfield        jnl.c:Ljnm;
        //   873: aload           13
        //   875: iconst_0       
        //   876: invokevirtual   jnm.c:(Ljng;Z)Ljava/lang/String;
        //   879: astore          21
        //   881: aload           21
        //   883: ifnonnull       905
        //   886: aload           19
        //   888: getfield        jnl.c:Ljnm;
        //   891: invokevirtual   jmb.i:()Ljnj;
        //   894: aload           13
        //   896: ldc_w           "Error formatting hit"
        //   899: invokevirtual   jnj.b:(Ljng;Ljava/lang/String;)V
        //   902: goto            1066
        //   905: aload           21
        //   907: invokevirtual   java/lang/String.getBytes:()[B
        //   910: astore          21
        //   912: aload           21
        //   914: arraylength    
        //   915: istore          18
        //   917: iload           18
        //   919: getstatic       jnd.p:Ljnc;
        //   922: invokevirtual   jnc.a:()Ljava/lang/Object;
        //   925: checkcast       Ljava/lang/Integer;
        //   928: invokevirtual   java/lang/Integer.intValue:()I
        //   931: if_icmple       953
        //   934: aload           19
        //   936: getfield        jnl.c:Ljnm;
        //   939: invokevirtual   jmb.i:()Ljnj;
        //   942: aload           13
        //   944: ldc_w           "Hit size exceeds the maximum size limit"
        //   947: invokevirtual   jnj.b:(Ljng;Ljava/lang/String;)V
        //   950: goto            1066
        //   953: aload           19
        //   955: getfield        jnl.b:Ljava/io/ByteArrayOutputStream;
        //   958: invokevirtual   java/io/ByteArrayOutputStream.size:()I
        //   961: ifle            970
        //   964: iinc            18, 1
        //   967: goto            970
        //   970: aload           19
        //   972: getfield        jnl.b:Ljava/io/ByteArrayOutputStream;
        //   975: invokevirtual   java/io/ByteArrayOutputStream.size:()I
        //   978: istore          22
        //   980: getstatic       jnd.r:Ljnc;
        //   983: invokevirtual   jnc.a:()Ljava/lang/Object;
        //   986: checkcast       Ljava/lang/Integer;
        //   989: invokevirtual   java/lang/Integer.intValue:()I
        //   992: istore          23
        //   994: iload           22
        //   996: iload           18
        //   998: iadd           
        //   999: iload           23
        //  1001: if_icmpgt       1085
        //  1004: aload           19
        //  1006: getfield        jnl.b:Ljava/io/ByteArrayOutputStream;
        //  1009: invokevirtual   java/io/ByteArrayOutputStream.size:()I
        //  1012: ifle            1026
        //  1015: aload           19
        //  1017: getfield        jnl.b:Ljava/io/ByteArrayOutputStream;
        //  1020: getstatic       jnm.a:[B
        //  1023: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //  1026: aload           19
        //  1028: getfield        jnl.b:Ljava/io/ByteArrayOutputStream;
        //  1031: aload           21
        //  1033: invokevirtual   java/io/ByteArrayOutputStream.write:([B)V
        //  1036: aload           19
        //  1038: aload           19
        //  1040: getfield        jnl.a:I
        //  1043: iconst_1       
        //  1044: iadd           
        //  1045: putfield        jnl.a:I
        //  1048: goto            1066
        //  1051: astore          21
        //  1053: aload           19
        //  1055: getfield        jnl.c:Ljnm;
        //  1058: ldc_w           "Failed to write payload when batching hits"
        //  1061: aload           21
        //  1063: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1066: aload           20
        //  1068: aload           13
        //  1070: getfield        jng.b:J
        //  1073: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1076: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1081: pop            
        //  1082: goto            824
        //  1085: aload           19
        //  1087: getfield        jnl.a:I
        //  1090: ifne            1100
        //  1093: aload           20
        //  1095: astore          13
        //  1097: goto            2187
        //  1100: aload           17
        //  1102: invokevirtual   jnm.D:()Ljava/net/URL;
        //  1105: astore          14
        //  1107: aload           14
        //  1109: ifnonnull       1128
        //  1112: aload           17
        //  1114: ldc_w           "Failed to build batching endpoint url"
        //  1117: invokevirtual   jmb.n:(Ljava/lang/String;)V
        //  1120: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //  1123: astore          13
        //  1125: goto            2187
        //  1128: iload           9
        //  1130: ifeq            1591
        //  1133: aload           19
        //  1135: invokevirtual   jnl.a:()[B
        //  1138: astore          13
        //  1140: aload           13
        //  1142: invokestatic    jvu.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1145: pop            
        //  1146: aload           17
        //  1148: invokevirtual   jmb.d:()Landroid/content/Context;
        //  1151: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  1154: pop            
        //  1155: new             Ljava/io/ByteArrayOutputStream;
        //  1158: astore          24
        //  1160: aload           24
        //  1162: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //  1165: new             Ljava/util/zip/GZIPOutputStream;
        //  1168: astore          21
        //  1170: aload           21
        //  1172: aload           24
        //  1174: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //  1177: aload           21
        //  1179: aload           13
        //  1181: invokevirtual   java/util/zip/GZIPOutputStream.write:([B)V
        //  1184: aload           21
        //  1186: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //  1189: aload           24
        //  1191: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //  1194: aload           24
        //  1196: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //  1199: astore          21
        //  1201: aload           21
        //  1203: arraylength    
        //  1204: istore          22
        //  1206: iload           22
        //  1208: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1211: astore          24
        //  1213: iload           22
        //  1215: i2l            
        //  1216: lstore          15
        //  1218: aload           13
        //  1220: arraylength    
        //  1221: istore          18
        //  1223: iload           18
        //  1225: i2l            
        //  1226: lstore          6
        //  1228: aload           17
        //  1230: iconst_3       
        //  1231: ldc_w           "POST compressed size, ratio %, url"
        //  1234: aload           24
        //  1236: lload           15
        //  1238: ldc2_w          100
        //  1241: lmul           
        //  1242: lload           6
        //  1244: ldiv           
        //  1245: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1248: aload           14
        //  1250: invokespecial   jmb.w:(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1253: iload           22
        //  1255: iload           18
        //  1257: if_icmple       1275
        //  1260: aload           17
        //  1262: ldc_w           "Compressed payload is larger then uncompressed. compressed, uncompressed"
        //  1265: aload           24
        //  1267: iload           18
        //  1269: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1272: invokevirtual   jmb.v:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1275: invokestatic    jnm.x:()V
        //  1278: aload           17
        //  1280: aload           14
        //  1282: invokevirtual   jnm.C:(Ljava/net/URL;)Ljava/net/HttpURLConnection;
        //  1285: astore          13
        //  1287: aload           13
        //  1289: iconst_1       
        //  1290: invokevirtual   java/net/HttpURLConnection.setDoOutput:(Z)V
        //  1293: aload           13
        //  1295: ldc_w           "Content-Encoding"
        //  1298: ldc_w           "gzip"
        //  1301: invokevirtual   java/net/HttpURLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //  1304: aload           13
        //  1306: iload           22
        //  1308: invokevirtual   java/net/HttpURLConnection.setFixedLengthStreamingMode:(I)V
        //  1311: aload           13
        //  1313: invokevirtual   java/net/HttpURLConnection.connect:()V
        //  1316: aload           13
        //  1318: invokevirtual   java/net/HttpURLConnection.getOutputStream:()Ljava/io/OutputStream;
        //  1321: astore          24
        //  1323: aload           24
        //  1325: aload           21
        //  1327: invokevirtual   java/io/OutputStream.write:([B)V
        //  1330: aload           24
        //  1332: invokevirtual   java/io/OutputStream.close:()V
        //  1335: aload           17
        //  1337: aload           13
        //  1339: invokevirtual   jnm.G:(Ljava/net/HttpURLConnection;)V
        //  1342: aload           13
        //  1344: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //  1347: istore          18
        //  1349: iload           18
        //  1351: sipush          200
        //  1354: if_icmpne       1373
        //  1357: aload           17
        //  1359: invokevirtual   jmb.f:()Ljma;
        //  1362: invokevirtual   jma.c:()V
        //  1365: sipush          200
        //  1368: istore          18
        //  1370: goto            1373
        //  1373: aload           17
        //  1375: ldc_w           "POST status"
        //  1378: iload           18
        //  1380: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1383: invokevirtual   jmb.m:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1386: aload           13
        //  1388: ifnull          1396
        //  1391: aload           13
        //  1393: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  1396: goto            1605
        //  1399: astore          14
        //  1401: aload           13
        //  1403: astore          21
        //  1405: aload           24
        //  1407: astore          13
        //  1409: goto            1553
        //  1412: astore          21
        //  1414: aload           13
        //  1416: astore          14
        //  1418: aload           24
        //  1420: astore          13
        //  1422: goto            1486
        //  1425: astore          14
        //  1427: aload           13
        //  1429: astore          21
        //  1431: aconst_null    
        //  1432: astore          13
        //  1434: goto            1553
        //  1437: astore          21
        //  1439: aconst_null    
        //  1440: astore          24
        //  1442: aload           13
        //  1444: astore          14
        //  1446: aload           24
        //  1448: astore          13
        //  1450: goto            1486
        //  1453: astore          13
        //  1455: goto            1465
        //  1458: astore          21
        //  1460: goto            1480
        //  1463: astore          13
        //  1465: aload           13
        //  1467: astore          14
        //  1469: aconst_null    
        //  1470: astore          13
        //  1472: aconst_null    
        //  1473: astore          21
        //  1475: goto            1553
        //  1478: astore          21
        //  1480: aconst_null    
        //  1481: astore          14
        //  1483: aconst_null    
        //  1484: astore          13
        //  1486: aload           17
        //  1488: ldc_w           "Network compressed POST connection error"
        //  1491: aload           21
        //  1493: invokevirtual   jmb.u:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1496: aload           13
        //  1498: ifnull          1521
        //  1501: aload           13
        //  1503: invokevirtual   java/io/OutputStream.close:()V
        //  1506: goto            1521
        //  1509: astore          13
        //  1511: aload           17
        //  1513: ldc_w           "Error closing http compressed post connection output stream"
        //  1516: aload           13
        //  1518: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1521: aload           14
        //  1523: ifnull          1537
        //  1526: aload           14
        //  1528: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  1531: iconst_0       
        //  1532: istore          18
        //  1534: goto            1605
        //  1537: iconst_0       
        //  1538: istore          18
        //  1540: goto            1605
        //  1543: astore          24
        //  1545: aload           14
        //  1547: astore          21
        //  1549: aload           24
        //  1551: astore          14
        //  1553: aload           13
        //  1555: ifnull          1578
        //  1558: aload           13
        //  1560: invokevirtual   java/io/OutputStream.close:()V
        //  1563: goto            1578
        //  1566: astore          13
        //  1568: aload           17
        //  1570: ldc_w           "Error closing http compressed post connection output stream"
        //  1573: aload           13
        //  1575: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1578: aload           21
        //  1580: ifnull          1588
        //  1583: aload           21
        //  1585: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  1588: aload           14
        //  1590: athrow         
        //  1591: aload           17
        //  1593: aload           14
        //  1595: aload           19
        //  1597: invokevirtual   jnl.a:()[B
        //  1600: invokevirtual   jnm.b:(Ljava/net/URL;[B)I
        //  1603: istore          18
        //  1605: iload           18
        //  1607: sipush          200
        //  1610: if_icmpne       1636
        //  1613: aload           17
        //  1615: ldc_w           "Batched upload completed. Hits batched"
        //  1618: aload           19
        //  1620: getfield        jnl.a:I
        //  1623: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1626: invokevirtual   jmb.r:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1629: aload           20
        //  1631: astore          13
        //  1633: goto            2187
        //  1636: iload           18
        //  1638: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1641: astore          13
        //  1643: aload           17
        //  1645: ldc_w           "Network error uploading hits. status code"
        //  1648: aload           13
        //  1650: invokevirtual   jmb.r:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1653: aload           17
        //  1655: invokevirtual   jmb.g:()Ljmv;
        //  1658: invokevirtual   jmv.a:()Ljava/util/Set;
        //  1661: aload           13
        //  1663: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  1668: ifeq            1687
        //  1671: aload           17
        //  1673: ldc_w           "Server instructed the client to stop batching"
        //  1676: invokevirtual   jmb.t:(Ljava/lang/String;)V
        //  1679: aload           17
        //  1681: getfield        jnm.c:Ljnv;
        //  1684: invokevirtual   jnv.b:()V
        //  1687: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //  1690: astore          13
        //  1692: goto            2187
        //  1695: new             Ljava/util/ArrayList;
        //  1698: astore          24
        //  1700: aload           24
        //  1702: aload           13
        //  1704: invokeinterface java/util/List.size:()I
        //  1709: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1712: aload           13
        //  1714: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1719: astore          21
        //  1721: aload           21
        //  1723: invokeinterface java/util/Iterator.hasNext:()Z
        //  1728: ifeq            2183
        //  1731: aload           21
        //  1733: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1738: checkcast       Ljng;
        //  1741: astore          13
        //  1743: aload           13
        //  1745: invokestatic    jvu.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1748: pop            
        //  1749: aload           17
        //  1751: aload           13
        //  1753: aload           13
        //  1755: getfield        jng.d:Z
        //  1758: iconst_1       
        //  1759: ixor           
        //  1760: invokevirtual   jnm.c:(Ljng;Z)Ljava/lang/String;
        //  1763: astore          14
        //  1765: aload           14
        //  1767: ifnonnull       1786
        //  1770: aload           17
        //  1772: invokevirtual   jmb.i:()Ljnj;
        //  1775: aload           13
        //  1777: ldc_w           "Error formatting hit for upload"
        //  1780: invokevirtual   jnj.b:(Ljng;Ljava/lang/String;)V
        //  1783: goto            2147
        //  1786: aload           14
        //  1788: invokevirtual   java/lang/String.length:()I
        //  1791: getstatic       jnd.m:Ljnc;
        //  1794: invokevirtual   jnc.a:()Ljava/lang/Object;
        //  1797: checkcast       Ljava/lang/Integer;
        //  1800: invokevirtual   java/lang/Integer.intValue:()I
        //  1803: if_icmpgt       2028
        //  1806: aload           17
        //  1808: aload           13
        //  1810: aload           14
        //  1812: invokevirtual   jnm.F:(Ljng;Ljava/lang/String;)Ljava/net/URL;
        //  1815: astore          14
        //  1817: aload           14
        //  1819: ifnonnull       1837
        //  1822: aload           17
        //  1824: ldc_w           "Failed to build collect GET endpoint url"
        //  1827: invokevirtual   jmb.n:(Ljava/lang/String;)V
        //  1830: aload           24
        //  1832: astore          13
        //  1834: goto            2187
        //  1837: aload           17
        //  1839: ldc_w           "GET request"
        //  1842: aload           14
        //  1844: invokevirtual   jmb.m:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1847: aload           17
        //  1849: aload           14
        //  1851: invokevirtual   jnm.C:(Ljava/net/URL;)Ljava/net/HttpURLConnection;
        //  1854: astore          14
        //  1856: aload           14
        //  1858: invokevirtual   java/net/HttpURLConnection.connect:()V
        //  1861: aload           17
        //  1863: aload           14
        //  1865: invokevirtual   jnm.G:(Ljava/net/HttpURLConnection;)V
        //  1868: aload           14
        //  1870: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //  1873: istore          18
        //  1875: iload           18
        //  1877: sipush          200
        //  1880: if_icmpne       1899
        //  1883: aload           17
        //  1885: invokevirtual   jmb.f:()Ljma;
        //  1888: invokevirtual   jma.c:()V
        //  1891: sipush          200
        //  1894: istore          18
        //  1896: goto            1899
        //  1899: aload           17
        //  1901: ldc_w           "GET status"
        //  1904: iload           18
        //  1906: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1909: invokevirtual   jmb.m:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1912: aload           14
        //  1914: ifnull          1922
        //  1917: aload           14
        //  1919: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  1922: iload           18
        //  1924: sipush          200
        //  1927: if_icmpeq       1937
        //  1930: aload           24
        //  1932: astore          13
        //  1934: goto            2187
        //  1937: goto            2147
        //  1940: astore          13
        //  1942: goto            2015
        //  1945: astore          21
        //  1947: aload           14
        //  1949: astore          13
        //  1951: goto            1971
        //  1954: astore          13
        //  1956: aconst_null    
        //  1957: astore          14
        //  1959: goto            2015
        //  1962: astore          14
        //  1964: aconst_null    
        //  1965: astore          13
        //  1967: aload           14
        //  1969: astore          21
        //  1971: aload           17
        //  1973: ldc_w           "Network GET connection error"
        //  1976: aload           21
        //  1978: invokevirtual   jmb.u:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1981: aload           13
        //  1983: ifnull          1998
        //  1986: aload           13
        //  1988: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  1991: aload           24
        //  1993: astore          13
        //  1995: goto            2187
        //  1998: aload           24
        //  2000: astore          13
        //  2002: goto            2187
        //  2005: astore          21
        //  2007: aload           13
        //  2009: astore          14
        //  2011: aload           21
        //  2013: astore          13
        //  2015: aload           14
        //  2017: ifnull          2025
        //  2020: aload           14
        //  2022: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //  2025: aload           13
        //  2027: athrow         
        //  2028: aload           17
        //  2030: aload           13
        //  2032: iconst_0       
        //  2033: invokevirtual   jnm.c:(Ljng;Z)Ljava/lang/String;
        //  2036: astore          14
        //  2038: aload           14
        //  2040: ifnonnull       2059
        //  2043: aload           17
        //  2045: invokevirtual   jmb.i:()Ljnj;
        //  2048: aload           13
        //  2050: ldc_w           "Error formatting hit for POST upload"
        //  2053: invokevirtual   jnj.b:(Ljng;Ljava/lang/String;)V
        //  2056: goto            2147
        //  2059: aload           14
        //  2061: invokevirtual   java/lang/String.getBytes:()[B
        //  2064: astore          20
        //  2066: aload           20
        //  2068: arraylength    
        //  2069: getstatic       jnd.q:Ljnc;
        //  2072: invokevirtual   jnc.a:()Ljava/lang/Object;
        //  2075: checkcast       Ljava/lang/Integer;
        //  2078: invokevirtual   java/lang/Integer.intValue:()I
        //  2081: if_icmple       2100
        //  2084: aload           17
        //  2086: invokevirtual   jmb.i:()Ljnj;
        //  2089: aload           13
        //  2091: ldc_w           "Hit payload exceeds size limit"
        //  2094: invokevirtual   jnj.b:(Ljng;Ljava/lang/String;)V
        //  2097: goto            2147
        //  2100: aload           17
        //  2102: aload           13
        //  2104: invokevirtual   jnm.E:(Ljng;)Ljava/net/URL;
        //  2107: astore          14
        //  2109: aload           14
        //  2111: ifnonnull       2129
        //  2114: aload           17
        //  2116: ldc_w           "Failed to build collect POST endpoint url"
        //  2119: invokevirtual   jmb.n:(Ljava/lang/String;)V
        //  2122: aload           24
        //  2124: astore          13
        //  2126: goto            2187
        //  2129: aload           17
        //  2131: aload           14
        //  2133: aload           20
        //  2135: invokevirtual   jnm.b:(Ljava/net/URL;[B)I
        //  2138: sipush          200
        //  2141: if_icmpeq       2147
        //  2144: goto            2183
        //  2147: aload           24
        //  2149: aload           13
        //  2151: getfield        jng.b:J
        //  2154: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2157: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2162: pop            
        //  2163: aload           24
        //  2165: invokeinterface java/util/List.size:()I
        //  2170: invokestatic    jmv.e:()I
        //  2173: if_icmplt       1721
        //  2176: aload           24
        //  2178: astore          13
        //  2180: goto            2187
        //  2183: aload           24
        //  2185: astore          13
        //  2187: lload_2        
        //  2188: lstore          6
        //  2190: aload           13
        //  2192: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2197: astore          14
        //  2199: aload           14
        //  2201: invokeinterface java/util/Iterator.hasNext:()Z
        //  2206: ifeq            2232
        //  2209: lload           4
        //  2211: aload           14
        //  2213: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2218: checkcast       Ljava/lang/Long;
        //  2221: invokevirtual   java/lang/Long.longValue:()J
        //  2224: invokestatic    java/lang/Math.max:(JJ)J
        //  2227: lstore          4
        //  2229: goto            2199
        //  2232: aload_0        
        //  2233: getfield        jmt.c:Ljmn;
        //  2236: aload           13
        //  2238: invokevirtual   jmn.E:(Ljava/util/List;)V
        //  2241: aload           12
        //  2243: aload           13
        //  2245: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //  2250: pop            
        //  2251: goto            2303
        //  2254: astore          13
        //  2256: aload_0        
        //  2257: ldc_w           "Failed to remove successfully uploaded hits"
        //  2260: aload           13
        //  2262: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2265: aload_0        
        //  2266: invokespecial   jmt.H:()V
        //  2269: aload_0        
        //  2270: getfield        jmt.c:Ljmn;
        //  2273: invokevirtual   jmn.G:()V
        //  2276: aload_0        
        //  2277: getfield        jmt.c:Ljmn;
        //  2280: invokevirtual   jmn.F:()V
        //  2283: lload           6
        //  2285: lstore_2       
        //  2286: goto            2482
        //  2289: astore          13
        //  2291: aload_0        
        //  2292: ldc_w           "Failed to commit local dispatch transaction"
        //  2295: aload           13
        //  2297: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2300: goto            2351
        //  2303: lload_2        
        //  2304: lstore          6
        //  2306: aload           12
        //  2308: invokeinterface java/util/List.isEmpty:()Z
        //  2313: istore          9
        //  2315: iload           9
        //  2317: ifeq            2358
        //  2320: aload_0        
        //  2321: getfield        jmt.c:Ljmn;
        //  2324: invokevirtual   jmn.G:()V
        //  2327: aload_0        
        //  2328: getfield        jmt.c:Ljmn;
        //  2331: invokevirtual   jmn.F:()V
        //  2334: lload           6
        //  2336: lstore_2       
        //  2337: goto            2482
        //  2340: astore          13
        //  2342: aload_0        
        //  2343: ldc_w           "Failed to commit local dispatch transaction"
        //  2346: aload           13
        //  2348: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2351: aload_0        
        //  2352: invokespecial   jmt.H:()V
        //  2355: goto            2482
        //  2358: aload_0        
        //  2359: getfield        jmt.c:Ljmn;
        //  2362: invokevirtual   jmn.G:()V
        //  2365: aload_0        
        //  2366: getfield        jmt.c:Ljmn;
        //  2369: invokevirtual   jmn.F:()V
        //  2372: lload           6
        //  2374: lstore_2       
        //  2375: goto            148
        //  2378: astore          13
        //  2380: aload_0        
        //  2381: ldc_w           "Failed to commit local dispatch transaction"
        //  2384: aload           13
        //  2386: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2389: goto            2351
        //  2392: astore          13
        //  2394: lload_2        
        //  2395: lstore          4
        //  2397: aload_0        
        //  2398: ldc_w           "Failed to read hits from persisted store"
        //  2401: aload           13
        //  2403: invokevirtual   jmb.u:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2406: aload_0        
        //  2407: invokespecial   jmt.H:()V
        //  2410: aload_0        
        //  2411: getfield        jmt.c:Ljmn;
        //  2414: invokevirtual   jmn.G:()V
        //  2417: aload_0        
        //  2418: getfield        jmt.c:Ljmn;
        //  2421: invokevirtual   jmn.F:()V
        //  2424: lload           4
        //  2426: lstore_2       
        //  2427: goto            2482
        //  2430: astore          13
        //  2432: aload_0        
        //  2433: ldc_w           "Failed to commit local dispatch transaction"
        //  2436: aload           13
        //  2438: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2441: goto            2351
        //  2444: astore          13
        //  2446: goto            2451
        //  2449: astore          13
        //  2451: aload_0        
        //  2452: getfield        jmt.c:Ljmn;
        //  2455: invokevirtual   jmn.G:()V
        //  2458: aload_0        
        //  2459: getfield        jmt.c:Ljmn;
        //  2462: invokevirtual   jmn.F:()V
        //  2465: aload           13
        //  2467: athrow         
        //  2468: astore          13
        //  2470: aload_0        
        //  2471: ldc_w           "Failed to commit local dispatch transaction"
        //  2474: aload           13
        //  2476: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2479: goto            2351
        //  2482: aload_0        
        //  2483: invokevirtual   jmb.j:()Ljno;
        //  2486: invokevirtual   jno.c:()V
        //  2489: aload_0        
        //  2490: invokevirtual   jmt.F:()V
        //  2493: aload_1        
        //  2494: ifnull          2503
        //  2497: aload_1        
        //  2498: invokeinterface jnb.a:()V
        //  2503: aload_0        
        //  2504: getfield        jmt.e:J
        //  2507: lload_2        
        //  2508: lcmp           
        //  2509: ifeq            2597
        //  2512: aload_0        
        //  2513: getfield        jmt.h:Ljnk;
        //  2516: invokevirtual   jnk.a:()Landroid/content/Context;
        //  2519: astore          14
        //  2521: new             Landroid/content/Intent;
        //  2524: astore          13
        //  2526: aload           13
        //  2528: ldc_w           "com.google.analytics.RADIO_POWERED"
        //  2531: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //  2534: aload           13
        //  2536: aload           14
        //  2538: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //  2541: invokevirtual   android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
        //  2544: pop            
        //  2545: aload           13
        //  2547: getstatic       jnk.a:Ljava/lang/String;
        //  2550: iconst_1       
        //  2551: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2554: pop            
        //  2555: aload           14
        //  2557: aload           13
        //  2559: aconst_null    
        //  2560: invokevirtual   android/content/Context.sendOrderedBroadcast:(Landroid/content/Intent;Ljava/lang/String;)V
        //  2563: return         
        //  2564: astore          13
        //  2566: aload_0        
        //  2567: ldc_w           "Local dispatch failed"
        //  2570: aload           13
        //  2572: invokevirtual   jmb.o:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2575: aload_0        
        //  2576: invokevirtual   jmb.j:()Ljno;
        //  2579: invokevirtual   jno.c:()V
        //  2582: aload_0        
        //  2583: invokevirtual   jmt.F:()V
        //  2586: aload_1        
        //  2587: ifnull          2597
        //  2590: aload_1        
        //  2591: invokeinterface jnb.a:()V
        //  2596: return         
        //  2597: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  66     98     2564   2597   Ljava/lang/Exception;
        //  112    119    2564   2597   Ljava/lang/Exception;
        //  122    144    2564   2597   Ljava/lang/Exception;
        //  148    174    2449   2451   Any
        //  174    206    2392   2444   Landroid/database/sqlite/SQLiteException;
        //  174    206    2449   2451   Any
        //  206    220    223    234    Landroid/database/sqlite/SQLiteException;
        //  206    220    2564   2597   Ljava/lang/Exception;
        //  225    234    2564   2597   Ljava/lang/Exception;
        //  234    238    2564   2597   Ljava/lang/Exception;
        //  241    258    2392   2444   Landroid/database/sqlite/SQLiteException;
        //  241    258    2449   2451   Any
        //  258    267    2449   2451   Any
        //  267    322    2449   2451   Any
        //  322    336    339    353    Landroid/database/sqlite/SQLiteException;
        //  322    336    2564   2597   Ljava/lang/Exception;
        //  341    350    2564   2597   Ljava/lang/Exception;
        //  361    378    2449   2451   Any
        //  386    421    2449   2451   Any
        //  424    455    2449   2451   Any
        //  455    483    486    532    Landroid/database/sqlite/SQLiteException;
        //  455    483    2449   2451   Any
        //  488    501    2449   2451   Any
        //  501    515    518    532    Landroid/database/sqlite/SQLiteException;
        //  501    515    2564   2597   Ljava/lang/Exception;
        //  520    529    2564   2597   Ljava/lang/Exception;
        //  540    608    2449   2451   Any
        //  617    639    2449   2451   Any
        //  645    656    2449   2451   Any
        //  662    673    2449   2451   Any
        //  679    690    2449   2451   Any
        //  696    707    2449   2451   Any
        //  716    735    2449   2451   Any
        //  758    824    2449   2451   Any
        //  824    865    2449   2451   Any
        //  868    881    2449   2451   Any
        //  886    902    2449   2451   Any
        //  905    950    2449   2451   Any
        //  953    964    2449   2451   Any
        //  970    994    2449   2451   Any
        //  1004   1026   1051   1066   Ljava/io/IOException;
        //  1004   1026   2449   2451   Any
        //  1026   1036   1051   1066   Ljava/io/IOException;
        //  1026   1036   2449   2451   Any
        //  1036   1048   2449   2451   Any
        //  1053   1066   2449   2451   Any
        //  1066   1082   2449   2451   Any
        //  1085   1093   2449   2451   Any
        //  1100   1107   2449   2451   Any
        //  1112   1125   2449   2451   Any
        //  1133   1146   2449   2451   Any
        //  1146   1213   1478   1480   Ljava/io/IOException;
        //  1146   1213   1463   1465   Any
        //  1218   1223   1478   1480   Ljava/io/IOException;
        //  1218   1223   1463   1465   Any
        //  1228   1253   1458   1463   Ljava/io/IOException;
        //  1228   1253   1453   1458   Any
        //  1260   1275   1458   1463   Ljava/io/IOException;
        //  1260   1275   1453   1458   Any
        //  1275   1287   1458   1463   Ljava/io/IOException;
        //  1275   1287   1453   1458   Any
        //  1287   1323   1437   1453   Ljava/io/IOException;
        //  1287   1323   1425   1437   Any
        //  1323   1335   1412   1425   Ljava/io/IOException;
        //  1323   1335   1399   1412   Any
        //  1335   1349   1437   1453   Ljava/io/IOException;
        //  1335   1349   1425   1437   Any
        //  1357   1365   1437   1453   Ljava/io/IOException;
        //  1357   1365   1425   1437   Any
        //  1373   1386   1437   1453   Ljava/io/IOException;
        //  1373   1386   1425   1437   Any
        //  1391   1396   2444   2449   Any
        //  1486   1496   1543   1553   Any
        //  1501   1506   1509   1521   Ljava/io/IOException;
        //  1501   1506   2444   2449   Any
        //  1511   1521   2444   2449   Any
        //  1526   1531   2444   2449   Any
        //  1558   1563   1566   1578   Ljava/io/IOException;
        //  1558   1563   2444   2449   Any
        //  1568   1578   2444   2449   Any
        //  1583   1588   2444   2449   Any
        //  1588   1591   2444   2449   Any
        //  1591   1605   2444   2449   Any
        //  1613   1629   2444   2449   Any
        //  1636   1687   2444   2449   Any
        //  1687   1692   2444   2449   Any
        //  1695   1721   2444   2449   Any
        //  1721   1765   2444   2449   Any
        //  1770   1783   2444   2449   Any
        //  1786   1817   2444   2449   Any
        //  1822   1830   2444   2449   Any
        //  1837   1847   2444   2449   Any
        //  1847   1856   1962   1971   Ljava/io/IOException;
        //  1847   1856   1954   1962   Any
        //  1856   1875   1945   1954   Ljava/io/IOException;
        //  1856   1875   1940   1945   Any
        //  1883   1891   1945   1954   Ljava/io/IOException;
        //  1883   1891   1940   1945   Any
        //  1899   1912   1945   1954   Ljava/io/IOException;
        //  1899   1912   1940   1945   Any
        //  1917   1922   2444   2449   Any
        //  1971   1981   2005   2015   Any
        //  1986   1991   2444   2449   Any
        //  2020   2025   2444   2449   Any
        //  2025   2028   2444   2449   Any
        //  2028   2038   2444   2449   Any
        //  2043   2056   2444   2449   Any
        //  2059   2097   2444   2449   Any
        //  2100   2109   2444   2449   Any
        //  2114   2122   2444   2449   Any
        //  2129   2144   2444   2449   Any
        //  2147   2176   2444   2449   Any
        //  2190   2199   2444   2449   Any
        //  2199   2229   2444   2449   Any
        //  2232   2251   2254   2303   Landroid/database/sqlite/SQLiteException;
        //  2232   2251   2444   2449   Any
        //  2256   2269   2444   2449   Any
        //  2269   2283   2289   2303   Landroid/database/sqlite/SQLiteException;
        //  2269   2283   2564   2597   Ljava/lang/Exception;
        //  2291   2300   2564   2597   Ljava/lang/Exception;
        //  2306   2315   2444   2449   Any
        //  2320   2334   2340   2351   Landroid/database/sqlite/SQLiteException;
        //  2320   2334   2564   2597   Ljava/lang/Exception;
        //  2342   2351   2564   2597   Ljava/lang/Exception;
        //  2351   2355   2564   2597   Ljava/lang/Exception;
        //  2358   2372   2378   2392   Landroid/database/sqlite/SQLiteException;
        //  2358   2372   2564   2597   Ljava/lang/Exception;
        //  2380   2389   2564   2597   Ljava/lang/Exception;
        //  2397   2410   2444   2449   Any
        //  2410   2424   2430   2444   Landroid/database/sqlite/SQLiteException;
        //  2410   2424   2564   2597   Ljava/lang/Exception;
        //  2432   2441   2564   2597   Ljava/lang/Exception;
        //  2451   2465   2468   2482   Landroid/database/sqlite/SQLiteException;
        //  2451   2465   2564   2597   Ljava/lang/Exception;
        //  2465   2468   2564   2597   Ljava/lang/Exception;
        //  2470   2479   2564   2597   Ljava/lang/Exception;
        //  2482   2493   2564   2597   Ljava/lang/Exception;
        //  2497   2503   2564   2597   Ljava/lang/Exception;
        //  2503   2563   2564   2597   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1396:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
