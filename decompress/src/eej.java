// 
// Decompiled by Procyon v0.6.0
// 

final class eej extends Thread
{
    final /* synthetic */ eel a;
    
    public eej(final eel a) {
        this.a = a;
        super("EncoderDrainerDrainThread");
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        eej.a:Leel;
        //     4: astore_1       
        //     5: aload_1        
        //     6: getfield        eel.g:Z
        //     9: ifne            354
        //    12: aload_1        
        //    13: getfield        eel.b:Leeh;
        //    16: invokeinterface eeh.a:()Landroid/media/MediaCodec;
        //    21: astore_2       
        //    22: aload_2        
        //    23: invokevirtual   android/media/MediaCodec.getOutputBuffers:()[Ljava/nio/ByteBuffer;
        //    26: astore_3       
        //    27: aload_1        
        //    28: getfield        eel.i:Z
        //    31: ifeq            0
        //    34: new             Landroid/media/MediaCodec$BufferInfo;
        //    37: dup            
        //    38: invokespecial   android/media/MediaCodec$BufferInfo.<init>:()V
        //    41: astore          4
        //    43: aload_2        
        //    44: aload           4
        //    46: ldc2_w          250000
        //    49: invokevirtual   android/media/MediaCodec.dequeueOutputBuffer:(Landroid/media/MediaCodec$BufferInfo;J)I
        //    52: istore          5
        //    54: iload           5
        //    56: iconst_m1      
        //    57: if_icmpne       91
        //    60: aload_1        
        //    61: getfield        eel.g:Z
        //    64: ifeq            74
        //    67: aload_1        
        //    68: getfield        eel.l:I
        //    71: ifne            27
        //    74: getstatic       eel.a:Lnsd;
        //    77: invokevirtual   nry.c:()Lnsu;
        //    80: ldc             "MediaCodec timed out."
        //    82: sipush          1138
        //    85: invokestatic    a.l:(Lnsu;Ljava/lang/String;C)V
        //    88: goto            0
        //    91: iload           5
        //    93: bipush          -3
        //    95: if_icmpne       106
        //    98: aload_2        
        //    99: invokevirtual   android/media/MediaCodec.getOutputBuffers:()[Ljava/nio/ByteBuffer;
        //   102: astore_3       
        //   103: goto            27
        //   106: iload           5
        //   108: bipush          -2
        //   110: if_icmpne       135
        //   113: aload_2        
        //   114: invokevirtual   android/media/MediaCodec.getOutputFormat:()Landroid/media/MediaFormat;
        //   117: astore          4
        //   119: aload_1        
        //   120: aload_1        
        //   121: getfield        eel.c:Leem;
        //   124: aload           4
        //   126: invokevirtual   eem.a:(Landroid/media/MediaFormat;)I
        //   129: putfield        eel.f:I
        //   132: goto            27
        //   135: iload           5
        //   137: iflt            27
        //   140: aload_3        
        //   141: iload           5
        //   143: aaload         
        //   144: astore          6
        //   146: aload           6
        //   148: ifnonnull       183
        //   151: getstatic       eel.a:Lnsd;
        //   154: invokevirtual   nry.b:()Lnsu;
        //   157: checkcast       Lnsa;
        //   160: sipush          1137
        //   163: invokeinterface nsa.E:(I)Lnsu;
        //   168: checkcast       Lnsa;
        //   171: ldc             "encoderOutputBuffer %s was null"
        //   173: iload           5
        //   175: invokeinterface nsa.p:(Ljava/lang/String;I)V
        //   180: goto            0
        //   183: aload           4
        //   185: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   188: iconst_2       
        //   189: iand           
        //   190: ifeq            199
        //   193: aload           4
        //   195: iconst_0       
        //   196: putfield        android/media/MediaCodec$BufferInfo.size:I
        //   199: aload           4
        //   201: getfield        android/media/MediaCodec$BufferInfo.size:I
        //   204: ifeq            305
        //   207: aload           6
        //   209: invokevirtual   java/nio/ByteBuffer.rewind:()Ljava/nio/Buffer;
        //   212: pop            
        //   213: aload           6
        //   215: invokevirtual   java/nio/ByteBuffer.remaining:()I
        //   218: newarray        B
        //   220: astore          7
        //   222: aload           6
        //   224: aload           7
        //   226: invokevirtual   java/nio/ByteBuffer.get:([B)Ljava/nio/ByteBuffer;
        //   229: pop            
        //   230: aload           7
        //   232: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //   235: astore          8
        //   237: aload_1        
        //   238: aload_1        
        //   239: getfield        eel.l:I
        //   242: iconst_1       
        //   243: iadd           
        //   244: putfield        eel.l:I
        //   247: aload_1        
        //   248: getfield        eel.e:Ljava/lang/Object;
        //   251: astore          6
        //   253: aload           6
        //   255: monitorenter   
        //   256: aload_1        
        //   257: getfield        eel.d:Ljava/util/Queue;
        //   260: astore          7
        //   262: new             Leek;
        //   265: astore          9
        //   267: aload           9
        //   269: aload           8
        //   271: aload           4
        //   273: invokespecial   eek.<init>:(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
        //   276: aload           7
        //   278: aload           9
        //   280: invokeinterface java/util/Queue.offer:(Ljava/lang/Object;)Z
        //   285: pop            
        //   286: aload_1        
        //   287: getfield        eel.e:Ljava/lang/Object;
        //   290: invokevirtual   java/lang/Object.notifyAll:()V
        //   293: aload           6
        //   295: monitorexit    
        //   296: goto            305
        //   299: astore_3       
        //   300: aload           6
        //   302: monitorexit    
        //   303: aload_3        
        //   304: athrow         
        //   305: aload_2        
        //   306: iload           5
        //   308: iconst_0       
        //   309: invokevirtual   android/media/MediaCodec.releaseOutputBuffer:(IZ)V
        //   312: aload           4
        //   314: getfield        android/media/MediaCodec$BufferInfo.flags:I
        //   317: iconst_4       
        //   318: iand           
        //   319: ifeq            27
        //   322: aload_1        
        //   323: iconst_1       
        //   324: putfield        eel.g:Z
        //   327: goto            0
        //   330: astore_3       
        //   331: getstatic       eel.a:Lnsd;
        //   334: invokevirtual   nry.b:()Lnsu;
        //   337: ldc             "Illegal state when dequeueing output buffer"
        //   339: sipush          1139
        //   342: aload_3        
        //   343: invokestatic    a.m:(Lnsu;Ljava/lang/String;CLjava/lang/Throwable;)V
        //   346: aload_1        
        //   347: iconst_1       
        //   348: putfield        eel.g:Z
        //   351: goto            0
        //   354: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  43     54     330    354    Ljava/lang/IllegalStateException;
        //  256    296    299    305    Any
        //  300    303    299    305    Any
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
}
