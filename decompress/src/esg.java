import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esg extends Thread
{
    public final ArrayBlockingQueue a;
    public boolean b;
    private euc c;
    private Boolean d;
    
    public esg() {
        this.a = new ArrayBlockingQueue(50);
        this.b = false;
        this.c = null;
        this.d = false;
    }
    
    public final void a(final euc c) {
        synchronized (this) {
            if (!this.isInterrupted() && this.isAlive()) {
                this.c = c;
                this.d = true;
                super.interrupt();
                return;
            }
            throw new RuntimeException("IncrementalAligner is already shut down.");
        }
    }
    
    @Override
    public final void interrupt() {
        this.a.add("Poison Pill");
    }
    
    @Override
    public final void run() {
    Label_0177_Outer:
        while (!this.isInterrupted()) {
            final ArrayList<String> list = new ArrayList<String>();
            final boolean b = true;
            try {
                final String s = this.a.take();
                this.b = true;
                list.add(s);
                while (!this.a.isEmpty()) {
                    list.add(this.a.take());
                }
            }
            catch (final InterruptedException ex) {
                this.interrupt();
            }
            final int size = list.size();
            int i = 0;
            while (true) {
                while (i < size) {
                    final String s2 = list.get(i);
                    int n;
                    if ("Poison Pill".equals(s2)) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        if (!this.d) {
                            final String value = String.valueOf(s2);
                            if (value.length() != 0) {
                                "Processing file ".concat(value);
                            }
                            else {
                                new String("Processing file ");
                            }
                            ++i;
                            esh.g();
                            continue Label_0177_Outer;
                        }
                        n = (b ? 1 : 0);
                    }
                    this.b = false;
                    if (n != 0) {
                        break Label_0177_Outer;
                    }
                    continue Label_0177_Outer;
                }
                int n = 0;
                continue;
            }
        }
        final euc c = this.c;
        if (c != null) {
            c.a(null);
        }
    }
}
