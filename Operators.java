public class Operators {
    public static void main(String[] args) {
        int examScore = 80;
        int week = 7;
        if (examScore >= 70){

        System.out.println("Passed with A");
        }else if (examScore >= 60){
            System.out.println("Passed with B");
        }else{
            System.out.println("Failed");
        }

        switch (examScore){
            case 70:
            System.out.println("case 70");
            break;
            case 60:
            System.out.println("case 60");
            break;
            default:
            System.out.println("All go chop breakfast");
            break;
        }
        if (week == 7){

            System.out.println("Passed with first day of the week");
            
    
            switch (week){
                case 1:
                    System.out.println("onday");
                break;
                case 2:
                    System.out.println("Teusday");
                break;
                default:
                System.out.println("All go chop breakfast");
                break;
            }
    }
}
}
