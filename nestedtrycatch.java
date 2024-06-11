class A{
    public static void main(String args[]){
        try{
            try{
                System.out.println("inside block1");
                int b=45/0;
                System.out.println(b);
            }
            catch(ArithmeticException e1){
                System.out.println("Exception e1");
            }
            try{
                System.out.println("inside block2");
                int b=45/0;
                System.out.println(b);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("Exception e2");
            }
            System.out.println("just another statement");
        }
        catch(ArithmeticException e3){
                System.out.println("inside parent trycatch block");
            }
            catch(ArrayIndexOutOfBoundsException e4){
                System.out.println("inside parent trycatch block");
            }
            catch(Exception e5){
                System.out.println("Inside parent try catch block");
            }
            System.out.println("next statemnet");
    }
}