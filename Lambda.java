// to find product of the range.
@FunctionalInterface
interface Production{
    long ProductionRange(long num1, long num2);
}
public class Lambda {
    public static void main(String[] args) {
    
        Production object1= (num1,num2)->{
            long res=1;
            if(num1==num2)
                return num1;
            else{
                
                while(num1<=num2){
                    res*=num1;
                    num1++;
                }
                return res;
            }
        };
        System.out.println("Product of range{0 to 1}: "+object1.ProductionRange(0,1));
        System.out.println("Product of range{2 to 2}: "+object1.ProductionRange(2,2));
        System.out.println("Product of range{1 to 4}: "+object1.ProductionRange(1,4));
        System.out.println("Product of range{5 to 15}: "+object1.ProductionRange(5,15));
        
    }
    
}
