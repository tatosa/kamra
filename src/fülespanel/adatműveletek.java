
package fülespanel;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Toolkit.getDefaultToolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class adatműveletek {
    
    
    static Vector tétel=new Vector(31,1);
    public static Connection kapcsolat;
    public static JFrame a = new JFrame();
    
    
    static void törlés(){
        System.out.println("törlés");
        tétel.removeAllElements();
            
    }

        
    public static void adatgyűjtés(String dátum,String szervezet,int regLétsz, String regSt, String regE, String regMod, 
                                                                 int kv1Létsz, String kv1St, String kv1E, String kv1Mod,
                                                                 int ebeLétsz, String ebeSt, String ebeE, String ebeMod,
                                                                 int kv2Létsz, String kv2St, String kv2E, String kv2Mod,
                                                                 int vacsLétsz, String vacsSt, String vacsE, String vacsMod){
      
      int szóhossz=dátum.length();
      String év=dátum.substring(szóhossz-4);
      int elsőperjel=dátum.indexOf("/");
      String hónap=dátum.substring(elsőperjel+1,szóhossz-5);
      if(Integer.parseInt(hónap)<=9) hónap="0"+hónap;
      String nap=dátum.substring(0,elsőperjel);
      if (Integer.parseInt(nap)<=9) nap="0"+nap;
      String dátum2=év+"-"+hónap+"-"+nap;
      
      if (regMod.equals("Válassz!"))regMod="-";
      if (kv1Mod.equals("Válassz!"))kv1Mod="-";
      if (ebeMod.equals("Válassz!"))ebeMod="-";
      if (kv2Mod.equals("Válassz!"))kv2Mod="-";
      if (vacsMod.equals("Válassz!"))vacsMod="-";
      
      if (regSt.equals("  :  "))regSt="-";  if (regE.equals("  :  "))regE="-";
      if (kv1St.equals("  :  "))kv1St="-";  if (kv1E.equals("  :  "))kv1E="-";
      if (ebeSt.equals("  :  "))ebeSt="-";  if (ebeE.equals("  :  "))ebeE="-";
      if (kv2St.equals("  :  "))kv2St="-";  if (kv2E.equals("  :  "))kv2E="-";
      if (vacsSt.equals("  :  "))vacsSt="-";if (vacsE.equals("  :  "))vacsE="-";
        
        
      
          
            tétel.addElement(dátum2);        //0
            tétel.addElement(szervezet);    //1
            tétel.addElement(regLétsz);     //2
            tétel.addElement(regSt);        //3
            tétel.addElement(regE);         //4
            tétel.addElement(regMod);       //5
            tétel.addElement(kv1Létsz);     //6
            tétel.addElement(kv1St);        //7
            tétel.addElement(kv1E);        //8
            tétel.addElement(kv1Mod);       //9
            tétel.addElement(ebeLétsz);     //10
            tétel.addElement(ebeSt);        //11
            tétel.addElement(ebeE);         //12
            tétel.addElement(ebeMod);       //13
            tétel.addElement(kv2Létsz);     //14
            tétel.addElement(kv2St);        //15
            tétel.addElement(kv2E);        //16
            tétel.addElement(kv2Mod);       //17
            tétel.addElement(vacsLétsz);     //18
            tétel.addElement(vacsSt);        //19
            tétel.addElement(vacsE);         //20
            tétel.addElement(vacsMod);       //21

    }
    
    
    static void kapcsolatNyit() {
      String url = "jdbc:mysql://localhost:3306/madpilot";
		  
      String driver = "com.mysql.jdbc.Driver";
      String userName = "tatosa"; 
      String password = "almagul";
      try {
          Class.forName(driver).newInstance();
          kapcsolat = DriverManager.getConnection(url,userName,password);
          //System.out.println ("Database connection established");
  
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Hiba az adatbázis kapcsolat "
           + "felépítése során!\n"+e.getMessage(),"HIBA!", 0);
      }
        
  }
    
    static void kapcsolatZár() {
        try {
          kapcsolat.close();
        }
        catch(SQLException e) {
          System.out.println("Hiba! Nem sikerült lezárni a kapcsolatot az adatbázis-szerverrel.");
        }
  }
    
    //adatbeszúrás metódus
    static void beszúr() {
        try {
            kapcsolatNyit();
        
            Statement stmt=kapcsolat.createStatement();
            
     
        
            String sql =  "INSERT INTO MADPILOT (MPDATE,MPSZERVEZET,MPREGGELIFO,MPREGGELISTART,MPREGGELIEND,MPREGGELIMOD, "
                    + "                                             MPKAVE1FO, MPKAVE1START, MPKAVE1END, MPKAVE1MOD,"
                    + "                                             MPEBEDFO,MPEBEDSTART,MPEBEDEND,MPEBEDMOD,"
                    + "                                             MPKAVE2FO,MPKAVE2START,MPKAVE2END,MPKAVE2MOD,"
                    + "                                             MPVACSORAFO,MPVACSORASTART,MPVACSORAEND,MPVACSORAMOD) VALUES ('"
                    
                    +tétel.get(0)+"', '"
                    +tétel.get(1)+"', '"
                    +tétel.get(2)+"', '"
                    +tétel.get(3)+"', '"
                    +tétel.get(4)+"', '"
                    +tétel.get(5)+"', '"
                    +tétel.get(6)+"', '"
                    +tétel.get(7)+"', '"
                    +tétel.get(8)+"', '"
                    +tétel.get(9)+"', '"
                    +tétel.get(10)+"', '"
                    +tétel.get(11)+"', '"
                    +tétel.get(12)+"', '"
                    +tétel.get(13)+"', '"
                    +tétel.get(14)+"', '"
                    +tétel.get(15)+"', '"
                    +tétel.get(16)+"', '"
                    +tétel.get(17)+"', '"
                    +tétel.get(18)+"', '"
                    +tétel.get(19)+"', '"
                    +tétel.get(20)+"', '"
                    +tétel.get(21)+"')";
    
            stmt.executeUpdate(sql);
            stmt.close();
            kapcsolatZár();
            
        }    
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Hiba az adatbevitel során!\n"
            + "Hibaüzenet: "+e.getMessage(), 
            "HIBA!", 0);
        }
         
    }
    
    //tábálazban megjelenít
    static void megjelenít(){
        try {
            ArrayList columnNames = new ArrayList();
            ArrayList data = new ArrayList();
            
            
            
            String sql = "SELECT * FROM madpilot ORDER BY MPDATE ASC";
            kapcsolatNyit();
            Statement stmt = kapcsolat.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            //System.out.println(columns);

            //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( /*md.getColumnName(i)*/i );
            }
            
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                    
                }

                data.add( row );
            }
            
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }
            
        columnNamesVector.add("Ssz.");
        columnNamesVector.add("Időpont");
        columnNamesVector.add("Szervező");
        columnNamesVector.add("R");
        columnNamesVector.add("Start");
        columnNamesVector.add("End");
        columnNamesVector.add("Módja");
        columnNamesVector.add("");
            columnNamesVector.add("KV");
            columnNamesVector.add("Kezdete");
            columnNamesVector.add("Vége");
            columnNamesVector.add("Módja");
            columnNamesVector.add("");
        columnNamesVector.add("E");
        columnNamesVector.add("Kezdete");
        columnNamesVector.add("Vége");
        columnNamesVector.add("Módja");
        columnNamesVector.add("");
            columnNamesVector.add("KV");
            columnNamesVector.add("Kezdete");
            columnNamesVector.add("Vége");
            columnNamesVector.add("Módja");
            columnNamesVector.add("");
        columnNamesVector.add("V");
        columnNamesVector.add("Kezdete");
        columnNamesVector.add("Vége");
        columnNamesVector.add("Módja");
        
        DefaultTableCellRenderer rightRenderer=new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        //  Create table with database data    
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            
            public Class getColumnClass(int column)
            {
                
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);
                    
                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
        
        
        TableColumnModel táblaminta=table.getColumnModel();
        táblaminta.getColumn(0).setPreferredWidth(50);
        táblaminta.getColumn(0).setCellRenderer(rightRenderer);
        táblaminta.getColumn(1).setPreferredWidth(120);
        táblaminta.getColumn(1).setCellRenderer(rightRenderer);
        táblaminta.getColumn(2).setPreferredWidth(120);
        táblaminta.getColumn(2).setCellRenderer(rightRenderer);
        táblaminta.getColumn(3).setPreferredWidth(40);
        táblaminta.getColumn(3).setCellRenderer(rightRenderer);
        táblaminta.getColumn(4).setPreferredWidth(60);
        táblaminta.getColumn(4).setCellRenderer(rightRenderer);
        táblaminta.getColumn(5).setPreferredWidth(60);
        táblaminta.getColumn(5).setCellRenderer(rightRenderer);
        táblaminta.getColumn(6).setPreferredWidth(80);
        táblaminta.getColumn(6).setCellRenderer(rightRenderer);
        táblaminta.getColumn(7).setPreferredWidth(2);
        TableColumn tm = táblaminta.getColumn(7);
        tm.setCellRenderer(new ColorColumnRenderer(Color.GRAY, Color.green));
        
                    táblaminta.getColumn(8).setPreferredWidth(40);
                    táblaminta.getColumn(8).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(9).setPreferredWidth(60);
                    táblaminta.getColumn(9).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(10).setPreferredWidth(60);
                    táblaminta.getColumn(10).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(11).setPreferredWidth(80);
                    táblaminta.getColumn(11).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(12).setPreferredWidth(2);
                    TableColumn tm2 = táblaminta.getColumn(12);
                    tm2.setCellRenderer(new ColorColumnRenderer(Color.GRAY, Color.green));
                    
        táblaminta.getColumn(13).setPreferredWidth(40);
        táblaminta.getColumn(13).setCellRenderer(rightRenderer);
        táblaminta.getColumn(14).setPreferredWidth(60);
        táblaminta.getColumn(14).setCellRenderer(rightRenderer);
        táblaminta.getColumn(15).setPreferredWidth(60);
        táblaminta.getColumn(15).setCellRenderer(rightRenderer);
        táblaminta.getColumn(16).setPreferredWidth(80);
        táblaminta.getColumn(16).setCellRenderer(rightRenderer);
        táblaminta.getColumn(17).setPreferredWidth(2);  
        TableColumn tm3 = táblaminta.getColumn(17);
        tm3.setCellRenderer(new ColorColumnRenderer(Color.GRAY, Color.green));
        
                    táblaminta.getColumn(18).setPreferredWidth(40);
                    táblaminta.getColumn(18).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(19).setPreferredWidth(60);
                    táblaminta.getColumn(19).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(20).setPreferredWidth(60);
                    táblaminta.getColumn(20).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(21).setPreferredWidth(80);
                    táblaminta.getColumn(21).setCellRenderer(rightRenderer);
                    táblaminta.getColumn(22).setPreferredWidth(2);
                    TableColumn tm4 = táblaminta.getColumn(22);
                    tm4.setCellRenderer(new ColorColumnRenderer(Color.GRAY, Color.green));
                    
        táblaminta.getColumn(23).setPreferredWidth(40);
        táblaminta.getColumn(23).setCellRenderer(rightRenderer);
        táblaminta.getColumn(24).setPreferredWidth(60);
        táblaminta.getColumn(24).setCellRenderer(rightRenderer);
        táblaminta.getColumn(25).setPreferredWidth(60);
        táblaminta.getColumn(25).setCellRenderer(rightRenderer);
        táblaminta.getColumn(26).setPreferredWidth(80);
        táblaminta.getColumn(26).setCellRenderer(rightRenderer);
        
        
        Dimension kép=getDefaultToolkit().getScreenSize();
        
        a.setSize(1177, 200);
        a.setLocation(kép.width/2-573, 65);
        a.add(new JScrollPane(table));
        a.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        a.setVisible(true); 
            

        stmt.close();    
        kapcsolatZár();
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
        
    }
    
    //táblázat bezárása
    static void eltűntet(){
        a.dispose();
    }
    

    }
    

