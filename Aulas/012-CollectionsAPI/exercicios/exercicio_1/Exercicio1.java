package exercicios.exercicio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Double> nums = new ArrayList<>();
        Random rand = new Random();

        while(true) {
            int exitNum = rand.nextInt(5);
            if(exitNum == 0 && nums.size() > 3) {
                break;
            }
            double num = rand.nextDouble();
            nums.add(num+(double)exitNum);
        }

        System.out.println("ANTES---------");
        for(double num : nums) {
            System.out.println("Numero: "+num);
        }

        Collections.sort(nums, Collections.reverseOrder());

        System.out.println("DEPOIS---------");
        for(double num : nums) {
            System.out.println("Numero: "+num);
        }
    }
}
