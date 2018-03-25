package Environment.Test;

import javafx.scene.control.Button;

public class TestController {
    private Environment.Test.TestView View;
    
    Button Access;

    public TestController() {
        this.View = new Environment.Test.TestView();
        this.Access = View.getAccess();
        attachEvents();
    }
    
    private void attachEvents()
    {
        this.Access.setOnAction(e-> handleretrieveCarByVin()); 
    }
    
    void handleretrieveCarByVin()
    {
        getView().updateAudioViewGrid();
    }

    /**
     * @return the View
     */
    public Environment.Test.TestView getView() {
        return View;
    }

    /**
     * @param View the View to set
     */
    public void setView(Environment.Test.TestView View) {
        this.View = View;
    }
}
