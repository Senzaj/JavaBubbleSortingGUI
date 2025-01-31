package Handler;

import View.MainWindowView;

public class Program implements IProgram{

    @Override
    public void Start() {
        MainWindowView mainView = new MainWindowView();

        mainView.SetStartPanel();
        mainView.DrawWindow();
    }
}
