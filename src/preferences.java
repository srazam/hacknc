package src;

public class preferences {

    private int foodList[];
    private int eventsList[];
    public preferences(){

    }

    public void addFood(int foodList[]){
        this.foodList = foodList;
    }

    public void addEvents(int eventsList[]){
        this.eventsList = eventsList;
    }

    public void makeFile(){

    }

    public void downloadFile(){

    }

    public void printPref(){
        System.out.println();
        System.out.println("Food Preferences:");
        for (int food  : foodList) {
            switch (food){
                case 1:
                    System.out.println("Italian");
                    break;
                case 2:
                    System.out.println("Mediterranean");
                    break;
                case 3:
                    System.out.println("Japanese");
                    break;
                case 4:
                    System.out.println("Indian");
                    break;
                case 5:
                    System.out.println("American");
                    break;
                case 6:
                    System.out.println("Mexican");
                    break;
                case 7:
                    System.out.println("Cafe");
                    break;
                case 8:
                    System.out.println("Other");
                    break;
            }
        }
        System.out.println();
        System.out.println("Events Preferences:");
        for(int event : eventsList){
            switch (event){
                case 1:
                    System.out.println("Ice Skating");
                    break;
                case 2:
                    System.out.println("Hiking");
                    break;
                case 3:
                    System.out.println("Shopping");
                    break;
                case 4:
                    System.out.println("Movie");
                    break;
                case 5:
                    System.out.println("At Home Hangout");
                    break;
                case 6:
                    System.out.println("Bowling");
                    break;
                case 7:
                    System.out.println("Arcane");
                    break;
                case 8:
                    System.out.println("Amusement Park");
                    break;
                case 9:
                    System.out.println("Park");
                    break;
                case 10:
                    System.out.println("other");
                    break;
            }
        }
    }

    public int[] convertInput(String input[]){
        int converted[] = new int[input.length];
        int counter = 0;
        for (String number: input) {
            converted[counter] = Integer.parseInt(number);
            counter++;
        }
        return converted;
    }
}
