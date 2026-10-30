package staticconcepts;


//second example detaily
//This is the demo for initialization for the static variables

class UseStatic {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    
    //Simple-ah sonna, Java-la static block use pannuradhu, static variables-ku value assign pannavum, class related initialization work pannavum dhaan.
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String args[]) {
        meth(42);
    }
}

//As soon as the UseStatic class is loaded, all of the static statements are run. First, a is set to 3,
//then the static block executes, which prints a message and then initializes b to a*4 or 12. Then main( ) is called,
//which calls meth( ), passing 42 to x. The three println( ) statements refer to the two static variables a and b,
//as well as to the local variable x.


//Here is the output of the program:
//Static block initialized. 
//x = 42
//a = 3
//b = 12

//Static block, main() execute ஆவதற்கு முன்னால் run ஆகிறது. அதனால்தான் Static block initialized. முதலில் print ஆகிறது.
//அதற்குப் பிறகு main() method, meth(42)-ஐ call செய்கிறது. அந்த method மூன்று values-ஐ print செய்கிறது.
//OUTPUT
//Static block initialized.
//x = 42
//a = 3
//b = 12
