import controller.LadderGameController;
import domain.RandomDigitsGenerator;
import view.InputView;
import view.OutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomDigitsGenerator generator = new RandomDigitsGenerator();
        LadderGameController controller = new LadderGameController(inputView, outputView, generator);

        controller.run();
    }
}