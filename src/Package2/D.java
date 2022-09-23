package Package2;

public class D {
    public String model;
    public String type;
    public String fuel;
//    클래스 내부에서만 사용, 클래스의 멤버끼리만 사용
    private String color;
    private String size;

    public void getMyCarInfo(){
        System.out.println("색상 : "+ this.color + "\n크기 : "+ this.size);
    }

    public void setCarInfo(String color, String size){
        this.color = color;
        this.size = size;
    }
}
