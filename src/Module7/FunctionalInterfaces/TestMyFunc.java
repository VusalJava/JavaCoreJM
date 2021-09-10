package Module7.FunctionalInterfaces;

interface MyFunc<T>{
    T  func(T v1,T v2);
}

public class TestMyFunc {
    public static void main(String[] args) {
        MyFunc<Integer> myFunc = new MyFunc<Integer>() {

            @Override
            public Integer func(Integer v1, Integer v2) {
                return v1+v2;
            }
        };

        testFunc(myFunc,10,20);
    }

    public static  <T> void testFunc(MyFunc<T> f, T v1, T v2) {
        System.out.println(f.func(v1, v2));
    }
}
