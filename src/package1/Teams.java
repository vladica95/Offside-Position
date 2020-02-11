/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.Scanner;

/**
 *
 * @author Vladica
 */
public class Teams {

    private int[][] teams;

    public int getPosition(int team, int position) {
        return teams[team][position];
    }

    public Teams() {
        teams = new int[2][11];
        Scanner entry;
        entry = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                System.out.println("Enter red team players positions. Positions must be between 0 and 100!");
            } else {
                System.out.println("Enter blue team players positions. Positions must be between 0 and 100!");
            }
            int j = 0;
            while (j < 11) {
                int number = entry.nextInt();
                if (0 <= number && number <= 100) {
                    teams[i][j] = number;
                    j++;
                } else {
                    System.out.println("Poitions must be between 0 and 100!");
                }
            }
        }
    }
}
