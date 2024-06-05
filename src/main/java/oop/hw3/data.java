package oop.hw3;

public enum data {
     FOREST(1),
    FIELD(2),
     SWAMP(3),


    HUMANSTRENGTH(100),
    CARGAS(80),
    VEZDEHODGAS(200),
    BIKEGAS(150),
    HORSESTRENGTH(130),
    DISTANCE(50);

    private int num;

    public int getNum(){
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    data(int num){
        this.num = num;
    }

}
