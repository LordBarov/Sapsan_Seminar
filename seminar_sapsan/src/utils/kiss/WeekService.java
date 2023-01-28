package utils.kiss;

public class WeekService {

    public String returnWeekDay(int dayIndex) throws InvalidWeatherException {
        if (dayIndex == 1) {
            return "Monday";
        }
        else if (dayIndex == 2) {
            return "Tuesday";
        }
        else if(dayIndex == 3) {
            return "Wednesday";
        }
        else if (dayIndex == 4) {
            return "Thursday";
        }
        else if (dayIndex == 5) {
            return "Friday";
        }
        else if (dayIndex == 6) {
            return "Saturday";
        }
        else if (dayIndex == 7) {
            return "Sunday";
        }
        else {
            throw new InvalidWeatherException("day must be in range 1 to 7");
        }
    }
    public String returnWeekDaySecond(int dayIndex) throws InvalidWeatherException {
        if ((dayIndex < 1) || (dayIndex > 7)) throw new InvalidWeatherException("day must be in range 1 to 7");
        String[] days = {"Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        return days[dayIndex-1];
    }
}
