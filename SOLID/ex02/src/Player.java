public class Player {

    FrameUI ui;
    Decoder decoder;
    Cache cache;

    public Player (FrameUI ui, Decoder decoder, Cache cache) {
        this.ui = ui;
        this.decoder = decoder;
        this.cache = cache;
    }

    
    void play(byte[] fileBytes){
        // decode
        Frame f = decoder.decode(fileBytes); // pretend decoding
        
        // draw UI
        ui.draw(fileBytes.length);
        // cache
        cache.cache(f);
    }
}