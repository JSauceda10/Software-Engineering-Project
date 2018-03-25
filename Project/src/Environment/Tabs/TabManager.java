package Environment.Tabs;

import Environment.AllNutrients.AllNutrientsController;
import Environment.CalorieCalculator.CalorieController;
import Environment.EmailPackage.EmailController;
import Environment.Controllers.ExitController;
import Environment.InformationTab.InformationTabController;
import Environment.Search.SearchController;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TabManager extends HBox{
    private BorderPane root;
    private VBox mainMenuTemplate;
    private VBox subMenuTemplate;
    
    private String[] mainMenu;
    
    private Environment.Test.TestController test_Controller = new Environment.Test.TestController();
    private ExitController Exit = new ExitController();
    private AllNutrientsController AllNutrients = new AllNutrientsController();
    private CalorieController CalorieCalculator = new CalorieController();
    private SearchController Search = new SearchController();
    private EmailController Email = new EmailController();
    private InformationTabController Info = new InformationTabController();
    
    /**/
    Object[][][] subMenus;
    
    LinkedHashMap<MenuTab, List<SubMenuTab>> TabsMap = new LinkedHashMap<>();
    
    private MenuTab currentMenu;
    
    String CSSLink = "resources/css/OB11142017.css";

    public TabManager(BorderPane root) {
        this.mainMenu = new String[]{"Home", "Diet", "Exercise", "Information"};

        //Sub Tabs (Title, CSS Id, Controller View)
        this.subMenus = new Object[][][]{
            /*Home*/
            {
                {"Profile" ,"profilePage", test_Controller.getView()},
                {"Close Application" ,"exitPage", Exit.getView()},
            },
            /*Diet*/
            {
                {"Our Foods" ,"allfoodsPage", AllNutrients.getView()},
                {"Calorie Calculator" ,"caloriecalPage", CalorieCalculator.getView()},
                {"Email" ,"EmailPage", Email.getView()},
                {"Search" ,"searchPage", Search.getView()},
            },
            /*Exercise*/
            {
                {"Exercise" ,"tr", test_Controller.getView()}
            },
            /*Information*/
            {
                {"Information" ,"informationPage", Info.getView()}
            },
        };
        
        mainMenuTemplate = new VBox();
        subMenuTemplate = new VBox();
        
        drawMenu();
        
        this.getChildren().add(mainMenuTemplate);
        this.getChildren().add(subMenuTemplate);
        
        this.root = root;
        
        this.root.setLeft(this);
        this.root.setCenter(test_Controller.getView());
    }
    
    private void drawMenu(){
        mainMenuTemplate.setId("mainMenu");
        subMenuTemplate.setId("subMenu");
        
        int i = 0;
        
        for (String s : mainMenu)
        {
            MenuTab mTab = new MenuTab(s);
            List<SubMenuTab> temp = new ArrayList<>();
            loadSubTabs loadSubMenu = new loadSubTabs();
            loadCenter loadCenterContent = new loadCenter();
            
            
            try{
                System.out.println(s + " has " + subMenus[i].length + " submenu(s).");
                
                for(Object[] o : subMenus[i]){
                    SubMenuTab sTab = new SubMenuTab(i, o[0].toString(), o[1].toString(), (Node) o[2]);
                    sTab.getButton().setOnAction(loadCenterContent);
                    temp.add(sTab);
                }
               
            }catch(ArrayIndexOutOfBoundsException e){
                System.err.println(s + " doesn't contain any subTab(s)");
            }
            
            TabsMap.put(mTab, temp);
            drawMainButton(mTab);
            mTab.getButton().setOnAction(loadSubMenu);
            i++;
        }
        
        loadSubMenu(TabsMap.entrySet().iterator().next().getKey());
    }
    
    private void drawMainButton(MenuTab _menuItem){
        _menuItem.getButton().setText(_menuItem.getTitle());
        _menuItem.getButton().setId(_menuItem.getCSSId());
        _menuItem.getButton().setContentDisplay(ContentDisplay.TOP);
        mainMenuTemplate.getChildren().add(_menuItem.getButton());
        
    }
    
    private void drawSubButton(SubMenuTab _submenuItem){
        _submenuItem.getButton().setText(_submenuItem.getTitle());
        _submenuItem.getButton().setId(_submenuItem.getCSSId());
        subMenuTemplate.getChildren().add(_submenuItem.getButton());
    }
    
    private void loadSubMenu(MenuTab Menu){
        subMenuTemplate.getChildren().clear();
                    
        for(SubMenuTab s : TabsMap.get(Menu))
            drawSubButton(s);
        
        this.currentMenu = Menu;
    }
    
    private void loadContent(SubMenuTab SubMenu){
        this.root.setCenter(SubMenu.getContent());
    }
    
    public class loadSubTabs implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            for(MenuTab m : TabsMap.keySet())
                if(event.getSource().equals(m.getButton()))
                    loadSubMenu(m);
        }
    }
    
    public class loadCenter implements EventHandler<ActionEvent> {
       @Override
       public void handle(ActionEvent event) {
           for(SubMenuTab s : TabsMap.get(currentMenu))
               if(event.getSource().equals(s.getButton()))
                   loadContent(s);
       }
    }
}
