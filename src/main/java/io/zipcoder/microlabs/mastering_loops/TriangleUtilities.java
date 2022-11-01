package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        while (idx < numberOfRows) {
            String thisRow = getRow(idx);
            sb.append(thisRow).append("\n");
            idx++;
        }
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        //StringBuilder sb = new StringBuilder();
        //for (int i = 0; i < numberOfStars; i++) {
        //   sb.append("*");
        //}
        //return sb.append();
        String buildingBlock = "*"; //created a string for the *
        String makeRow = buildingBlock.repeat(numberOfStars); //created string that repeats my buildingBlock string by the  numberOfStars
        return makeRow;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
