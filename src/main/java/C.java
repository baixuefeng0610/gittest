public class C {
    public void test(){
        System.out.println("新增C");
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("继续开发新功能");

        return super.equals(obj);
    }
}
