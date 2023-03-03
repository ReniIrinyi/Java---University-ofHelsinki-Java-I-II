
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints=new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        examPoints.add(points);
        System.out.println("The average of points: "+this.averageOfGrades());
        System.out.println("The average of grades: "+this.averageOfPoints());
        
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades(){
       return avg(this.grades);
    }
    
    public double averageOfPoints(){
     return avg(this.examPoints);
    }
    
    public double avg(ArrayList<Integer> list){
        double avg=0;
        if(list.isEmpty()){
        return -1;
        } else {
        for(Integer grade: list){
               avg+=grade;
        }
    
        return avg/grades.size();
    }
    }
}
