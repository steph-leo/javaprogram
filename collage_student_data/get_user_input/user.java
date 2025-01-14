import java.util.Scanner;
class user{
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        String user_name;
        System.out.println("user name");
        user_name = name.nextLine();
        System.out.println(user_name);
    }
}