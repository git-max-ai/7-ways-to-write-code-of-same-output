class Volume7{
    int b, l, h;

    void setValues(int breadth, int length, int height){
        b = breadth;
        l = length;
        h = height;
    }

    void calculateVolume(){
        System.out.println(b*l*h);
    }

}

class Demo{
    public static void main(String[] args) {
        Volume7 vol = new Volume7();
        vol.setValues(3, 2, 5);
        vol.calculateVolume();
    }

}