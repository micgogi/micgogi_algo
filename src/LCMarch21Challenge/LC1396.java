package LCMarch21Challenge;

import java.util.HashMap;

/**
 * @author Micgogi
 * on 3/20/2021  1:44 PM
 * Rahul Gogyani
 */
public class LC1396 {
    public static void main(String args[]) {
        LC1396 undergroundSystem = new LC1396();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
        undergroundSystem.checkIn(10, "Leyton", 24);
        System.out.println( undergroundSystem.getAverageTime("Leyton", "Waterloo") );
                // return 11.00000
        undergroundSystem.checkOut(10, "Waterloo", 38);
        System.out.println( undergroundSystem.getAverageTime("Leyton", "Waterloo"));



    }
    class Ave{
        double s2e;
        double size;
        Ave(){

        }
        public Ave(double s2e,double size){
            this.s2e = s2e;
            this.size = size;
        }

    }
    class Sta{
        String station;
        int time;
        public Sta(String station,int time){
            this.station = station;
            this.time = time;
        }
    }
    HashMap<Integer,Sta> idMap;
    HashMap<String,Ave> aveTimeMap;
    public LC1396() {
        this.idMap = new HashMap<>();
        this.aveTimeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        idMap.put(id,new Sta(stationName,t));
    }

    public void checkOut(int id, String stationName, int t) {
        Sta sta = idMap.get(id);
        aveTimeMap.putIfAbsent(sta.station+"-"+stationName,new Ave());
        aveTimeMap.get(sta.station+"-"+stationName).s2e = (t-sta.time)+aveTimeMap.get(sta.station+"-"+stationName).s2e;
        aveTimeMap.get(sta.station+"-"+stationName).size++;
    }

    public double getAverageTime(String startStation, String endStation) {
        return aveTimeMap.get(startStation+"-"+endStation).s2e/aveTimeMap.get(startStation+"-"+endStation).size;
    }



}

