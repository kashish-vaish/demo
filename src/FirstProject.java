public class FirstProject {
    public static void main(String[] args)
    {
        FetchName fn = new FetchName();
        fn.setName("Kashish");
        fn.setLastName("Vaish");
        String name ;
        String lastName ;

        name = fn.getName();
        lastName = fn.getLastName();
        System.out.println("Hello "+name+" "+lastName+" !");
    }
}
