package Model;

import Asset.Tools;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.tools.Tool;

public class Case {
    private Piece pieceSurLaCase;
    private int x;
    private int y;
    private boolean estBlanc;
    private ImageView skinCase;

    public Case(Piece pieceSurLaCase, int x, int y) {
        this.pieceSurLaCase = pieceSurLaCase;
        this.x = x;
        this.y = y;
        if (x % 2 == 0 && y % 2 == 0 || (x % 2 == 1 && y % 2 == 1)) {
            skinCase = new ImageView(Tools.CASEBLANCHE);
        } else {
            skinCase = new ImageView(Tools.CASENOIRE);
        }
        double scale = 0.15;
        skinCase.setScaleX(scale);
        skinCase.setScaleY(scale);
        skinCase.setX(x*Tools.TAILLEIMAGECASE*scale + 150);
        skinCase.setY(y*Tools.TAILLEIMAGECASE*scale - 150);
    }

    public Piece getPieceSurLaCase() {
        return pieceSurLaCase;
    }

    public void poserPieceSurLaCase(Piece pieceSurLaCase) {
        this.pieceSurLaCase = pieceSurLaCase;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEstBlanc() {
        return estBlanc;
    }

    public void setEstBlanc(boolean estBlanc) {
        this.estBlanc = estBlanc;
    }

    public ImageView getSkinCase() { return skinCase; }
}
