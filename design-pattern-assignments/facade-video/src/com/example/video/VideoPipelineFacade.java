package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    static Decoder dec = new Decoder();
    static FilterEngine fe = new FilterEngine();
    static Encoder enc = new Encoder();
    public static Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength){
        Frame[] frames = dec.decode(Path.of("in.mp4"));
        if(gray) frames = fe.grayscale(frames);
        frames = fe.scale(frames, scale);
        return enc.encode(frames, out);
    }
}
