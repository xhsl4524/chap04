public class Circle {
//    클래스 Circle의 멤버 변수
//    선언
//    멤버 변수는 클래스 안에 선언 ( 메서드 안에 포함 되지 않음, 선언하지 않음)
//    사용
//    메서드 내에서 사용함(일반 변수 사용방법과 동일)
//    클래스의 멤버 변수 선언부에서 연산은 불가함 (선언만 가능)
//    해당 클래스의 밖에서 클래스를 통한 객체 생성 후 '객체명, 멤버변수명' 형태로 사용
   int radius;//멤버 변수
   String name;//멤버 변수

//    클래스 Circle의 멤버 메서드
   public  double getArea(){
       return 3.14 * radius * radius;
   }
}
