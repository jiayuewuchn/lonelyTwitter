import java.util.Date;

public class Happy extends CurrentMood{
    public Date date;

    public Happy(){
        this.date = new Date();
    }

    public void Happy_date(int year, int month, int day){
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

    public String getMood(){
        String mood_happy = "Happy";
        return mood_happy;
    }

}
