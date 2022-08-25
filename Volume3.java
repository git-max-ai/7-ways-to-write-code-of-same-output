class Volume3{
    int b, l, h;

    void setValues(int breadth, int length, int height){
        b = breadth;
        l = length;
        h = height;
    }

}

class Demo{
    public static void main(String[] args) {
        Volume3 vol = new Volume3();
        vol.b = 3;
        vol.l = 2;
        vol.h = 5;
        int volume;
        volume = vol.b*vol.l*vol.h;
        System.out.println(volume);    
    }
}