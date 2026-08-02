public class Calculator{
    int a ;
    int b;
    double p;
    double q;
    Calculator(){
        a = 0; 
        b = 0;
    }
    Calculator(int p,int q){
        a = p;
        b = q;
    }
    Calculator(double p , double q){
        this.p = p;
        this.q = q;
    }
    
    void add(int i , int j){
        int sum = i+j;
        System.out.println("Add integer:" +sum);

    }
    void add(double i, double j){
        double sum = i+j;
        System.out.println("Add double:" +sum);

    }
 
}


public class Calculatortest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(3, 4);
        c1.add(3.3, 4.4);
    }
}


make this code better these are two different files of java code dont change the code if there are any errors just fix that and make the output look a little good
