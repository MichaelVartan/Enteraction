package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {


    JButton create_person;
    public Panel(){
        this.setComponents();
        this.setConstants();
        this.add(create_person);
    }
    private void setConstants(){
        this.setLocation(0,0);
        this.setSize(500,600);
        this.setVisible(true);
        this.setLayout(null);

    }
    private void setComponents(){
        // set all the graphics and ui for the panel
        this.create_person = new JButton("Create person");
        this.create_person.setLocation(100,100);
        this.create_person.setSize(100,50);
        this.create_person.setActionCommand("a1");

    }
    public void create_human(){
        HumanClasses.myHuman human = new HumanClasses.myHuman();



    }
    /*


     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // "0"
       String s =  e.getActionCommand();
       // case String type to integer: "0" -> 0
        int mycase=-1;
        try {
            mycase = Integer.parseInt(s);
        }
        catch(NumberFormatException exception){
            System.out.println(exception.getMessage());
        }
       switch (mycase) {
           case 0:

               break;


       }
       // if break then exit


    }
}
