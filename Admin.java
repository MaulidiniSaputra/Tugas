/*
Maulidini Saputra
166030021
 */
package tugas;

import java.awt.PopupMenu;
 import javax.swing.*;
class Admin extends JFrame
{
 JMenuBar mb=new JMenuBar();
 JMenu file=new JMenu("File");
 JMenu help=new JMenu("Help");
 JMenuItem open=new JMenuItem("open");
 JMenuItem close=new JMenuItem("close");
 JMenuItem quit=new JMenuItem("quit");
 JMenuItem about=new JMenuItem("about");
 JLabel lblnplat=new JLabel("No PLAT");
 JTextField txplat=new JTextField(20);
 JButton tblcari=new JButton("Cari");
 JLabel lblnama=new JLabel("Nama");
 JTextField txnama= new JTextField(20);
 JLabel lblalamat=new JLabel("alamat");
 JTextField txalamat= new JTextField(20);
 JLabel lbldomisili=new JLabel("domisili");
 JRadioButton kelasA=new JRadioButton("DA");
 JRadioButton kelasB=new JRadioButton("KT");
 JRadioButton kelasC=new JRadioButton("KH");
 JRadioButton kelasD=new JRadioButton("KB");
 ButtonGroup grupkelas=new ButtonGroup();
 JLabel lblkelompok=new JLabel("MerkMotor");
 String[] jeniskelompok={"YAMAHA","HONDA","KAWASAKI","SUZUKI","DUCATI","BMW","MVAGUSTA"};
 JComboBox cbkelompok=new JComboBox(jeniskelompok);
 JLabel lbl=new JLabel("");
 JLabel lbltm=new JLabel("Tipe Motor");
 JTextField txtm= new JTextField(20);
 JLabel lblcc=new JLabel("CC Motor");
 JTextField txcc= new JTextField(20);
 JLabel lblno=new JLabel("No Rangka");
 JTextField txno= new JTextField(20);
 JLabel lblbb=new JLabel("Bhn Bakar");
 JTextField txbb= new JTextField(20);
 JLabel lblti=new JLabel("Transmisi");
 JTextField txti= new JTextField(20);
 JButton tblsave=new JButton("Save");
 JLabel lbluts=new JLabel("");
 JTextField txuts= new JTextField(20);
 JButton tblupdate=new JButton("update");
 JLabel lblUAS=new JLabel("");
 JTextField txuas= new JTextField(20);
 JButton tblexit=new JButton("EXIT");
 JButton tblcetak=new JButton("CETAK");
    private Object lblplat;
 
 Admin()
 {
setTitle("Pengguna Kendaraan");
setLocation(300,100);
setSize(300,500);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
 }
 void komponenVisual()
 {
     setJMenuBar(mb);
     mb.add(file);
     mb.add(help);
     file.add(open);
     file.add(close);
     close.setEnabled(false);
     file.add(quit);
     help.add(about);
     setVisible(true);
     getContentPane().setLayout(null);
     getContentPane().add(lblnplat);
     lblnplat.setBounds(10,10,70,20);
     getContentPane().add(txplat);
     txplat.setBounds(75,10,100,20);
     getContentPane().add(tblcari);
     tblcari.setBounds(180,10,95,20);
     getContentPane().add(lblnama);
     lblnama.setBounds(10,30,70,20);
     getContentPane().add(txnama);
     txnama.setBounds(75,30,200,20);
     getContentPane().add(lblalamat);
     lblalamat.setBounds(10,50,100,20);
     getContentPane().add(txalamat);
     txalamat.setBounds(75,50,200,20);
     getContentPane().add(lbldomisili);
     lbldomisili.setBounds(10,70,100,20);
     getContentPane().add(kelasA);
     kelasA.setBounds(75,70,50,20);
     getContentPane().add(kelasB);
     kelasB.setBounds(125,70,50,20);
     getContentPane().add(kelasC);
     kelasC.setBounds(175,70,50,20);
     getContentPane().add(kelasD);
     kelasD.setBounds(225,70,50,20);
     grupkelas.add(kelasA);
     grupkelas.add(kelasB);
     grupkelas.add(kelasC);
     grupkelas.add(kelasD);
     getContentPane().add(lblkelompok);
     lblkelompok.setBounds(10,90,100,20);
     getContentPane().add(cbkelompok);
     cbkelompok.setBounds(75,90,100,20);
     getContentPane().add(lbltm);
     lbltm.setBounds(10,125,100,20);
     getContentPane().add(txtm);
     txtm.setBounds(75,125,100,20);
     getContentPane().add(lblcc);
     lblcc.setBounds(10,145,100,20);
     getContentPane().add(txcc);
     txcc.setBounds(75,145,100,20);
     getContentPane().add(lblno);
     lblno.setBounds(10,165,100,20);
     getContentPane().add(txno);
     txno.setBounds(75,165,100,20);
     getContentPane().add(lblbb);
     lblbb.setBounds(10,185,100,20);
     getContentPane().add(txbb);
     txbb.setBounds(75,185,100,20);
     getContentPane().add(lblti);
     lblti.setBounds(10,205,100,20);
     getContentPane().add(txti);
     txti.setBounds(75,205,100,20);
     getContentPane().add(tblupdate);
     tblupdate.setBounds(180,165,100,20);
     getContentPane().add(tblsave);
     tblsave.setBounds(180,185,100,20);
     getContentPane().add(tblexit);
     tblexit.setBounds(180,205,100,20);
     getContentPane().add(tblcetak);
     tblcetak.setBounds(10,235,250,25);
     
     
     
     
     
     
     setVisible(true);
 }
public static void main(String args[])
{
  Admin apa = new Admin();
  apa.komponenVisual();
}
}
    
    


