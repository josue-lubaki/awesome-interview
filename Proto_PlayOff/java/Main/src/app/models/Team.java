package app.models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère les équipes
 *
 * @author Josue Lubaki
 * @version 1.0
 */
public class Team {
    private final double score;
    private final String name;
    private final List<Player> players;

    public Team() {
        this.players = generatePlayers();
        this.score = getAverangeTeam();
        this.name = generateName();
    }

    public double getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Methode qui permet de générer le nom d'une équipe
     * @return String
     * */
    private String generateName() {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            name.append((char) (Math.random() * ('Z' - 'A' + 1) + 'A'));
        }
        return name.toString();
    }

    /**
     * Methode qui permet de générer les joueurs de l'équipe
     * @return List<Player>
     * */
    private List<Player> generatePlayers() {
        return new ArrayList<>() {
            {
                for (int i = 0; i < 8; i++) {
                    this.add(new Player());
                }
            }
        };
    }

    /**
     * Methode qui permet de calculer le score d'une équipe en se basant sur les moyennes de ses joueurs
     * @return double
     * */
    private double getAverangeTeam() {
        double score = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        for (Player player : players)
            score += player.getAverange();

        score = score / players.size();
        return Double.parseDouble(df.format(score).replace(",", ".").substring(0, 4));
    }
}
