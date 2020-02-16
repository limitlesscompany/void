class ArgPrinter {

    public static void main(String args[]) {
        int result = 0;
        switch (args[0]) {
            case "+":
                result = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
                System.out.println(result);
                break;
            case "-":
                result = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
                System.out.println(result);
                break;
            case "*":
                result = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}