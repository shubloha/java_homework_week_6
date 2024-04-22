package java_homework_week_6;

    public class Programme12 {
        // Declare one instance method
        public void i1 (){
            double a = 25.5;
            double b = 3.5;
            double c = 40.5;
            double d = 4.5 ;

            double result =   ((a * b - b* b) / (c -d));

            System.out.println("Output : "+result);


        }
        // Declare one main method
    public static void main (String[]args){

      Programme12 obj1 = new Programme12();
      obj1.i1();
    }
}
