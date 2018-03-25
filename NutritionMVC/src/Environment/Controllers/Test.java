package Environment.Controllers;

import javafx.scene.control.Button;

public class Test {
    private Environment.Views.Test View;
    
    Button Access;

    public Test() {
        this.View = new Environment.Views.Test();
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
    public Environment.Views.Test getView() {
        return View;
    }

    /**
     * @param View the View to set
     */
    public void setView(Environment.Views.Test View) {
        this.View = View;
    }
}
