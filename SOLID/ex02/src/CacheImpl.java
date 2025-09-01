public class CacheImpl implements Cache{
    private Frame last;
    @Override
    public void cache(Frame f) {
        this.last = f;
        System.out.println("Cached last frame? " + (last!=null));
    }
    
}
