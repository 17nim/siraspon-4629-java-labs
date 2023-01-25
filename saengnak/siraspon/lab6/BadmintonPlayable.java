package saengnak.siraspon.lab6;

public interface BadmintonPlayable {
    double racketLength = 0;
    int worldRanking = 0;

    void setRacketLength(double newRacketLength);

    double getRacketLength();

    void setWorldRanking(int newWorldRanking);

    int getWorldRanking();
}
