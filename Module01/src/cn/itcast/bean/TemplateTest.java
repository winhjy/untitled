package cn.itcast.bean;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2018/7/26 -17:16
 * IDEA中模板所处的位置 Setting - Editor -live Templates /postfix completion
 */
public class TemplateTest {
    //模板六 prsf,可生成private static final /psf
    private static final hellow first_1 = new hellow();
    public static final int Num_1 = 1;
    public static final int Num_2=2;
    public static final String ROLE = "3";
    public static final int Num_3 =3;
    
    //模板一 psvm
    public static void main(String[] args) {
        //模板二 sout / soutp /soutm / soutv
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        int num1 = 10;
        int num2=20;
        //模板三 fori
      String arr[] = new String[]{"Tom","Jerry","Pony Ma","Lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //模板四 list.for
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s : list) {
            System.out.println(s);
        }
        //变形list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形到序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //模板五ifn  变形inn
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        //list.nn.n
        if (list != null) {

        }

    }
    //生成的模板测试
    public void testUpdate_1(){
       //测试的方法
    }



}
