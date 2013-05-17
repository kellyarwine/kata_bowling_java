package com.kata.bowling;

public class Scorer {

    public void addThrow(int pins) {
        itsThrows[itsCurrentThrow++] = pins;
    }

    public int scoreForFrame(int theFrame) {
        ball = 0;
        int score = 0;
        for ( int currentFrame = 0;
              currentFrame < theFrame;
              currentFrame++)

        {
            if ( strike() )
            {
                score += 10 + nextTwoBalls();
                ball++;
            }
            else if ( spare() ) {
                score += 10 + nextBall();
                ball +=2;
            }
            else {
                score += twoBallsInFrame();
                ball += 2;
            }
        }
        return score;
    }

    public boolean strike() {
        return itsThrows[ball] == 10;
    }

    private boolean spare() {
        return itsThrows[ball] + itsThrows[ball+1] == 10;
    }

    private int nextTwoBalls() {
        return itsThrows[ball+1] + itsThrows[ball+2];
    }

    private int nextBall() {
        return itsThrows[ball+2];
    }

    private int twoBallsInFrame() {
        return (itsThrows[ball] + itsThrows[ball+1]);
    }

    private int ball;
    private int [] itsThrows = new int[21];
    private int itsCurrentThrow = 0;

}
