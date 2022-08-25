class Volume4{
    int b, l, h;

    Volume4(int breadth, int length, int height){
        b = breadth;
        l = length;
        h = height;
    }
}

class Demo{
    public static void main(String[] args) {
        Volume4 vol = new Volume4(3, 2, 5);
        int volume;
        volume = vol.b*vol.l*vol.h;
        System.out.println(volume);    
    }
}
