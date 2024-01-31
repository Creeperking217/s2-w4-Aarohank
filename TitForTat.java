public class TitForTat extends Player{
    private boolean choice = true;
    
    public boolean cooperates(){
        return choice;
    }

    public void remember(boolean opponentChoice){
        choice = opponentChoice;
    }

    public String toString() {
		return "Tit for tat: " + this.score();
	}
}