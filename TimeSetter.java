public class TimeSetter {
    /**
     * Calculates the year based on number of days
     * since January 1, 1980. January 1 is day 0.
     * @param d int days since January 1, 1980.
     * @return int year corresponding to d.
     */
    public static int daysToYear(int d) {
        int y = 1980;
        while (d > 365) {
            if (y % 400 == 0 ||
                    (y % 4 == 0 && y % 100 != 0)) {
                if (d > 366) {
                    d -= 366;
                    y += 1;
                }
            } else {
                d -= 365;
                y += 1;
            }
        }
        return y;
    }
}