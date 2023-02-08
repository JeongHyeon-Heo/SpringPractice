package hello.core.member;

public enum Grade {
    BASIC,
    VIP
}

// enum으로 선언한 이유 ? - > 기대하는 상수값이 할당되었는지에 대한
// 유효성 검사 로직이 없을 경우 문제 발생.
// enum은 로직이 없어도 상수 값이 정해져있어서 문제 발생시에 알 수가 있다.