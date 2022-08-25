class Volume6{
    int b, l, h;

    Volume6(){
        b = 3;
        l = 2;
        h = 5;
    }
}

class Demo{
    public static void main(String[] args) {
        Volume6 vol = new Volume6();
        int volume;
        volume = vol.b*vol.l*vol.h;
        System.out.println(volume);    
    }
}
