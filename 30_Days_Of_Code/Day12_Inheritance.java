// https://www.hackerrank.com/challenges/30-inheritance
class Student extends Person{
	private int[] testScores;
    
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }
    
    char calculate(){
        int sum = 0;
        for(int i=0;i<testScores.length;i++){
            sum+=testScores[i];
        }
       int avg = sum/testScores.length;
        char grade = 'O';
        if(avg>=90 && avg<=100){
            grade = 'O';
        }else if(avg>=80 && avg < 90){
            grade = 'E';
        }else if(avg>=70 && avg < 98){
            grade = 'A';
        }else if(avg>=55 && avg < 70){
            grade = 'P';
        }else if(avg>=40 && avg < 55){
            grade = 'D';
        }else if(avg<40){
            grade = 'T';
        }
        return grade;
    }
}
