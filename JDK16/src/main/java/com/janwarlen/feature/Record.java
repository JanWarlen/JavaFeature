package com.janwarlen.feature;

import java.util.Objects;

public class Record {

    public static void func() {
        Point point = new Point(1, 2);
        System.out.println(point.x());
        System.out.println(point.y());
        System.out.println(point);
        RecordPoint recordPoint = new RecordPoint(1, 2);
        System.out.println(recordPoint.x());
        System.out.println(recordPoint.y());
        System.out.println(recordPoint);

        System.out.println(point.equals(recordPoint));
        System.out.println(recordPoint.equals(point));

        System.out.println("recordPoint super class:"+recordPoint.getClass().getSuperclass().getName());
    }

    static class Point {
        private final int x;
        private final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x() { return x; }
        int y() { return y; }

        public boolean equals(Object o) {
            if (!(o instanceof Point)) return false;
            Point other = (Point) o;
            return other.x == x && other.y == y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public String toString() {
            return String.format("Point[x=%d, y=%d]", x, y);
        }
    }

    public record RecordPoint(int x, int y) {
//        Instance field is not allowed in record
//        private final int z;
    }
}
