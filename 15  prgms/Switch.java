public class Switch {
    public static void main(String[] args){
        int number=42;
        String size;
        switch(number){
            case 29:
              size="Small";
              break;
            case 42:
              size="Medium";
              break;
            case 44:
              size="Large";
              break;
            case 48:
              size="Extra Large";
              break;
            default:
              size="unknown";
              break;
        }
        System.out.println("size: "+size);
    }
    
}