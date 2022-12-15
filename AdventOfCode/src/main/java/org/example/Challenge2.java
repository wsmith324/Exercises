package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge2 {
    public static List<Integer> ch2() {
        try {
            Scanner scanner = new Scanner(new File("real1.txt"));
            List<Integer> sums = new ArrayList<>();
            int sum = 0;
            while(scanner.hasNext()) {
                String current = scanner.nextLine();
                if (current.equals("")) {
                    if (sums.isEmpty()) {sums.add(sum);}
                    if (sums.get(0)<sum) {sums.add(sum);}
                    System.out.println("Sum: "+sum);
                    sum = 0;
                    Collections.sort(sums);
                } else {
                    sum += Integer.parseInt(current);
                }
            }
            return sums;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
