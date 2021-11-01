package day04;

public class Prison {
    private boolean[] cells = new boolean[100];

    public void openFreeCells(){
        for (int i = 0; i < cells.length; i++){
            cells[i] = false;
        }
        for (int nap = 1; nap < 101; nap ++){
            for (int cell = nap; cell < 101; cell = (cell + nap)){
                cells[cell-1] = !cells[cell-1];
            }
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
