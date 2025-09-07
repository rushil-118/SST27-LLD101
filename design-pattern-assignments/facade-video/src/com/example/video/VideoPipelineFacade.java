package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    static Decoder dec = new Decoder();
    static FilterEngine fe = new FilterEngine();
    static Encoder enc = new Encoder();
    public static Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength){
        Frame[] frames = dec.decode(Path.of("in.mp4"));
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, scale);

        // Path out1 = enc.encode(frames, Path.of("out.mp4"));
        // System.out.println("Wrote " + out);

        return enc.encode(frames, out);
    }
}
