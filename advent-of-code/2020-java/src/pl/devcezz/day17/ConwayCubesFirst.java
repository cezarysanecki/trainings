package pl.devcezz.day17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ConwayCubesFirst {

    private static final char ACTIVE = '#';
    private static final char INACTIVE = '.';

    private static final int TIMES = 6;

    public static List<String> readData(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new IllegalArgumentException("Not found file: " + path);
        }
    }

    public static void main(String[] args) {
        List<String> data = readData("2020-java/data/day17/task.txt");

        char[][][] cubes = new char[data.size() + 2 * (TIMES + 1)][data.size() + 2 * (TIMES + 1)][1 + 2 * (TIMES + 1)];
        makeAllInactive(cubes);

        int middleZ = cubes[0][0].length / 2;
        for (int i = 0; i < data.size(); i++) {
            char[] fields = data.get(i).toCharArray();
            for (int j = 0; j < fields.length; j++) {
                cubes[cubes.length / 2 - fields.length / 2 + i][cubes.length / 2 - fields.length / 2 + j][middleZ] = fields[j];
            }
        }

        for (int times = 0; times < TIMES; times++) {
            char[][][] newCubes = new char[cubes.length][cubes[0].length][cubes[0][0].length];
            makeAllInactive(newCubes);
            for (int i = 1; i < cubes.length - 1; i++) {
                for (int j = 1; j < cubes[i].length - 1; j++) {
                    for (int k = 1; k < cubes[i][j].length - 1; k++) {
                        char currentCube = cubes[i][j][k];

                        if (currentCube == ACTIVE) {
                            int count = 0;
                            for (int l = -1; l <= 1; l++) {
                                for (int m = -1; m <= 1; m++) {
                                    for (int n = -1; n <= 1; n++) {
                                        if (l == m && l == n && l == 0) {
                                            continue;
                                        }

                                        if (cubes[i + l][j + m][k + n] == ACTIVE) {
                                            count++;
                                        }
                                    }
                                }
                            }
                            if (!(count == 2 || count == 3)) {
                                newCubes[i][j][k] = INACTIVE;
                            } else {
                                newCubes[i][j][k] = ACTIVE;
                            }
                        } else if (currentCube == INACTIVE) {
                            int count = 0;
                            for (int l = -1; l <= 1; l++) {
                                for (int m = -1; m <= 1; m++) {
                                    for (int n = -1; n <= 1; n++) {
                                        if (l == m && l == n && l == 0) {
                                            continue;
                                        }

                                        if (cubes[i + l][j + m][k + n] == ACTIVE) {
                                            count++;
                                        }
                                    }
                                }
                            }
                            if (count == 3) {
                                newCubes[i][j][k] = ACTIVE;
                            }
                        }
                    }
                }
            }
            cubes = newCubes;
        }

        int active = 0;
        for (int i = 1; i < cubes.length - 1; i++) {
            for (int j = 1; j < cubes[i].length - 1; j++) {
                for (int k = 1; k < cubes[i][j].length - 1; k++) {
                    if (cubes[i][j][k] == ACTIVE) {
                        active++;
                    }
                }
            }
        }

        System.out.println(active);
    }

    private static void makeAllInactive(char[][][] cubes) {
        for (int i = 0; i < cubes.length; i++) {
            for (int j = 0; j < cubes[i].length; j++) {
                for (int k = 0; k < cubes[i][j].length; k++) {
                    cubes[i][j][k] = INACTIVE;
                }
            }
        }
    }

    private static void print(char[][][] cubes) {
        for (int z = 0; z < cubes[0][0].length; z++) {
            System.out.println("z = " + z);

            for (int x = 0; x < cubes.length; x++) {
                for (int y = 0; y < cubes[x].length; y++) {
                    System.out.print(cubes[x][y][z]);
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}
