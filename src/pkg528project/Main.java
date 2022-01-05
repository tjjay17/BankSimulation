/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg528project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.StageStyle;
import javafx.scene.layout.VBox;
import java.util.ArrayList;

/**
 *
 * @author Tj
 */
public class Main extends Application {
    int counter = 1;
    @Override
    public void start(Stage primaryStage) {
        //All the buttons used in GUI
        Button manager = new Button();
        Button customer = new Button();
        Button loginm = new Button();
        Button loginc = new Button();
        Button logoutm = new Button();
        Button addc = new Button();
        Button deletec = new Button();
        Button createc = new Button();
        Button Backc = new Button();
        Button Backm = new Button();
        Button deposit = new Button();
        Button withdraw = new Button();
        Button onlinebuy = new Button();
        Button getbalance = new Button();
        Button Backaddc = new Button();
        Button createuser = new Button();
        Button finaldelete = new Button();
        Button backfrmdel = new Button();
        Button logoutc = new Button();
        Button depositmoney = new Button();
        Button depmoneyback = new Button();
        Button withdrawmoney = new Button();
        Button withmoneyback = new Button();
        Button BackBal = new Button();
        Button onlineback = new Button();
        Button purchase = new Button();
      
        ArrayList Customers = new ArrayList<Customer>();
       
        customer.setTranslateX(200);
        customer.setText("Customer");
        loginm.setText("Login");
        loginc.setText("Login");
        createc.setText("Create");
        Backc.setText("Back");
        Backm.setText("Back");
        addc.setText("Add Customer");
        deletec.setText("Delete Customer");
        logoutm.setText("LogOut");
        deposit.setText("Deposit");
        onlinebuy.setText("Online Purchase");
        getbalance.setText("Current Balance");
        Backaddc.setText("Back");
        createuser.setText("Create");
        finaldelete.setText("Delete User");
        backfrmdel.setText("Back");
        logoutc.setText("Logout");
        withdraw.setText("Withdraw");
        depositmoney.setText("Deposit!");
        depmoneyback.setText("Back");
        withdrawmoney.setText("Withdraw!");
        withmoneyback.setText("Back");
        BackBal.setText("Back");
        onlineback.setText("Back");
        purchase.setText("Purchase");
        
        manager.setTranslateX(-200);
        manager.setText("Manager");
        
        Label Prompt = new Label("Are you a manager or customer?");
        Prompt.setTranslateY(-100);
        
        TextField userm = new TextField();
        PasswordField pwm = new PasswordField();
        PasswordField pwc = new PasswordField();
        TextField userc = new TextField();
        TextField addcuser = new TextField();
        PasswordField addcpass = new PasswordField();
        PasswordField confirmpasstext = new PasswordField();
        TextField deluser = new TextField();
        TextField depositamt = new TextField();
        TextField withdrawamt = new TextField();
        TextField purchaseprice = new TextField();
        
        Label Loginpromptm = new Label("Can you Please Login, manager?");
        Label Loginpromptc = new Label("Can you Please Login, customer?");
        Label passc = new Label("Password: ");
        Label Userc = new Label("Username: ");
        Label passm = new Label("Password: ");
        Label Userm = new Label("Username: ");
        Label wrongm = new Label("No such manager exists! ");
        Label rightm = new Label("Successful! Hello manager!");
        Label Welcomem = new Label("Welcome Manager! What do you want to do today?");
        Label AccountBalance = new Label("Current Balance: ");
        Label CreateUser = new Label("Create new customer:");
        Label Customeruser = new Label("Username: ");
        Label Customerpass = new Label("Password: ");
        Label ConfirmPass = new Label ("Confirm Password: ");
        Label deleteprompt = new Label("Deleted!");
        Label deletewho = new Label ("Who do you want to delete?");
        Label userlabeldel = new Label("Username");
        Label alreadyexist = new Label("");
        Label passwrong = new Label("");
        Label addedprompt = new Label("");
        Label customerprompt = new Label ("What do you want to do today, customer?");
        Label depositprompt = new Label("How much do you want to deposit?");
        Label yourbal = new Label("");
        Label withdrawprompt = new Label("How much would you like to withdraw?");
        Label buythings = new Label("How much is the price of your purchase?");
        
        String CSSdesign = "-fx-font-size: 16pt;" + 
                           "-fx-font-family: 'Comic Sans MS';" ;
                           
        Backc.setStyle(CSSdesign);
        Backm.setStyle(CSSdesign);
        customer.setStyle(CSSdesign);
        manager.setStyle(CSSdesign);
        
        
        
        Prompt.setStyle(CSSdesign);
        Loginpromptm.setStyle(CSSdesign);
        Loginpromptc.setStyle(CSSdesign);
        Welcomem.setStyle(CSSdesign);
        CreateUser.setStyle(CSSdesign);
        deletewho.setStyle(CSSdesign);
        customerprompt.setStyle(CSSdesign);
        depositprompt.setStyle(CSSdesign);
        withdrawprompt.setStyle(CSSdesign);
        yourbal.setStyle(CSSdesign);
        buythings.setStyle(CSSdesign);
        
        String borders = "-fx-border-color: Blue;";
        
        StackPane root = new StackPane();
        GridPane root2 = new GridPane();
        GridPane root3 = new GridPane();
        VBox managerOps = new VBox();
        VBox customerOps = new VBox();
        GridPane addcustomer = new GridPane();
        GridPane deletecustomer = new GridPane(); 
        GridPane deposit$ = new GridPane();
        GridPane withdraw$ = new GridPane();
        GridPane YourBalance = new GridPane();
        GridPane buystuff = new GridPane();
        
        root.setStyle(borders);
        root2.setStyle(borders);
        root3.setStyle(borders);
        addcustomer.setStyle(borders);
        customerOps.setStyle(borders);
        
        root.getChildren().add(manager);
        root.getChildren().add(customer);
        root.getChildren().add(Prompt);
        root.setAlignment(Pos.CENTER);
        
        root2.add(Loginpromptc,0,0);
       //labels
        root2.add(Userc, 0, 1);
        root2.add(passc,0,2);
        //credential fields
        root2.add(userc, 1,1);
        root2.add(pwc, 1, 2);
        root2.add(Backc, 0, 8);
        root2.add(loginc, 3, 6);
        root2.setAlignment(Pos.CENTER);
        
        root3.add(Loginpromptm, 0, 0);
        //labels
        root3.add(Userm, 0, 2);
        root3.add(passm,0,6);
        //text and pass fields
        root3.add(userm, 1, 2);
        root3.add(pwm, 1, 6);
        root3.add(Backm, 0, 8);
        root3.add(loginm,1,7);
        root3.setAlignment(Pos.CENTER);
      
        managerOps.getChildren().add(Welcomem);
        managerOps.getChildren().add(logoutm);
        managerOps.getChildren().add(addc);
        managerOps.getChildren().add(deletec);
        managerOps.setSpacing(20);
        managerOps.setStyle(borders);
        managerOps.setAlignment(Pos.CENTER);
       
        customerOps.getChildren().add(customerprompt);
        customerOps.getChildren().add(logoutc);
        customerOps.setAlignment(Pos.CENTER);
        customerOps.getChildren().add(deposit);
        customerOps.getChildren().add(withdraw);
        customerOps.getChildren().add(getbalance);
        customerOps.getChildren().add(onlinebuy);
        customerOps.setSpacing(20);
        
        addcustomer.add(addcuser, 2 ,1 );
        addcustomer.add(Customeruser, 1,1 );
        addcustomer.add(Customerpass,1,2);
        addcustomer.add(addcpass, 2, 2);
        addcustomer.add(CreateUser, 0, 0);
        addcustomer.add(ConfirmPass, 1, 3);
        addcustomer.add(confirmpasstext,2,3);
        addcustomer.setAlignment(Pos.CENTER);
        addcustomer.add(Backaddc, 0, 8);
        addcustomer.add(createuser, 7, 8);
        addcustomer.add(alreadyexist, 0, 7);
        addcustomer.add(addedprompt, 4, 5);
        addcustomer.add(passwrong, 1, 9);
        
        deletecustomer.setAlignment(Pos.CENTER);
        deletecustomer.add(deletewho, 0, 0);
        deletecustomer.add(deluser,1,2);
        deletecustomer.add(userlabeldel, 0, 2);
        deletecustomer.add(finaldelete, 2, 3);
        deletecustomer.add(backfrmdel, 0, 4);
        
        deposit$.add(depositprompt, 0, 0);
        deposit$.add(depositamt, 2, 6);
        deposit$.add(depositmoney, 2, 7);
        deposit$.add(depmoneyback,0,1);
        
        withdraw$.add(withdrawprompt, 0, 0);
        withdraw$.add(withmoneyback, 0, 1);
        withdraw$.add(withdrawamt,2 , 6);
        withdraw$.add(withdrawmoney, 2, 7);
        
        YourBalance.add(yourbal, 0, 0);
        YourBalance.add(BackBal, 5, 5);
        YourBalance.setAlignment(Pos.CENTER);
        
        buystuff.add(buythings, 0, 0);
        buystuff.add(onlineback, 0,1);
        buystuff.add(purchase, 5, 10);
        buystuff.add(purchaseprice, 5, 8);
      
        Scene scene1 = new Scene(root, 700, 250);
        Scene scene2 = new Scene(root2, 700, 250);
        Scene scene3 = new Scene(root3, 700,250);
        Scene scene4 = new Scene(managerOps,700,250);
        Scene scene5 = new Scene(customerOps,700,500);
        Scene scene6 = new Scene(addcustomer,700,250);
        Scene scene7 = new Scene(deletecustomer,700,250);
        Scene scene8 = new Scene(deposit$,700,250);
        Scene scene9 = new Scene(withdraw$,700,250);
        Scene scene10 = new Scene(YourBalance,700,250);
        Scene scene11 = new Scene(buystuff,1000,250);
   
   //*********************************************************************************************
   //*********************************************************************************************
   //THESE ARE ALL BUTTON ACTIONS BELOW     
       
        customer.setOnAction(new EventHandler<ActionEvent>() {
             
            @ Override
            public void handle(ActionEvent event){
            System.out.println("Login Please");
            
            primaryStage.setScene(scene2);
        }
    });
        
         manager.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(scene3);
            }
        });
         
         
       Backc.setOnAction(new EventHandler<ActionEvent>() {
             
            @ Override
            public void handle(ActionEvent event){
            
            primaryStage.setScene(scene1);
            

            
            
        }
    });
       Backm.setOnAction(new EventHandler<ActionEvent>() {
             
            @ Override
            public void handle(ActionEvent event){
            
            primaryStage.setScene(scene1);
            

            
            
        }
    });
       
       loginm.setOnAction(new EventHandler<ActionEvent>() {
             
            @ Override
            public void handle(ActionEvent event){
            
            if(userm.getText().equals("admin") && pwm.getText().equals("admin")){
            primaryStage.setScene(scene4);
            }
            
            else{
                root3.add(wrongm, 8, 10);
            }
           
        }
    });
       
       logoutm.setOnAction(new EventHandler<ActionEvent>(){
           
           @ Override
           public void handle(ActionEvent event){
               primaryStage.setScene(scene3);
               userm.setText("");
               pwm.setText("");
           }
       });
       
       addc.setOnAction(new EventHandler<ActionEvent>(){
           
           @ Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene6);
              addcuser.setText("");
              addcpass.setText("");
              confirmpasstext.setText("");
           }
       });
       
       Backaddc.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
               primaryStage.setScene(scene4);
               addcuser.setText("");
               addcpass.setText("");
               confirmpasstext.setText("");
               addedprompt.setText("");
               
           }
       });
       
       createuser.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              int y = 0;
               for(int j = 0; j<Customers.size(); j++){
                   Customer person = (Customer) Customers.get(j);
                   if(person.usernamec.equals(addcuser.getText())){
                      
                       alreadyexist.setText("Customer already exists!");
                       addedprompt.setText("");
                       passwrong.setText("");
                    y++;
                   }
               }

               
              if(y == 0){
               if((addcpass.getText().equals(confirmpasstext.getText())) && (!(addcuser.getText().equals(""))) && (!(addcpass.getText().equals("")))) {
                   alreadyexist.setText("");
                   Customers.add(new Customer(addcuser.getText(),addcpass.getText()));
                  addedprompt.setText("Customer " + counter + " Created!");
                   alreadyexist.setText("");
                   passwrong.setText("");
                  
                   addcuser.setText("");
                   addcpass.setText("");
                   confirmpasstext.setText("");
                   counter++;
                   
                   
               }
               else {
               
                   
                   alreadyexist.setText("");
                   addedprompt.setText("");
                   passwrong.setText("Error! Try again.");
                   
                   addcuser.setText("");
                   addcpass.setText("");
                   confirmpasstext.setText("");
                   
                   
               }
               }
           }
           
       });
       
        deletec.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene7);
               

               }
           
       });
        
        finaldelete.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene7);
                String holder = deluser.getText();
                
                for(int i = 0; i<Customers.size();i++){
                    Customer c = (Customer) Customers.get(i);
                    if(c.usernamec.equals(holder)){
                        Customers.remove(c);
                        deletecustomer.add(deleteprompt, 3, 6);
                }
                

               }
           }
           
       });
        
         backfrmdel.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
           primaryStage.setScene(scene4);
           deluser.setText("");
           deleteprompt.setText("");
           }
           
       });
         
         
          loginc.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
           for(int k = 0; k<Customers.size();k++){
              Customer x = (Customer) Customers.get(k);
               if(userc.getText().equals(x.usernamec) && pwc.getText().equals(x.passwordc)){
                   primaryStage.setScene(scene5);
               }
               
           }
          
           
           }
           
       });
        
        
          logoutc.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
           
               primaryStage.setScene(scene2);
               userc.setText("");
               pwc.setText("");
           }
       });
          
          
          
          deposit.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene8);
           }
           
       });
          
          depositmoney.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
           for(int i = 0; i<Customers.size();i++){
               String c = userc.getText();
               Customer guy = (Customer) Customers.get(i);
               if(guy.usernamec.equals(c)){
                   String amt = depositamt.getText();
                   int num = Integer.parseInt(amt);
                   if(num>0){
                   guy.accbalance = guy.accbalance + num;
                   guy.level.changelevel(guy);
                   depositprompt.setText("Your balance is: " + guy.accbalance  + ". Level: " + guy.level.toString());
               }
           }
           }
           }
           
       });
        
        depmoneyback.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene5);
              depositamt.setText("");
              depositprompt.setText("How much do you want to deposit?");
           }
           
       });
        
         withdraw.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene9);
           }
           
       });
          
         withdrawmoney.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
           for(int i = 0; i<Customers.size();i++){
               String c = userc.getText();
               Customer guy = (Customer) Customers.get(i);
               if(guy.usernamec.equals(c)){
                   String amt = withdrawamt.getText();
                   int num = Integer.parseInt(amt);
                   
                   if(num>0 && (guy.accbalance - num) >= 0){
                   guy.accbalance = guy.accbalance - num;
                   guy.level.changelevel(guy);
                   withdrawprompt.setText("Your balance is: " + guy.accbalance + ". Level: " + guy.level.toString());
                   }
                   
                   else if(guy.accbalance<=0 || (guy.accbalance - num)<0){
                           withdrawprompt.setText("You don't have enough!");
                           }
               }
           }
           
           }
       });
       
         withmoneyback.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene5);
              depositamt.setText("");
              withdrawprompt.setText("How much would you like to withdraw?");
           }
           
       });
       
         
            getbalance.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
           primaryStage.setScene(scene10);
               for(int i = 0; i<Customers.size();i++){
               String c = userc.getText();
               Customer guy = (Customer) Customers.get(i);
               if(guy.usernamec.equals(c)){
                   yourbal.setText("Your balance is:  " + guy.accbalance + " And level is " + guy.level.toString());
               }
           }
           }
           
       });
            
            BackBal.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene5);
             
           }
           
       });
            
            onlinebuy.setOnAction(new EventHandler<ActionEvent>(){
        
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene11);
           }
           
       });
            onlineback.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
              primaryStage.setScene(scene5);
           }
           
       });
              purchase.setOnAction(new EventHandler<ActionEvent>(){
           
           @Override
           public void handle(ActionEvent event){
               for(int i = 0; i<Customers.size();i++){
               String c = userc.getText();
               int amt = Integer.parseInt(purchaseprice.getText());
               Customer guy = (Customer) Customers.get(i);
               if(guy.usernamec.equals(c)){
                   if(amt>0 && (guy.accbalance - amt - guy.level.getfeeprice())>=0 ){
                       buythings.setText("Level: " + guy.level.toString()+", Your balance is:$" + (guy.accbalance - amt - (int) guy.level.getfeeprice()) + " And your purchase was $" + (amt ));
                       guy.level.changelevel(guy);
               }
                   else if (guy.accbalance<0 || (guy.accbalance - amt - guy.level.getfeeprice())<0){
                       buythings.setText("Not enough money!");
                   }
           }
               }
           }
           
       });
       
       
       
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setTitle("Welcome to the Bank!");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        
            
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
