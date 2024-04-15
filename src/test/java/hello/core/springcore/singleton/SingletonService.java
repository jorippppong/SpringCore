package hello.core.springcore.singleton;

public class SingletonService {

    // 1. static 영역에 딱 하나 생성한다.
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 static method를 사용해서 조회만 가능하게 한다.
    public static SingletonService getInstance(){
        return instance;
    }

    // 3. 생성자를 private으로 생성해서, 외부애서 new로 객체 생성을 못하게 막는다.
    private SingletonService(){}

}
