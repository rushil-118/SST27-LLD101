public class DecoderImpl implements Decoder {

    @Override
    public Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
    
}
