public class Car3 {
    public String name;
    public String type;

    public Car3(){//생성자는 반환타입이 없음  생성자는 new키워드가 객체 생성시에만 실행 (예외 :생성자 끼리는 가능)
        name = "토레스";
        type = "SUV";
    }

    public void  run(){
        System.out.println(name + "가 달립니다");
    }

    public void stop(){
        System.out.println(name + "가 멈춥니다");
    }

    public void info(){
        System.out.println("차 이름은 " + name + "이고, 타입은 "+ type + "입니다");
    }
}

