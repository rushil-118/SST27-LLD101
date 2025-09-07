package com.example.imports;

import java.nio.file.Path;

public class CsvProfileImporter implements ProfileImporter {
    NaiveCsvReader naiveCsvReader;
    ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader naiveCsvReader, ProfileService profileService){
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;
    }


    @Override
    public int importFrom(Path csvFile) {
        int count = 0;
        for(String[] row : naiveCsvReader.read(csvFile)){
            profileService.createProfile(row[0], row[1], row[2]);
            count++;
        }
        return count;
    }
}
