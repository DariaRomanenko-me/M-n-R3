package com.company.Flock;

public class R3V {
    public int x, y, z;
    public R3V(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static R3V sum(R3V a, R3V b){
        R3V c = new R3V(0, 0, 0);
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        c.z = a.z + b.z;
        return c;
    }

    public static R3V min(R3V a, R3V b){
        R3V c = new R3V(0, 0, 0);
        c.x = a.x - b.x;
        c.y = a.y - b.y;
        c.z = a.z - b.z;
        return c;
    }

    public static R3V mulNum(R3V a, int b){
        R3V c = new R3V(0, 0, 0);
        c.x = a.x * b;
        c.y = a.y * b;
        c.z = a.z * b;
        return c;
    }

    public static int scal(R3V a, R3V b){
        int c = 0;
        c += a.x * b.x;
        c += a.y * b.y;
        c += a.z * b.z;
        return c;
    }

    public static R3V mulVec(R3V a, R3V b){
        R3V c = new R3V(0, 0, 0);
        c.x = a.y * b.z - a.z * b.y;
        c.y = a.z * b.x - a.x * b.z;
        c.z = a.x * b.y - a.y * b.z;
        return c;
    }

    public static int mulMix(R3V a, R3V b, R3V c){
        return scal((mulVec(a, b)), c);
    }
}
