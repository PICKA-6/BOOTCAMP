class grand_father{
    int age=84;
    void gfage(){
        System.out.println("AGE OF GRAND FATHER="+age);
    }
   }  
class father extends grand_father{
    int age=45;
    void fage(){
        System.out.println("AGE OF FATHER="+age);
    }

}
class son extends father{
    int age=18;
    public static void main(String[] args){
        father obj=new father();
        obj.fage();
        obj.gfage();
        System.out.println("AGE OF THE SON="+obj.age);

    }
}