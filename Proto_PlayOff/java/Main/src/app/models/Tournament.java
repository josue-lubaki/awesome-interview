package app.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère le tournoi
 *
 * @author Josue Lubaki
 * @version 1.0
 */
public class Tournament {
    private final List<Team> teams;

    public Tournament() {
        this.teams = generateTeams();
    }

    public List<Team> getTeams() {
        return this.teams;
    }


    /**
     * Methode qui permet de générer une 8 équipes participantes du tournoi
     * @return List<Team>
     * */
    private List<Team> generateTeams() {
        return new ArrayList<>() {
            {
                for (int i = 0; i < 8; i++) {
                    this.add(new Team());
                }
            }
        };
    }


    /**
     * Methode qui retourne l'équipe gagnante
     * @return Team
     */
    public Team getWinner() {
        return getWinnerHelper(teams).get(0);
    }


    /**
     * Methode qui permet de trouver les vainqueurs du tournoi
     *
     * @param teams la liste des équipes participant au tournoi
     * @return List<Team>
     */
    private List<Team> getWinnerHelper(List<Team> teams) {

        if (teams.size() == 1)
            return teams;

        return new ArrayList<>(){
            {
                // Prendre les équipes deux à deux
                for (int i = 0; i < teams.size() / 2; i++) {
                    Team team1 = teams.get(i);
                    Team team2 = teams.get(teams.size() - i - 1);

                    // vérifier les scores
                    if (team1.getScore() > team2.getScore()) {
                        this.add(team1);
                    } else {
                        this.add(team2);
                    }
                }

                getWinnerHelper(this);
            }
        };
    }
}