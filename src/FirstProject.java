public class FirstProject {
    public static void main(String[] args)
    {
        FetchName fn = new FetchName();
        fn.setName("Kashish");
        String name ;
        name = fn.getName();
        System.out.println("Hello "+name);
    }
}
