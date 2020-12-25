public class Main {

    public static void main(String[] args) {
        System.out.println(Main.calculateMachineEpsilon());
    }

    private static float calculateMachineEpsilon() {

        float machEps = 1.0f;

        do
            machEps = machEps / 2.0f;
        while ((float) (1.0 + (machEps / 2.0)) != 1.0);

        return machEps;
    }
}
