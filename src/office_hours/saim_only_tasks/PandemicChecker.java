package office_hours.saim_only_tasks;

public class PandemicChecker {
    public static void main(String[] args) {
        /*[Pandemic Checker]
        Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one.
        Data to use:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19
        Less than 0 and more then 2021: Invalid year Any year not in those ranges: No Pandemic
        */
        int year = 2019;
        String print ="";
        if(year <= 0 && year > 2021) {
            print = "Invalid year";
        }else if (year>=1346 && year <= 1353){
            print = "The Black Death";
        }else if (year>=1665 && year <= 1666){
            print = "Great Plague of London";
        }else if (year>=1770 && year <= 1772){
            print = "Russian plague";
        }else if (year>=1889 && year <= 1890){
            print = "Flu pandemic";
        }else if (year>=1916 && year <= 1916){
            print = "American polio epidemic";
        }else if (year>=1918 && year <= 1920){
            print = "Spanish Flu";
        }else if (year>= 2009 && year <= 2010){
            print = "H1N1 Swine Flu pandemic";
        }else if (year>= 2014 && year <= 2016){
            print = "West African Ebola epidemic";
        }else if (year>= 2019 && year <= 2021){
            print = "COVID-19";
        }else{
            print= "No Pandemic";
        }
        System.out.println(print);

    }
}
