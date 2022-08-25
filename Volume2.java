class Volume2{
    int b, l, h;

public static void main(String[] args) {
    Volume2 vol1 = new Volume2();
    vol1.b = 5;
    vol1.l = 3;
    vol1.h = 2;
    int volume;
    volume = vol1.b*vol1.l*vol1.h;
    System.out.println(volume);
}
}
