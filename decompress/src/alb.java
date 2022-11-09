import androidx.work.impl.WorkDatabase;
import java.util.Set;
import android.database.Cursor;
import android.app.job.JobInfo$TriggerContentUri;
import android.net.NetworkRequest$Builder;
import android.app.job.JobInfo$Builder;
import java.util.Locale;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alb implements ajq
{
    private static final String a;
    private final Context b;
    private final JobScheduler c;
    private final akh d;
    private final ala e;
    
    static {
        a = aiy.b("SystemJobScheduler");
    }
    
    public alb(final Context b, final akh d) {
        final JobScheduler c = (JobScheduler)b.getSystemService("jobscheduler");
        final ala e = new ala(b);
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public static void a(final Context context) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            final List h = h(context, jobScheduler);
            if (h != null && !h.isEmpty()) {
                final Iterator iterator = h.iterator();
                while (iterator.hasNext()) {
                    i(jobScheduler, ((JobInfo)iterator.next()).getId());
                }
            }
        }
    }
    
    public static boolean f(final Context context, akh d) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        final List h = h(context, jobScheduler);
        final amp w = d.d.w();
        boolean b = false;
        Object a = at.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        w.a.g();
        Object o = gz.s(w.a, (aff)a, false);
        try {
            final ArrayList list = new ArrayList(((Cursor)o).getCount());
            while (((Cursor)o).moveToNext()) {
                list.add((Object)((Cursor)o).getString(0));
            }
            ((Cursor)o).close();
            ((at)a).j();
            int size;
            if (h != null) {
                size = h.size();
            }
            else {
                size = 0;
            }
            a = new HashSet<CharSequence>(size);
            if (h != null && !h.isEmpty()) {
                for (final JobInfo jobInfo : h) {
                    o = g(jobInfo);
                    if (!TextUtils.isEmpty((CharSequence)o)) {
                        ((Set<CharSequence>)a).add((CharSequence)o);
                    }
                    else {
                        i(jobScheduler, jobInfo.getId());
                    }
                }
            }
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                if (!((Set)a).contains(iterator2.next())) {
                    aiy.a().d(new Throwable[0]);
                    b = true;
                    break;
                }
            }
            if (b) {
                d = (akh)d.d;
                ((aq)d).h();
                try {
                    final anb s = ((WorkDatabase)d).s();
                    final Iterator iterator3 = list.iterator();
                    while (iterator3.hasNext()) {
                        s.j((String)iterator3.next(), -1L);
                    }
                    ((aq)d).j();
                }
                finally {
                    ((aq)d).i();
                }
            }
            return b;
        }
        finally {
            ((Cursor)o).close();
            ((at)a).j();
            while (true) {}
        }
    }
    
    private static String g(final JobInfo jobInfo) {
        final PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
            }
            catch (final NullPointerException ex) {}
        }
        return null;
    }
    
    private static List h(final Context context, final JobScheduler jobScheduler) {
        List list = null;
        try {
            jobScheduler.getAllPendingJobs();
        }
        finally {
            aiy.a();
            final Throwable t;
            aiy.e(alb.a, "getAllPendingJobs() is not reliable on this device.", t);
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add((Object)jobInfo);
            }
        }
        return list2;
    }
    
    private static void i(final JobScheduler jobScheduler, final int n) {
        try {
            jobScheduler.cancel(n);
        }
        finally {
            aiy.a();
            final Throwable t;
            aiy.e(alb.a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n), t);
        }
    }
    
    @Override
    public final void b(final String s) {
        final List h = h(this.b, this.c);
        List list;
        if (h == null) {
            list = null;
        }
        else {
            list = new ArrayList(2);
            for (final JobInfo jobInfo : h) {
                if (s.equals(g(jobInfo))) {
                    list.add(jobInfo.getId());
                }
            }
        }
        if (list != null && !list.isEmpty()) {
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                i(this.c, (int)iterator2.next());
            }
            this.d.d.w().c(s);
        }
    }
    
    @Override
    public final void c(final ana... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        alb.d:Lakh;
        //     4: getfield        akh.d:Landroidx/work/impl/WorkDatabase;
        //     7: astore_2       
        //     8: new             Lanu;
        //    11: dup            
        //    12: aload_2        
        //    13: invokespecial   anu.<init>:(Landroidx/work/impl/WorkDatabase;)V
        //    16: astore_3       
        //    17: aload_1        
        //    18: arraylength    
        //    19: istore          4
        //    21: iconst_0       
        //    22: istore          5
        //    24: iload           5
        //    26: iload           4
        //    28: if_icmpge       359
        //    31: aload_1        
        //    32: iload           5
        //    34: aaload         
        //    35: astore          6
        //    37: aload_2        
        //    38: invokevirtual   aq.h:()V
        //    41: aload_2        
        //    42: invokevirtual   androidx/work/impl/WorkDatabase.s:()Lanb;
        //    45: aload           6
        //    47: getfield        ana.a:Ljava/lang/String;
        //    50: invokeinterface anb.a:(Ljava/lang/String;)Lana;
        //    55: astore          7
        //    57: aload           7
        //    59: ifnonnull       131
        //    62: invokestatic    aiy.a:()Laiy;
        //    65: pop            
        //    66: getstatic       alb.a:Ljava/lang/String;
        //    69: astore          8
        //    71: new             Ljava/lang/StringBuilder;
        //    74: astore          7
        //    76: aload           7
        //    78: invokespecial   java/lang/StringBuilder.<init>:()V
        //    81: aload           7
        //    83: ldc_w           "Skipping scheduling "
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: pop            
        //    90: aload           7
        //    92: aload           6
        //    94: getfield        ana.a:Ljava/lang/String;
        //    97: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   100: pop            
        //   101: aload           7
        //   103: ldc_w           " because it's no longer in the DB"
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: pop            
        //   110: aload           8
        //   112: aload           7
        //   114: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   117: iconst_0       
        //   118: anewarray       Ljava/lang/Throwable;
        //   121: invokestatic    aiy.g:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   124: aload_2        
        //   125: invokevirtual   aq.j:()V
        //   128: goto            335
        //   131: aload           7
        //   133: getfield        ana.p:I
        //   136: iconst_1       
        //   137: if_icmpeq       209
        //   140: invokestatic    aiy.a:()Laiy;
        //   143: pop            
        //   144: getstatic       alb.a:Ljava/lang/String;
        //   147: astore          8
        //   149: new             Ljava/lang/StringBuilder;
        //   152: astore          7
        //   154: aload           7
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: aload           7
        //   161: ldc_w           "Skipping scheduling "
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: pop            
        //   168: aload           7
        //   170: aload           6
        //   172: getfield        ana.a:Ljava/lang/String;
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: pop            
        //   179: aload           7
        //   181: ldc_w           " because it is no longer enqueued"
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: pop            
        //   188: aload           8
        //   190: aload           7
        //   192: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   195: iconst_0       
        //   196: anewarray       Ljava/lang/Throwable;
        //   199: invokestatic    aiy.g:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   202: aload_2        
        //   203: invokevirtual   aq.j:()V
        //   206: goto            335
        //   209: aload_2        
        //   210: invokevirtual   androidx/work/impl/WorkDatabase.w:()Lamp;
        //   213: aload           6
        //   215: getfield        ana.a:Ljava/lang/String;
        //   218: invokevirtual   amp.a:(Ljava/lang/String;)Lamm;
        //   221: astore          7
        //   223: aload           7
        //   225: ifnull          238
        //   228: aload           7
        //   230: getfield        amm.b:I
        //   233: istore          9
        //   235: goto            286
        //   238: aload_0        
        //   239: getfield        alb.d:Lakh;
        //   242: getfield        akh.c:Lail;
        //   245: getfield        ail.d:I
        //   248: istore          9
        //   250: ldc_w           Lanu;.class
        //   253: monitorenter   
        //   254: aload_3        
        //   255: ldc_w           "next_job_scheduler_id"
        //   258: invokevirtual   anu.a:(Ljava/lang/String;)I
        //   261: istore          9
        //   263: iload           9
        //   265: ifge            282
        //   268: aload_3        
        //   269: ldc_w           "next_job_scheduler_id"
        //   272: iconst_1       
        //   273: invokevirtual   anu.b:(Ljava/lang/String;I)V
        //   276: iconst_0       
        //   277: istore          9
        //   279: goto            282
        //   282: ldc_w           Lanu;.class
        //   285: monitorexit    
        //   286: aload           7
        //   288: ifnonnull       323
        //   291: new             Lamm;
        //   294: astore          7
        //   296: aload           7
        //   298: aload           6
        //   300: getfield        ana.a:Ljava/lang/String;
        //   303: iload           9
        //   305: invokespecial   amm.<init>:(Ljava/lang/String;I)V
        //   308: aload_0        
        //   309: getfield        alb.d:Lakh;
        //   312: getfield        akh.d:Landroidx/work/impl/WorkDatabase;
        //   315: invokevirtual   androidx/work/impl/WorkDatabase.w:()Lamp;
        //   318: aload           7
        //   320: invokevirtual   amp.b:(Lamm;)V
        //   323: aload_0        
        //   324: aload           6
        //   326: iload           9
        //   328: invokevirtual   alb.e:(Lana;I)V
        //   331: aload_2        
        //   332: invokevirtual   aq.j:()V
        //   335: aload_2        
        //   336: invokevirtual   aq.i:()V
        //   339: iinc            5, 1
        //   342: goto            24
        //   345: astore_1       
        //   346: ldc_w           Lanu;.class
        //   349: monitorexit    
        //   350: aload_1        
        //   351: athrow         
        //   352: astore_1       
        //   353: aload_2        
        //   354: invokevirtual   aq.i:()V
        //   357: aload_1        
        //   358: athrow         
        //   359: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  41     57     352    359    Any
        //  62     128    352    359    Any
        //  131    206    352    359    Any
        //  209    223    352    359    Any
        //  228    235    352    359    Any
        //  238    254    352    359    Any
        //  254    263    345    352    Any
        //  268    276    345    352    Any
        //  282    286    345    352    Any
        //  291    323    352    359    Any
        //  323    335    352    359    Any
        //  346    350    345    352    Any
        //  350    352    352    359    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    @Override
    public final boolean d() {
        return true;
    }
    
    public final void e(final ana ex, int size) {
        final ala e = this.e;
        final ain i = ((ana)ex).i;
        final PersistableBundle extras = new PersistableBundle();
        extras.putString("EXTRA_WORK_SPEC_ID", ((ana)ex).a);
        extras.putBoolean("EXTRA_IS_PERIODIC", ((ana)ex).d());
        final JobInfo$Builder setExtras = new JobInfo$Builder(size, e.a).setRequiresCharging(i.b).setRequiresDeviceIdle(i.c).setExtras(extras);
        final int j = i.i;
        if (j == 6) {
            setExtras.setRequiredNetwork(new NetworkRequest$Builder().addCapability(25).build());
        }
        else {
            if (j == 0) {
                throw null;
            }
            int requiredNetworkType = 0;
            switch (j - 1) {
                default: {
                    final aiy a = aiy.a();
                    String.format("API version too low. Cannot convert network type value %s", cwy.c(j));
                    a.d(new Throwable[0]);
                    requiredNetworkType = 1;
                    break;
                }
                case 4: {
                    requiredNetworkType = 4;
                    break;
                }
                case 3: {
                    requiredNetworkType = 3;
                    break;
                }
                case 2: {
                    requiredNetworkType = 2;
                    break;
                }
                case 1: {
                    requiredNetworkType = 1;
                    break;
                }
                case 0: {
                    requiredNetworkType = 0;
                    break;
                }
            }
            setExtras.setRequiredNetworkType(requiredNetworkType);
        }
        if (!i.c) {
            int n;
            if (((ana)ex).q == 2) {
                n = 0;
            }
            else {
                n = 1;
            }
            setExtras.setBackoffCriteria(((ana)ex).k, n);
        }
        final long max = Math.max(((ana)ex).a() - System.currentTimeMillis(), 0L);
        if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!((ana)ex).o) {
            setExtras.setImportantWhileForeground(true);
        }
        if (i.a()) {
            for (final aio aio : i.h.a) {
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(aio.a, (int)(aio.b ? 1 : 0)));
            }
            setExtras.setTriggerContentUpdateDelay(i.f);
            setExtras.setTriggerContentMaxDelay(i.g);
        }
        setExtras.setPersisted(false);
        setExtras.setRequiresBatteryNotLow(i.d);
        setExtras.setRequiresStorageNotLow(i.e);
        final int k = ((ana)ex).j;
        if (aah.b() && ((ana)ex).o && k <= 0) {
            setExtras.setExpedited(true);
        }
        final JobInfo build = setExtras.build();
        final aiy a2 = aiy.a();
        String.format("Scheduling work ID %s Job ID %s", ((ana)ex).a, size);
        a2.d(new Throwable[0]);
        try {
            if (this.c.schedule(build) == 0) {
                aiy.a();
                aiy.g(alb.a, String.format("Unable to schedule work ID %s", ((ana)ex).a), new Throwable[0]);
                if (((ana)ex).o && ((ana)ex).r == 1) {
                    ((ana)ex).o = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", ((ana)ex).a);
                    aiy.a().d(new Throwable[0]);
                    this.e((ana)ex, size);
                }
            }
            return;
        }
        catch (final IllegalStateException ex) {
            final List h = h(this.b, this.c);
            if (h != null) {
                size = h.size();
            }
            else {
                size = 0;
            }
            final Locale default1 = Locale.getDefault();
            final int size2 = this.d.d.s().c().size();
            final int e2 = this.d.c.e;
            final String format = String.format(default1, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", size, size2, 20);
            aiy.a();
            aiy.e(alb.a, format, new Throwable[0]);
            throw new IllegalStateException(format, ex);
        }
        finally {
            aiy.a();
            final Throwable t;
            aiy.e(alb.a, String.format("Unable to schedule %s", ex), t);
            return;
        }
        throw null;
    }
}
