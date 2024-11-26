class Main1{
    public static void main(String[] args){
        try{
            int c=5/0;
            System.out.println("rest of the code is try block");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException => "+ e.getMessage());
        }
    }
}