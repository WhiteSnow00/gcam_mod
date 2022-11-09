import android.database.Cursor;
import java.io.File;
import android.os.Build$VERSION;
import android.database.sqlite.SQLiteException;
import java.util.HashSet;
import java.util.Set;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmm extends SQLiteOpenHelper
{
    final /* synthetic */ jmn a;
    
    public jmm(final jmn a, final Context context) {
        this.a = a;
        super(context, "google_analytics_v4.db", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    private final boolean a(final SQLiteDatabase p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aconst_null    
        //     3: astore          4
        //     5: aload_1        
        //     6: ldc             "SQLITE_MASTER"
        //     8: iconst_1       
        //     9: anewarray       Ljava/lang/String;
        //    12: dup            
        //    13: iconst_0       
        //    14: ldc             "name"
        //    16: aastore        
        //    17: ldc             "name=?"
        //    19: iconst_1       
        //    20: anewarray       Ljava/lang/String;
        //    23: dup            
        //    24: iconst_0       
        //    25: aload_2        
        //    26: aastore        
        //    27: aconst_null    
        //    28: aconst_null    
        //    29: aconst_null    
        //    30: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    33: astore          5
        //    35: aload           5
        //    37: astore_1       
        //    38: aload           5
        //    40: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    45: istore          6
        //    47: aload           5
        //    49: ifnull          59
        //    52: aload           5
        //    54: invokeinterface android/database/Cursor.close:()V
        //    59: iload           6
        //    61: ireturn        
        //    62: astore_3       
        //    63: goto            80
        //    66: astore_1       
        //    67: aload_3        
        //    68: astore          5
        //    70: aload_1        
        //    71: astore_2       
        //    72: goto            112
        //    75: astore_3       
        //    76: aload           4
        //    78: astore          5
        //    80: aload           5
        //    82: astore_1       
        //    83: aload_0        
        //    84: getfield        jmm.a:Ljmn;
        //    87: ldc             "Error querying for table"
        //    89: aload_2        
        //    90: aload_3        
        //    91: invokevirtual   jmb.v:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //    94: aload           5
        //    96: ifnull          106
        //    99: aload           5
        //   101: invokeinterface android/database/Cursor.close:()V
        //   106: iconst_0       
        //   107: ireturn        
        //   108: astore_2       
        //   109: aload_1        
        //   110: astore          5
        //   112: aload           5
        //   114: ifnull          124
        //   117: aload           5
        //   119: invokeinterface android/database/Cursor.close:()V
        //   124: aload_2        
        //   125: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  5      35     75     80     Landroid/database/sqlite/SQLiteException;
        //  5      35     66     75     Any
        //  38     47     62     66     Landroid/database/sqlite/SQLiteException;
        //  38     47     108    112    Any
        //  83     94     108    112    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    private static final Set b(SQLiteDatabase rawQuery, final String s) {
        final HashSet set = new HashSet();
        final StringBuilder sb = new StringBuilder(s.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(s);
        sb.append(" LIMIT 0");
        rawQuery = (SQLiteDatabase)rawQuery.rawQuery(sb.toString(), (String[])null);
        try {
            final String[] columnNames = ((Cursor)rawQuery).getColumnNames();
            for (int i = 0; i < columnNames.length; ++i) {
                set.add(columnNames[i]);
            }
            ((Cursor)rawQuery).close();
            return set;
        }
        finally {
            ((Cursor)rawQuery).close();
            while (true) {}
        }
    }
    
    public final SQLiteDatabase getWritableDatabase() {
        if (this.a.e.c(3600000L)) {
            try {
                return super.getWritableDatabase();
            }
            catch (final SQLiteException ex) {
                this.a.e.b();
                this.a.n("Opening the database failed, dropping the table and recreating it");
                this.a.d().getDatabasePath("google_analytics_v4.db").delete();
                try {
                    final SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.a.e.a();
                    return writableDatabase;
                }
                catch (final SQLiteException ex2) {
                    this.a.o("Failed to open freshly created database", ex2);
                    throw ex2;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        final String path = sqLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build$VERSION.SDK) < 9) {
                return;
            }
            final File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
        catch (final NumberFormatException ex) {
            jni.a(Build$VERSION.SDK);
        }
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
    
    public final void onOpen(final SQLiteDatabase sqLiteDatabase) {
        final boolean a = this.a(sqLiteDatabase, "hits2");
        final int n = 0;
        if (!a) {
            sqLiteDatabase.execSQL(jmn.a);
        }
        else {
            final Set b = b(sqLiteDatabase, "hits2");
            for (int i = 0; i < 4; ++i) {
                final String s = (new String[] { "hit_id", "hit_string", "hit_time", "hit_url" })[i];
                if (!b.remove(s)) {
                    final String value = String.valueOf(s);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Database hits2 is missing required column: ".concat(value);
                    }
                    else {
                        concat = new String("Database hits2 is missing required column: ");
                    }
                    throw new SQLiteException(concat);
                }
            }
            final boolean remove = b.remove("hit_app_id");
            if (!b.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (remove ^ true) {
                sqLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (!this.a(sqLiteDatabase, "properties")) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        final Set b2 = b(sqLiteDatabase, "properties");
        for (int j = n; j < 6; ++j) {
            final String s2 = (new String[] { "app_uid", "cid", "tid", "params", "adid", "hits_count" })[j];
            if (!b2.remove(s2)) {
                final String value2 = String.valueOf(s2);
                String concat2;
                if (value2.length() != 0) {
                    concat2 = "Database properties is missing required column: ".concat(value2);
                }
                else {
                    concat2 = new String("Database properties is missing required column: ");
                }
                throw new SQLiteException(concat2);
            }
        }
        if (b2.isEmpty()) {
            return;
        }
        throw new SQLiteException("Database properties table has extra columns");
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
    }
}
