package Study.L_Dx.Extends_Test;

class Father extends GrandFather{
    public void smoke() {
        System.out.println("爸爸爱抽烟");
    }
}

class GrandFather {
    public void drink() {
        System.out.println("爷爷爱喝酒");
    }
}

class Mother {
    public void dance() {
        System.out.println("妈妈爱跳舞");
    }
}

class Son extends Father {

}

public class Demo8 {
}
