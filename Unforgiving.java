public class Unforgiving extends Player {
    
    private boolean veng = true;
    public void remember (boolean opponentChoice){
        if (opponentChoice == false){
            this.veng = false;
        }  
    }

    public boolean cooperates(){
        return veng;
    }

    public String toString() {
		return "Unforgiving: " + this.score();
	}
}
