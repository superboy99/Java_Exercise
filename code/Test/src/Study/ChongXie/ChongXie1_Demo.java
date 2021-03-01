package Study.ChongXie;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/10 3:08 下午
 */
class Phone{
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }
}

class NewPhone extends Phone{
    @Override
    public void call(String name){
        System.out.println("使用视频通话功能");
        super.call("superboy");
    }
}


public class ChongXie1_Demo {
    public static void main(String[] args) {
        Phone P = new Phone();
        P.call("wcg");
        System.out.println("---------------");
        NewPhone NP = new NewPhone();
        NP.call("superboy");
    }
}
