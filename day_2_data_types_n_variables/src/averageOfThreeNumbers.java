public class averageOfThreeNumbers {
    public static void main(String[] args) {
        String name1 = "Cole";
        double coletest1 = 78;
        double coletest2 = 87;
        double colefinaltest = 81;
        double coleaverage = (coletest1 + coletest2 + colefinaltest) / Double.valueOf(3);
        String coleavg2dp = String.format("%.2f", coleaverage);

        String name2 = "Rodney";
        double rodtest1 = 97;
        double rodtest2 = 57;
        double rodfinaltest = 78;
        double rodaverage = (rodtest1 + rodtest2 + rodfinaltest) / Double.valueOf(3);
        String rodavg2dp = String.format("%.2f", rodaverage);

        System.out.println("NAME  |  TEST 1  |  TEST 2  |  FINAL  |  AVERAGE");
        System.out.println(name1 + "        " + coletest1 + "        " + coletest2 + "      " + colefinaltest +
                "     " + coleavg2dp);
        System.out.println(name2 + "      " + rodtest1 + "        " + rodtest2 + "      " + rodfinaltest +
                "     " + rodavg2dp);
    }
}
