package com.company;

public class Main {

    public static int thangHang(Point a, Point b, Point c){
        double d1 = Math.sqrt((a.getX()-b.getX()*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY())));
        double d2 = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX())+(a.getY()-c.getY())*(a.getY()-c.getY()));
        double d3 = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX())+(c.getY()-b.getY())-(c.getY()-b.getY()));
        if(d1+d2 == d3 || d1+d3==d2 || d2+d3==d1){
            return 1;
        }else{
            return 0;
        }
    }

    public static double khoangCanh(Point a, Point b){
        double d1 = Math.sqrt((a.getX()-b.getX()*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY())));
        return d1;
    }
    public static double chuVi(Point a, Point b,Point c) {
        if (thangHang(a, b, c) == 1) {
            System.out.printf("3 diem thang hang khong the tinh");
            return 0;
        }
            return khoangCanh(a, b) + khoangCanh(a, c) + khoangCanh(c, b);
    }
    public static double dienTich(Point a,Point b, Point c){
        if(thangHang(a,b,c) == 1){
            System.out.printf("3 diem thang hang khong the tinh");
            return 0;
        }
            double n = chuVi(a,b,c)/2;
            return Math.sqrt((n*(n-khoangCanh(a,b))*(n-khoangCanh(b,c))*(n-khoangCanh(c,b))));
    }
    public static void main(String[] args) {
	Point a = new Point(1,4);
    Point b = new Point(16,3);
    Point c = new Point(2,8);

    if(thangHang(a,b,c)==1){
        System.out.println("3 diem thang hang");
    }else{
        System.out.println("3 diem khong thang hang");
    }
        System.out.println("Khoang cach cua 2 diem la: " + Math.round(khoangCanh(a,b)*100.0)/100.0);
        System.out.println("Chu vi cua tam giac la: "+ Math.round(chuVi(a,b,c)*100.0)/100.0);
        System.out.println("Dien tich cua tam giac la: " + Math.round(dienTich(a,b,c)*100.0)/100.0);
    }
    }
