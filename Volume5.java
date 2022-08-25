class Volume5{
    int b, l, h;

    void calculateVolume(){
        System.out.println(b*l*h);
    }

}

class Demo{
    public static void main(String[] args) {
        Volume5 vol = new Volume5();
        vol.b = 3;
        vol.l = 2;
        vol.h = 5;
        vol.calculateVolume();

    }
}
