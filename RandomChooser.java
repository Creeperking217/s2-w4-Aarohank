public class RandomChooser extends Player {
    public boolean cooperates(){
        return ((int)(Math.random()*2) == 1);
    }
    public String toString() {
		return "Random Chooser: " + this.score();
	}
}
