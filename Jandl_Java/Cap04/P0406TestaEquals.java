package com.company.Jandl_Java.Cap04;

public class P0406TestaEquals {

    public static void main(String [] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = b;

        System.out.println("a==b " + a.equals(b) + "\tb==a " + b.equals(a));
        System.out.println("c==b " + c.equals(b) + "\tb==c " + b.equals(c));
        System.out.println("a==c " + a.equals(c) + "\tc==a " + c.equals(a));

        String s = new String("Java");
        String t = "Jandl";
        String u = s;

        System.out.println("s==t " + s.equals(t) + "\tt==s " + t.equals(s));
        System.out.println("s==u " + s.equals(u) + "\tu==s " + u.equals(s));

    }
}
