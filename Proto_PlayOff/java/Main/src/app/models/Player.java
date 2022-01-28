package app.models;

import java.text.DecimalFormat;

/**
 * Classe qui gère les joueurs
 *
 * @author Josue Lubaki
 * @version 1.0
 */
public class Player {
    private final double averange;

    public Player() {
        this.averange = generateAverange();
    }

    public double getAverange() {
        return this.averange;
    }

    /**
     * Methode qui permet de générer une moyenne entre 0.15 et 1
     * @return double
     * */
    private double generateAverange() {
        DecimalFormat df = new DecimalFormat("0.00");
        String valueString = df.format(Math.random() * (1 - 0.15) + 0.15).replace(",", ".");
        return Double.parseDouble(valueString);
    }
}
