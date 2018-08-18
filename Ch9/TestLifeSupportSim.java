import java.util.*;

class V2Radiator {
    V2Radiator(ArrayList<SimUnit> list) {
        for (int x=0; x<5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }

    V2Radiator() {};
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList<SimUnit> lglist) {
        // super(lglist);
        for (int g=0; g<10; g++) {
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList<SimUnit> rlist) {
        rlist.add(new SimUnit("Retention"));
    }
}

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
        System.out.println("Create V2Radiator");
        V2Radiator v2 = new V2Radiator(aList);

        System.out.println("Create V3Radiator");
        V3Radiator v3 = new V3Radiator(aList);

        System.out.println("Create RetentionBot");
        for (int z=0; z<20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }

        int power = 0;
        for (SimUnit s : aList) {
            power += s.powerUse();
        }
        System.out.println("PowerUsage: " + power);
    }
}

class SimUnit {
    String botType;
    SimUnit(String type) {
        botType = type;
        System.out.println("Create SimUnit for " + type);
    }
    int powerUse() {
        if ("Retention".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}
