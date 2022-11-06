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
