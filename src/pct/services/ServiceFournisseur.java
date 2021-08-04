/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct.services;

import java.util.ArrayList;
import pct.entities.Fournisseur;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;

/**
 *
 * @author mahas
 */
public class ServiceFournisseur {
     public ArrayList<Fournisseur> tasks;
   
    public static ServiceFournisseur instance=null;
    public boolean resultOK;
    private ConnectionRequest req;
   public ServiceFournisseur() {
         req = new ConnectionRequest();
    }

    public static ServiceFournisseur getInstance() {
        if (instance == null) {
            instance = new ServiceFournisseur();
        }
        return instance;
    }
   
     public ArrayList<Fournisseur> parseTasks(String jsonText){
        try {
            tasks=new ArrayList<>();
            JSONParser j = new JSONParser();// Instanciation d'un objet JSONParser permettant le parsing du résultat json
            Map<String,Object> tasksListJson = j.parseJSON(new CharArrayReader(jsonText.toCharArray()));
            List<Map<String,Object>> list = (List<Map<String,Object>>)tasksListJson.get("root");
            
            //Parcourir la liste des tâches Json
            for(Map<String,Object> obj : list){
                //Création des tâches et récupération de leurs données
                Cinema f = new Cinema();
//                Date date = new Date();
//               
//              f.setDate((java.sql.Date) date);
                float num = Float.parseFloat(obj.get("num").toString());
                f.setNum((int)num);
float id = Float.parseFloat(obj.get("nbr").toString());
                f.setNbr((int)id);
                //Ajouter la tâche extraite de la réponse Json à la liste
                tasks.add(f);
            } 
        } catch (IOException ex) {
        }
        return tasks;
    }
   //  ArrayList<Film> listReclamations= new ArrayList<>();
    public ArrayList<Cinema> getAllTasks(){
        String url = Statics.BASE_URL +"/afficherCinemajsonTwig";
        req.setUrl(url);
        req.setPost(false);
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                tasks = parseTasks(new String(req.getResponseData()));
                req.removeResponseListener(this);
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(req);
        return tasks;

    }
}
