package Part5;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
            this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
    	day+=7;
    	if(day > 30) {
    		month++;
    		day = day - 30;
    		if(month > 12) {
    			year++;
    			month = 1;
    		}
    	}
    }
    public void advance(int howManyDays) {
    	day = day + howManyDays;
    	if(day > 30) {
    		month++;
    		day = day - 30;
    		if(month > 12) {
    			year++;
    			month = 1;
    		}
    	}
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        newDate.advance(days);
        
        return newDate;
    }
}