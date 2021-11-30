package com.example.loginsignupapp;

enum Levels
{
    easy,medium,hard,expert
}

class Suduko {
    private Levels lv;
    private int time;
    private int AveregeTime;
    private int gamesstarted;
    private int GameWon;
    private int BestTime;

    @Override
    public String toString() {
        return "Suduko{" +
                "lv=" + lv +
                ", time=" + time +
                ", AveregeTime=" + AveregeTime +
                ", gamesstarted=" + gamesstarted +
                ", GameWon=" + GameWon +
                ", BestTime=" + BestTime +
                '}';
    }

    public Levels getLv() {
        return lv;
    }

    public void setLv(Levels lv) {
        this.lv = lv;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAveregeTime() {
        return AveregeTime;
    }

    public void setAveregeTime(int averegeTime) {
        AveregeTime = averegeTime;
    }

    public int getGamesstarted() {
        return gamesstarted;
    }

    public void setGamesstarted(int gamesstarted) {
        this.gamesstarted = gamesstarted;
    }

    public int getGameWon() {
        return GameWon;
    }

    public void setGameWon(int gameWon) {
        GameWon = gameWon;
    }

    public int getBestTime() {
        return BestTime;
    }

    public void setBestTime(int bestTime) {
        BestTime = bestTime;
    }

    Suduko(Levels lv, int time, int averegeTime, int gamesstarted, int gameWon, int bestTime)
    {
        this.lv = lv;
        this.time = time;
        AveregeTime = averegeTime;
        this.gamesstarted = gamesstarted;
        GameWon = gameWon;
        BestTime = bestTime;
    }
}
