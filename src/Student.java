import java.time.Year;

public class Student extends Man {
    private int yearOfStudy=0;
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy=yearOfStudy;
    }
    public void increaseYearOfStudy (){
        if ( yearOfStudy == 0){
            yearOfStudy=1;
        }
        yearOfStudy++;
    }
}
