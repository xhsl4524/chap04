package Package2;

import Package1.A;

// class A는 접근제한자를 default를 사용하고 있어 다른 패키지에서 사용할 수 없음
//import Package1.A;
//import Package1.B;
//// class B는 접근 제한자를 public으로 사용하고 있어 다른 패키지에서 사용할 수 있음
//public class C {
////    A a;
//    B b;
//}
//import Package1.A;
//
//public class C {
////    클래스 A의 public을 사용한 생성자로 객체 생성
////    public을 사용하여 다른패키지에서 사용 가능
//    A a1 = new A(true);
////    클래스 A의 default를 사용한 생성자로 객체 생성
////    default는 동일한 패키지 내에서만 사용이 가능, 다른 패키지에서는 사용 불가
//    A a2 = new A(1);
//    A a3 = new A("문자열");
//}
public class C {
    private C(){
        A a = new A();
        a.value1 = 1000;
//        클래스 A의 value2는 dafault를 사용하여 다른 패키지에서 접근 불가
//        a.value2 = 1000;
//        클래스 A의 value3은 private을 사용하여 클래스 외부에서 접근 불가
//        a.value3 = 1000;

        a.method1();
//        클래스 A의 method2()는 default를 사용하여 다른 패키지에서 접근 불가
//        a.method2();
//        클래스 A의 method3은 private을 사용하여 클래스 외부에서 접근 불가
//        a.method3();
    }


}