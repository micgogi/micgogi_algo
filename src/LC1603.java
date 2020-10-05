import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/5/2020  2:43 PM
 * Rahul Gogyani
 */
public class LC1603 {

    int big, medium, small;

    public LC1603(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big != 0) {
            big--;
            return true;
        }
        if (carType == 2 && medium != 0) {
            medium--;
            return true;
        }
        if (carType == 3 && small != 0) {
            small--;
            return true;
        }
        return false;
    }


/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
}

