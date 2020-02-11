/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Vladica
 */
public class OffsidePosition {

    public boolean offsidePosition(Teams teams) {
        int redTeamMin = 101;
        int redTeamSecMin = 101;
        int redTeamMax = -1;
        int blueTeamMin = 101;
        int blueTeamSecMax = -1;
        int blueTeamMax = -1;

        for (int i = 0; i < 11; i++) {
            if (teams.getPosition(0, i) < redTeamSecMin) {
                redTeamSecMin = teams.getPosition(0, i);
                if (redTeamSecMin < redTeamMin) {
                    redTeamSecMin = redTeamMin;
                    redTeamMin = teams.getPosition(0, i);
                }
            }
            if (teams.getPosition(0, i) > redTeamMax) {
                redTeamMax = teams.getPosition(0, i);
            }

            if (teams.getPosition(1, i) > blueTeamSecMax) {
                blueTeamSecMax = teams.getPosition(1, i);
                if (blueTeamMax < blueTeamSecMax) {
                    blueTeamSecMax = blueTeamMax;
                    blueTeamMax = teams.getPosition(1, i);
                }
            }
            if (teams.getPosition(1, i) < blueTeamMin) {
                blueTeamMin = teams.getPosition(1, i);
            }
        }
        if (redTeamMax > blueTeamSecMax || redTeamSecMin > blueTeamMin) {
            System.out.println("Some players are in offside position!");
            return true;
        } else {
            System.out.println("No players are in offside position!");
            return false;
        }
    }
}
