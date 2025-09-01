public class Demo02 {
    public static void main(String[] args) {
        FrameUI ui = new FrameUIimpl();
        Decoder decoder = new DecoderImpl();
        Cache cache = new CacheImpl();
        new Player(ui, decoder, cache).play(new byte[]{1,2,3,4});
    }
}
