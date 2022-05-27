class multi{
int a=1,b=2,c=3,mul=b*c;
    void multiple()
    {
    System.out.println(mul);
    }
    }
class add{
    int a=1,b=2,c=3;
    void addition()
    {
    int add=b+c;
    System.out.println("Addition is "+add);
    }
}
class div extends multi {
    public static void main(String[] args){
    int divide=6/2;
    multi obj=new multi();
    add obj2=new add();

    obj.multiple();
    System.out.println("DIVISION IS="+divide);
    obj2.addition();

    }
}