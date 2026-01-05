class Complex{
    int real , imag;
    Complex(){
        real = 0;
        imag = 0;
    }

    Complex(int r , int i){
        real = r;
        imag = i;
    }

    Complex(Complex c){
        real = c.real;
        imag = c.imag;
    }

    void add (Complex c1 , Complex c2){
        real = c1.real + c2.real;
        imag = c1.imag + c2.imag;
    }

    void display(){
        System.out.println(real + "i" + imag);
    }

    public static void main (String []args){
 
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(5,6);
        Complex c3 = new Complex();
        c3.add(c1 , c2);
        Complex c4 = new Complex(c3);

        System.out.println("first complex number");
        c1.display();
        System.out.println("second complex number");
        c2.display();
        System.out.println(" addition complex of number");
        c3.display();
        System.out.println("  copy complex number");
        c4.display();

        


}
}