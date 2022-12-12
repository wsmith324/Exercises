package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Challenge1 {

    public int ch1() {
        try {
            Scanner scanner = new Scanner(new File("real1.txt"));
            List<Integer> sums = new ArrayList<>();
            int sum = 0;
            while(scanner.hasNext()) {
                String current = scanner.nextLine();
                if (current.equals("")) {
                    sums.add(sum);
                    System.out.println("Sum: "+sum);
                    sum = 0;
                } else {
                    sum += Integer.parseInt(current);
                }
            }
            return Collections.max(sums);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
