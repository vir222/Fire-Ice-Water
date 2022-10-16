public class FIW {

public static int Magnitude(double m) {
    double x = Math.random() * 10;
    int value = (int)x;
    return value;
}
public static void main(String[] args) {

    String x = "Fire";
    String y = "Ice";
    String z = "Water";
    String e = "Error";
    String bot = "bot";
    String choice1;
    String choice2;

    StdOut.println("How to play: Choose an element from Fire, Ice, or Water. Fire deals double magnitude to Ice, Water deals double magnitude to Fire, and Ice deals double damage to Water. The player with higher magnitude wins. Type 'bot' for player 2 if playing singleplayer.");
StdOut.println("Options: | Fire | Ice | Water |");
    StdOut.println("Choose an element Player 1:");

    choice1 = StdIn.readString();

    if (!choice1.equals(x) && !choice1.equals(y) && !choice1.equals(z)) {
        choice1 = "Error";
    }

        StdOut.println("Choose an element Player 2:");
            choice2 = StdIn.readString();

    double p1 = Math.random() * 10;
    double p2 = Math.random() * 10;
    int p1mag = (int)p1;
    int p2mag = (int)p2;
        if (!choice2.equals(x) && !choice2.equals(y) && !choice2.equals(z) && !(choice2.equals(bot))) {
            choice2 = "Error";
        }

        int b;

        if (choice2.equals(bot)) {
            double bo = Math.random() * 3;
            b = (int)bo;
            if (b == 0) {
                choice2 = x;
            } else {
                if (b == 1) {
                    choice2 = y;
                } else {
                    choice2 = z;
                }
            }
        }


        


        StdOut.println("Player 1 chose " + choice1 + " Player 2 chose " + choice2);
        StdOut.println("Player 1 Magnitude: " + p1mag);
        StdOut.println("Player 2 Magnitude: " + p2mag);


    
        if (((choice1.equals(x)) && (choice2.equals(y)))) {
            p1mag = p1mag * 2;
            }

        if (((choice1.equals(y)) && (choice2.equals(x)))) {
            p2mag = p2mag * 2;
            }
        if (((choice1.equals(y)) && (choice2.equals(z)))) {
            p1mag = p1mag * 2;
          }
        if (((choice1.equals(z)) && (choice2.equals(y)))) {
            p2mag = p2mag * 2;
        }
        if (((choice1.equals(z)) && (choice2.equals(x)))) {
            p1mag = p1mag * 2;
        }
        if (((choice1.equals(x)) && (choice2.equals(z)))) {
            p2mag = p2mag * 2;
        }

        if ((p1mag > p2mag) && (choice1.equals(x))&& !(choice2.equals(e))) {
            StdOut.println("Player 1 Burned Player 2 with magnitude of " + p1mag);
            StdOut.println("Player 1 WINS!");
        } else {
            if ((p1mag > p2mag) && (choice1.equals(y)) && !(choice2.equals(e))) {
                StdOut.println("Player 1 Froze Player 2 with magnitude of " + p1mag);
                StdOut.println("Player 1 WINS!");
            } else {
                if ((p1mag > p2mag) && (choice1.equals(z)) && !(choice2.equals(e))) {
                    StdOut.println("Player 1 Splashed Player 2 with magnitude of " + p1mag);
                    StdOut.println("Player 1 WINS!");
                }
            }
        }

        if ((p2mag > p1mag) && (choice2.equals(x)) && !(choice1.equals(e))) {
            StdOut.println("Player 2 Burned Player 1 with magnitude of " + p2mag);
            StdOut.println("Player 2 WINS!");
        } else {
            if ((p2mag > p1mag) && (choice2.equals(y)) && !(choice1.equals(e))) {
                StdOut.println("Player 2 Froze Player 1 with magnitude of " + p2mag);
                StdOut.println("Player 2 WINS!");
            } else {
                if ((p2mag > p1mag) && (choice2.equals(z)) && !(choice1.equals(e))) {
                    StdOut.println("Player 2 Splashed Player 1 with magnitude of " + p2mag);
                    StdOut.println("Player 2 WINS!");
                }
            }
        }

        if ((p1mag == p2mag) && (choice1.equals(choice2)) && !(choice1.equals(e)) && !(choice2.equals(e))) {
            StdOut.println("You somehow Tied -_-");
        }

        if ((choice1.equals(e)) || (choice2.equals(e))) {
            StdOut.println("Error, INVALID Element");
        }


        


        }
    }
    