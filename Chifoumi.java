public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        switch (chifoumiAction) {
            case ROCK:
                System.out.println("SCISSOR");
                return ChifoumiAction.SCISSOR;

            case PAPER:
                System.out.println("ROCK");
                return ChifoumiAction.ROCK;

            case SCISSOR:
                System.out.println("PAPER");
                return ChifoumiAction.PAPER;

            default:
                return ChifoumiAction.PUITS;
        }
    }
}
