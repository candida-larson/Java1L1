package com.geek.java;

public class Methods {

    public static void main(String[] args) {
        System.out.println("checkSum = " + checkSum(111, 6));
        showSignOfNumber(-99);
        System.out.println("checkSignOfNumber = " + checkSignOfNumber(-99));
        showStringWithRepeats("Ops...", 7);

        /*
        * Correct leap years from internet:
        * 1600, 1604, 1608, 1612, 1616, 1620, 1624, 1628, 1632, 1636,
        * 1640, 1644, 1648, 1652, 1656, 1660, 1664, 1668, 1672, 1676,
        * 1680, 1684, 1688, 1692, 1696, 1704, 1708, 1712, 1716, 1720,
        * 1724, 1728, 1732, 1736, 1740, 1744, 1748, 1752, 1756, 1760,
        * 1764, 1768, 1772, 1776, 1780, 1784, 1788, 1792, 1796, 1804,
        * 1808, 1812, 1816, 1820, 1824, 1828, 1832, 1836, 1840, 1844,
        * 1848, 1852, 1856, 1860, 1864, 1868, 1872, 1876, 1880, 1884,
        * 1888, 1892, 1896, 1904, 1908, 1912, 1916, 1920, 1924, 1928,
        * 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968,
        * 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008,
        * 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048,
        * 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088,
        * 2092, 2096
        * */
        System.out.println("Leap years:");
        int counter = 1;
        for (int year = 1600; year <= 2096; year += 2){
            if( isLeapYear(year) ) {

                System.out.print(year + ", ");
                if( counter++ % 10 == 0 ){
                    System.out.println();
                }

            }

        }

    }

    private static boolean checkSum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void showSignOfNumber(int number){

        if( number >= 0 ){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }

    }

    private static boolean checkSignOfNumber(int number){
        if( number >= 0 ){
            return false;
        }else {
            return true;
        }
    }

    private static void showStringWithRepeats(String str, int repeats){
        for (int i = 1; i <= repeats; i++){
            System.out.println(">> " + str);
        }
    }

    private static boolean isLeapYear(int year){

        if( year % 4 == 0 ){

            if( year % 400 == 0 ){
                return true;
            }

            if( year % 100 == 0 ){
                return false;
            }

            return true;
        }

        return false;
    }


}
