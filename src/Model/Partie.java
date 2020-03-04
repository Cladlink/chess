package Model;

public class Partie {
    private Case[][] plateau;

    public Partie() {
        plateau = new Case[8][8];
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                plateau[i][j] = new Case(null, i, j);
            }
        }
    }

    public Case getCase(int x, int y) {
        return plateau[x][y];
    }

    public Case[][] getPlateau() {
        return plateau;
    }

}
