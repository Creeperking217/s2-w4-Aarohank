public class Competitor extends Player {
    
    public boolean cooperates(){
        return false;
    }

    public String toString() {
		return "Competitor: " + this.score();
	}
}
