import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

// 
// Decompiled by Procyon v0.6.0
// 

final class bab
{
    final Lock a;
    int b;
    
    public bab() {
        this.a = new ReentrantLock();
    }
}
