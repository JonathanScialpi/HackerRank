// https://www.hackerrank.com/challenges/calculating-volume
//Write your code here
class Calculate{
   Scanner in = new Scanner(System.in);
    Output output = new Output();
    public Calculate(){
       in = new Scanner(System.in);
   }
    public static Calculate do_calc(){
       return new Calculate();
   }
    public int get_int_val()throws IOException{
        int returnVal = in.nextInt();
        if(returnVal<=0) throw new java.lang.NumberFormatException("All the values must be positive");
        return returnVal;
    }
    public double get_double_val()throws IOException{
        double returnVal = in.nextDouble();
        if(returnVal<=0) throw new java.lang.NumberFormatException("All the values must be positive");
        return returnVal;
    }
    public double get_volume(int a){
        double volume = (double)(Math.pow(a,3));
        return volume;
    }
    public double get_volume(int l,int b,int h){
        double volume = l*b*h;
        return volume;
    }
    public double get_volume(double r){
        double res1 = (double)(Math.PI *2/3);
        double res2 = (double)(Math.pow(r,3));
        double volume = (double)((res1)*(res2));
        return volume;
    }
    public double get_volume(double r, double h){
        double volume = (double)(Math.PI*r*r*h);
        return volume;
    }
}
class Output{
    public void display(double volume){
        System.out.println(String.format("%.3f",volume));
    }
}
