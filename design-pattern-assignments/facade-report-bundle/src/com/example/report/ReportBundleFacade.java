package com.example.report;

import java.nio.file.Path;

public class ReportBundleFacade {
    static AuditLog log = new AuditLog();
    static JsonWriter writer = new JsonWriter();
    static Zipper zipper = new Zipper();
    

    public static Path export(java.util.Map<String,Object> data, java.nio.file.Path outDir, String baseName){
        Path json = writer.write(data, outDir, baseName);
        Path zip = zipper.zip(json, outDir.resolve(baseName));
        log.log("exported " + zip);
        return zip;
    }

}
