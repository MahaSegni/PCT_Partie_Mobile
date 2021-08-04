/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct.gui;

/**
 *
 * @author mahas
 */
public class AddFournisseur extends BaseForm {
    
    public AddFournisseur(Resources res) {
         super("", BoxLayout.y());
        
        Toolbar tb = new Toolbar(true);
        setToolbar(tb);
     Button b1= new Button ("Retour");
        b1.addActionListener(e->
            new HomeFormBack(res).show()
        );add(b1);
         Container C1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
         Container centerContainer = new Container( new BoxLayout(BoxLayout.Y_AXIS_BOTTOM_LAST));
     
        
                Label nom = new Label("Nom fournisseur: ");
         Label email = new Label("Email: ");
         Label telephone = new Label("Téléphone : ");
       
  
        
        TextField tfNonm = new TextField("","nom fournisseur");
        TextField tfemail= new TextField("", "Email");
        
          TextField tftelephone= new TextField("", "Email");
          Button btnValider = new Button("Ajouter");
Style buttonStyle = btnValider.getAllStyles();
buttonStyle.setBorder(Border.createEmpty());
buttonStyle.setFgColor(0xff);

              centerContainer.add(nom);
              centerContainer.add( tfNonm);
               centerContainer.add(email);
              centerContainer.add( tfemail);
              centerContainer.add(telephone);
              centerContainer.add( tftelephone);
              centerContainer.add( btnValider);
}
    
}
