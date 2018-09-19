import java.util.Date;

public class Sad extends CurrentMood{
    public Date date;

    public Sad(){
        this.date = new Date();
    }

    public void Sad_date(int year, int month, int day){
        dateSetter(year, month, day);
    }
    public Date dateGetter(){
        return date;
    }
    public void dateSetter(int year, int month, int day){
        date.setDate(day);
        date.setMonth(month);
        date.setYear(year);
    }

    public String getMood() {
        String mood_sad = "Sad";
        return mood_sad;
    }

}
