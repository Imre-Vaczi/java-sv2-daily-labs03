package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.openFreeCells();

        boolean[] cells = prison.getCells();

        for (int i = 0; i < 100; i++){
            if (cells[i]){
                System.out.println((i+1)+" számú cella nyitva a 100. nap után.");
            }
        }
    }
}
