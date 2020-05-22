///demo1
	 public Person(int age, String name){

        if (name == null){
            throw new NullPointerException("null name!");
        }
        this.name = name;
        this.age = age;
    }



    public static void main(String[] args) {
        try{
            Person p1 = new Person(1,null);
        }
        catch(NullPointerException e) {
            System.out.println(e);  //toString
            e.printStackTrace();  //printStackTrace
            System.out.println(e.getMessage());//getMessage
        }
}


///demo2
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
            Person p1 = new Person(1,null);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("get 1");
        }
        catch(NullPointerException e) {
            System.out.println("get 2");
        }
        catch(Exception e){
            System.out.println("hihi");  ///put end
        }
}

///demo3

    public static void main(String[] args) {
        try {
            Person p1 = new Person(1, null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            try {
                throw e; //throw same exception
            } catch (NullPointerException ee) {
                Person p = new Person(2, "default");
            }


        }
    }


        public static void main(String[] args) {
        try {
            Person p1 = new Person(1, null);
        } catch (NullPointerException e) {
            try{
            throw new ArrayIndexOutOfBoundsException("another exception");}
            //throw a new diff exception
            catch(ArrayIndexOutOfBoundsException h){
                System.out.println(h.getMessage());
            }
        }
    }


    ///demo4
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
            Person p1 = new Person(1, null);
        } catch (NullPointerException e) {

            }
        finally {
            System.out.println("this code is executed"); //always executed
        }
        System.out.println("this code is executed");
        }


   //https://beginnersbook.com/2013/12/throws-keyword-example-in-java/



//demo5
        public class demo5 {
    void method1() throws ArithmeticException{
//        throw new NullPointerException("print me");
//        System.out.println(1/0);
        throw new ArithmeticException("Calculation error");
    }
    void method2() throws ArithmeticException{
        method1();
    }
    void method3(){
        try{
            method2();
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException handled");
        }
    }
    public static void main(String args[]){
        demo5 obj=new demo5();
        obj.method3();
        System.out.println("End Of Program");
    }
}



///write
public class WriteDog {
    public static void main(String[] args) {

        Dog d1 = new Dog(1,"bob");
        Dog d2 = new Dog(2, "sue");
        Dog[] dogs = {d1, d2};


        ObjectOutputStream outputStream = null;
        String filename = "dogs.dat";


        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(filename));
            outputStream.writeObject(dogs);


        } catch (FileNotFoundException e) {
            System.out.println("File dogs.dat was not found");
            System.out.println("or could not be opened.");
        } catch (IOException e) {
            System.out.println("Could not write to file: " + filename);
            System.exit(0);
        }
        finally {
            if (outputStream != null){
                try{
                    outputStream.close();
                }
                catch(IOException e){
                    System.out.println("Error closing!");
                    System.exit(0);
                }
            }
        }
    }
}




    ////read
public class ReadDog {

    public static void main(String[] args) {
        ObjectInputStream inputStream = null;
        String filename = "dogs.dat";

        Dog[] dogs = new Dog[3];
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            dogs =(Dog[]) inputStream.readObject();
        }

        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("Could not read to file: " + filename);
            System.exit(0);
        }

        System.out.println(Arrays.toString(dogs));

    }

}
















