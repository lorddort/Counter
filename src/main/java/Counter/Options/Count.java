package main.java.Counter.Options;

public class Count {
    int wins;
    int loses;

    public Count(int wins, int loses) {
	this.wins = wins;
	this.loses = loses;
    }

    public int counting(boolean winLoses) {
	if (winLoses) {
	    wins++;
	    return wins;
	} else {
	    loses++;
	    return loses;
	}
    }

}
