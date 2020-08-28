import java.lang.annotation.*;
import java.util.*;

/**
 * @author Micgogi
 * on 11/18/2019  2:17 AM
 * 65 78 75 73 84 65
 */

//interface StrFunc {
//    String disp(String s);
//}

//class Test65 implements Runnable {
//
//    @Override
//    public void run() {
//        try {
//            for (int i = 0; i < 2; i++) {
//                Thread.sleep(100);
//                System.out.print(" " + Thread.currentThread().getName());
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
//class A {
//        public int x;
//        protected int y;
//        void calc(int a, int b){
//            x = a+1;
//            y = b;
//        }
//}



class Test {
    int getValue(){
        int returnValue = 10;
        try{
            String[] Languages = {"Java","Ruby"};
            System.out.println(Languages[5]);
        }catch (Exception e){
            System.out.println("Catch Block"+returnValue);
            return returnValue;
        }finally {
            returnValue+=10;
            System.out.println("Finally"+returnValue);

        }
        return returnValue;
    }
    public static void main(String[] args) {
    Test test = new Test();
        System.out.println(test.getValue());
//        A a = new A();
//        a.calc(2,3);
//        System.out.println(a.x+" "+a.y);
//        ArrayList<Double> arrayList = new ArrayList<>();
//        arrayList.add(1.0);
//        arrayList.add(4.0);
//        arrayList.add(16.0);
//        Spliterator<Double> spliterator = arrayList.spliterator();
//        while (spliterator.tryAdvance((n)-> System.out.print(" "+n)));
//        System.out.println();
//        spliterator = arrayList.spliterator();
//        ArrayList<Double> sqrs = new ArrayList<>();
//        while (spliterator.tryAdvance((n)->sqrs.add(Math.sqrt(n))));
//        spliterator = sqrs.spliterator();
//        spliterator.forEachRemaining(System.out::println);
//        StrFunc strFunc = (str) -> {
//            String result = "";
//
//            for (int i = str.length() - 1; i >= 0; i--) {
//                result += str.charAt(i);
//
//            }
//            return result;
//        };
//        System.out.println(strFunc.disp(""));
//        Test65 test65 = new Test65();
//        Thread t1 = new Thread(test65,"JAVA");
//
//        Thread t2 = new Thread(test65,"PHP");
//        t1.start();
//        t1.join();
//        t2.start();

//        int  n ;
//        for (int i = 0; i <5 ; i++) {
//          n = getVal();
//          assert n>2;
//            System.out.println(" "+n);
//        }
//      int[] array = {6,9,8};
//      List<Integer> list = new ArrayList<>();
//      list.add(array[0]);
//      list.add(array[2]);
//      list.set(1,array[1]);
//      list.remove(0);
//        System.out.println(list);
//        String regex = ".@.";
//        compare("HackerEarth@jfjf.ocm",regex);
//        compare("a@N",regex);
//        compare("Java@Program",regex);


    }
//    public static void compare(String str, String reg){
//        if(str.matches(reg)){
//            System.out.println(str+"matches");
//        }else{
//            System.out.println(str+"doesnotmatch");
//        }
//    }


//    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
//    @interface MyAnnotation{}
//
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface Hints{
//        Hint[] value();
//    }
//    @Repeatable(Hints.class)
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface Hint
//    {
//        String value();
//    }
//    @Hint("hint1")
//    @Hint("hint2")
//
//    class Person{}
//    public static void main(String[] args){
//        Hint hint = Person.class.getAnnotation(Hint.class);
//        System.out.println(hint);
//        Hints hints1 = Person.class.getAnnotation(Hints.class);
//        System.out.println(hints1.value().length);
//        Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
//        System.out.println(hints2.length);
//
//    }
    // null 2 2



}

