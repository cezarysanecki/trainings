package pl.devcezz.day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LobbyLayoutFirst {

    private static final Map<String, Boolean> TILES = new HashMap<>();

    public static List<String> readData(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new IllegalArgumentException("Not found file: " + path);
        }
    }

    public static void main(String[] args) {
        List<String> data = readData("2020-java/data/day25/test.txt");

        long cardPublicKey = Long.parseLong(data.get(0));
        long doorPublicKey = Long.parseLong(data.get(1));

        int loopSizeDoor = calculateLoopSize(doorPublicKey);

        long initialValue = 1L;
        long divider = 20201227L;
        long subjectValue = cardPublicKey;
        for (int i = 0; i < loopSizeDoor; i++) {
            initialValue = initialValue * subjectValue;
            initialValue = initialValue % divider;
        }
        
        System.out.println(initialValue);
    }

    public static int calculateLoopSize(long value) {
        long initialValue = 1L;
        long divider = 20201227L;
        int subjectValue = 7;
        int loopSize = 0;

        while (initialValue != value) {
            initialValue = initialValue * subjectValue;
            initialValue = initialValue % divider;
            loopSize++;
        }

        return loopSize;
    }
}