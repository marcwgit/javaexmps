public class ConsoleReadingDemo {

    public static void main(String[] args) {

        // ==== 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter user name : ");
        String username = null;
        try {
            username = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        System.out.println("You entered : " + username);

        // ===== In Java 5, Java.util,Scanner is used for this purpose. 
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter user name : ");
        username = in.nextLine();       
        System.out.println("You entered : " + username);
 
  
        // ====== Java 6
        Console console = System.console();
        username = console.readLine("Please enter user name : ");   
        System.out.println("You entered : " + username);

    }
}
