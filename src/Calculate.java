

public class Calculate {

    public static String Calculate_L( int typeMb, float v, int type, int num, float ps) {
        String result = "";
        int check = 0;

        float phiMbDv = 0;
        float sum = 0;
        float chiPhi = 0;
        float lai = 0;

        if (v < 0 || (0 <= v && v < 25) || (v > 35)
                || (typeMb != 1 && typeMb != 2)
        || (type < 1 || type > 2)
        || (num <= 0 || num > 1000)
        || (ps < 0 || ps > 0.5)){
            check = 0;
        } else {
            if (type == 1) {
                sum = (float) ((float) num * 0.2);
            } else if (type == 2) {
                sum = (float) ((float) num * 0.1);
            }
            if (typeMb == 1) {
                phiMbDv = (float) 3.5;
            } else if (typeMb == 0) {
                phiMbDv = 1;
            }

            chiPhi = v + phiMbDv + ps;
            lai = sum - chiPhi;

            if (0 < lai && lai <= 10) {
                check = 1;
            } else if (lai <= 0) {
                check = 2;
            } else if (lai > 10) {
                check = 3;
            }
        }

        if (check == 0) {
            result = "Input khong hop le!";
        } else if (check == 1) {
            result = "Chua dat muc tieu!";
        } else if (check == 2) {
            result = "Lo!";
        } else {
            result = "Dat muc tieu!";
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

