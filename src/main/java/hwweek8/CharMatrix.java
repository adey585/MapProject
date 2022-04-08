package hwweek8;

public class CharMatrix {

    public char[][] map = new char[(int) Constants.CharMapSize][];

    public CharMatrix() {
        for (int i = 0; i < Constants.CharMapSize; i++) {
            map[i] = new char[(int) Constants.CharMapSize];
            for (int j = 0; j < Constants.CharMapSize; j++) map[i][j] = ' ';
        }
    }
}


