package com.company;

public class Polygon {
    private int n;
    private Point[] points = new Point[n+n];

    public Polygon(int n) {
        this.n = n;
    }

    public Polygon(Point[] points) {
        this.points = points;
    }
}
