package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        return null;
    }

    public static String getRow(int numberOfStars) {
        String buildingBlock = "*"; //created a string for the *
        String makeRow = buildingBlock.repeat(numberOfStars); //created string that repeats my buildingBlock string by the  numberOfStars
        return makeRow;
    }

    public static String getSmallTriangle() {
        String buildingBlock = "*";
        Integer smallTriSize = 4;
        for (int i = 1; i <= smallTriSize; i++) {
            String smallTri = buildingBlock.repeat(i+1);
        } return null;
//        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
